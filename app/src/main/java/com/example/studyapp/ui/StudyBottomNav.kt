package com.example.studyapp.ui

import androidx.compose.foundation.layout.size
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.currentBackStackEntryAsState
import com.example.studyapp.R

sealed class StudyBottomNavItems(
    val route: String,
    val title: String,
    val icon: Int
) {
    object Recruit: StudyBottomNavItems(
        route = "Recruit",
        title = "스터디 가입",
        icon = R.drawable.ic_recruit_study
    )
    object Chating: StudyBottomNavItems(
        route = "Chating",
        title = "채팅",
        icon = R.drawable.ic_chatbot
    )
    object JoiningStudy: StudyBottomNavItems(
        route = "JoiningStudy",
        title = "스터디 조회",
        icon = R.drawable.ic_joining_study
    )
}

@Composable
fun StudyBottomNavigationBar(navController: NavController) {
    val items = listOf(
        StudyBottomNavItems.Recruit,
        StudyBottomNavItems.Chating,
        StudyBottomNavItems.JoiningStudy
    )

    BottomNavigation(
        backgroundColor = colorResource(id = R.color.main_blue)
    ) {
        val navBackStackEntry by navController.currentBackStackEntryAsState()
        val currentRoute = navBackStackEntry?.destination?.route

        items.forEach { item ->
            BottomNavigationItem(
                selected = currentRoute == item.route,
                onClick = {
                    navController.navigate(item.route) {
                        popUpTo(navController.graph.startDestinationId) {
                            saveState = true
                        }
                        launchSingleTop = true
                        restoreState = true
                    }
                },
                icon = {
                    Icon(
                        painterResource(id = item.icon),
                        contentDescription = item.title,
                        modifier = Modifier.size(42.dp)
                    )
                }
            )
        }
    }
}