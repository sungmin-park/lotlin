package com.lotlin.sting

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


fun String.join(vararg words: String): String {
    val builder = StringBuilder()
    words.forEachIndexed { i, s ->
        if (i != 0) {
            builder.append(this)
        }
        builder.append(s)
    }
    return builder.toString()
}

fun String.join(words: Collection<String>): String {
    return this.join(*words.copyToArray())
}