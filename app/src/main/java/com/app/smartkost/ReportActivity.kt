package com.app.smartkost

import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.cardview.widget.CardView
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ReportActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_report)

        // Toolbar setup
        val toolbar: Toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        toolbar.setNavigationOnClickListener {
            finish() // Kembali ke activity sebelumnya
        }

        // Mengatur padding untuk sistem insets
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Penanganan klik pada card
        findViewById<CardView>(R.id.cardExpenses).setOnClickListener {
            Toast.makeText(this, "Pengeluaran clicked", Toast.LENGTH_SHORT).show()
        }

        findViewById<CardView>(R.id.cardIncome).setOnClickListener {
            Toast.makeText(this, "Pemasukan clicked", Toast.LENGTH_SHORT).show()
        }

        findViewById<CardView>(R.id.cardReport).setOnClickListener {
            Toast.makeText(this, "Laporan clicked", Toast.LENGTH_SHORT).show()
        }

        findViewById<CardView>(R.id.cardProfit).setOnClickListener {
            Toast.makeText(this, "Keuntungan clicked", Toast.LENGTH_SHORT).show()
        }
    }
}
