package com.example.challenge1stpartial

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import edu.itesm.stanley.Anime


class AnimesAdapter (private val animes : List<Anime>, val context: Context)
    : RecyclerView.Adapter<AnimesAdapter.AnimeViewHolder>(){

    inner class AnimeViewHolder(renglon: View) : RecyclerView.ViewHolder(renglon){
        var titulo = renglon.findViewById<TextView>(R.id.titulo)
        var anio = renglon.findViewById<TextView>(R.id.anio)
        var plot = renglon.findViewById<TextView>(R.id.plot)
        var foto = renglon.findViewById<ImageView>(R.id.foto)
        var tipo = renglon.findViewById<TextView>(R.id.tipo)
        var rank = renglon.findViewById<TextView>(R.id.rank)
    }

    //Crea el renglón
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AnimeViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val renglon_vista = inflater.inflate(R.layout.animes_renglon,parent, false)
        return AnimeViewHolder(renglon_vista)
    }

    //Asocia datos con los elementos del renglón
    override fun onBindViewHolder(holder: AnimeViewHolder, position: Int) {
        val anime = animes[position]
        holder.foto.setImageResource(anime.picture)
        holder.titulo.text = anime.titulo
        holder.anio.text = anime.anio
        holder.plot.text = anime.plot
        holder.tipo.text = anime.tipo
        holder.rank.text = anime.rank.toString()

        holder.itemView.setOnClickListener {
            var toast = Toast.makeText(context, "El rank de ${anime.titulo} es: ${anime.rank.toString()}", Toast.LENGTH_LONG)
            toast.show()
            val action = AnimesFragmentDirections.actionAnimesFragmentToAnimeFragment(anime)
            holder.itemView.findNavController().navigate(action)

        }

    }

    // Cuantos elementos tiene la lista
    override fun getItemCount(): Int {
        return animes.size
    }
}