package com.arvind.jetsunglass.view

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.shape.ZeroCornerSize
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.compose.ConstraintLayout
import com.arvind.jetsunglass.R
import com.arvind.jetsunglass.component.TopAppBarWithBack
import com.arvind.jetsunglass.ui.theme.*

@Preview(showBackground = true)
@Composable
fun ProductDetailsScreen() {
    Scaffold(
        topBar = {
            TopAppBarWithBack(
                onBackClick = {

                },
            )
        }, backgroundColor = bgwhitelight,
        content = {
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .verticalScroll(rememberScrollState())
            ) {
                ConstraintLayout() {
                    val (SunglassImage, BuyForm) = createRefs()

                    Box(contentAlignment = Alignment.Center,
                        modifier = Modifier
                            .height(280.dp)
                            .constrainAs(SunglassImage) {
                                top.linkTo(BuyForm.top)
                                bottom.linkTo(BuyForm.top)
                                start.linkTo(parent.start)
                                end.linkTo(parent.end)
                            }) {
                        HeaderView()
                    }

                    Surface(
                        color = white,
                        shape = RoundedCornerShape(40.dp).copy(
                            bottomStart = ZeroCornerSize,
                            bottomEnd = ZeroCornerSize
                        ),
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(top = 100.dp)
                            .constrainAs(BuyForm) {
                                bottom.linkTo(parent.bottom)
                                start.linkTo(parent.start)
                                end.linkTo(parent.end)
                            },
                    ) {
                        Column(
                            modifier = Modifier
                                .fillMaxSize()
                                .padding(horizontal = 16.dp)
                        ) {
                            Spacer(modifier = Modifier.padding(5.dp))

                            Column(
                                modifier = Modifier.fillMaxWidth(),
                                horizontalAlignment = Alignment.CenterHorizontally
                            ) {
                                Divider(
                                    color = bgwhitelight,
                                    modifier = Modifier
                                        .height(5.dp)
                                        .width(30.dp)
                                )
                            }

                            Column(
                                modifier = Modifier.padding(horizontal = 16.dp),
                                horizontalAlignment = Alignment.Start
                            ) {
                                Text(
                                    text = "RAY-BAN",
                                    fontSize = 16.sp,
                                    color = Color.Gray,
                                )
                                Spacer(modifier = Modifier.height(4.dp))
                                Text(
                                    text = "STATE STREET",
                                    fontSize = 24.sp,
                                    color = paledark,
                                    fontWeight = FontWeight.Bold
                                )
                            }

                            Spacer(modifier = Modifier.padding(24.dp))
                            val counter = remember {
                                mutableStateOf(1)
                            }
                            Row(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .padding(horizontal = 16.dp),
                                horizontalArrangement = Arrangement.SpaceBetween,
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                Box(
                                    modifier = Modifier
                                        .width(110.dp)
                                        .wrapContentHeight()
                                        .clip(RoundedCornerShape(20.dp))
                                        .background(Color(0xffF7F7F7))
                                ) {
                                    Row(
                                        modifier = Modifier
                                            .fillMaxWidth(),
                                        verticalAlignment = Alignment.CenterVertically
                                    ) {
                                        IconButton(onClick = {

                                        }) {
                                            Icon(
                                                painter = painterResource(id = R.drawable.ic_baseline_minimize_24),
                                                contentDescription = "",
                                                modifier = Modifier.padding(bottom = 10.dp)
                                            )
                                        }
                                        Text(
                                            text = "${counter.value}",
                                            color = paledark,
                                            fontWeight = FontWeight.Bold,
                                            fontSize = 18.sp
                                        )

                                        IconButton(onClick = {
                                            counter.value++
                                        }) {
                                            Icon(
                                                imageVector = Icons.Default.Add,
                                                contentDescription = "",
                                                tint = paledark
                                            )
                                        }
                                    }
                                }

                                Text(
                                    text = "$155.00",
                                    color = paledark,
                                    fontSize = 24.sp,
                                    fontWeight = FontWeight.Bold
                                )
                            }

                            Spacer(modifier = Modifier.padding(24.dp))

                            Text(
                                text = "Choose color",
                                color = paledark,
                                fontSize = 16.sp,
                                fontWeight = FontWeight.Normal,
                                modifier = Modifier.padding(horizontal = 16.dp)
                            )

                            Row(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .padding(16.dp),
                                horizontalArrangement = Arrangement.spacedBy(16.dp),
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                Box(
                                    modifier = Modifier
                                        .size(40.dp)
                                        .clip(shape = CircleShape)
                                        .background(paldarklight)
                                )
                                Box(
                                    modifier = Modifier
                                        .size(40.dp)
                                        .clip(shape = CircleShape)
                                        .background(olivedark)
                                )
                                Box(
                                    modifier = Modifier
                                        .size(40.dp)
                                        .clip(shape = CircleShape)
                                        .background(darkblue)
                                )
                            }

                            Row(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .padding(16.dp),
                                horizontalArrangement = Arrangement.SpaceBetween,
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                Text(
                                    text = "Tint lavel",
                                    color = paledark,
                                    fontSize = 16.sp,
                                    fontWeight = FontWeight.Bold
                                )

                                Text(
                                    text = "20%",
                                    color = paledark,
                                    fontSize = 16.sp,
                                    fontWeight = FontWeight.Bold
                                )
                            }

                            Box(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .height(50.dp)
                                    .clip(RoundedCornerShape(20.dp))
                                    .background(Color(0xffF7F7F7))
                            ) {

                            }
                            Spacer(modifier = Modifier.padding(20.dp))

                            Button(
                                onClick = {

                                },
                                modifier = Modifier
                                    .height(80.dp)
                                    .width(150.dp)
                                    .padding(bottom = 20.dp)
                                    .align(Alignment.CenterHorizontally),
                                elevation = null,
                                shape = RoundedCornerShape(14.dp),
                                colors = ButtonDefaults.buttonColors(
                                    backgroundColor = paledark
                                ),
                            ) {
                                Text(
                                    text = "Buy",
                                    color = white,
                                    fontSize = 12.sp
                                )
                            }
                        }
                    }

                }
            }
        }
    )
}

@Composable
fun HeaderView() {

    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
            .padding(top = 20.dp)
    ) {
        Box(
            modifier = Modifier
                .fillMaxHeight()
        ) {
            Image(
                contentScale = ContentScale.Fit,
                painter = painterResource(id = R.drawable.sunglasses3),
                contentDescription = "",
                modifier = Modifier
                    .fillMaxWidth(0.7f)
                    .padding(top = 20.dp)
            )
        }
    }

}
