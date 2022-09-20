package com.example.fruitsappusingrv

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class CharacterAdapter(private val characterlist: List<Character>): RecyclerView.Adapter<CharacterViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CharacterViewHolder {
        val itemCharacterView = LayoutInflater.from(parent.context).inflate(R.layout.character_item, parent)
        return CharacterViewHolder(itemCharacterView)
    }

    override fun onBindViewHolder(holder: CharacterViewHolder, position: Int) {
        val currentCharacter = characterlist[position]
        holder.bindCharacter(currentCharacter)
    }

    override fun getItemCount(): Int {
        return characterlist.size
    }


}