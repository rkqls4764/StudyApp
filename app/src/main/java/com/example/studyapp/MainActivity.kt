package com.example.studyapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.studyapp.navigation.MainNavHost
import com.example.studyapp.view.AddScheduleScreen
import com.example.studyapp.view.AddStudyScreen
import com.example.studyapp.view.CalendarScreen
import com.example.studyapp.view.ChatingScreen
import com.example.studyapp.view.DetailScheduleScreen
import com.example.studyapp.view.DetailStudyScreen
import com.example.studyapp.view.JoinStudyScreen
import com.example.studyapp.view.JoiningStudyScreen
import com.example.studyapp.view.LoginScreen
import com.example.studyapp.view.RecruitScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val navController = rememberNavController()
            MainNavHost(navController = navController)
        }
    }
}


//@Composable
//fun MainNavHost(navController: NavHostController) {
//    NavHost(navController = navController, startDestination = Screen.Login.route) {
//        composable(Screen.AddSchedule.route) {
//            AddScheduleScreen(navController)
//        }
//        composable(Screen.AddStudy.route) {
//            AddStudyScreen(navController)
//        }
//        composable(Screen.Calendar.route) {
//            CalendarScreen(navController)
//        }
//        composable(Screen.Chating.route) {
//            ChatingScreen(navController)
//        }
//        composable(Screen.DetailSchedule.route) {
//            DetailScheduleScreen(navController)
//        }
//        composable(Screen.DetailStudy.route) {
//            DetailStudyScreen(navController)
//        }
//        composable(Screen.JoiningStudy.route) {
//            JoiningStudyScreen(navController)
//        }
//        composable(Screen.JoinStudy.route) {
//            JoinStudyScreen(navController)
//        }
//        composable(Screen.Login.route) {
//            LoginScreen(navController)
//        }
//        composable(Screen.Recruit.route) {
//            RecruitScreen(navController)
//        }
//    }
//}