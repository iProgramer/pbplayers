package de.spoloczek.pbplayers.domain.service

import de.spoloczek.pbplayers.domain.entity.Player
import de.spoloczek.pbplayers.domain.repository.PlayerRepository
import org.junit.jupiter.api.Test
import org.mockito.Mockito
import org.mockito.Mockito.mock
import org.mockito.Mockito.times

internal class PlayerServiceTest
{
    var playerService: PlayerService
    var playerRepository: PlayerRepository

    constructor()
    {
        playerRepository = mock(PlayerRepository::class.java)
        playerService = PlayerService(playerRepository)
    }

    @Test
    fun `load all players from repo`()
    {
        Mockito.spy(playerRepository)

        playerService.listAllPlayers()

        Mockito.verify(playerRepository, times(1)).getAllPlayers()
    }

    @Test
    fun `add new player to repo`()
    {
        Mockito.spy(playerRepository)
        val newPlayer = Player(1, "Max", "Mustermann")

        playerService.addNewPlayer(newPlayer)

        Mockito.verify(playerRepository, times(1)).addPlayer(newPlayer)
    }

    @Test
    fun `let player participates to an event`(){


    }
}