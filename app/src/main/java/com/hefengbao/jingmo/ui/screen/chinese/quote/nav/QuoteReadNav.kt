/*
 *  This file is part of the 京墨（jingmo）APP.
 *
 * (c) 贺丰宝（hefengbao） <hefengbao@foxmail.com>
 *
 *  For the full copyright and license information, please view the LICENSE
 *  file that was distributed with this source code.
 */

package com.hefengbao.jingmo.ui.screen.chinese.quote.nav

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.hefengbao.jingmo.ui.screen.chinese.quote.QuoteReadRoute

private const val ROUTE = "chinese_quote_read"

fun NavController.navigateToChineseQuoteReadScreen() {
    this.navigate(ROUTE)
}

fun NavGraphBuilder.chineseQuoteReadScreen(
    onBackClick: () -> Unit
) {
    composable(ROUTE) {
        QuoteReadRoute(onBackClick = onBackClick)
    }
}