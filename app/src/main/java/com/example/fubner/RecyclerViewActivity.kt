package com.example.fubner
import android.media.Image
import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyItemScope
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.SnackbarData
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.modifier.modifierLocalMapOf
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.fubner.ui.theme.FubnerTheme
import com.example.fubner.utils.Photo
import com.example.fubner.utils.User
import com.example.fubner.utils.dummyData
import com.example.fubner.utils.pngData
import java.nio.file.WatchEvent



class RecyclerViewActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FubnerTheme {
                Surface(color = Color.Black) {
                    Recyclerview()
                }

            }

        }
    }
    @Composable
    fun EachRow(user:String,image: Int,status:Int){
        Card (
            modifier = Modifier
                .padding(horizontal = 8.dp, vertical = 8.dp)
                .fillMaxWidth(),
            shape = RoundedCornerShape(CornerSize(10.dp)),
                )
        {
            Row(modifier = Modifier.padding(5.dp)) {

                Box {
                    Image(
                        painter = painterResource(id = image), contentDescription = "image",
                        modifier = Modifier
                            .padding(8.dp)
                            .size(80.dp)
                            .clip(CircleShape)
                            .border(2.5f.dp, Color.Magenta, RoundedCornerShape(50))

                    )
                    Image(painter = painterResource(id = status), contentDescription = null,
                    modifier = Modifier.size(15.dp,15.dp)
                        .align(Alignment.BottomEnd)
                        .offset(-12.dp,-10.dp))
                }
                Text(text = user, color = Color.Magenta,modifier = Modifier.padding(8.dp))
            }
        }
    }



    @Composable
    fun Recyclerview(){
        LazyColumn{
            items(1) {
                     EachRow("Sahil Mishra",R.drawable.sahilm,R.drawable.offline)

            }
            items(1) {
                EachRow("Sahil mishra",R.drawable.user,R.drawable.online)

            }
            items(1) {
                EachRow("Sahil mishra",R.drawable.user,R.drawable.offline)

            }
            items(1) {
                EachRow("Sahil mishra",R.drawable.user,R.drawable.online)

            }
            items(1) {
                EachRow("Sahil mishra",R.drawable.user,R.drawable.online)

            }
            items(1) {
                EachRow("Sahil mishra", com.example.fubner.R.drawable.user,R.drawable.offline)

            }
            items(1) {
                EachRow("Sahil mishra", com.example.fubner.R.drawable.user,R.drawable.online)

            }
            items(1) {
                EachRow("Sahil mishra",R.drawable.user,R.drawable.online)

            }
            items(1) {
                EachRow("Sahil mishra",R.drawable.user,R.drawable.online)

            }
            items(1) {
                EachRow("Sahil mishra",R.drawable.user,R.drawable.online)

            }



        }
    }

    private fun Card(modifier: Modifier) {

    }
}


