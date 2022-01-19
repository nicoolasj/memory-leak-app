package com.example.memoryleakapp.presentation.leaks.viewsleak

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.memoryleakapp.databinding.FragmentBBinding

class FragmentB : Fragment() {

    private lateinit var binding: FragmentBBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentBBinding.inflate(inflater, container, false)
        return binding.root
    }
}