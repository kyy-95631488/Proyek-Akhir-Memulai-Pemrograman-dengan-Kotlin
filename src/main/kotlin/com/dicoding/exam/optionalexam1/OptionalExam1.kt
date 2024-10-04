package com.dicoding.exam.optionalexam1

// TODO
fun sumOfBigThree(vararg numbers: Int): Int {
    val topThree = numbers.sortedDescending().take(3)
    return topThree.sum()
}