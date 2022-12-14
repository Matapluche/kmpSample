package org.jetbrains.base64
import java.util.*

actual object Base64Factory {
    actual fun createEncoder(): Base64Encoder = JvmBase64Encoder
}

object JvmBase64Encoder : Base64Encoder {
    override fun encode(src: ByteArray): ByteArray = Base64.getEncoder().encode(src)

    override fun sumNumbers(num1: Int, num2: Int): Int {
        return super.sumNumbers(num1, num2)
    }
}