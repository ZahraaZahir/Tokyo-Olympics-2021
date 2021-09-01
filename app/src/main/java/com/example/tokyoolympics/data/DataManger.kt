package com.example.tokyoolympics.data
import com.example.tokyoolympics.data.domain.Game

object DataManger {
    private val  gamesList= mutableListOf<Game>()

    val games:List<Game>
        get() = gamesList

    fun addGame(games:Game){
        gamesList += games
    }

}