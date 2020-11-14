package com.example.desafio2

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.restaurant_item.view.*


class RestaurantAdapter(
    private val restaurantList: List<Restaurant>
) : RecyclerView.Adapter<RestaurantAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(
            R.layout.restaurant_item,
            parent,
            false
        )
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: RestaurantAdapter.ViewHolder, position: Int) {
        holder.bind(restaurantList[position])
        Glide.with(holder.itemView.context).load(restaurantList[position].photo).into(holder.imageView)
        holder.itemView.setOnClickListener {

            val intent = Intent(holder.itemView.context, MenuActivity::class.java)
            intent.putExtra("restaurantData", restaurantList[position])

            it.context.startActivity(
                intent
            )
        }
    }

    override fun getItemCount(): Int {
        return restaurantList.size
    }

    class ViewHolder(itemView: View):RecyclerView.ViewHolder(itemView) {
        val imageView: ImageView = itemView.findViewById(R.id.ivRestaurant)
        fun bind(restaurant: Restaurant) = with(itemView){
            tvName.text = restaurant.name
            tvAddress.text = restaurant.address
            tvTime.text = restaurant.closeDoors
        }
    }

}

