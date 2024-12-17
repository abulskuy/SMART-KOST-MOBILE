package com.app.smartkost

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.app.smartkost.adapter.PaymentAdapter
import com.app.smartkost.databinding.ActivityPaymentBinding
import com.app.smartkost.model.Payment

class PaymentActivity : AppCompatActivity() {

    private lateinit var binding: ActivityPaymentBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityPaymentBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val paymentList = listOf(
            Payment("01", "RIAN", "Rp.1.000.000", "Isi", "-------", "-------"),
            Payment("02", "BUDI", "Rp.1.500.000", "Kosong", "-------", "-------"),
            Payment("03", "SITA", "Rp.1.200.000", "Isi", "-------", "-------"),
            Payment("04", "ANDI", "Rp.1.800.000", "Isi", "-------", "-------"),
            Payment("05", "JOKO", "Rp.1.400.000", "Isi", "-------", "-------")
        )

        binding.rvPaymentList.layoutManager = LinearLayoutManager(this)
        binding.rvPaymentList.adapter = PaymentAdapter(paymentList)
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed() // Handle back button click
        return true
    }
}
