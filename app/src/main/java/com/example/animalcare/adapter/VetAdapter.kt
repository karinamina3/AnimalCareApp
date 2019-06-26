package com.example.animalcare.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.animalcare.R
import com.example.animalcare.database.entities.vet_entity
import kotlinx.android.synthetic.main.cardview_vet.view.*

class VetAdapter(var vets: List<vet_entity>) : RecyclerView.Adapter<VetAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.cardview_vet, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return vets.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(vets[position])
    }

    fun updateList(newVet: List<vet_entity>) {
        newVet.forEach {
            println("Nueva Vet")
            println(newVet.get(1).nombre_vet)
        }
        this.vets = newVet
        notifyDataSetChanged()
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bind(vet: vet_entity) = with(itemView) {

            Glide.with(this)
                    .load(vet.img_vet)
                    .placeholder(R.drawable.ic_launcher_background)
                    .into(img_vet)

            this.tv_nombreVet.text = vet.nombre_vet
            this.tv_telefonoVet.text = vet.telefono_vet
        }
    }
}