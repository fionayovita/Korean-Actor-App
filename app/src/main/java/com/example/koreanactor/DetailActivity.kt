package com.example.koreanactor

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.example.mysubmissionapp.Actors

class DetailActivity : AppCompatActivity(), View.OnClickListener {

    companion object {
        const val EXTRA_DATA = "extra data"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        getSupportActionBar()?.setDisplayHomeAsUpEnabled(true)

        val imgPhoto: ImageView = findViewById(R.id.img_photo)
        val tvName: TextView = findViewById(R.id.tv_name)
        val tvDetail: TextView = findViewById(R.id.tv_detail)
        val tvBorn: TextView = findViewById(R.id.tv_born)
        val tvDrama: TextView = findViewById(R.id.tv_drama)

        val actor = intent.getParcelableExtra<Actors>(EXTRA_DATA)

        Glide.with(this)
            .load(actor?.photo)
            .apply(RequestOptions().override(550, 550))
            .into(imgPhoto)
        tvName.text = actor?.name
        tvDetail.text = actor?.detail
        tvBorn.text = actor?.born
        tvDrama.text = actor?.drama

        val btnFavorite: Button = findViewById(R.id.btn_favorite)
        btnFavorite.setOnClickListener(this)

        val btnShare: Button = findViewById(R.id.btn_share)
        btnShare.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when (v?.id){
            R.id.btn_favorite -> {
                Toast.makeText(baseContext, "Add to favorite", Toast.LENGTH_SHORT).show()
            }
            R.id.btn_share -> {
                Toast.makeText(baseContext, "Shared", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
