package com.example.fubner.nav.utils

sealed class NavigationScreen(val route:String){
    object LoginActivity: NavigationScreen(route = "firstScreen")
    object RecyclerViewActivity : NavigationScreen(route = "secondScreen")
}
