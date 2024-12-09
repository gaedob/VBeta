package com.teamtalento.housyappbeta.ui.main

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.teamtalento.housyappbeta.R
import com.teamtalento.housyappbeta.adapter.ImageAdapter
import com.teamtalento.housyappbeta.databinding.FragmentMainBinding

class MainFragment : Fragment() {

    private lateinit var viewModel: MainViewModel
    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: ImageAdapter

    private var _binding: FragmentMainBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentMainBinding.inflate(inflater, container, false)
        return binding.root
    }



    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Inflar el diseño del fragmento
       // val view = inflater.inflate(R.layout.fragment_main, container, false)

        // Inicializar RecyclerView
        recyclerView = view.findViewById(R.id.recyclerView)
        recyclerView = view.findViewById(R.id.recyclerView)

        recyclerView.layoutManager = LinearLayoutManager(requireContext())

        // Inicializar ViewModel
        viewModel = ViewModelProvider(this).get(MainViewModel::class.java)

        // Observar los datos del ViewModel
        viewModel.imageList.observe(viewLifecycleOwner) { images ->
            // Configurar el Adapter con la lista de imágenes
            adapter = ImageAdapter(images)
            recyclerView.adapter = adapter
        }

       // navigateToDetails()

    }

    private fun navigateToDetails() {
       adapter.onClick = {

            findNavController().navigate(R.id.action_global_activityDetailsHouse)
       }
    }
}