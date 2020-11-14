package com.example.desafio2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_menu.*
import kotlinx.android.synthetic.main.restaurant_item.view.*

class DishActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dish)
        val dishData = intent.getParcelableExtra<Dish>("dishData")
        initComponents()

        findViewById<ImageView>(R.id.ivDishPhoto).apply {
            Glide.with(this).load(dishData?.photo).into(this)
        }
        findViewById<TextView>(R.id.tvDishName).apply{
            this.text = dishData?.name
        }
        findViewById<TextView>(R.id.tvDishExplanation).apply{
            this.text = dishData?.explanation
        }
    }

    private fun initComponents() {
        ivArrowBack.setOnClickListener {
            finish()
        }
    }
}