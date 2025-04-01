package com.example.studyapp.view

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp

@Composable
fun StudyDetail() {
    val name = "Data Science 부트캠프"
    val description = "데이터 과학과 머신 러닝에 관심이 있는 사람들을 위한 스터디입니다. 매주 4번씩 정기적으로 모임을 가질 예정입니다."
    val date = "매주 월, 수, 금, 일"
    val time = "20:00 ~ 21:00"
    val method = "온라인 회의"
    val tag = "데이터 과학, 머신 러닝"

    Column(
        modifier = Modifier.fillMaxSize().padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = name, fontWeight = FontWeight.Bold) // 이름 출력

        Text(text = description)    // 설명 출력

        Divider(color = Color.Gray, thickness = 1.dp)

        Row(    // 회의 날짜, 시간 출력
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(text = "회의", fontWeight = FontWeight.Bold)
            Text(text = "${date} ${time}")
        }

        Row(    // 방식 출력
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(text = "방식", fontWeight = FontWeight.Bold)
            Text(text = method)
        }

        Row(    // 태그 출력
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(text = "태그", fontWeight = FontWeight.Bold)
            Text(text = tag)
        }
    }
}