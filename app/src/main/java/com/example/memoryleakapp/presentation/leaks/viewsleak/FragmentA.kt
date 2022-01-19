package com.example.memoryleakapp.presentation.leaks.viewsleak

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.memoryleakapp.R
import com.example.memoryleakapp.databinding.FragmentABinding

class FragmentA : Fragment() {
//class FragmentA : Fragment(), ViewBindingHolder<FragmentABinding> {

    private lateinit var binding: FragmentABinding
//    override var binding: FragmentABinding? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentABinding.inflate(inflater, container, false)
        return binding.root

//        registerBinding(requireBinding(), viewLifecycleOwner)
//        return requireBinding().root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.continueButton.setOnClickListener {
            findNavController().navigate(R.id.action_fragmentA_to_fragmentB)
        }

//        requireBinding().continueButton.setOnClickListener {
//            findNavController().navigate(R.id.action_fragmentA_to_fragmentB)
//        }
    }

//    override fun onDestroyView() {
//        super.onDestroyView()
//        binding = null
//    }
}