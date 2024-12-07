package com.teamtalento.housyappbeta.ui.main
import androidx.lifecycle.LiveData
import com.teamtalento.housyappbeta.R
    import androidx.lifecycle.MutableLiveData
    import androidx.lifecycle.ViewModel
import com.teamtalento.housyappbeta.R.id

class MainViewModel : ViewModel() {

        // Lista de imágenes (usando IDs de recursos)
        private val _imageList = MutableLiveData<List<Int>>().apply {
            listOf(
              R.drawable.images__1_,
                R.drawable.images__1_,
                R.drawable.images__1_,
                R.drawable.images__1_,
            ).also { value = it }
        }
        val imageList: LiveData<List<Int>> get() = _imageList
    }