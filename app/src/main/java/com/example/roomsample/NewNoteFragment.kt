package com.example.roomsample

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.roomsample.databinding.FragmentListBinding
import com.example.roomsample.databinding.FragmentNewNoteBinding


class NewNoteFragment : Fragment() {


    private var _binding: FragmentNewNoteBinding? = null


    // This property is only valid between onCreateView and onDestroyView.
    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentNewNoteBinding.inflate(inflater, container, false)
        return binding.root

    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        // butona tıklama özelliği burada eklenebilir.




    }






    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}