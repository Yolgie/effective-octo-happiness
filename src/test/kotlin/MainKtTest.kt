
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

internal class MainKtTest {

    @Test
    fun `kotlin returns 1 for 1`() {
        assertEquals("1", fizzbuzz(1))
    }

    @Test
    fun `kotlin returns 2 for 2`() {
        assertEquals("2", fizzbuzz(2))
    }

    @Test
    fun `kotlin returns Fizz for 3`() {
        assertEquals("Fizz", fizzbuzz(3))
    }

    @Test
    fun `kotlin returns Fizz for 6`() {
        assertEquals("Fizz", fizzbuzz(6))
    }

    @Test
    fun `kotlin returns Buzz for 5`() {
        assertEquals("Buzz", fizzbuzz(5))
    }

    @Test
    fun `kotlin returns Buzz for 10`() {
        assertEquals("Buzz", fizzbuzz(10))
    }

    @Test
    fun `kotlin returns FizzBuzz for 15`() {
        assertEquals("FizzBuzz", fizzbuzz(15))
    }

    @Test
    fun `kotlin test all`() {
        @Suppress("MaxLineLength")
        val fullSolution = arrayOf("1","2","Fizz","4","Buzz","Fizz","7","8","Fizz","Buzz","11","Fizz","13","14","FizzBuzz","16","17","Fizz","19","Buzz","Fizz","22","23","Fizz","Buzz","26","Fizz","28","29","FizzBuzz","31","32","Fizz","34","Buzz","Fizz","37","38","Fizz","Buzz","41","Fizz","43","44","FizzBuzz","46","47","Fizz","49","Buzz","Fizz","52","53","Fizz","Buzz","56","Fizz","58","59","FizzBuzz","61","62","Fizz","64","Buzz","Fizz","67","68","Fizz","Buzz","71","Fizz","73","74","FizzBuzz","76","77","Fizz","79","Buzz","Fizz","82","83","Fizz","Buzz","86","Fizz","88","89","FizzBuzz","91","92","Fizz","94","Buzz","Fizz","97","98","Fizz","Buzz")
        fullSolution.forEachIndexed { index, expected -> assertEquals(expected, fizzbuzz(index+1)) }
    }
}
