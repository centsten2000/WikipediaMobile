package com.cokimutai.wikipediamobile.holders

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.cokimutai.wikipediamobile.R


class ListItemViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView) {
    private val articleImageView: ImageView = itemView.findViewById(R.id.result_icon)
    private val titleTextView: TextView = itemView.findViewById(R.id.result_title)


}