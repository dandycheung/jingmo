/*
 * This file is part of the 京墨（jingmo）APP.
 *
 * (c) 贺丰宝（hefengbao） <hefengbao@foxmail.com>
 *
 * For the full copyright and license information, please view the LICENSE
 * file that was distributed with this source code.
 */

package com.hefengbao.jingmo.data.network

import com.hefengbao.jingmo.data.model.ChineseExpressionWrapper
import com.hefengbao.jingmo.data.model.ChineseKnowledge
import com.hefengbao.jingmo.data.model.ChineseWisecrack
import com.hefengbao.jingmo.data.model.ClassicPoem
import com.hefengbao.jingmo.data.model.Dataset
import com.hefengbao.jingmo.data.model.DictionaryWrapper
import com.hefengbao.jingmo.data.model.IdiomWrapper
import com.hefengbao.jingmo.data.model.Lyric
import com.hefengbao.jingmo.data.model.PeopleWrapper
import com.hefengbao.jingmo.data.model.PoemSentence
import com.hefengbao.jingmo.data.model.Riddle
import com.hefengbao.jingmo.data.model.TongueTwister
import com.hefengbao.jingmo.data.model.WritingWrapper

interface Network {
    suspend fun dataset(): List<Dataset>
    suspend fun chineseExpressions(page: Int): ChineseExpressionWrapper
    suspend fun chineseKnowledge(): List<ChineseKnowledge>
    suspend fun chineseWisecracks(): List<ChineseWisecrack>
    suspend fun classicPoems(): List<ClassicPoem>
    suspend fun dictionary(page: Int): DictionaryWrapper
    suspend fun lyrics(): List<Lyric>
    suspend fun idioms(page: Int): IdiomWrapper
    suspend fun people(page: Int): PeopleWrapper
    suspend fun poemSentences(): List<PoemSentence>
    suspend fun riddles(): List<Riddle>
    suspend fun tongueTwisters(): List<TongueTwister>
    suspend fun writings(page: Int): WritingWrapper
}