package com.pfv.eventtracker.ui.screens.home

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.pfv.eventtracker.R
import com.pfv.eventtracker.ui.screens.home.components.HomeScreenTopBar
import com.pfv.eventtracker.ui.screens.home.components.InfoCategoryItem
import com.pfv.eventtracker.ui.screens.home.components.InfoSectionItem

@Composable
fun HomeScreen(
    navController: NavController
) {

    Scaffold(
        modifier = Modifier
            .fillMaxSize(),
        containerColor = MaterialTheme.colorScheme.surface,
        topBar = {
            HomeScreenTopBar(
                modifier = Modifier
                    .statusBarsPadding()
            )
        }
    ) {

        Column(
            modifier = Modifier
                .padding(it)
                .padding(horizontal = 16.dp)
                .fillMaxWidth()
        ) {

            Text(
                modifier = Modifier
                    .padding(
                        bottom = 12.dp,
                        top = 30.dp
                    ),
                text = stringResource(id = R.string.financial_summary),
                color = MaterialTheme.colorScheme.onSurface,
                fontSize = 18.sp,
                fontWeight = FontWeight.SemiBold
            )

            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(12.dp)
            ) {
                InfoSectionItem(
                    modifier = Modifier
                        .weight(1f),
                    value = "$5000",
                    title = "Savings",
                    onClick = {}
                )

                InfoSectionItem(
                    modifier = Modifier
                        .weight(1f),
                    value = "$2000",
                    title = "Investments",
                    onClick = {}
                )

                InfoSectionItem(
                    modifier = Modifier
                        .weight(1f),
                    value = "$5100",
                    title = "Expenses",
                    onClick = {}
                )
            }

            Text(
                modifier = Modifier
                    .padding(
                        bottom = 12.dp,
                        top = 30.dp
                    ),
                text = stringResource(id = R.string.spent_by_category),
                color = MaterialTheme.colorScheme.onSurface,
                fontSize = 18.sp,
                fontWeight = FontWeight.SemiBold
            )

            InfoCategoryItem(
                modifier = Modifier
                    .padding(bottom = 6.dp),
                img = R.drawable.ic_alcohol,
                title = stringResource(id = R.string.alcohol),
                value = "300$"
            )

            InfoCategoryItem(
                modifier = Modifier
                    .padding(bottom = 6.dp),
                img = R.drawable.ic_alcohol,
                title = stringResource(id = R.string.alcohol),
                value = "300$",
            )

            InfoCategoryItem(
                modifier = Modifier
                    .padding(bottom = 6.dp),
                img = R.drawable.ic_alcohol,
                title = stringResource(id = R.string.alcohol),
                value = "300$"
            )
        }
    }
}