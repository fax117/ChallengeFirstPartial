package com.example.challenge1stpartial

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import kotlinx.android.synthetic.main.fragment_anime.*

/**
 * A simple [Fragment] subclass.
 * Use the [AnimeFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class AnimeFragment : Fragment() {
    private val args by navArgs<AnimeFragmentArgs>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_anime, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        foto.setImageResource(args.anime.picture)
        titulo.text = args.anime.titulo
        anio.text = args.anime.anio
        plot.text = args.anime.plot
        tipo.text = args.anime.tipo

    }

}