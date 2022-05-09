package com.bilge.travelguide

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bilge.travelguide.databinding.ActivityDetailsBinding

class ActivityDetails : AppCompatActivity() {

    private lateinit var binding: ActivityDetailsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailsBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val intent = intent

        val selectedTravelGuide = intent.getSerializableExtra("TravelGuide") as TravelGuide

        binding.nameText.text = selectedTravelGuide.name
        binding.countryText.text = selectedTravelGuide.country
        binding.informationText.text = selectedTravelGuide.information
        binding.imageView.setImageResource(selectedTravelGuide.image)

    }
}