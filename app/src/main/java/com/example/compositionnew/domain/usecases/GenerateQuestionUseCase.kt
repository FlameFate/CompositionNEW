package com.example.compositionnew.domain.usecases

import com.example.compositionnew.domain.entity.Question
import com.example.compositionnew.domain.repository.GameRepository

class GenerateQuestionUseCase(
    private val repository: GameRepository
) {

    operator fun invoke(maxSumValue : Int): Question {
return repository.GenerateQuestion(maxSumValue, Count_Of_Options)
    }
private companion object{
private const val Count_Of_Options = 6
}
}