package com.example.studyapp.view

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.navigation.NavHostController
import com.example.studyapp.R
import com.example.studyapp.ui.DetailStudy

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DetailStudyScreen(navController: NavHostController) {
    val name = "Data Science 부트캠프"

    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text(name) },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = colorResource(id = R.color.main_blue),
                    titleContentColor = Color.White
                )
            )
        }
    ) { paddingValues ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues),
            verticalArrangement = Arrangement.Center
        ) {
            DetailStudy()  // 스터디 정보
        }
    }
}