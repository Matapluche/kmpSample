package org.jetbrains.base64

interface Base64Encoder {
    fun encode(src: ByteArray): ByteArray

    fun encodeToString(src: ByteArray): String {
        val encoded = encode(src)
        return buildString(encoded.size) {
            encoded.forEach { append(it.toInt().toChar()) }
        }
    }

    fun sumNumbers(num1 : Int, num2 : Int) : Int{
        return num1 + num2
    }
}

expect object Base64Factory {
    fun createEncoder(): Base64Encoder
}