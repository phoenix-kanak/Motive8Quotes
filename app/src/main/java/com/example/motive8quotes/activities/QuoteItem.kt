package com.example.motive8quotes.activities

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
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
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.motive8quotes.models.quotesModel


@Composable
fun QuoteItem(quote: quotesModel , onClick:(quote:quotesModel) ->Unit) {

    Card(
        elevation = CardDefaults.cardElevation(4.dp),
        modifier = Modifier.padding(8.dp)
            .clickable { onClick(quote) }
    ) {
        Row(
            modifier = Modifier.padding(16.dp)
        ) {
            Image(
                modifier = Modifier
                    .size(40.dp)
                    .align(Alignment.Top)
                    .background(Color.Black)
                    .rotate(180f),
                imageVector = Icons.Filled.FormatQuote,
                colorFilter = ColorFilter.tint(Color.White),
                alignment = Alignment.TopStart,
                contentDescription = "QuoteItem"
            )
            Spacer(
                Modifier.padding(4.dp)
            )
            Column(modifier = Modifier.weight(1f)) {
                Text(
                    text = quote.quote,
                    textAlign = TextAlign.Justify,
                    color = Color.Black,
                    fontWeight = FontWeight.Bold
                )

                Box(
                    modifier = Modifier
                        .fillMaxWidth(0.4f)
                        .size(1.dp)
                        .background(Color(0xFFEEEEEE))
                )
                Text(
                    fontFamily = FontFamily.Cursive,
                    text = quote.author,
                    fontWeight = FontWeight.Bold,
                    color = Color.Black,
                )
            }
        }
    }
}
