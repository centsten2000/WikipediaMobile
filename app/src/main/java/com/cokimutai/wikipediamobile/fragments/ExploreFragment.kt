package com.cokimutai.wikipediamobile.fragments


import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

import com.cokimutai.wikipediamobile.R
import com.cokimutai.wikipediamobile.SearchActivity
import com.cokimutai.wikipediamobile.adapters.ArticleCardRecyclerAdapter
import kotlinx.android.synthetic.main.fragment_explore.*

/**
 * A simple [Fragment] subclass.
 */
class ExploreFragment : Fragment() {

    var search_card_view: CardView? = null
    var explore_article_recycler: RecyclerView? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        var view =  inflater.inflate(R.layout.fragment_explore, container, false)

        search_card_view = view.findViewById<CardView>(R.id.search_card_view)
        explore_article_recycler  = view.findViewById<RecyclerView>(R.id.explore_article_recycler)

        search_card_view!!.setOnClickListener{
            val searchIntent = Intent(context, SearchActivity::class.java)
            context?.startActivity(searchIntent)
        }
        explore_article_recycler!!.layoutManager = LinearLayoutManager(context)
        explore_article_recycler!!.adapter = ArticleCardRecyclerAdapter()

        return view
    }


}
