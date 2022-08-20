package org.jetbrains.base64

actual object SharedCodeFactory {
    actual fun createSharedCode(): SharedCode = NativeSharedCode

}

object NativeSharedCode : SharedCode {

    override fun greeting(name: String): String {
        return super.greeting(name)
    }

    override fun sumNumbers(num1: Int, num2: Int): Int {
        return super.sumNumbers(num1, num2)
    }
}