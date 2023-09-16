package com.example.fubner    //it is the package name for our application

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Refresh
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.fubner.ui.theme.FubnerTheme
// above line is used to import libraries or package to execute our instructions
// creating main class for main activity like front UI for our app
class MainActivity : ComponentActivity() {
    @SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?)  // function is overriding to create the function oncreate
    {
        super.onCreate(savedInstanceState)
        // below line is used to create the content in UI for our application
        setContent{
            // below line is used to create the theme in our appliaction
            FubnerTheme {
                // scaffold is used to provide the slots for the top app or a bottom app bar
                    Scaffold(
                        // below line topBar is used to show both navigation and status bar combinely
                        topBar = {
                            // TopBarApp is used to display the content in top bar of application
                            TopAppBar (
                                // title in the top bar will show with below line
                                title = { Text(text = "FUBNER")},
                                //here navigation icon is used as our menu option is come under the library in navigationIcon
                            navigationIcon = {
                                IconButton(onClick = {  }) {
                                    Icon(Icons.Filled.Menu, contentDescription = "menu" )
                                }
                            },
                                //here action icon is used as our menu option is come under the library in action
                            actions = {
                                IconButton(onClick = {  }) {
                                    Icon(Icons.Filled.Notifications, contentDescription = "noti" )
                                }
                                IconButton(onClick = {  }) {
                                    Icon(Icons.Filled.Search, contentDescription = "search" )
                                }
                            }
                            )
                        },
                        floatingActionButton = {
                            FloatingActionButton(onClick = { }) {
                                IconButton(onClick = { }) {
                                  Icon(Icons.Filled.Refresh, contentDescription = "refresh"  )
                                }

                            }
                        }

                    ) {
                         Greeting(name = "users")
                    }
                        }

            }
        }
    }

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

