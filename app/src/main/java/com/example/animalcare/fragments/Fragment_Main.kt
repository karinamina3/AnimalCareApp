package com.example.animalcare.fragments


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.animalcare.R
import com.example.animalcare.viewModels.ViewModelRoom
import kotlinx.android.synthetic.main.fragment_main.view.*


// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 *
 */
class Fragment_Main : Fragment() {
    lateinit var viewModel: ViewModelRoom

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_main, container, false)

        view.iv_enfermedades.setOnClickListener {
            findNavController().navigate(R.id.action_fragment_Main_to_fragment_enfermedades)
        }

        view.iv_laws.setOnClickListener {
            findNavController().navigate(R.id.action_fragment_Main_to_fragment_leyes)
        }

        view.iv_associations.setOnClickListener {
            findNavController().navigate(R.id.action_fragment_Main_to_fragment_organizaciones)
        }

        view.iv_facts.setOnClickListener {
            findNavController().navigate(R.id.action_fragment_Main_to_fragment_curiosidades)
        }

        view.iv_vet.setOnClickListener {
            findNavController().navigate(R.id.action_fragment_Main_to_fragment_veterinarias)
        }

        view.iv_animal.setOnClickListener {
            findNavController().navigate(R.id.action_fragment_Main_to_fragment_especies)
        }
        
        return view
    }
}
