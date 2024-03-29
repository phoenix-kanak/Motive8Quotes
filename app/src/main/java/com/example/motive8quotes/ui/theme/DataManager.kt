package com.example.motive8quotes.ui.theme

import android.content.Context
import androidx.compose.runtime.mutableStateOf
import com.example.motive8quotes.Screens
import com.example.motive8quotes.models.quotesModel
import com.google.gson.Gson

object DataManager {

    var currentPage= mutableStateOf(Screens.Listing)
    var quote= emptyArray<quotesModel>()
    var isDataLoaded= mutableStateOf(false)
    var currentQuote:quotesModel? =null

    fun LoadDataFromFile(context: Context){
        val inputStream=context.assets.open("quotes.json")
        val size=inputStream.available()
        val buffer=ByteArray(size)
        inputStream.read(buffer)
        inputStream.close()
        val json=String(buffer , Charsets.UTF_8)
        val gson=Gson()
        quote = gson.fromJson(json, Array<quotesModel>::class.java)
        isDataLoaded.value=true
    }
    fun SwitchPages(quote:quotesModel?){
        if(currentPage.value==Screens.Listing){
            currentQuote=quote
            currentPage.value=Screens.Detail
        }else{
            currentPage.value=Screens.Listing
        }
    }
}