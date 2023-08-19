package com.rushi.photofinder.navigation

sealed class Screen(val route : String){
    object Home : Screen("homeScreen")
    object Search: Screen("searchScreen")
}
