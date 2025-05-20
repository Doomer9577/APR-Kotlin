package com.example.businesscard
import android.graphics.drawable.Drawable
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.businesscard.ui.theme.BusinessCardTheme





class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        enableEdgeToEdge()

        setContent {

            BusinessCardTheme {

                card()

            }

        }

    }

}

@Composable

fun card(modifier: Modifier = Modifier.background(color = Color.Blue)){

    Column (horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center){

        Column (Modifier.weight(1f).fillMaxSize(),horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center){

            Image(

                painter = painterResource(R.drawable.android_logo),

                contentDescription = null,

                Modifier.size(100.dp),


                )

            Text(

                text = "Finn Vagners",

                fontSize = 40.sp,

                fontWeight = FontWeight.Bold

            )

            Text(

                text = "Ski Instructor",

                fontSize = 30.sp,

                fontWeight = FontWeight.Bold

            )


        }

        Column {

            Row {

                Image(

                    painter = painterResource(R.drawable.android_logo),

                    contentDescription = null,

                    Modifier.size(40.dp),

                    )

                Text(

                    text = "133",

                    fontSize = 20.sp,

                    )

            }

            Row {

                Image(

                    painter = painterResource(R.drawable.android_logo),

                    contentDescription = null,

                    Modifier.size(40.dp),

                    )

                Text(

                    text = "+43 660 928 3388",

                    fontSize = 20.sp,

                    )

            }

            Row (Modifier.padding(bottom = 16.dp)){

                Image(

                    painter = painterResource(R.drawable.android_logo),

                    contentDescription = null,

                    Modifier.size(40.dp),

                    )

                Text(

                    text = "finn.vagners@gmail.com",

                    fontSize = 20.sp,

                    )

            }

        }

    }

}

@Preview(showBackground = true)

@Composable

fun GreetingPreview() {

    BusinessCardTheme {

        card()

    }

}
