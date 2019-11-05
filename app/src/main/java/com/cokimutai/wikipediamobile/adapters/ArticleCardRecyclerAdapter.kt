package com.cokimutai.wikipediamobile.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.cokimutai.wikipediamobile.R
import com.cokimutai.wikipediamobile.holders.CardViewHolder


class ArticleCardRecyclerAdapter : RecyclerView.Adapter<CardViewHolder>() {

    override fun getItemCount(): Int {
        return 10
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardViewHolder {
        var cardItem = LayoutInflater.from(parent?.context).inflate(R.layout.article_card_item,
            parent,false)
        return CardViewHolder(cardItem)
    }

    override fun onBindViewHolder(holder: CardViewHolder, position: Int) {

    }

}