package com.arvind.jetsunglass.component

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Card
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowLeft
import androidx.compose.material.icons.outlined.Favorite
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.arvind.jetsunglass.ui.theme.black

@Composable
fun TopAppBarWithBack(onBackClick: () -> Unit) {

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 16.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        IconButton(onClick = { onBackClick() }) {
            Icon(
                imageVector = Icons.Default.KeyboardArrowLeft,
                contentDescription = "On Back",
                tint = black,
                modifier = Modifier.size(32.dp, 32.dp)

            )
        }

        Card(
            modifier = Modifier
                .padding(end = 20.dp)
                .width(50.dp)
                .clip(CircleShape),
            elevation = 4.dp
        ) {
            IconButton(onClick = { }) {
                Icon(
                    imageVector = Icons.Outlined.Favorite,
                    contentDescription = ""
                )

            }
        }

    }
}