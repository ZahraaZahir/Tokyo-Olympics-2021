package com.example.tokyoolympics.ui

import android.view.LayoutInflater
import com.example.tokyoolympics.data.DataManger
import com.example.tokyoolympics.databinding.ActivityMainBinding
import com.example.tokyoolympics.util.CsvParser
import java.io.BufferedReader
import java.io.InputStreamReader

class MainActivity : BaseActivity<ActivityMainBinding>() {

    override val bindingInflater: (LayoutInflater) -> ActivityMainBinding = ActivityMainBinding::inflate


    override fun setup() {

        parseFile()

    }

    private fun parseFile() {
        val inputStream = assets.open("TokyoOlympics.csv")
        val buffer = BufferedReader(InputStreamReader(inputStream))
        val myParser = CsvParser()
        buffer.forEachLine {

            val currentGame = myParser.parse(it)
            DataManger.addGame(currentGame)

        }
    }
}