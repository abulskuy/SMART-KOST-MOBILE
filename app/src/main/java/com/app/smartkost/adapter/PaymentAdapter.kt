package com.app.smartkost.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.app.smartkost.databinding.ItemPaymentBinding
import com.app.smartkost.model.Payment

class PaymentAdapter(private val paymentList: List<Payment>) :
    RecyclerView.Adapter<PaymentAdapter.PaymentViewHolder>() {

    class PaymentViewHolder(private val binding: ItemPaymentBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(payment: Payment) {
            binding.tvRoomNumber.text = "KAMAR\n${payment.roomNumber}"
            binding.tvName.text = payment.name
            binding.tvPayment.text = "Pembayaran\n${payment.payment}"
            binding.tvRentStatus.text = "Sewa\n${payment.rentStatus}"
            binding.tvElectricity.text = "Listrik\n${payment.electricity}"
            binding.tvWater.text = "Air\n${payment.water}"
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PaymentViewHolder {
        val binding = ItemPaymentBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
        return PaymentViewHolder(binding)
    }

    override fun onBindViewHolder(holder: PaymentViewHolder, position: Int) {
        holder.bind(paymentList[position])
    }

    override fun getItemCount(): Int = paymentList.size
}
