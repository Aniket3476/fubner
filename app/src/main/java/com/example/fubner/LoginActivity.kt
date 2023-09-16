package com.example.fubner
import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Refresh
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.fubner.ui.theme.FubnerTheme

class LoginActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterial3Api::class)
    @SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FubnerTheme {

                Surface(modifier = Modifier.fillMaxSize()) {
                    Scaffold(
                        topBar = {
                            TopAppBar(
                                title = { Text(text = "FUBNER") },
                                navigationIcon = {
                                    IconButton(onClick = {}) {
                                        Icon(
                                            Image(
                                                painter = painterResource(id = R.drawable.sahilm),
                                                contentDescription = "", modifier = Modifier
                                                    .padding(1.dp)
                                                    .size(80.dp)
                                                    .clip(CircleShape)
                                                    .border(2.5f.dp, Color.Magenta, RoundedCornerShape(50))

                                            )
                                        )
                                    }
                                },
                                actions = {
                                    IconButton(onClick = { }) {
                                        Icon(
                                            Icons.Filled.Notifications,
                                            contentDescription = "noti"
                                        )
                                    }
                                    IconButton(onClick = { }) {
                                        Icon(Icons.Filled.Search, contentDescription = "search")
                                    }
                                }
                            )
                        },


                        floatingActionButton = {
                            FloatingActionButton(onClick = { }) {
                                IconButton(onClick = { }) {
                                    Icon(Icons.Filled.Refresh, contentDescription = "refresh")
                                }

                            }
                        }

                    ) {
                        Box(modifier = Modifier.fillMaxSize()) {
                            Image(
                                modifier = Modifier.fillMaxSize(),
                                painter = painterResource(id = R.drawable.wallpaper),
                                contentDescription = "",
                                contentScale = ContentScale.FillBounds
                            )
                        }
                    }
                    LoginScreen()
                }

            }

        }
    }
    private fun Icon(image: Unit) {

    }

    private fun logged(username: String ,password: String){
        if(username=="Sahil88" && password== "@Sahil88.")
        {
            Toast.makeText(this, "logged!!",Toast.LENGTH_SHORT).show()

        }
        else
        {
            Toast.makeText(this , "wrong credentials!!",Toast.LENGTH_SHORT).show()
        }
    }

    @OptIn(ExperimentalMaterial3Api::class)
    @Composable
    fun LoginScreen() {
        val username = remember { mutableStateOf(value = "")}
        val password = remember { mutableStateOf(value = "")}
        Column (
            modifier = Modifier
                .fillMaxSize()
                .padding(20.dp),
            verticalArrangement = Arrangement.Center,
        ) {
            Text(
                text = "Login Credentials",
                color = Color.Cyan,
                fontSize = 30.sp,
                fontFamily = FontFamily.Monospace,
                fontWeight = FontWeight.Bold
            )

            OutlinedTextField(
                value = username.value,
                onValueChange = {
                    username.value = it
                },
                leadingIcon = {
                    Icon(Icons.Default.Person, contentDescription = "person")
                },
                label = {
                    Text(text = "Username")
                },
                placeholder = {
                    Text(text = "Enter Username")
                },
                modifier = Modifier
                    .fillMaxWidth()
            )
            OutlinedTextField(
                value = password.value,
                onValueChange = {
                    password.value = it
                },
                leadingIcon = {
                    Icon(Icons.Default.Person, contentDescription = "person")
                },
                label = {
                    Text(text = "Password")
                },
                placeholder = {
                    Text(text = "Enter Password")
                },
                modifier = Modifier
                    .fillMaxWidth()
            )
            OutlinedButton(
                onClick = { logged(username.value, password.value) },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 10.dp)
            ) {
                Text(text = "Login")

            }
            Text(
                text = "New User",
                color = Color.White,
                fontSize = 15.sp,
                fontFamily = FontFamily.Monospace,
                fontWeight = FontWeight.Bold
            )
            OutlinedTextField(
                value = "Any",
                onValueChange = {
                    password.value = it
                },
                leadingIcon = {
                    Icon(Icons.Default.Person, contentDescription = "person")
                },
                label = {
                    Text(text = "Register")
                },
                placeholder = {
                    Text(text = "New Registration")
                },
                modifier = Modifier
                    .fillMaxWidth()
            )
            OutlinedButton(
                onClick = { logged(username.value, password.value) },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 10.dp)
            ) {
                Text(text = "Enter")

            }
        }
    }
}
