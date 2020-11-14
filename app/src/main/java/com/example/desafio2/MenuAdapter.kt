package com.example.desafio2

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.menu_item.view.*
import kotlinx.android.synthetic.main.restaurant_item.view.*

class MenuAdapter(
    private val restaurantDishes: List<Dish>
) : RecyclerView.Adapter<MenuAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.menu_item, parent, false)

        return MenuAdapter.ViewHolder(view)
    }

    override fun onBindViewHolder(holder: MenuAdapter.ViewHolder, position: Int) {
        holder.bind(restaurantDishes[position])
        Glide.with(holder.itemView.context).load(restaurantDishes[position].photo).into(holder.imageView)
        holder.dishName.text = restaurantDishes[position].name

        holder.itemView.setOnClickListener {

            val intent = Intent(holder.itemView.context, DishActivity::class.java)
            intent.putExtra("dishData", restaurantDishes[position])

            it.context.startActivity(
                intent
            )
        }
    }

    override fun getItemCount(): Int {
        return restaurantDishes.size
    }

    class ViewHolder(itemView: View):RecyclerView.ViewHolder(itemView) {
        val imageView: ImageView = itemView.findViewById(R.id.ivMenuItem)
        val dishName: TextView = itemView.findViewById(R.id.tvMenuItem)
        fun bind(dish: Dish) = with(itemView){
        }
    }

}