/*
 * This file is part of the 京墨（jingmo）APP.
 *
 * (c) 贺丰宝（hefengbao） <hefengbao@foxmail.com>
 *
 * For the full copyright and license information, please view the LICENSE
 * file that was distributed with this source code.
 */

package com.hefengbao.jingmo.ui.screen.classicalliterature.people

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Refresh
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.hilt.navigation.compose.hiltViewModel
import com.hefengbao.jingmo.data.database.entity.classicalliterature.PeopleEntity
import com.hefengbao.jingmo.ui.component.SimpleScaffold
import com.hefengbao.jingmo.ui.screen.classicalliterature.people.components.PeoplePanel

@Composable
fun PeopleIndexRoute(
    viewModel: PeopleIndexViewModel = hiltViewModel(),
    onBackClick: () -> Unit,
    onSearchClick: () -> Unit,
) {
    val people by viewModel.people.collectAsState(initial = null)

    LaunchedEffect(Unit) {
        viewModel.getRandomPeople()
    }

    PeopleIndexScreen(
        onBackClick = onBackClick,
        onSearchClick = onSearchClick,
        people = people,
        onFabClick = {
            viewModel.getRandomPeople()
        }
    )
}

@Composable
private fun PeopleIndexScreen(
    onBackClick: () -> Unit,
    onSearchClick: () -> Unit,
    people: PeopleEntity?,
    onFabClick: () -> Unit
) {
    SimpleScaffold(
        onBackClick = onBackClick,
        title = "人物",
        actions = {
            IconButton(onClick = onSearchClick) {
                Icon(imageVector = Icons.Default.Search, contentDescription = "查找")
            }
        },
        floatingActionButton = {
            if (people !== null) {
                FloatingActionButton(onClick = onFabClick) {
                    Icon(imageVector = Icons.Default.Refresh, contentDescription = "刷新")
                }
            }
        }
    ) {
        people?.let {
            PeoplePanel(people = it)
        }
    }
}