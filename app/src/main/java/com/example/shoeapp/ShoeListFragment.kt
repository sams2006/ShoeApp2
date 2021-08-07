package com.example.shoeapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.Observer
import androidx.navigation.fragment.findNavController
//import coil.load
import com.example.shoeapp.databinding.FragmentInstructionBinding
import com.example.shoeapp.databinding.FragmentLoginBinding
import com.example.shoeapp.databinding.FragmentShoeListBinding
import com.example.shoeapp.databinding.ListShoeBinding


class ShoeListFragment : Fragment() {

    private lateinit var binding: FragmentShoeListBinding



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
         binding = DataBindingUtil.inflate(inflater , R.layout.fragment_shoe_list , container , false)




        return binding.root
    }

  

}