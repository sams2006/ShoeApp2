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
import com.example.shoeapp.databinding.FragmentInstructionBinding



class InstructionFragment : Fragment() {

    private lateinit var  binding: FragmentInstructionBinding
    private val viewModel: ShoeViewModel by activityViewModels()



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
       binding = DataBindingUtil.inflate(inflater , R.layout.fragment_instruction , container , false)

        binding.viewModel = viewModel

        viewModel.eventInstruction.observe(viewLifecycleOwner , Observer {
            if (it){
                findNavController().navigate(InstructionFragmentDirections.actionInstructionFragmentToShoeListFragment())
                viewModel.instructionComplete()
            }
        })



        return binding.root
    }


}