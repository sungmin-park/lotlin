package com.lotiln

import java.lang.reflect.Method

fun Class<*>.getGetters(klass: Class<*>): List<Method> {
    return getMethods()
            .filter { it.getName().matches("^get[A-Z].*") }
            .filter { it.getParameterTypes().size() == 0 }
            .filter { klass.isAssignableFrom(it.getReturnType()) }
}
