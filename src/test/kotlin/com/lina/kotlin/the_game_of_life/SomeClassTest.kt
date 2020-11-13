package com.lina.kotlin.the_game_of_life

import org.junit.jupiter.api.Test
import strikt.api.expectThat
import strikt.assertions.isFalse
import strikt.assertions.isTrue

internal class SomeClassTest {

    @Test
    fun `should return game not finished when grid is empty`(){
        // given empty grid
        val grid = """___
           ___
           ___    
        """.trimIndent()
        val gameWon = false
        // when check if game is finish
        val gameOver = isGameOver(grid, gameWon)
        // then the game is not done
        expectThat(gameOver).isFalse()
    }

    @Test
    internal fun `should return game finished when the grid is full`() {
        val grid = """OXO
           XXO
           OOX    
        """.trimIndent()
        val gameWon = false
        // when check if game is finish
        val gameOver = isGameOver(grid, gameWon)
        // then the game is done
        expectThat(gameOver).isTrue()
    }

    @Test
    internal fun `should return game not finish when grid is patially full and nobody has won`() {
        val grid = """XO_
           ___
           ___    
        """.trimIndent()
        val gameWon = false
        // when check if game is finish
        val gameOver = isGameOver(grid, gameWon)
        // then the game is not done
        expectThat(gameOver).isFalse()
    }

    private fun isGameOver(grid: String, gameWon: Boolean) : Boolean =
        when {
            grid.contains("_") -> false
            gameWon -> true
            else -> true
        }
}
