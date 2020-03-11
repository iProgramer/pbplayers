package de.spoloczek.pbplayers.service

import de.spoloczek.pbplayers.domain.Player
import de.spoloczek.pbplayers.repository.PlayerRepository

class PlayerService
{
    val playerRepository: PlayerRepository

    constructor(playerRepository: PlayerRepository)
    {
        this.playerRepository = playerRepository
    }

    fun listAllPlayers(): List<Player> = playerRepository.getAllPlayers()

    fun addNewPlayer(player: Player): Player = playerRepository.addPlayer(player)

}