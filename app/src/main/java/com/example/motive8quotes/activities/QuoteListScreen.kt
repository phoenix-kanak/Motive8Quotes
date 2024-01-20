package com.example.motive8quotes.activities


import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.motive8quotes.R
import com.example.motive8quotes.models.quotesModel


@Composable
fun QuoteListScreen(data: Array<quotesModel>, onClick: () -> Unit) {
    Column {
        Text(
            text = "Quotes",
           // fontFamily = FontFamily(Font(R.font.montserrat_regular)),
            textAlign = TextAlign.Center,
            modifier = Modifier
                .fillMaxWidth(1f)
                .padding(8.dp, 24.dp)
        )
        QuoteList(data = data) {
            onClick()
        }
    }

}