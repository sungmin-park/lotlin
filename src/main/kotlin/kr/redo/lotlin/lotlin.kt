package kr.redo.lotlin

import java.lang.reflect.Method

fun String.slice(start: Int = 0, end: Int? = null): String {
    if (start < 0) {
        return slice(start = length() + start, end = end)
    }
    if (start > length()) {
        return slice(start = length(), end = end)
    }
    if (end != null && end > length()) {
        return slice(start = start, end = length())
    }
    val till = end ?: length()
    return this.substring(start, till)
}


fun Class<*>.getGetters(klass: Class<*>): List<Method> {
    return getMethods()
            .filter { it.getName().matches("^get[A-Z].*") }
            .filter { it.getParameterTypes().size() == 0 }
            .filter { klass.isAssignableFrom(it.getReturnType()) }
}
