package com.example.compositionnew.domain.usecases

import com.example.compositionnew.domain.entity.GameSettings
import com.example.compositionnew.domain.entity.Level
import com.example.compositionnew.domain.repository.GameRepository

class GetGameSettingsUseCase(private val repository:GameRepository)
{


    operator fun invoke(level: Level): GameSettings{
return repository.getGameSettings(level)
    }
}