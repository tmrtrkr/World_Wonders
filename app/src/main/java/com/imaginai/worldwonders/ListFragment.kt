package com.imaginai.worldwonders

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.view.get
import androidx.navigation.NavDirections
import androidx.navigation.fragment.findNavController
import com.imaginai.worldwonders.databinding.FragmentListBinding


class ListFragment : Fragment() {

    private var _binding: FragmentListBinding? = null

    private val binding get() = _binding!!


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentListBinding.inflate(inflater, container, false)
        val view = binding.root

        binding.toArtemisBtn.setOnClickListener{

            val wonder = Wonder("Temple of Artemis", R.drawable.artemis)
            val action: NavDirections = ListFragmentDirections.actionListFragmentToFragmentDetail(wonder)
            findNavController().navigate(action)

        }

        binding.toGizaBtn.setOnClickListener{

            val wonder = Wonder("Giza Pyramid", R.drawable.giza)
            val action: NavDirections = ListFragmentDirections.actionListFragmentToFragmentDetail(wonder)
            findNavController().navigate(action)

        }

        binding.toHalicarnassus.setOnClickListener{

            val wonder = Wonder("Halicarnassus Mausoleum", R.drawable.halikarnas)
            val action: NavDirections = ListFragmentDirections.actionListFragmentToFragmentDetail(wonder)
            findNavController().navigate(action)

        }

        binding.toGardensBtn.setOnClickListener{

            val wonder = Wonder("Hanging Gardens", R.drawable.asma_bahce)
            val action: NavDirections = ListFragmentDirections.actionListFragmentToFragmentDetail(wonder)
            findNavController().navigate(action)

        }
        binding.toLighthouseBtn.setOnClickListener{

            val wonder = Wonder("Lighthouse of Alexanderia", R.drawable.iskenderiyefeneri)
            val action: NavDirections = ListFragmentDirections.actionListFragmentToFragmentDetail(wonder)
            findNavController().navigate(action)

        }
        binding.toRodosBtn.setOnClickListener{

            val wonder = Wonder("Colossus of Rhodes", R.drawable.rodos_heykeli)
            val action: NavDirections = ListFragmentDirections.actionListFragmentToFragmentDetail(wonder)
            findNavController().navigate(action)

        }
        binding.toZeusBtn.setOnClickListener{

            val wonder = Wonder("Statue of Zeus", R.drawable.zeus_heykeli)
            val action: NavDirections = ListFragmentDirections.actionListFragmentToFragmentDetail(wonder)
            findNavController().navigate(action)

        }




        return view
    }





    }
