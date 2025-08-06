package com.example.bhojanbox.presentation.utils

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.systemBarsPadding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Star
import androidx.compose.material.icons.outlined.Info
import androidx.compose.material.icons.outlined.Share
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.ModalBottomSheet
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.material3.rememberModalBottomSheetState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.bhojanbox.R
import com.example.bhojanbox.presentation.navigation.Routes

@OptIn(ExperimentalMaterial3Api::class)
@Composable

fun BottomSheetToAddProduct(onDismiss: () -> Unit, navController: NavController) {
    val sheetState = rememberModalBottomSheetState(
        skipPartiallyExpanded = true
    )

    var text by remember { mutableStateOf("") }
    var count by remember { mutableStateOf(1) }

    ModalBottomSheet(
        modifier = Modifier.fillMaxWidth().systemBarsPadding(),
        sheetState = sheetState,
        dragHandle = {},
        shape = RoundedCornerShape(topStart = 16.dp, topEnd = 16.dp),
        onDismissRequest = onDismiss
    ) {
        Scaffold(
            bottomBar = {
                Row(
                    modifier = Modifier
                        .padding(10.dp)
                        .fillMaxWidth(),
                    verticalAlignment = Alignment.Bottom
                ){
                    Row(
                        modifier = Modifier
                            .border(
                                1.dp,
                                color = colorResource(R.color.purple_500),//addButtonRed
                                RoundedCornerShape(4.dp)
                            )
                            .height(40.dp)
                            .background(colorResource(R.color.purple_500)),//lightPink
                        verticalAlignment = Alignment.CenterVertically
                    ){
                        Box(
                            modifier = Modifier
                                .width(40.dp)
                                .fillMaxHeight()
                                .clickable { count-- },
                            contentAlignment = Alignment.Center,
                        ){
                            Text(
                                text="-",
                                fontSize=20.sp,
                                color=colorResource(R.color.purple_500)//addButtonRed
                            )
                        }
                        Box(
                            modifier = Modifier
                                .width(40.dp)
                                .fillMaxHeight(),
                            contentAlignment = Alignment.Center
                        ){
                            Text(
                                text=count.toString(),
                                fontSize = 16.sp, color = Color.Black
                            )
                        }
                        Box(
                            modifier = Modifier
                                .width(40.dp)
                                .fillMaxHeight()
                                .clickable { count++ },
                            contentAlignment = Alignment.Center
                        ){
                            Text(
                                text="+",
                                fontSize = 20.sp,
                                color = colorResource(R.color.purple_500)//addButtonRed
                            )
                        }
                    }
                    Spacer(modifier = Modifier.width(8.dp))

                    Button(
                        onClick = {
                            navController.navigate(Routes.FinalCheckoutScreen)
                        },
                        modifier = Modifier.height(40.dp)
                            .weight(1f),

                        colors = ButtonDefaults.buttonColors(colorResource(R.color.purple_500)),//buttonColor
                        shape = RoundedCornerShape(4.dp)
                    ) {
                        Text(
                        text="Add item ₹259",
                        color=Color.White,
                        fontSize = 16.sp
                        )
                    }
                }
            }
        ) {
            it
            Column(
                modifier = Modifier
                    .fillMaxWidth().padding(horizontal = 4.dp)
                    .background(color = Color.Transparent)
            ) {
                Card(
                    modifier = Modifier.fillMaxWidth()
                        .background(color = Color.Transparent)
                        .padding(8.dp)
                        .align(Alignment.CenterHorizontally),
                    shape = RoundedCornerShape(16.dp),
                    elevation = CardDefaults.cardElevation(
                        defaultElevation = 2.dp
                    )
                ) {
                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .background(Color.White)
                    ) {
                        Box(
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(280.dp)
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.brick_oven_pizza),
                                contentDescription = "Location Background",
                                modifier = Modifier
                                    .fillMaxSize()
                                    .padding(12.dp)
                                    .clip(RoundedCornerShape(16.dp)),
                                contentScale = ContentScale.Crop
                            )
                        }
                        Spacer(modifier = Modifier.height(10.dp))

                        Row(
                            modifier = Modifier.padding(horizontal = 16.dp),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Row {
                                Icon(
                                    painter = painterResource(id = R.drawable.veg_icon),
                                    contentDescription = "veg",
                                    modifier = Modifier.size(18.dp),
                                    tint = Color.Unspecified
                                )
                            }
                            Spacer(modifier = Modifier.width(8.dp))

                            Row(
                                modifier = Modifier
                                    .background(
                                        color = Color(0xFFF9F0E6),
                                        shape = RoundedCornerShape(4.dp)
                                    )
                                    .padding(horizontal = 3.dp),
                                verticalAlignment = Alignment.CenterVertically,
                                horizontalArrangement = Arrangement.Center
                            ) {
                                Text(
                                    text = "Bestseller",
                                    color = Color(0xFFE67E22),
                                    fontSize = 10.sp,
                                    fontWeight = FontWeight.Medium
                                )
                            }
                        }
                        Spacer(modifier = Modifier.height(10.dp))

                        Column(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(horizontal = 16.dp, vertical = 8.dp)
                        ) {
                            Row(
                                modifier = Modifier.fillMaxWidth(),
                                horizontalArrangement = Arrangement.SpaceBetween,
                                verticalAlignment = Alignment.Top
                            ) {
                                Text(
                                    text = "Brick Oven Pizza",
                                    color = Color.Black,
                                    fontSize = 22.sp,
                                    fontWeight = FontWeight.Bold,
                                    modifier = Modifier.weight(1f)
                                )
                                Row {
                                    Icon(
                                        imageVector = Icons.Outlined.Share,
                                        contentDescription = "Share",
                                        tint = Color.Gray,
                                        modifier = Modifier.padding(horizontal = 8.dp)
                                    )
                                    Icon(
                                        painter = painterResource(R.drawable.outline_bookmark_24),
                                        tint = Color.Gray,
                                        contentDescription = "Bookmark"
                                    )
                                }
                            }

                            Row(
                                verticalAlignment = Alignment.CenterVertically,
                                modifier = Modifier.padding(vertical = 8.dp)
                            ) {
                                repeat(5) { index ->
                                    Icon(
                                        imageVector = if (index < 4) Icons.Filled.Star else Icons.Filled.Star,
                                        contentDescription = null,
                                        tint = Color(0xFFFFC107),
                                        modifier = Modifier.size(16.dp)
                                    )
                                }
                                Spacer(modifier = Modifier.width(4.dp))
                                Text(
                                    text = "(211)",
                                    color = Color.Gray,
                                    fontSize = 12.sp
                                )
                            }
                            Text(
                                text = "[Chef's Special]",
                                color = Color.Gray,
                                fontSize = 14.sp,
                                modifier = Modifier.padding(vertical = 2.dp)
                            )
                        }
                    }
                }
                Card(
                    modifier = Modifier.fillMaxWidth()
                        .padding(8.dp),
                    shape = RoundedCornerShape(16.dp),
                    colors = CardDefaults.cardColors(
                        containerColor = Color.White
                    ),
                    border = BorderStroke(1.dp, Color(0xFFE0E0E0))
                ) {
                    Column(
                        modifier = Modifier.padding(16.dp)
                    ) {
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.SpaceBetween
                        ) {
                            Text(
                                text = "Add a cooking request (optional)",
                                fontSize = 16.sp,
                                fontWeight = FontWeight.Medium,
                                color = Color(0xFF424242)
                            )
                            Icon(
                                imageVector = Icons.Outlined.Info,
                                contentDescription = "Information",
                                tint = Color(0xFFBDBBD),
                                modifier = Modifier.size(20.dp)
                            )
                        }
                        Spacer(modifier = Modifier.height(18.dp))

                        TextField(
                            value = text,
                            onValueChange = { text = it },
                            placeholder = {
                                Text(
                                    "e.g. Don't make it too spicy",
                                    color = Color(0xFFBDBDBD),
                                    fontSize = 14.sp
                                )
                            },
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(150.dp)
                                .padding(top = 8.dp),
                            colors = TextFieldDefaults.colors(
                                focusedContainerColor = Color(0xFFF5F5F5),
                                unfocusedContainerColor = Color(0xFFF5F5F5),
                                disabledContainerColor = Color(0xFFF5F5F5),
                                focusedIndicatorColor = Color.Transparent,
                                unfocusedIndicatorColor = Color.Transparent,
                                disabledIndicatorColor = Color.Transparent
                            ),
                            shape = RoundedCornerShape(8.dp),
                        )
                    }
                }
            }
        }
    }
}