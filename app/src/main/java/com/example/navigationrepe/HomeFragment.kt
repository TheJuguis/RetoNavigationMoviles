package com.example.navigationrepe

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import com.example.navigationrepe.databinding.ActivityMainBinding
import com.example.navigationrepe.databinding.FragmentHomeBinding


class HomeFragment : Fragment() {

    private lateinit var binding: FragmentHomeBinding



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        //binding = FragmentHomeBinding.inflate(inflater, container, false)
        binding = FragmentHomeBinding.inflate(layoutInflater)

        //onclick

        val navController = findNavController()
        binding.buttonHomeToInside.setOnClickListener{
            Toast.makeText(context, "prueba",Toast.LENGTH_SHORT).show()
            //navController.navigate(R.id.action_homeFragment_to_insideHome)
            val nomVal = binding.nombre.text.toString()
            val aPaVal = binding.aPaterno.text.toString()
            val aMaVal = binding.aMaterno.text.toString()
            val edadVal = binding.edad.text.toString()
            val correoVal = binding.correo.text.toString()

            val directions = HomeFragmentDirections.actionHomeFragmentToInsideHome(nomVal,aPaVal,aMaVal,edadVal,correoVal)
            navController.navigate(directions)
        }


        return binding.root
    }


}