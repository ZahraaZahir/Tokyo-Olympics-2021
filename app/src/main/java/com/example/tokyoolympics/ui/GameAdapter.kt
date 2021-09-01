package com.example.tokyoolympics.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.tokyoolympics.R
import com.example.tokyoolympics.data.domain.Game
import com.example.tokyoolympics.databinding.ItemGameBinding
import com.example.tokyoolympics.ui.GameAdapter.*

class GameAdapter(val list: List<Game> ) : RecyclerView.Adapter<GameViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GameViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_game, parent,false)
        return GameViewHolder(view)
    }

    override fun onBindViewHolder(holder: GameViewHolder, position: Int) {
        val currentGame = list[position]
        holder.binding.apply {
            countryName.text = currentGame.countryName
            countryRank.text = currentGame.countryRank.toString()
            numOfGold.text = currentGame.goldMedal.toString()
            numOfSilver.text = currentGame.silverMedal.toString()
            numOfBronze.text = currentGame.bronzeMedal.toString()
            totalMedalsNumber.text = currentGame.totalMedals.toString()
        }
    }

    override fun getItemCount() = list.size

    class GameViewHolder(viewItem: View): RecyclerView.ViewHolder(viewItem){
        val binding = ItemGameBinding.bind(itemView)
    }

}