package com.example.shoeapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.shoeapp.databinding.FragmentShoeDetailsBinding

class ShoeDetailsFragment : Fragment() {

    private lateinit var binding: FragmentShoeDetailsBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater , R.layout.fragment_shoe_details , container , false)


        val application = requireNotNull(this.activity).application

        val dataSource = ShoeDataBase.getInstance(application).shoeDao

        val viewModelFactory = SaveShoeViewModelFactory(dataSource , application)

        val saveShoeViewModel = ViewModelProvider(
            this , viewModelFactory)[SaveShoeViewModel::class.java]

        binding.saveShoeViewModel = saveShoeViewModel

        binding.lifecycleOwner = this

        return binding.root
    }


}