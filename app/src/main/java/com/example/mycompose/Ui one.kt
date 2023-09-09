package com.example.mycompose

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.unit.times



/*

@Composable
fun HomePage() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.White)
            .padding(10.dp)
    ) {
        HeaderRow()
        MainCard()
        FoodItem()
        MoneyCard()
    }
}


@Composable
fun HeaderRow() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .height(60.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        // ImageButton for Location
        ImageButton(
            imgRes = R.drawable.location,
            onClick = { */
/* Handle location click *//*
 }
        )

        Text(text = "Boston, MA", fontSize = 22.sp, modifier = Modifier.padding(start = 5.dp))

        Spacer(modifier = Modifier.weight(1f))

        // ImageButton for Search
        ImageButton(
            imgRes = R.drawable.search1,
            onClick = { */
/* Handle search click *//*
 },
            modifier = Modifier.padding(end = 5.dp)
        )
    }
}


@Composable
fun FoodItem(selectedIndex: Int = 0) {
    val sectionCardData = listOf(
        FoodItemData(Color.Red, "Pizza", R.drawable.pizza, Color.White),
        FoodItemData(Color.White, "Hamburger", R.drawable.humburger, Color.Black),
        FoodItemData(Color.White, "Drink", R.drawable.soda, Color.Black),
        FoodItemData(Color.White, "Soup", R.drawable.soups, Color.Black)
    )

    Row(
        modifier = Modifier
            .padding(10.dp)
            .fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceAround,
        verticalAlignment = Alignment.CenterVertically
    ) {
        sectionCardData.forEachIndexed { index, data ->
            FoodItemDetail(
                color = if (index == selectedIndex) data.bgColor else Color.White,
                text = data.text,
                img = data.imgRes,
                fontColor = if (index == selectedIndex) data.fontColor else Color.Black
            )
        }
    }

    if (selectedIndex == 0) {
        ItemCard(
            img = R.drawable.picitem1,
            title = "Pizza food",
            weight = "410g",
            price = "14.99"
        )
        ItemCard(
            img = R.drawable.pizza2,
            title = "Pizza food",
            weight = "560g",
            price = "20.99"
        )
    }
}

data class FoodItemData(
    val bgColor: Color,
    val text: String,
    val imgRes: Int,
    val fontColor: Color
)


@Composable
fun ItemCard(img: Int, title: String, weight: String, price: String) {
    Row(
        modifier = Modifier
            .height(220.dp)
            .fillMaxWidth()
            .padding(15.dp)
    ) {
        Image(
            painterResource(img),
            contentDescription = "",
            modifier = Modifier
                .height(200.dp)
                .width(200.dp))
        Column(
            modifier = Modifier
                .height(200.dp)
                .width(200.dp)
                .padding(start = 10.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.Start) {
            Text(text = title, fontSize = 20.sp)
            Spacer(modifier = Modifier.padding(top = 3.dp))
            Text(text = weight, fontSize = 15.sp, color = Color.Gray)
            Spacer(modifier = Modifier.padding(top = 10.dp))
            Row(
                modifier = Modifier
                    .width(180.dp)
                    .height(40.dp)
            ) {
                PriceColumn(price = price)
                Spacer(modifier = Modifier.weight(1f))
                AddColumn()
            }
        }
    }
}

@Composable
fun PriceColumn(price: String) {
    Column(
        modifier = Modifier
            .height(30.dp)
            .width(65.dp)
            .clip(shape = RoundedCornerShape(8.dp))
            .background(Color.Red),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(text = "$$price", fontSize = 15.sp, color = Color.White)
    }
}

@Composable
fun AddColumn() {
    Column(
        modifier = Modifier
            .height(30.dp)
            .width(30.dp)
            .border(
                BorderStroke(2.dp, color = Color.Red),
                shape = RoundedCornerShape(10.dp)
            )
            .clip(shape = RoundedCornerShape(10.dp)),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painterResource(id = R.drawable.add_ic),
            contentDescription = "",
            modifier = Modifier
                .height(25.dp)
                .width(25.dp)
        )
    }
}

@Composable
fun MainCard() {
    Card(
        shape = RoundedCornerShape(22.dp),
        modifier = Modifier
            .height(155.dp)
            .fillMaxWidth()
            .padding(10.dp),
        colors = CardDefaults.cardColors(containerColor = Color(0xFFF7F2FF))
    ) {
        Text(text = "Order again?", fontSize = 16.sp, color = Color.Black
            , modifier = Modifier.padding(top = 10.dp, start = 10.dp))
        Spacer(modifier = Modifier.padding(top = 3.dp))

        Text(text = "Hot Salami Pizza,Vegan Soup, Hot Pizza",
            fontSize = 14.sp, color = Color.Gray
            , modifier = Modifier.padding( start = 10.dp))

        Spacer(modifier = Modifier.weight(1f))
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(65.dp)
                .padding(start = 10.dp)
            , verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Start
        ) {

            val avatarResources = listOf(
                R.drawable.pizza2,
                R.drawable.soup1,
                R.drawable.picitem1
            )
            val avatars = avatarResources.map { painterResource(id = it) }
            AvatarStack(avatars = avatars)

            Column(modifier = Modifier
                .height(30.dp)
                .width(65.dp)
                .clip(shape = RoundedCornerShape(8.dp))
                .background(Color.Red),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center){
                Text(text = "$85.62", fontSize = 15.sp,
                    color = Color.White) }
            Spacer(modifier = Modifier.weight(1f))
            Column(modifier = Modifier
                .height(30.dp)
                .padding(end = 8.dp)
                .width(30.dp)
                .border(
                    BorderStroke(2.dp, color = Color.Red),
                    shape = RoundedCornerShape(10.dp)
                )
                .clip(shape = RoundedCornerShape(10.dp))
                , verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally){

                Image( painterResource(id = R.drawable.add_ic),
                    contentDescription = ""
                    , modifier = Modifier
                        .height(25.dp)
                        .width(25.dp))
            } } } }


@Composable
fun MoneyCard(){

    Row(Modifier.padding(start = 10.dp, end = 15.dp, bottom = 8.dp),
        verticalAlignment = Alignment.CenterVertically){

        Column(Modifier.padding(start = 10.dp, end = 10.dp )) {
            Text(text = "$24.99", fontSize = 18.sp, color = Color.Red)
            Text(text = "3 item", fontSize = 14.sp, color = Color.Gray)
        }

        Column(modifier = Modifier
            .height(55.dp)
            .weight(1f)
            .clip(shape = RoundedCornerShape(20.dp))
            .background(Color.Red),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center) {
            Text(
                text = "Go To Card", fontSize = 20.sp,
                color = Color.White
            )
        }
    }
}


@Composable
fun ImageButton(imgRes: Int, onClick: () -> Unit, modifier: Modifier = Modifier) {
    IconButton(
        onClick = onClick,
        modifier = modifier
            .size(30.dp)
    ) {
        Image(
            painterResource(id = imgRes),
            contentDescription = "",
            modifier = Modifier.fillMaxSize()
        )
    }
}


@Composable
fun AvatarStack(avatars: List<Painter>, modifier: Modifier = Modifier) {

    Row(
        modifier = modifier,
        verticalAlignment = Alignment.CenterVertically
    ) {
        avatars.forEachIndexed { index, painter ->
            val overlapAmount = index * 20.dp
            Image(
                painter = painter,
                contentDescription = null,
                contentScale = ContentScale.FillWidth,
                modifier = Modifier
                    .height(40.dp)
                    .width(40.dp)
                    .offset(x = -overlapAmount, y = 0.dp)

            )
        }
    }
}

@Composable
fun FoodItemDetail(color: Color, text:String, img: Int, fontColor: Color){

    Card(modifier = Modifier
        .size(80.dp)
        .shadow(
            elevation = 10.dp, shape =
            RoundedCornerShape(20.dp),
            ambientColor = Color.Red
        )
        , colors = CardDefaults.cardColors(
            containerColor = color))
    {
        Column(verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .fillMaxSize()
                .padding(bottom = 2.dp)) {
            Image(painterResource(img),
                contentDescription = "",
                modifier = Modifier.size(60.dp))
            Text(text = text, fontSize = 13.sp, color = fontColor)
        }
    }
}
*/




















