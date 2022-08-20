package org.jetbrains.base64

interface SharedCode {
    fun greeting(name: String): String {
        return "Hello ${name}"
    }

    fun sumNumbers(num1 : Int, num2 : Int) : Int{
        return num1 + num2
    }
}

expect object SharedCodeFactory {
    fun createSharedCode(): SharedCode
}