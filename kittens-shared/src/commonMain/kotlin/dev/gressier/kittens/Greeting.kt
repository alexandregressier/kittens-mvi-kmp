package dev.gressier.kittens

class Greeting {
    fun greeting(): String =
        "Hello, ${Platform().platform}!"
}