package com.example.tokyoolympics.util
import com.example.tokyoolympics.data.domain.Game

class CsvParser {
    fun parse(line : String): Game{
        val tokens = line.split(',')
        return Game(
            countryRank = tokens[Constants.ColumnIndex.COUNTRY_RANK].toInt(),
            countryName = tokens[Constants.ColumnIndex.COUNTRY_NAME],
            goldMedal = tokens[Constants.ColumnIndex.GOLD_MEDAL].toInt(),
            silverMedal = tokens[Constants.ColumnIndex.SILVER_MEDAL].toInt(),
            bronzeMedal = tokens[Constants.ColumnIndex.BRONZE_MEDAL].toInt(),
            totalMedals = tokens[Constants.ColumnIndex.TOTAL_MEDALS].toInt(),
            countryRankByMedals = tokens[Constants.ColumnIndex.COUNTRY_RANK_BY_MEDALS].toInt(),
        )
    }
}