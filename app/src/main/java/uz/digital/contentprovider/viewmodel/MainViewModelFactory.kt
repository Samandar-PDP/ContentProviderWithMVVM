package uz.digital.contentprovider.viewmodel

import android.app.Application
import android.content.ContentResolver
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import uz.digital.contentprovider.MainActivity

class MainViewModelFactory(
    private val contentResolver: ContentResolver
) :ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return MainViewModel(contentResolver) as T
    }
}