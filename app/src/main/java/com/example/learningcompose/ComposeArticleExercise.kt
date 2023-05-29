package com.example.learningcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.learningcompose.ui.theme.LearningComposeTheme

class ComposeArticleExercise : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LearningComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Article()
                }
            }
        }
    }
}

@Composable
fun Article(modifier: Modifier = Modifier) {
    val articleImage = painterResource(id = R.drawable.bg_compose_background)
    Column() {
        Image(
            painter = articleImage,
            contentDescription = stringResource(id = R.string.tutorial_name),
            contentScale = ContentScale.FillWidth
        )
        Box(modifier = modifier.padding(16.dp)) {
            Column {
                Text(
                    text = stringResource(id = R.string.tutorial_name),
                    fontSize = 24.sp,
                    modifier = modifier.padding(bottom = 16.dp)
                )
                Text(
                    text = stringResource(id = R.string.tutorial_text_1),
                    textAlign = TextAlign.Justify,
                    modifier = modifier.padding(bottom = 16.dp)
                )
                Text(
                    text = stringResource(id = R.string.tutorial_text_2),
                    textAlign = TextAlign.Justify,
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    LearningComposeTheme {
        Article()
    }
}