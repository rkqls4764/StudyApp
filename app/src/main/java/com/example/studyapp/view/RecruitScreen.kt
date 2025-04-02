package com.example.studyapp.view

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
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
fun RecruitScreen(navController: NavHostController) {
    val searchText = "검색어 예시"
    val studyList = listOf("스터디1", "스터디2", "스터디3")

    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("모집 중인 스터디") },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = colorResource(id = R.color.main_blue),
                    titleContentColor = Color.White
                )
            )
        },
        floatingActionButton = {
            FloatingActionButton(   // 스터디 생성 버튼
                onClick = { /*TODO*/ },
                containerColor = colorResource(id = R.color.sub_blue)
            ) {
                Icon(Icons.Filled.Add, contentDescription = "Add", tint = Color.White)
            }
        }
    ) { paddingValues ->
        Column(modifier = Modifier.padding(paddingValues)) {
            Row {   // 검색 바
                TextField( // 검색어 입력 필드
                    value = searchText,
                    onValueChange = { /* viewModel 값 변경 */ }
                )
                Button( // 검색 버튼
                    onClick = { /*TODO*/ },
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color.Gray
                    )
                ) {
                    Text("검색")
                }
            }
            // 스터디 목록
            LazyColumn(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(16.dp)
            ) {
                items(studyList) { study ->
                    StudyItem(study, "참여하기", onButtonClick = {
                        // 스터디 참여 화면으로 이동
                    })
                }
            }
        }
    }
}