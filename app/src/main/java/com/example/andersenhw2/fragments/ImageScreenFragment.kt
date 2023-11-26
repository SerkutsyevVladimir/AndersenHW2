package com.example.andersenhw2.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.example.andersenhw2.databinding.FragmentImageScreenBinding

class ImageScreenFragment : Fragment() {

    private var _binding: FragmentImageScreenBinding? = null
    private val binding get() = requireNotNull(_binding) { "View was destroyed" }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return FragmentImageScreenBinding.inflate(inflater, container, false)
            .also { _binding = it }
            .root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        with(binding) {
            uploadButton.setOnClickListener {
                Glide.with(requireActivity())
                    .load(editText.text.toString())
                    .into(imageView)
            }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}