package com.app.smartkost

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.app.smartkost.databinding.ActivityOverviewBinding

class OverviewActivity : AppCompatActivity() {
    private lateinit var binding: ActivityOverviewBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityOverviewBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Mengatur tombol CCTV
        binding.btnCctv1.setOnClickListener {
            Toast.makeText(this, "CCTV 1 selected", Toast.LENGTH_SHORT).show()
        }

        binding.btnCctv2.setOnClickListener {
            Toast.makeText(this, "CCTV 2 selected", Toast.LENGTH_SHORT).show()
        }

        binding.btnCctv3.setOnClickListener {
            Toast.makeText(this, "CCTV 3 selected", Toast.LENGTH_SHORT).show()
        }

        binding.btnCctv4.setOnClickListener {
            Toast.makeText(this, "CCTV 4 selected", Toast.LENGTH_SHORT).show()
        }

        binding.btnCctv5.setOnClickListener {
            Toast.makeText(this, "CCTV 5 selected", Toast.LENGTH_SHORT).show()
        }

        // Mengatur tombol kamar
        binding.gridButton01.setOnClickListener {
            Toast.makeText(this, "Room 01 clicked", Toast.LENGTH_SHORT).show()
        }
        binding.gridButton02.setOnClickListener {
            Toast.makeText(this, "Room 02 clicked", Toast.LENGTH_SHORT).show()
        }
        binding.gridButton03.setOnClickListener {
            Toast.makeText(this, "Room 03 clicked", Toast.LENGTH_SHORT).show()
        }
        binding.gridButton04.setOnClickListener {
            Toast.makeText(this, "Room 04 clicked", Toast.LENGTH_SHORT).show()
        }
        binding.gridButton05.setOnClickListener {
            Toast.makeText(this, "Room 05 clicked", Toast.LENGTH_SHORT).show()
        }
        binding.gridButton06.setOnClickListener {
            Toast.makeText(this, "Room 06 clicked", Toast.LENGTH_SHORT).show()
        }
    }
}
