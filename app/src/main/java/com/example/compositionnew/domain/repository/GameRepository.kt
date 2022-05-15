package com.example.compositionnew.domain.repository

import com.example.compositionnew.domain.entity.GameSettings
import com.example.compositionnew.domain.entity.Level
import com.example.compositionnew.domain.entity.Question

interface GameRepository {

    fun GenerateQuestion(
        maxSumValue :Int,
        countOfOptions : Int
        ):Question

    fun getGameSettings(level: Level): GameSettings
}