package com.example.studyapp.view

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
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
fun AddScheduleScreen(navController: NavHostController) {
    val name = "이름"
    val date = "날짜"
    val time = "시간"
    val description = "설명"

    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("일정 생성하기") },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = colorResource(id = R.color.main_blue),
                    titleContentColor = Color.White
                ),
                // 뒤로 가기 버튼
            )
        }
    ) { paddingValues ->
        Column(
            modifier = Modifier.padding(paddingValues),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Row(    // 이름 입력 필드
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(text = "이름", fontWeight = FontWeight.Bold)
                TextField(value = name, onValueChange = { /* viewModel 값 변경 */ })
            }

            Row(    // 날짜 입력 필드
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(text = "날짜", fontWeight = FontWeight.Bold)
                TextField(value = date, onValueChange = { /* viewModel 값 변경 */ })
            }

            Row(    // 시간 입력 필드
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(text = "시간", fontWeight = FontWeight.Bold)
                TextField(value = time, onValueChange = { /* viewModel 값 변경 */ })
            }

            Row(    // 설명 입력 필드
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(text = "설명", fontWeight = FontWeight.Bold)
                TextField(value = description, onValueChange = { /* viewModel 값 변경 */ })
            }

            Button( // 생성 버튼
                onClick = { /*TODO*/ },
                colors = ButtonDefaults.buttonColors(
                    containerColor = colorResource(id = R.color.sub_blue)
                )
            ) {
                Text(text = "생성하기", fontWeight = FontWeight.Bold, color = Color.White)
            }
        }
    }
}