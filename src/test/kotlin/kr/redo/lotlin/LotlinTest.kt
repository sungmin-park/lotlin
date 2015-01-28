package kr.redo.lotlin

import org.junit.Test
import kotlin.test.assertEquals

public class LotlinTest {
    Test fun testSlice() {
        val python = "Python"
        // slice
        assertEquals("Py", python.slice(0, 2))
        assertEquals("tho", python.slice(2, 5))

        // with named parameter
        assertEquals("Py", python.slice(end = 2))
        assertEquals("on", python.slice(4))
        assertEquals("on", python.slice(-2))
        assertEquals("Python", python.slice(end = 2) + python.slice(start = 2))
        assertEquals("Python", python.slice(end = 4) + python.slice(start = 4))

        // handle index gracefully
        assertEquals("on", python.slice(4, 42))
        assertEquals("", python.slice(42))
    }
}