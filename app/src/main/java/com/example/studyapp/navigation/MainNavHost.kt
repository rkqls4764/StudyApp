package com.example.studyapp.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.studyapp.view.CalendarScreen
import com.example.studyapp.view.JoiningStudyScreen
import com.example.studyapp.view.LoginScreen

@Composable
fun MainNavHost(navController: NavHostController) {
    NavHost(navController = navController, startDestination = "Login") {
        composable("Login") { LoginScreen(navController) }
        composable("JoiningStudy") { JoiningStudyScreen(navController) }
        composable("Calendar") { CalendarScreen(navController) }
    }
}