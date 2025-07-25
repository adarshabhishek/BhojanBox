package com.example.bhojanbox.presentation.components

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.bhojanbox.R

@Composable
fun OrComponent(){
    Row(modifier = Modifier
        .fillMaxWidth()
        .padding(start = 16.dp, bottom = 8.dp,end=16.dp,top=16.dp),
        Arrangement.SpaceEvenly,
        Alignment.CenterVertically) {
        HorizontalDivider(modifier = Modifier.width(160.dp),color= Color.LightGray,thickness=0.8.dp)
        Text(text = "or")
        HorizontalDivider(modifier = Modifier.width(160.dp),color= Color.LightGray,thickness=0.8.dp)
    }
    Spacer(modifier = Modifier.height(1.dp))
    Row(modifier = Modifier.fillMaxWidth(),Arrangement.Center) {
        IconButton(onClick = {}) {
            Icon(painter = painterResource(id= R.drawable.google),
                modifier = Modifier.size(60.dp).border(width=1.dp, color = Color.LightGray,
                    CircleShape),
                tint = Color.Unspecified,
                contentDescription = "Google Button")
        }
    }
}