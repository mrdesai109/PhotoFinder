package com.rushi.photofinder.utils

import java.util.Random

fun generateUniqueRandomString(length: Int): String {
    val charset = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789"
    val random = Random()
    val generatedStrings = mutableSetOf<String>()

    while (true) {
        val randomString = (1..length)
            .map { charset[random.nextInt(charset.length)] }
            .joinToString("")

        if (!generatedStrings.contains(randomString)) {
            generatedStrings.add(randomString)
            if (generatedStrings.size >= 10_000) {
                // Reset the set if it becomes too large to avoid excessive memory usage.
                generatedStrings.clear()
            }
            return randomString
        }
    }
}