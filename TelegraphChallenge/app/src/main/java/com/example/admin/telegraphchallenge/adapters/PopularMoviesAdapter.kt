package com.example.admin.telegraphchallenge.adapters

import android.databinding.DataBindingUtil
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import com.example.admin.telegraphchallenge.R
import com.example.admin.telegraphchallenge.databinding.RecyclerItemBinding
import com.example.admin.telegraphchallenge.models.Collection

class PopularMoviesAdapter(private val popularMovies: List<Collection>) :
    RecyclerView.Adapter<PopularMoviesAdapter.ViewHolder>() {

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): PopularMoviesAdapter.ViewHolder {
        val binding = DataBindingUtil.inflate<RecyclerItemBinding>(
            LayoutInflater.from(viewGroup.context),
            R.layout.recycler_item, viewGroup, false
        )
        return ViewHolder(binding)
    }

    override fun getItemCount() = popularMovies.size

    override fun onBindViewHolder(holder: PopularMoviesAdapter.ViewHolder, position: Int) {
        val temp = popularMovies[position]
        holder.binding.apply {
            tvHeadline.text = temp.headline
            tvRating.text = "Rating: ${temp.ratings}"
            tvDuration.text = "Movie Duration: ${temp.duration}"
        }
    }

    class ViewHolder(var binding: RecyclerItemBinding) : RecyclerView.ViewHolder(binding.root)
}