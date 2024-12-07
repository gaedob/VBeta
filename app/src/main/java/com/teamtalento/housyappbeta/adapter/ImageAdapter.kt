package com.teamtalento.housyappbeta.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.teamtalento.housyappbeta.R

private fun Any.findViewById(id: Int, s: String) {

}

class ImageAdapter(private val images: List<Int>) : RecyclerView.Adapter<ImageAdapter.ImageViewHolder>() {

    // ViewHolder: Representa una fila o elemento del RecyclerView
    class ImageViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val imageView: ImageView = view.findViewById(R.id.imageviewDetails)// ImageView del layout
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ImageViewHolder {
        // Inflar el diseño del elemento (activity_details.xml)
        val view = LayoutInflater.from(parent.context).inflate(R.layout.activity_details, parent, false)
        return ImageViewHolder(view)
    }

    override fun onBindViewHolder(holder: ImageViewHolder, position: Int) {
        // Configurar el contenido de cada elemento
        holder.imageView.setImageResource(images[position])
    }

    override fun getItemCount(): Int = images.size // Tamaño de la lista
}
