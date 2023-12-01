package com.example.aplikasisafe.Pelatihan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.example.aplikasisafe.MainActivity
import com.example.aplikasisafe.R
import com.example.aplikasisafe.databinding.FragmentProfileBinding

class DetailProfilActivity : AppCompatActivity(), View.OnClickListener{
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_profil)
        val btnDetailProfilActivity: Button = findViewById(/* id = */ R.id.btn_simpan)
        btnDetailProfilActivity.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when(v?.id){
            R.id.btn_simpan -> {
                val intent =
                    Intent(this, FragmentProfileBinding::class.java)
                startActivity(intent)
            }
        }
    }
}