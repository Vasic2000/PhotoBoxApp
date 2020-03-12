package cz.vasic2000.myapplication.ui.about

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class AboutDeveloperViewModel : ViewModel() {
    private val _text = MutableLiveData<String>().apply {
        value = "This is about Devrloper Fragment"
    }
    val text: LiveData<String> = _text
}
