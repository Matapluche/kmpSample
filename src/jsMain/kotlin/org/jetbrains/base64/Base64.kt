package org.jetbrains.base64

import kotlinx.browser.window

actual object Base64Factory {
    actual fun createEncoder(): Base64Encoder = JsBase64Encoder
}

object JsBase64Encoder : Base64Encoder {
    override fun encode(src: ByteArray): ByteArray {
        val string = src.decodeToString()
        val encodedString = window.btoa(string)
        return encodedString.encodeToByteArray()
    }

    override fun sumNumbers(num1: Int, num2: Int): Int {
        return super.sumNumbers(num1, num2)
    }
}