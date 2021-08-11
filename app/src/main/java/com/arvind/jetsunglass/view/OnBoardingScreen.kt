package com.arvind.jetsunglass.view

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import com.arvind.jetsunglass.R
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.arvind.jetsunglass.ui.theme.*

@Preview(showBackground = true)
@Composable
fun OnBoardingScreen() {
    var pageCount by remember { mutableStateOf(0) }
    val onBoardingImagesList =
        listOf(
            R.drawable.sunglassfind,
            R.drawable.sunglassfind,
            R.drawable.sunglassfind
        )

    val onBoardingHeadingList =
        listOf(
            "Find your\n" +
                    "Sunglasses",
            "Find your\n" +
                    "Sunglasses",
            "Find your\n" +
                    "Sunglasses"
        )

    val onBoardingDescriptionList =
        listOf(
            "We have a selection of the most\n" +
                    "popular sunglasses",
            "We have a selection of the most\n" +
                    "popular sunglasses",
            "We have a selection of the most\n" +
                    "popular sunglasses"

        )

    if (pageCount == 3) {
        produceState(initialValue = -1) { }
        return
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
    ) {
        Column(
            verticalArrangement = Arrangement.Top,
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(0.5f)
        ) {
            Box(
                modifier = Modifier
                    .weight(0.5f)
                    .fillMaxHeight()
                    .background(yellowwhite)
            ) {
                Image(
                    contentScale = ContentScale.Crop,
                    painter = painterResource(id = onBoardingImagesList[pageCount]),
                    contentDescription = "",
                    modifier = Modifier.fillMaxSize()
                )
            }
        }


        Box(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight()
                .background(white)

        ) {
            Column(modifier = Modifier.verticalScroll(rememberScrollState())) {
                Spacer(modifier = Modifier.padding(20.dp))
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween,
                    modifier = Modifier
                        .padding(horizontal = 16.dp)
                ) {
                    Box(
                        modifier = Modifier
                            .size(if (pageCount == 0) 10.dp else 8.dp)
                            .clip(CircleShape)
                            .background(if (pageCount == 0) paledark else Color.LightGray)
                    )

                    Spacer(modifier = Modifier.padding(horizontal = 4.dp))
                    Box(
                        modifier = Modifier
                            .size(if (pageCount == 1) 10.dp else 8.dp)
                            .clip(CircleShape)
                            .background(if (pageCount == 1) paledark else Color.LightGray)
                    )
                    Spacer(modifier = Modifier.padding(horizontal = 4.dp))
                    Box(
                        modifier = Modifier
                            .size(if (pageCount == 2) 10.dp else 8.dp)
                            .clip(CircleShape)
                            .background(if (pageCount == 2) paledark else Color.LightGray)
                    )

                }

                Spacer(modifier = Modifier.padding(10.dp))

                Text(
                    text = onBoardingHeadingList[pageCount],
                    fontWeight = FontWeight.Bold,
                    fontSize = 40.sp,
                    color = paledark,
                    modifier = Modifier.padding(horizontal = 16.dp)
                )

                Spacer(modifier = Modifier.padding(10.dp))

                Text(
                    text = onBoardingDescriptionList[pageCount],
                    fontWeight = FontWeight.Normal,
                    fontSize = 14.sp,
                    color = paledark,
                    modifier = Modifier.padding(horizontal = 16.dp)
                )
                Spacer(modifier = Modifier.height(30.dp))
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(start = 16.dp, bottom = 20.dp),
                    verticalArrangement = Arrangement.Bottom,
                    horizontalAlignment = Alignment.Start
                ) {
                    Button(
                        modifier = Modifier
                            .width(150.dp)
                            .height(60.dp),
                        onClick = {

                        },
                        elevation = null,
                        shape = RoundedCornerShape(14.dp),
                        colors = ButtonDefaults.buttonColors(
                            backgroundColor = paledark
                        ),
                    ) {
                        Text(
                            text = "Let's go",
                            color = white,
                            fontSize = 12.sp
                        )
                    }
                }

            }
        }
    }


}