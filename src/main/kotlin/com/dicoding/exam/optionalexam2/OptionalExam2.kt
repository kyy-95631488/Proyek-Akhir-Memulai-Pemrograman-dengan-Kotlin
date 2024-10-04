package com.dicoding.exam.optionalexam2

// TODO
fun minAndMax(number: Int): Int {
    val numberStr = number.toString()

    var minDigit = '9'
    var maxDigit = '0'

    for (char in numberStr) {
        if (char < minDigit) minDigit = char
        if (char > maxDigit) maxDigit = char
    }

    val minDigitInt = minDigit.toString().toInt()
    val maxDigitInt = maxDigit.toString().toInt()

    return minDigitInt + maxDigitInt
}