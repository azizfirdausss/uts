package com.example.uts.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.uts.R
import com.example.uts.databinding.FragmentFConversionBinding


class FConversion : Fragment() {
    private lateinit var binding: FragmentFConversionBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentFConversionBinding.inflate(inflater, container, false)

        binding.weightpicker.minValue = 30
        binding.weightpicker.maxValue = 150

        binding.heightpicker.minValue = 100
        binding.heightpicker.maxValue = 250

        binding.weightpicker.setOnValueChangedListener { _, _, _ ->
            calculateBMI()
        }
        binding.heightpicker.setOnValueChangedListener { _, _, _ ->
            calculateBMI()
        }

        // Restore state if available
        savedInstanceState?.let {
            binding.weightpicker.value = it.getInt("weight", 30)
            binding.heightpicker.value = it.getInt("height", 100)
        }

        return binding.root
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putInt("weight", binding.weightpicker.value)
        outState.putInt("height", binding.heightpicker.value)
    }

    private fun calculateBMI() {
        val height = binding.heightpicker.value
        val doubleHeight = height.toDouble() / 100

        val weight = binding.weightpicker.value
        val bmi = weight.toDouble() / (doubleHeight * doubleHeight)

        binding.resultTV.text = String.format("BMI kamu adalah: %.2f", bmi)
        binding.resultTV.append("\nKeterangan: " + healthyMessage(bmi))
    }

    private fun healthyMessage(bmi: Double): String {
        return when {
            bmi < 18.5 -> "Berat badan kurang"
            bmi < 24.9 -> "Sehat"
            bmi < 29.9 -> "Kegemukan"
            else -> "Obesitas"
        }
    }

}
