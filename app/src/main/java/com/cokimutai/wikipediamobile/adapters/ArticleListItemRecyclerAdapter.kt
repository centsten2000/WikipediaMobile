package com.cokimutai.wikipediamobile.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.cokimutai.wikipediamobile.R
import com.cokimutai.wikipediamobile.holders.CardViewHolder
import com.cokimutai.wikipediamobile.holders.ListItemViewHolder


class ArticleListItemRecyclerAdapter : RecyclerView.Adapter<ListItemViewHolder>() {

    override fun getItemCount(): Int {
        return 10
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListItemViewHolder {
        var cardItem = LayoutInflater.from(parent?.context).inflate(R.layout.article_list_item,
            parent,false)
        return ListItemViewHolder(cardItem)
    }

    override fun onBindViewHolder(holder: ListItemViewHolder, position: Int) {

    }

}