/*@Composable
fun HomePage() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.White)
            .padding(10.dp)
    ) {
        HeaderRow()
        MainCard()
        FoodItem()
        MoneyCard()
    }
}


@Composable
fun HeaderRow() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .height(60.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        // ImageButton for Location
        ImageButton(
            imgRes = R.drawable.location,
            onClick = { *//* Handle location click *//* }
        )

        Text(text = "Boston, MA", fontSize = 22.sp, modifier = Modifier.padding(start = 5.dp))

        Spacer(modifier = Modifier.weight(1f))

        // ImageButton for Search
        ImageButton(
            imgRes = R.drawable.search1,
            onClick = { *//* Handle search click *//* },
            modifier = Modifier.padding(end = 5.dp)
        )
    }
}


@Composable
fun FoodItem(selectedIndex: Int = 0) {
    val sectionCardData = listOf(
        FoodItemData(Color.Red, "Pizza", R.drawable.pizza, Color.White),
        FoodItemData(Color.White, "Hamburger", R.drawable.humburger, Color.Black),
        FoodItemData(Color.White, "Drink", R.drawable.soda, Color.Black),
        FoodItemData(Color.White, "Soup", R.drawable.soups, Color.Black)
    )

    Row(
        modifier = Modifier
            .padding(10.dp)
            .fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceAround,
        verticalAlignment = Alignment.CenterVertically
    ) {
        sectionCardData.forEachIndexed { index, data ->
            FoodItemDetail(
                color = if (index == selectedIndex) data.bgColor else Color.White,
                text = data.text,
                img = data.imgRes,
                fontColor = if (index == selectedIndex) data.fontColor else Color.Black
            )
        }
    }

    if (selectedIndex == 0) {
        ItemCard(
            img = R.drawable.picitem1,
            title = "Pizza food",
            weight = "410g",
            price = "14.99"
        )
        ItemCard(
            img = R.drawable.pizza2,
            title = "Pizza food",
            weight = "560g",
            price = "20.99"
        )
    }
}

data class FoodItemData(
    val bgColor: Color,
    val text: String,
    val imgRes: Int,
    val fontColor: Color
)


@Composable
fun ItemCard(img: Int, title: String, weight: String, price: String) {
    Row(
        modifier = Modifier
            .height(220.dp)
            .fillMaxWidth()
            .padding(15.dp)
    ) {
        Image(
            painterResource(img),
            contentDescription = "",
            modifier = Modifier
                .height(200.dp)
                .width(200.dp))
        Column(
            modifier = Modifier
                .height(200.dp)
                .width(200.dp)
                .padding(start = 10.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.Start) {
            Text(text = title, fontSize = 20.sp)
            Spacer(modifier = Modifier.padding(top = 3.dp))
            Text(text = weight, fontSize = 15.sp, color = Color.Gray)
            Spacer(modifier = Modifier.padding(top = 10.dp))
            Row(
                modifier = Modifier
                    .width(180.dp)
                    .height(40.dp)
            ) {
                PriceColumn(price = price)
                Spacer(modifier = Modifier.weight(1f))
                AddColumn()
            }
        }
    }
}

@Composable
fun PriceColumn(price: String) {
    Column(
        modifier = Modifier
            .height(30.dp)
            .width(65.dp)
            .clip(shape = RoundedCornerShape(8.dp))
            .background(Color.Red),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(text = "$$price", fontSize = 15.sp, color = Color.White)
    }
}

@Composable
fun AddColumn() {
    Column(
        modifier = Modifier
            .height(30.dp)
            .width(30.dp)
            .border(
                BorderStroke(2.dp, color = Color.Red),
                shape = RoundedCornerShape(10.dp)
            )
            .clip(shape = RoundedCornerShape(10.dp)),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painterResource(id = R.drawable.add_ic),
            contentDescription = "",
            modifier = Modifier
                .height(25.dp)
                .width(25.dp)
        )
    }
}

@Composable
fun MainCard() {
    Card(
        shape = RoundedCornerShape(22.dp),
        modifier = Modifier
            .height(155.dp)
            .fillMaxWidth()
            .padding(10.dp),
        colors = CardDefaults.cardColors(containerColor = Color(0xFFF7F2FF))
    ) {
        Text(text = "Order again?", fontSize = 16.sp, color = Color.Black
            , modifier = Modifier.padding(top = 10.dp, start = 10.dp))
        Spacer(modifier = Modifier.padding(top = 3.dp))

        Text(text = "Hot Salami Pizza,Vegan Soup, Hot Pizza",
            fontSize = 14.sp, color = Color.Gray
            , modifier = Modifier.padding( start = 10.dp))

        Spacer(modifier = Modifier.weight(1f))
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(65.dp)
                .padding(start = 10.dp)
            , verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Start
        ) {

            val avatarResources = listOf(
                R.drawable.pizza2,
                R.drawable.soup1,
                R.drawable.picitem1
            )
            val avatars = avatarResources.map { painterResource(id = it) }
            AvatarStack(avatars = avatars)

            Column(modifier = Modifier
                .height(30.dp)
                .width(65.dp)
                .clip(shape = RoundedCornerShape(8.dp))
                .background(Color.Red),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center){
                Text(text = "$85.62", fontSize = 15.sp,
                    color = Color.White) }
            Spacer(modifier = Modifier.weight(1f))
            Column(modifier = Modifier
                .height(30.dp)
                .padding(end = 8.dp)
                .width(30.dp)
                .border(
                    BorderStroke(2.dp, color = Color.Red),
                    shape = RoundedCornerShape(10.dp)
                )
                .clip(shape = RoundedCornerShape(10.dp))
                , verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally){

                Image( painterResource(id = R.drawable.add_ic),
                    contentDescription = ""
                    , modifier = Modifier
                        .height(25.dp)
                        .width(25.dp))
            } } } }


@Composable
fun MoneyCard(){

    Row(
        Modifier.padding(start = 10.dp, end = 15.dp, bottom = 8.dp),
        verticalAlignment = Alignment.CenterVertically){

        Column(Modifier.padding(start = 10.dp, end = 10.dp )) {
            Text(text = "$24.99", fontSize = 18.sp, color = Color.Red)
            Text(text = "3 item", fontSize = 14.sp, color = Color.Gray)
        }

        Column(modifier = Modifier
            .height(55.dp)
            .weight(1f)
            .clip(shape = RoundedCornerShape(20.dp))
            .background(Color.Red),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center) {
            Text(
                text = "Go To Card", fontSize = 20.sp,
                color = Color.White
            )
        }
    }
}


@Composable
fun ImageButton(imgRes: Int, onClick: () -> Unit, modifier: Modifier = Modifier) {
    IconButton(
        onClick = onClick,
        modifier = modifier
            .size(30.dp)
    ) {
        Image(
            painterResource(id = imgRes),
            contentDescription = "",
            modifier = Modifier.fillMaxSize()
        )
    }
}


@Composable
fun AvatarStack(avatars: List<Painter>, modifier: Modifier = Modifier) {

    Row(
        modifier = modifier,
        verticalAlignment = Alignment.CenterVertically
    ) {
        avatars.forEachIndexed { index, painter ->
            val overlapAmount = index * 20.dp
            Image(
                painter = painter,
                contentDescription = null,
                contentScale = ContentScale.FillWidth,
                modifier = Modifier
                    .height(40.dp)
                    .width(40.dp)
                    .offset(x = -overlapAmount, y = 0.dp)

            )
        }
    }
}

@Composable
fun FoodItemDetail(color: Color, text:String, img: Int, fontColor: Color){

    Card(modifier = Modifier
        .size(80.dp)
        .shadow(
            elevation = 10.dp, shape =
            RoundedCornerShape(20.dp),
            ambientColor = Color.Red
        )
        , colors = CardDefaults.cardColors(
            containerColor = color))
    {
        Column(verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .fillMaxSize()
                .padding(bottom = 2.dp)) {
            Image(
                painterResource(img),
                contentDescription = "",
                modifier = Modifier.size(60.dp))
            Text(text = text, fontSize = 13.sp, color = fontColor)
        }
    }
}*/
