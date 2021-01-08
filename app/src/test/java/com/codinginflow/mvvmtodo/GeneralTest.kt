package com.codinginflow.mvvmtodo

import com.codinginflow.mvvmtodo.other.Box
import org.junit.Test


class GeneralTest {

    @Test
    fun testThing() {
        val box: Box<Int> = Box(1)
        println(box.value)

        val otherBox: Box<String> = Box("hi")
        println(otherBox.value)
    }

    private fun <T> something(thing: T): Any {
        return thing.toString()
    }
}