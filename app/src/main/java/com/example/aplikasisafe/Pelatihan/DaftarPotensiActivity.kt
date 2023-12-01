package com.example.aplikasisafe.Pelatihan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.example.aplikasisafe.R

class DaftarPotensiActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_daftar_potensi)
        val btnDaftarPotensiActivity: Button = findViewById(/* id = */ R.id.btnDaftar)
        btnDaftarPotensiActivity.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when(v?.id){
            R.id.btnDaftar -> {
                val intent =
                    Intent(this, BerhasilDaftarActivity::class.java)
                startActivity(intent)
            }
        }
    }
}