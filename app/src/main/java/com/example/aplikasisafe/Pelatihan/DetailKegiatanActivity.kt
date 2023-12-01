package com.example.aplikasisafe.Pelatihan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.example.aplikasisafe.R

class DetailKegiatanActivity : AppCompatActivity(),  View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_kegiatan)
        val btnDetailKegiatanActivity: Button = findViewById(/* id = */ R.id.btn_daftarpotensi)
        btnDetailKegiatanActivity.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when(v?.id){
            R.id.btn_daftarpotensi -> {
                val intent =
                    Intent(this@DetailKegiatanActivity, DaftarKegiatanActivity::class.java)
                startActivity(intent)
            }
        }
    }
}