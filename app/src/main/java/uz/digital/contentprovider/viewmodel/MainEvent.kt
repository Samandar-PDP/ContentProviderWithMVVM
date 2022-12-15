package uz.digital.contentprovider.viewmodel

import uz.digital.contentprovider.model.Student

sealed class MainEvent  {
    object OnNext: MainEvent()
    object OnPrev: MainEvent()
    data class OnSaveStudent(val student: Student): MainEvent()
    data class OnDeleteStudent(val name: String):MainEvent()
    data class OnUpdateStudent(val student: Student) :MainEvent()
}