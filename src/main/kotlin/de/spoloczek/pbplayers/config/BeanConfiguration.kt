package de.spoloczek.pbplayers.config

import de.spoloczek.pbplayers.repository.PlayerRepository
import de.spoloczek.pbplayers.domain.service.PlayerService
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class BeanConfiguration
{
    @Bean
    fun playerService(playerRepository: PlayerRepository): PlayerService = PlayerService(playerRepository)
}