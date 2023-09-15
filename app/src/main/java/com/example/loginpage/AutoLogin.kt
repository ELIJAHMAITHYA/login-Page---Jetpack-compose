package com.example.loginpage

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun autologin() {
    Row(
        modifier = Modifier.fillMaxWidth(),
        Arrangement.Center
    ) {
        Text(text = "Or Login With", fontSize = 14.sp)
    }
    Divider(
        color = Color.White.copy(alpha = 0.5f),
        thickness = 2.dp,
        //modifier = Modifier.padding(top = 2.dp)
    )
    Row(
        modifier = Modifier.fillMaxWidth(),
        Arrangement.SpaceAround
    ) {
        Button(
            onClick = { /*TODO*/ },
            shape = RoundedCornerShape(percent = 50),
            modifier = Modifier
                .height(45.dp)
                .width(45.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color.White)

        ) {
            Image(
                painter = painterResource(id = R.drawable.facebook),
                contentDescription = "facebook logo",
                modifier = Modifier
                    .weight(1f)
                    .size(40.dp),
                // ColorFilter = ColorFilter.tint(Color.White)
            )
        }
        Button(
            onClick = { /*TODO*/ },
            shape = RoundedCornerShape(percent = 50),
            modifier = Modifier
                .height(45.dp)
                .width(45.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color.White)

        ) {
            Image(
                painter = painterResource(id = R.drawable.twitter),
                contentDescription = "facebook logo",
                modifier = Modifier
                    .weight(1f)
                    .size(40.dp),
                // ColorFilter = ColorFilter.tint(Color.White)
            )
        }
        Button(
            onClick = { /*TODO*/ },
            shape = RoundedCornerShape(percent = 50),
            modifier = Modifier
                .height(45.dp)
                .width(45.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color.White)

        ) {
            Image(
                painter = painterResource(id = R.drawable.google),
                contentDescription = "facebook logo",
                modifier = Modifier
                    .weight(1f)
                    .size(40.dp),
                // ColorFilter = ColorFilter.tint(Color.White)
            )
        }
    }
}


        