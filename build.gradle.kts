
import org.eclipse.jgit.api.Git
import org.eclipse.jgit.api.ResetCommand.ResetType
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile
import java.io.BufferedReader
import java.io.InputStreamReader
import java.net.URL
import java.time.Instant
import java.time.format.DateTimeFormatter

plugins {
    kotlin("jvm") version "1.7.10"
    application
}

buildscript {
    repositories {
        mavenCentral()
    }
    dependencies {
        classpath("org.eclipse.jgit:org.eclipse.jgit:6.2.0.202206071550-r")
    }
}

group = "io.cloudflight.kata.refucktoring"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "17"
}

application {
    mainClass.set("MainKt")
}

tasks.withType<Test> {
    addTestListener(object : TestListener {
        override fun beforeSuite(suite: TestDescriptor) {}
        override fun beforeTest(testDescriptor: TestDescriptor) {}
        override fun afterTest(testDescriptor: TestDescriptor, result: TestResult) {}
        override fun afterSuite(suite: TestDescriptor, result: TestResult) {
            if (suite.name == "Gradle Test Run :test" &&
                result.resultType == TestResult.ResultType.SUCCESS
            ) {
                commitWithTimestamp()
            }
        }
    })
}

tasks.register("commit") {
    commitWithTimestamp()
}

fun commitWithTimestamp() {
    val git = Git.open(layout.projectDirectory.asFile)
    val message = getBetterCommitMessage() ?: "auto ${DateTimeFormatter.ISO_INSTANT.format(Instant.now())}"

    git.add().addFilepattern(".").call()
    git.commit().setMessage(message).call()

    println("Committed with \"$message\"")
}

tasks.register("reset") {
    doLast {
        val git = Git.open(layout.projectDirectory.asFile)
        git.reset().setMode(ResetType.HARD).call()
    }
}

fun getBetterCommitMessage(): String? {
    try {
        val url = URL("http://whatthecommit.com/index.txt")
        val connection = url.openConnection()
        BufferedReader(InputStreamReader(connection.getInputStream())).use { inp ->
            return inp.readLine()
        }
    } catch (e: Exception) {
        return null
    }
}
