package com.example.uts.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.appcompat.app.AlertDialog
import androidx.core.app.ActivityCompat.finishAffinity
import androidx.fragment.app.Fragment
import com.example.uts.R
import com.example.uts.databinding.FragmentFMenuBinding
import com.example.uts.databinding.FragmentFMoneyconvBinding


class FMenu : Fragment() {

    private lateinit var binding: FragmentFMenuBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentFMenuBinding.inflate(inflater, container, false)
        val view = binding.root
        return view

    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.LBtn4.setOnClickListener {
            val builder = AlertDialog.Builder(requireContext())
            builder.setTitle("Keluar dari Aplikasi")
            builder.setMessage("Apakah Anda yakin ingin keluar dari aplikasi?")
            builder.setPositiveButton("Ya") { dialog, which ->
                // Implementasi logika ketika pengguna mengklik "Ya" untuk keluar
                requireActivity().finishAffinity() // Mengakhiri semua aktivitas dan keluar dari aplikasi
            }
            builder.setNegativeButton("Tidak") { dialog, which ->
                // Implementasi logika ketika pengguna mengklik "Tidak"
                dialog.dismiss() // Menutup dialog tanpa melakukan apa-apa
            }

            val dialog: AlertDialog = builder.create()
            dialog.show()
        }
    }
}
