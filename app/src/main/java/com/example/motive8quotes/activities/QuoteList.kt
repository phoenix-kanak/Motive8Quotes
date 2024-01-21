package com.example.motive8quotes.activities

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import com.example.motive8quotes.models.quotesModel

@Composable
fun QuoteList(data:Array<quotesModel> , onClick:(quote:quotesModel)->Unit){
    LazyColumn(content = {
        items(data){
            QuoteItem(quote = it , onClick)
        }
    })
}