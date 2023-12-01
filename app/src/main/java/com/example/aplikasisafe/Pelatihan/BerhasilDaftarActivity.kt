package com.example.aplikasisafe.Pelatihan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.example.aplikasisafe.MainActivity
import com.example.aplikasisafe.R

class BerhasilDaftarActivity : AppCompatActivity(), View.OnClickListener{
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_berhasil_daftar)
        val btnBerhasilDaftarActivity: Button = findViewById(/* id = */ R.id.btn_doneHome)
        btnBerhasilDaftarActivity.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when(v?.id){
            R.id.btn_doneHome -> {
                val intent =
                    Intent(this, MainActivity::class.java)
                startActivity(intent)
            }
        }
    }
}