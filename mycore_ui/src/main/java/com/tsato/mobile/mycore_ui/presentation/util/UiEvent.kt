package com.tsato.mobile.mycore_ui.presentation.util

sealed class UiEvent: Event() {
    data class ShowSnackbar(val uiText: UiText) : UiEvent()
    data class ShowToast(val uiText: UiText) : UiEvent()
    data class ShowDialog(val title: UiText, val body: UiText) : UiEvent()
    data class Navigate(val route: String) : UiEvent()
    object NavigateUp : UiEvent()
    object Do : UiEvent()
}