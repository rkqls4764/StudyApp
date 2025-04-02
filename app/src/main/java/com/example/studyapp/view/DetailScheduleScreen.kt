package com.example.studyapp.view

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import com.example.studyapp.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DetailScheduleScreen(navController: NavHostController) {
    val name = "머신 러닝 공부"
    val description = "머신 러닝 기본 개념 공부\n파이썬으로 선형 회귀 구현"
    val date = "2020년 5월 13일 수요일"
    val time = "20:00 ~ 21:00"

    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("일정 조회하기") },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = colorResource(id = R.color.main_blue),
                    titleContentColor = Color.White
                ),
                // 뒤로 가기 버튼
            )
        }
    ) { paddingValues ->
        Column(
            modifier = Modifier.fillMaxSize().padding(paddingValues),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Row(    // 이름 출력
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(text = "이름", fontWeight = FontWeight.Bold)
                Text(text = name)
            }

            Row(    // 날짜 출력
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(text = "날짜", fontWeight = FontWeight.Bold)
                Text(text = date)
            }

            Row(    // 시간 출력
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(text = "시간", fontWeight = FontWeight.Bold)
                Text(text = time)
            }

            Row(    // 설명 출력
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(text = "설명", fontWeight = FontWeight.Bold)
                Text(text = description)
            }
        }
    }
}