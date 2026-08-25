package com.example.projectcircle

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.projectcircle.ui.theme.ProjectCircleTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            ProjectCircleTheme {
                CircleScreen()
            }
        }
    }
}

data class Circle(
    val name: String,
    var memberCount: Int = 0,
    val isPrivate: Boolean = false,
    val description: String? = null
)

@Composable
fun CircleScreen() {
    Column {
        Text(
            text = "Welcome to Circle!"
        )

        Spacer(
            modifier = Modifier.height(16.dp)
        )

        Text(
            text = "Your communities, your people."
        )

        Spacer(
            modifier = Modifier.height(16.dp)
        )

        val gaming = Circle(
            name = "Gaming",
            memberCount = 7,
            isPrivate = false,
            description = "Gaming with friends"
        )

        val collegeFriends = Circle(
            name = "College Friends",
            memberCount = 12,
            isPrivate = true,
            description = "For college friends"
        )

        CircleCard(gaming)
        CircleCard(collegeFriends)
    }
}

@Composable
fun CircleCard(circle: Circle) {
    Card {
        Column (
            modifier = Modifier.padding(16.dp)
        ) {
            Text(circle.name)
            Text("${circle.memberCount} members")
            Text(
                if (circle.isPrivate) {
                    "Private"
                } else {
                    "Public"
                }
            )
        }
    }
}