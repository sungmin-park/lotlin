package kr.redo.lotlin

import org.junit.Test
import kotlin.test.assertEquals

public class LotlinJavaClassTest {
    Test fun testGetGetters() {
        val test = object {
            val i = 0
            val s = "string"
        }

        assertEquals(
                listOf(test.javaClass.getMethod("getS")),
                test.javaClass.getGetters(javaClass<String>())
        )

        assertEquals(
                listOf(test.javaClass.getMethod("getI")),
                test.javaClass.getGetters(javaClass<Int>())
        )
    }
}