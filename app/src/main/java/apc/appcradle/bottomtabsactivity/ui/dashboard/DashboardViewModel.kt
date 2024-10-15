package apc.appcradle.bottomtabsactivity.ui.dashboard

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class DashboardViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply { value = "This is Image Fragment" }
    val text: LiveData<String> = _text
}