package com.example.fubner.nav.Navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.fubner.LoginActivity
import com.example.fubner.RecyclerViewActivity
import com.example.fubner.nav.utils.NavigationScreen

@Composable
fun StartNavigation(){
    val navController= rememberNavController()
    NavHost(navController = navController, startDestination =NavigationScreen.LoginActivity.route ){
        composable(NavigationScreen.LoginActivity.route) {
            LoginActivity(navController)
        }
        composable(NavigationScreen.RecyclerViewActivity.route){
                RecyclerViewActivity()
            }
    }
}