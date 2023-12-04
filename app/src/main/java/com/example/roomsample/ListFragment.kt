package com.example.roomsample

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.roomsample.databinding.FragmentListBinding


class ListFragment : Fragment() {
    private var _binding: FragmentListBinding? = null


    // This property is only valid between onCreateView and onDestroyView.
    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentListBinding.inflate(inflater, container, false)
        return binding.root

    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        // butona tıklama özelliği burada eklenebilir.

        binding.createNoteButton.setOnClickListener {
            val create = binding.createNoteButton
            val action = ListFragmentDirections.actionListFragmentToNewNoteFragment()
            findNavController().navigate(action)  //bu kod ile yeni bir fragmenta geçiş sağladık safe-args.

        }


        }






    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    }