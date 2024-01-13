package com.example.motive8quotes.activities

import android.graphics.drawable.Icon
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material3.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.motive8quotes.R

@Preview
@Composable
fun QuoteItem() {
    Card (
        elevation = 4.dp,
        modifier = Modifier
        .padding(8.dp)
    ){
        Row (modifier= Modifier.padding(16.dp)){
            Image(
                painter = Icons.Filled.For
                contentDescription = )
        }

    }
}