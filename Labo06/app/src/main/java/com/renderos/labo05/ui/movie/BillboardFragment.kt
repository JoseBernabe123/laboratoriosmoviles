package com.renderos.labo05.ui.movie

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.cardview.widget.CardView
import androidx.navigation.findNavController
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.renderos.labo05.R

class BillboardFragment : Fragment() {
    private lateinit var btnCreateNewMovie: FloatingActionButton
    private lateinit var starWarsCv: CardView
    private lateinit var harryPotterCv: CardView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_bilborad, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        btnCreateNewMovie = view.findViewById(R.id.btnNavCreateNewMovie)
        starWarsCv = view.findViewById(R.id.starWarsCardView)
        harryPotterCv = view.findViewById(R.id.harryPotterCardView)

        starWarsCv.setOnClickListener {
            it.findNavController().navigate(R.id.action_bilboradFragment_to_createmovieFragment2)
        }

        harryPotterCv.setOnClickListener {
            it.findNavController().navigate(R.id.action_bilboradFragment_to_createmovieFragment2)
        }

        btnCreateNewMovie.setOnClickListener {
            it.findNavController().navigate(R.id.action_bilboradFragment_to_createmovieFragment2)
        }

    }

}