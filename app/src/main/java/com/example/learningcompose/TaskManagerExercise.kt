package com.example.learningcompose

import android.graphics.Paint.Align
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.learningcompose.ui.theme.LearningComposeTheme

class TaskManagerExercise : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LearningComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    AllTasksCompleted()
                }
            }
        }
    }
}

@Composable
fun AllTasksCompleted(modifier: Modifier = Modifier) {
    val image = painterResource(id = R.drawable.ic_task_completed)
    Column (verticalArrangement = Arrangement.Center) {
        Image(
            painter = image,
            contentDescription = stringResource(R.string.all_tasks_completed),
            modifier = modifier.align(Alignment.CenterHorizontally)
        )
        Text(
            text = stringResource(id = R.string.all_tasks_completed),
            textAlign = TextAlign.Center,
            fontWeight = FontWeight.Black,
            modifier = modifier.padding(top = 24.dp, bottom = 8.dp).align(Alignment.CenterHorizontally)
        )
        Text(
            text = stringResource(R.string.nice_work),
            modifier = modifier.align(Alignment.CenterHorizontally)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview2() {
    LearningComposeTheme {
        AllTasksCompleted()
    }
}