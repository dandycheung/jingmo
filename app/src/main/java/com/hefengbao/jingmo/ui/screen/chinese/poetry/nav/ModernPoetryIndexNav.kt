/*
 * This file is part of the 京墨（jingmo）APP.
 *
 * (c) 贺丰宝（hefengbao） <hefengbao@foxmail.com>
 *
 * For the full copyright and license information, please view the LICENSE
 * file that was distributed with this source code.
 */

package com.hefengbao.jingmo.ui.screen.chinese.poetry.nav

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.hefengbao.jingmo.ui.screen.chinese.poetry.ModernPoetryIndexRoute

private const val ROUTE = "chinese_modern_poetry_index"
private const val ROUTE_GRAPH = "chinese_modern_poetry_index_graph"

fun NavController.navigateToChineseModernPoetryIndexGraph() {
    this.navigate(ROUTE) {
        launchSingleTop = true
    }
}

fun NavGraphBuilder.chineseModernPoetryIndexGraph(
    onBackClick: () -> Unit,
    onBookmarksClick: () -> Unit,
    onReadMoreClick: () -> Unit,
    onSearchClick: () -> Unit,
    nestGraph: NavGraphBuilder.() -> Unit
) {
    navigation(
        startDestination = ROUTE,
        route = ROUTE_GRAPH
    ) {
        composable(ROUTE) {
            ModernPoetryIndexRoute(
                onBackClick = onBackClick,
                onBookmarksClick = onBookmarksClick,
                onReadMoreClick = onReadMoreClick,
                onSearchClick = onSearchClick
            )
        }

        nestGraph()
    }
}