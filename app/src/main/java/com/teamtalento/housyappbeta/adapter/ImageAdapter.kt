package com.teamtalento.housyappbeta.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.teamtalento.housyappbeta.R
import com.teamtalento.housyappbeta.databinding.ActivityDetailsBinding
import com.teamtalento.housyappbeta.model.Mansion

class ImageAdapter(
    private val images: List<Mansion>) : RecyclerView.Adapter<ImageAdapter.ImageViewHolder>() {

    private lateinit var binding: ActivityDetailsBinding
    var onClick: ((Int) -> Unit)? = null

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ImageViewHolder {
        // Inflar el diseño del elemento (activity_details.xml)
       // val view = LayoutInflater.from(parent.context).inflate(R.layout.activity_details, parent, false)
        binding = ActivityDetailsBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ImageViewHolder(binding)
    }

    override fun getItemCount(): Int = images.size // Tamaño de la lista

    // ViewHolder: Representa una fila o elemento del RecyclerView
//    class ImageViewHolder(view: ActivityDetailsBinding) : RecyclerView.ViewHolder(view) {
//        val imageView: ImageView = view.findViewById(R.id.imageviewDetails)// ImageView del layout
//    }


    override fun onBindViewHolder(holder: ImageViewHolder, position: Int) {
        // Configurar el contenido de cada elemento
        holder.onBind(images[position])

    }

    inner class ImageViewHolder(private val binding: ActivityDetailsBinding) : ViewHolder(binding.root){
        fun onBind(masion: Mansion){
            with(binding) {
                masion.run {

                    textViewStoreAttention.text= masion.officeHours
                    Glide.with(imageViewStore.context)
                        .load(store.photo)
                        .centerCrop()
                        .error(R.drawable.baseline_error_outline_24)
                        .into(binding.imageViewStore)
                }

            }

            binding.imageviewDetails.setOnClickListener {
                onClick?.invoke(store)
            }
        }
    }


}
