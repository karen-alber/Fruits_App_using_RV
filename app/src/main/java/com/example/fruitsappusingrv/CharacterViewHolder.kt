package com.example.fruitsappusingrv

import android.content.Intent
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class CharacterViewHolder (itemView: View) : RecyclerView.ViewHolder(itemView){
    private val charName: TextView
    private val charImage: ImageView

    init {
        charName = itemView.findViewById(R.id.char_name_label)
        charImage = itemView.findViewById(R.id.char_image)
        itemView.setOnClickListener {
            val currentCharacter = characterList[layoutPosition]
            val intent = Intent(itemView.context, MainActivity::class.java)
            intent.putExtra("Fruit", currentCharacter)
            itemView.context.startActivity(intent)
            Toast.makeText(itemView.context, currentCharacter.characterName, Toast.LENGTH_SHORT).show()
        }
    }

    fun bindCharacter(character: Character){
        charName.text = character.characterName
        charImage.setImageResource(character.characterImage)
    }
}