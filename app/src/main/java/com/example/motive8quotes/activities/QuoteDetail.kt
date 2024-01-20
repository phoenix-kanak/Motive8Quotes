package com.example.motive8quotes.activities

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.FormatQuote
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.motive8quotes.models.quotesModel

@Composable

fun QuoteDetail(quote: quotesModel) {
    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier
            .fillMaxWidth(1f)
            // .clickable { onClick() }
            .background(
                Brush.linearGradient(
                    colors = listOf(
                        Color(0xFFffffff),
                        Color(0xFFE3E3E3)
                    )
                )
            )
    ) {

        Card(
            elevation = CardDefaults.cardElevation(4.dp),
            modifier = Modifier
                .padding(8.dp)
        ) {
            Column(
                verticalArrangement = Arrangement.Center,
                modifier = Modifier.padding(16.dp , 24.dp)
            ) {
                Image(
                    modifier = Modifier
                        .size(60.dp)
                        .background(Color.Black)
                        .rotate(180f),
                    imageVector = Icons.Filled.FormatQuote,
                    //   colorFilter = ColorFilter.tint(Color.White),
                    //   alignment = Alignment.TopStart,
                    contentDescription = "QuoteItem"
                )

                //    Column(modifier = Modifier.weight(1f)) {
                Text(
                    text = quote.quote,
                    textAlign = TextAlign.Center,
                    color = Color.Black,
                    fontWeight = FontWeight.Bold
                )
                Spacer(
                    Modifier.height(16.dp)
                )

//                    Box(
//                        modifier = Modifier
//                            .fillMaxWidth(0.4f)
//                            .size(1.dp)
//                            .background(Color(0xFFEEEEEE))
//                    )
                Text(
                    fontFamily = FontFamily.Cursive,
                    text = quote.author,
                    color = Color.Black,
                    fontWeight = FontWeight.Thin,
                )
                //}
            }
        }
    }
}
