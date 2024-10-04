package com.dicoding.exam.optionalexam3

// TODO
fun manipulateString(str: String, num: Int): String {
    val numberPattern = Regex("\\d+")
    val matches = numberPattern.findAll(str)

    if (matches.any()) {
        val numberStr = matches.first().value
        val number = numberStr.toInt()
        val multipliedValue = number * num

        val resultStr = str.replace(numberStr, "") + multipliedValue
        return resultStr
    } else {
        return str + num
    }
}