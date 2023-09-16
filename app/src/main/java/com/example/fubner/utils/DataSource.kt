package com.example.fubner.utils

import android.media.Image
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.unit.dp
import com.example.fubner.R
import androidx.compose.ui.res.painterResource as painterResource


data class User(
    val description:String,val int: Int
)
fun dummyData():List<User>
{
    return listOf(
        User
            (
            "Name:- Sahil Kumar Mishra  ",
            int = R.drawable.sahilm
        ),
        User(
            "Name:- Sahil Kumar Mishra  ",
            int = R.drawable.sahilm
        ),
        User(
            "Name:- Sahil Kumar Mishra  ",
            int = R.drawable.sahilm
        ),
        User(
            "Name:- Sahil Kumar Mishra  ",
            int = R.drawable.sahilm
        ),
        User(
            "Name:- Sahil Kumar Mishra  ",
            int = R.drawable.sahilm
        ),
        User(
            "Name:- Sahil Kumar Mishra  ",
            int = R.drawable.sahilm
        ),
        User(
                "Name:- Sahil Kumar Mishra  ",
                int = R.drawable.sahilm
        ),
                User(
                "Name:- Sahil Kumar Mishra  ",
        int = R.drawable.sahilm
    ),
    )
}

data class Photo(
    val int: Int
)
fun pngData():List<Photo>
{
    return listOf(

        Photo(int = R.drawable.sahilm),
        Photo(int = R.drawable.user),
        Photo(int = R.drawable.sahilm),
        Photo(int = R.drawable.user),
        Photo(int = R.drawable.sahilm),
        Photo(int = R.drawable.sahilm),
        Photo(int = R.drawable.sahilm),
        Photo(int = R.drawable.sahilm),


        )
}
