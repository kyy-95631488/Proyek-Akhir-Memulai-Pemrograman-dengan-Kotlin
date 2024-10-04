package com.dicoding.exam.optionalexam4

// TODO
fun getMiddleCharacters(string: String): String {
    val length = string.length
    return if (length % 2 == 0) {
        val middleIndex1 = length / 2 - 1
        val middleIndex2 = length / 2
        string.substring(middleIndex1, middleIndex2 + 1)
    } else {
        val middleIndex = length / 2
        string[middleIndex].toString()
    }
}