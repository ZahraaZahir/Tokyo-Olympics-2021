package com.example.tokyoolympics.data
import com.example.tokyoolympics.data.domain.Game

object DataManger {
    private val  gamesList= mutableListOf<Game>()

    val game:List<Game>
        get() = gamesList

    fun addGame(game:Game){
        gamesList.add(game)
    }

}