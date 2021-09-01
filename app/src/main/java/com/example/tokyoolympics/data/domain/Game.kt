package com.example.tokyoolympics.data.domain

//this class has the data we need from the csv file

data class Game (

    val countryRank: Int,
    val countryName: String,
    val goldMedal: Int,
    val silverMedal: Int,
    val bronzeMedal: Int,
    val totalMedals: Int,
    val countryRankByMedals: Int,

)