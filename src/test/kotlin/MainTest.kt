
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

internal class MainTest {
    
    @Test
    fun `java returns 1 for 1`() {
        assertEquals("1", Main.fb(1))
    }

    @Test
    fun `java returns 2 for 2`() {
        assertEquals("2", Main.fb(2))
    }

    @Test
    fun `java returns Fizz for 3`() {
        assertEquals("Fizz", Main.fb(3))
    }

    @Test
    fun `java returns Fizz for 6`() {
        assertEquals("Fizz", Main.fb(6))
    }

    @Test
    fun `java returns Buzz for 5`() {
        assertEquals("Buzz", Main.fb(5))
    }

    @Test
    fun `java returns Buzz for 10`() {
        assertEquals("Buzz", Main.fb(10))
    }

    @Test
    fun `java returns FizzBuzz for 15`() {
        assertEquals("FizzBuzz", Main.fb(15))
    }

    @Test
    fun `java test all`() {
        @Suppress("MaxLineLength")
        val fullSolution = arrayOf("1","2","Fizz","4","Buzz","Fizz","7","8","Fizz","Buzz","11","Fizz","13","14","FizzBuzz","16","17","Fizz","19","Buzz","Fizz","22","23","Fizz","Buzz","26","Fizz","28","29","FizzBuzz","31","32","Fizz","34","Buzz","Fizz","37","38","Fizz","Buzz","41","Fizz","43","44","FizzBuzz","46","47","Fizz","49","Buzz","Fizz","52","53","Fizz","Buzz","56","Fizz","58","59","FizzBuzz","61","62","Fizz","64","Buzz","Fizz","67","68","Fizz","Buzz","71","Fizz","73","74","FizzBuzz","76","77","Fizz","79","Buzz","Fizz","82","83","Fizz","Buzz","86","Fizz","88","89","FizzBuzz","91","92","Fizz","94","Buzz","Fizz","97","98","Fizz","Buzz")
        fullSolution.forEachIndexed { index, expected -> assertEquals(expected, Main.fb(index+1)) }
    }
}
