package com.example.desafio2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_menu.*

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        val restaurantData = intent.getParcelableExtra<Restaurant>("restaurantData")

        findViewById<RecyclerView>(R.id.rvMenuList).apply {
            layoutManager = GridLayoutManager(this@MenuActivity, 2)
            if (restaurantData != null) {
                adapter = MenuAdapter(restaurantData.menu)
            }

        }
        findViewById<ImageView>(R.id.ivRestaurantPhoto).apply {
            Glide.with(this@MenuActivity).load(restaurantData?.photo).into(this)
        }
        findViewById<TextView>(R.id.tvRestaurantName).apply {
            this.text = restaurantData?.name

        }
        initComponents()
    }

    private fun initComponents() {
        ivArrowBack.setOnClickListener {
            finish()
        }
    }
}