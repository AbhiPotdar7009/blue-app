package com.example.blue_app.ui.screen.main

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import com.example.blue_app.R
import com.example.blue_app.domain.model.ListItem

@Composable
fun StatsBottomSheetContent(labelList: List<ListItem>, top3: List<Pair<Char, Int>>) {
    Column(modifier = Modifier.padding(dimensionResource(id = R.dimen.padding_large))) {
        Text(
            text = "List 1 (${labelList.size} items)",
            style = MaterialTheme.typography.titleMedium
        )
        Spacer(modifier = Modifier.height(dimensionResource(id = R.dimen.height_small)))
        top3.forEach { (char, count) ->
            Text(text = "$char = $count")
        }
        Spacer(modifier = Modifier.height(dimensionResource(id = R.dimen.height_medium)))
    }
}
