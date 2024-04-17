package com.imaginai.worldwonders

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavDirections
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.imaginai.worldwonders.databinding.FragmentDetailBinding

class FragmentDetail : Fragment() {

    private val args by navArgs<FragmentDetailArgs>()

    private var _binding: FragmentDetailBinding? = null

    private val binding get() = _binding!!


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentDetailBinding.inflate(inflater, container, false)
        val view = binding.root

        binding.textView2.text = "${args.CurrentWonder.name}"
        binding.imageView2.setImageResource(args.CurrentWonder.ImgW)


        binding.BackB.setOnClickListener{
            val action: NavDirections = FragmentDetailDirections.actionFragmentDetailToListFragment()
            findNavController().navigate(action)
        }

        return view
    }


}