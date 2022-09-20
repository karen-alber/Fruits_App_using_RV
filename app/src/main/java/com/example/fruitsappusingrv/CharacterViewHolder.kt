package com.example.fruitsappusingrv

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CharacterViewHolder (itemView: View) : RecyclerView.ViewHolder(itemView){
    private val charName: TextView
    private val charImage: ImageView

    init {
        charName = itemView.findViewById(R.id.char_name_label)
        charImage = itemView.findViewById(R.id.char_image)
    }

    fun bindCharacter(character: Character){
        charName.text = character.characterName
        charImage.setImageResource(character.characterImage)
    }
}