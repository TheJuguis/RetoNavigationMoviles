package com.example.navigationrepe

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.navigationrepe.databinding.FragmentInsideHomeBinding


class InsideHome : Fragment() {



    private lateinit var binding: FragmentInsideHomeBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentInsideHomeBinding.inflate(layoutInflater)


        val argumentoRecibido = arguments?.getString("argumentoPasado")
        val argumentoRecibido2 = arguments?.getString("nombrePasado")
        val argumentoRecibido3 = arguments?.getString("aMaPasado")
        val argumentoRecibido4 = arguments?.getString("edadPasado")
        val argumentoRecibido5 = arguments?.getString("correoPasado")
        binding.nombreView.setText(argumentoRecibido)
        binding.aPaternoView.setText(argumentoRecibido2)
        binding.aMaternoView.setText(argumentoRecibido3)
        binding.edadView.setText(argumentoRecibido4)
        binding.correoView.setText(argumentoRecibido5)
        return binding.root
    }


}