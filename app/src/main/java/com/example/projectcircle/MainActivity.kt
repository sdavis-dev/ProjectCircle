package com.example.projectcircle

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
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
        Text(text = "Welcome to Circle!")

        Spacer(modifier = Modifier.height(16.dp))

        Text(text = "Your communities, your people.")

        Spacer(modifier = Modifier.height(16.dp))

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

        val trips = Circle(
            name = "Trips",
            memberCount = 5,
            isPrivate = false,
            description = null
        )

        val circles = listOf(
            gaming,
            collegeFriends,
            trips
        )

        var isMember by remember {
            mutableStateOf(false)
        }

        LazyColumn(
            modifier = Modifier.padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            items(circles) { circle ->
                CircleCard(circle = circle,
                    isMember = isMember,
                    onJoin = {
                        isMember = true
                    })
            }
        }
    }
}

@Composable
fun CircleCard(circle: Circle, isMember: Boolean, onJoin: () -> Unit) {
    Card {
        Column (
            modifier = Modifier.padding(16.dp)
        ) {
            var memberCount by remember {
                mutableStateOf(circle.memberCount)
            }

            Text(circle.name)
            Text("$memberCount members")
            Text(
                if (circle.isPrivate) {
                    "Private"
                } else {
                    "Public"
                }
            )
            Text(text = circle.description ?: "No description")

            Button(
                onClick = {
                    if (!isMember) {
                        onJoin()
                        memberCount += 1
                    }
                }
            ) {
                Text(
                    if (isMember) {
                        "Joined"
                    } else {
                        "Join Circle"
                    }
                )
            }
        }
    }
}