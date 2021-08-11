package com.arvind.jetsunglass.view

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Menu
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.arvind.jetsunglass.R
import com.arvind.jetsunglass.ui.theme.*

@Preview(showBackground = true)
@Composable
fun DashboardScreen() {
    val itemList = listOf("Teanding", "Casual", "Origin")

    Surface(
        modifier = Modifier
            .fillMaxSize()
            .background(cottonBall)
    ) {
        Column(modifier = Modifier.verticalScroll(rememberScrollState())) {

            Spacer(modifier = Modifier.padding(10.dp))
            TopAppBarHeader()
            Category(itemList)
            Spacer(modifier = Modifier.padding(10.dp))
            CategoryItems()
            Spacer(modifier = Modifier.padding(10.dp))
            OurClients()
        }
    }
}

@Composable
fun TopAppBarHeader() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Image(
            painter = painterResource(id = R.drawable.avtarimage),
            contentDescription = "Avtar",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(50.dp)
                .clip(CircleShape)
        )
        Text(
            text = "Hi, Alexa!",
            color = black,
            fontWeight = FontWeight.Bold,
            fontSize = 20.sp,
            modifier = Modifier.offset((-65).dp)
        )

        IconButton(onClick = {

        }) {
            Image(
                painter = painterResource(id = R.drawable.dashboard_icon_grid),
                contentDescription = "Home",
                modifier = Modifier.size(32.dp, 32.dp)
            )


        }
    }
}

@Composable
fun Category(itemList: List<String>) {
    LazyRow(
        modifier = Modifier
            .fillMaxWidth()
            .padding(10.dp)
    ) {
        items(itemList.size) { item ->
            Text(
                fontSize = 30.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(
                    start = 16.dp,
                    end = 16.dp,
                    top = 8.dp,
                    bottom = 8.dp
                ),
                text = itemList[item],
                color = if (item == 0) black else Color.LightGray
            )
        }
    }
}

@Composable
fun CategoryItems() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = 16.dp)
    ) {
        CategoryTeandingItems(
            imagePainter = painterResource(id = R.drawable.sunglasses3),
            title = "RAY-BAN",
            subtitle = "State street",
            price = "$155.00",
            backgroundColor = lightsilverbox
        )
        CategoryTeandingItems(
            imagePainter = painterResource(id = R.drawable.sunglasses2),
            title = "PRADA",
            subtitle = "Original Wayfarer",
            price = "$123.00",
            backgroundColor = lightsilverbox
        )
        CategoryTeandingItems(
            imagePainter = painterResource(id = R.drawable.sunglasses4),
            title = "VERCACE",
            subtitle = "Round Metal",
            price = "$182.00",
            backgroundColor = lightsilverbox
        )
    }
}

@Composable
fun CategoryTeandingItems(
    imagePainter: Painter,
    title: String = "",
    subtitle: String = "",
    price: String = "",
    backgroundColor: Color = Color.Transparent
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .wrapContentHeight(),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Box(
            modifier = Modifier
                .padding(10.dp)
                .width(120.dp)
                .height(120.dp)
                .fillMaxWidth(0.2f)
                .clip(RoundedCornerShape(20.dp))
                .background(backgroundColor),
            contentAlignment = Alignment.Center
        ) {
            Image(
                painter = imagePainter,
                contentDescription = "",
                modifier = Modifier.padding(8.dp),
            )

        }

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp),
            verticalArrangement = Arrangement.SpaceEvenly,
            horizontalAlignment = Alignment.Start
        ) {

            Text(
                text = title,
                fontSize = 14.sp,
                color = Color.Gray,
            )
            Spacer(modifier = Modifier.height(4.dp))
            Text(
                text = subtitle,
                fontSize = 13.sp,
                color = black,
                fontWeight = FontWeight.Bold
            )
            Spacer(modifier = Modifier.height(12.dp))

            Row(
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .fillMaxWidth()
            ) {
                Text(
                    text = price,
                    fontWeight = FontWeight.Bold,
                    fontSize = 16.sp,
                    color = black,
                )
                Box(
                    modifier = Modifier
                        .clip(CircleShape)
                        .background(lightsilverbox)
                        .padding(4.dp),
                ) {
                    Icon(
                        modifier = Modifier.size(16.dp, 16.dp),
                        imageVector = Icons.Default.Favorite,
                        contentDescription = "",
                        tint = black
                    )
                }
            }
        }
    }
}

@Composable
fun OurClients() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(start = 26.dp, bottom = 20.dp)
    ) {
        Text(
            text = "Our Clients",
            fontWeight = FontWeight.Bold,
            fontSize = 20.sp,
            color = black
        )
        Spacer(modifier = Modifier.padding(10.dp))

        LazyRow(
            modifier = Modifier
                .fillMaxWidth()
        ) {
            item {
                OurClientsItems(
                    imagePainter = painterResource(id = R.drawable.photo2),
                    title = "Ryan Ekstrom",
                    subtitle = "well protected\n" +
                            "from the sun!",
                    backgroundColor = lightBlue

                )
                Spacer(modifier = Modifier.padding(10.dp))
                OurClientsItems(
                    imagePainter = painterResource(id = R.drawable.photo1),
                    title = "Haley Hogan",
                    subtitle = "well protected\n" +
                            "from the sun!",
                    backgroundColor = lightsoap

                )
            }
        }
    }
}

@Composable
fun OurClientsItems(
    imagePainter: Painter,
    title: String = "",
    subtitle: String = "",
    backgroundColor: Color = Color.Transparent
) {
    Box(
        modifier = Modifier
            .width(250.dp)
            .wrapContentHeight()
            .clip(RoundedCornerShape(12.dp))
            .background(backgroundColor)
            .padding(10.dp)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentHeight()
                .padding(10.dp)
        ) {
            Box(
                modifier = Modifier
                    .height(80.dp)
                    .width(90.dp)
                    .weight(0.3f)
                    .clip(RoundedCornerShape(20.dp)),
            ) {
                Image(
                    painter = imagePainter,
                    contentDescription = "",
                    contentScale = ContentScale.Crop
                )

            }
            Spacer(modifier = Modifier.width(16.dp))
            Column(
                modifier = Modifier
                    .weight(0.7f)
                    .wrapContentHeight(),
                horizontalAlignment = Alignment.Start,
                verticalArrangement = Arrangement.SpaceEvenly
            ) {
                Text(
                    text = title,
                    fontWeight = FontWeight.Bold,
                    fontSize = 16.sp,
                    color = black
                )

                Text(
                    text = subtitle,
                    fontWeight = FontWeight.Normal,
                    fontSize = 16.sp,
                    color = paleBlack
                )
            }
        }
    }


}



