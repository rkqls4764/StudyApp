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

sealed class CalendarBottomNavItems(
    val route: String,
    val title: String,
    val icon: Int
) {
    object Calendar: CalendarBottomNavItems(
        route = "Calendar",
        title = "캘린더",
        icon = R.drawable.ic_calendar
    )
    object Chating: CalendarBottomNavItems(
        route = "Chating",
        title = "채팅",
        icon = R.drawable.ic_chatbot
    )
    object DetailStudy: CalendarBottomNavItems(
        route = "DetailStudy",
        title = "스터디 정보",
        icon = R.drawable.ic_detail_study
    )
}

@Composable
fun CalendarBottomNavigationBar(navController: NavController) {
    val items = listOf(
        CalendarBottomNavItems.Calendar,
        CalendarBottomNavItems.Chating,
        CalendarBottomNavItems.DetailStudy
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