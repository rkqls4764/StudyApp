package com.example.studyapp.view

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.studyapp.R
import com.example.studyapp.ui.StudyItem

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun JoiningStudyScreen(navController: NavHostController) {
    val studyList = listOf("스터디1", "스터디2", "스터디3")

    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("가입 중인 스터디") },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = colorResource(id = R.color.main_blue),
                    titleContentColor = Color.White
                )
            )
        }
    ) { paddingValues ->
        Column(modifier = Modifier.padding(paddingValues)) {
            LazyColumn(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(16.dp)
            ) {
                items(studyList) { study ->
                    StudyItem(study, "일정 관리", onButtonClick = {
                        // 일정 관리 화면으로 이동
                    })
                }
            }
        }
    }
}