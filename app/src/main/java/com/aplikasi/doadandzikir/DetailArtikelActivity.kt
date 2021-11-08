package com.aplikasi.doadandzikir

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class DetailArtikelActivity : AppCompatActivity() {

    companion object {
        const val DATA_TITLE = "title"
        const val DATA_DESC = "desc"
        const val DATA_IMAGE = "image"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        title = "Artikel Islami"
        setContentView(R.layout.activity_dzikir_artikel)

        val dataTitle = intent.getStringExtra(DATA_TITLE)
        val dataDesc = intent.getStringExtra(DATA_DESC)
        val dataImage = intent.getIntExtra(DATA_IMAGE, 0)

        val tvTitle: TextView = findViewById(R.id.tv_detail_title)
        tvTitle.text = dataTitle
        val tvDesc: TextView = findViewById(R.id.tv_detail_desc)
        tvDesc.text = dataDesc
        val imgArtikel = findViewById<ImageView>(R.id.img_detail)
        imgArtikel.setImageResource(dataImage)

    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}