package com.example.studyapp.view

import android.inputmethodservice.Keyboard
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.Button
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
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.studyapp.R

@OptIn(ExperimentalMaterial3Api::class)
@Preview(showBackground = true)
@Composable
fun RecruitScreen() {
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
                Icon(Icons.Filled.Add, contentDescription = "Add")
            }
        }
    ) { paddingValues ->
        Column(modifier = Modifier.padding(paddingValues)) {
            Row {   // 검색 바
                TextField( // 검색어 입력 필드
                    value = searchText,
                    onValueChange = { /* viewModel 값 변경 */ },
                    label = { Text("검색어") }
                )
                Button( // 검색 버튼
                    onClick = { /*TODO*/ }
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
                    StudyItem(study)
                }
            }
        }
    }
}

@Composable
fun StudyItem(studyName: String) {
    Box(
        modifier = Modifier.fillMaxWidth().padding(vertical = 8.dp)
    ) {
        Text(
            text = studyName,
            modifier = Modifier.padding(16.dp)
        )
    }
}