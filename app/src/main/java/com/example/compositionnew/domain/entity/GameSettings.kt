package com.example.compositionnew.domain.entity

data class GameSettings(
    val maxSumValue: Int,
    val minCountofRightAnswers: Int,
    val minPercentOfRightAnswers:Int,
    val gameTimeinSeconds : Int
)