package com.example.happybirthdaylintang

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.happybirthdaylintang.ui.theme.HappyBirthdayLintangTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HappyBirthdayLintangTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Color.Magenta
                ) {
                    HappyBirthdayText(
                        message = "Happy Birthday Musiala!",
                        from = "~From Lintang⚽⚽",
                        modifier = Modifier.padding(8.dp)
                    )
                }
            }
        }
    }
}

@Composable
fun HappyBirthdayText(message: String, from: String, modifier: Modifier = Modifier) {
    Column(
        verticalArrangement = Arrangement.Center,
        modifier = modifier.padding(8.dp)
    ) {
        Image(
            painter = painterResource(id = R.drawable.musiala_cartoon),
            contentDescription = "Image",
            modifier = Modifier
                .size(300.dp)
                .align(alignment = Alignment.CenterHorizontally)
        )
        Text(
            text = message,
            fontSize = 90.sp,
            lineHeight = 120.sp,
            textAlign = TextAlign.Center,
            color = Color.Blue
        )
        Text(
            text = from,
            fontSize = 25.sp,
            color = Color.Cyan,
            modifier = Modifier
                .padding(14.dp)
                .align(alignment = Alignment.End)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun BirthdayCardPreview() {
    HappyBirthdayLintangTheme {
        HappyBirthdayText("Happy Birthday Musiala!", "~From Lintang⚽⚽")
    }
}