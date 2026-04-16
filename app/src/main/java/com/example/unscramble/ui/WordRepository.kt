package com.example.unscramble.data

import kotlinx.coroutines.flow.Flow

class WordRepository(private val dao: WordDao) {

    val allWords: Flow<List<WordEntity>> = dao.getAllWords()

    suspend fun insertWord(word: String) {
        dao.insert(WordEntity(word = word))
    }
}