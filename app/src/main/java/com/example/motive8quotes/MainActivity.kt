package com.example.motive8quotes

import android.os.Build
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.annotation.RequiresApi
import androidx.compose.runtime.Composable
import com.example.motive8quotes.activities.QuoteListScreen
import com.example.motive8quotes.ui.theme.DataManager
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch


class MainActivity : ComponentActivity() {
    @RequiresApi(Build.VERSION_CODES.Q)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //Launched a coroutine so that the loading of data takes place on main thread
        CoroutineScope(Dispatchers.IO).launch{
            DataManager.LoadDataFromFile(applicationContext)
        }
        setContent {
            App()

        }
    }
}

@RequiresApi(Build.VERSION_CODES.Q)
@Composable
fun App() {
    if(DataManager.isDataLoaded.value){
        QuoteListScreen(data = DataManager.quote) {

        }
    }
}

