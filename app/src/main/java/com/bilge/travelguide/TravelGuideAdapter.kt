package com.bilge.travelguide

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bilge.travelguide.databinding.RecyclerRowBinding

class TravelGuideAdapter(val TravelGuideList : ArrayList<TravelGuide>) : RecyclerView.Adapter<TravelGuideAdapter.TravelGuideHolder>() {

    class TravelGuideHolder(val binding: RecyclerRowBinding) : RecyclerView.ViewHolder(binding.root){

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TravelGuideHolder {
        val binding = RecyclerRowBinding.inflate(LayoutInflater.from(parent.context),parent, false)
        return TravelGuideHolder(binding)
    }

    override fun onBindViewHolder(holder: TravelGuideHolder, position: Int) {
        holder.binding.recyclerViewTextView.text = TravelGuideList.get(position).name

        holder.itemView.setOnClickListener {
            val intent = Intent(holder.itemView.context,ActivityDetails::class.java)
            intent.putExtra("TravelGuide",TravelGuideList.get(position))
            holder.itemView.context.startActivity(intent)
        }

    }

    override fun getItemCount(): Int {
        return TravelGuideList.size
    }
}