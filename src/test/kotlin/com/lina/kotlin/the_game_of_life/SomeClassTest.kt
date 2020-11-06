package com.lina.kotlin.the_game_of_life

import org.junit.jupiter.api.Test
import strikt.api.expectThat
import strikt.assertions.isEqualTo

internal class SomeClassTest {

    @Test
    fun `should return something`() {
        val someClass = SomeClass()
        val aNumber = someClass.returnANumber()
        expectThat(aNumber)
            .isEqualTo(-1)
    }

    // Any live cell with fewer than two live neighbours dies, as if caused by under-population.
    // Any live cell with two or three live neighbours lives on to the next generation.
    // Any live cell with more than three live neighbours dies, as if by overcrowding.
    // Any dead cell with exactly three live neighbours becomes a live cell, as if by reproduction.
}
