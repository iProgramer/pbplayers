package de.spoloczek.pbplayers.domain.service

import de.spoloczek.pbplayers.domain.entity.Player
import de.spoloczek.pbplayers.domain.repository.PlayerRepository

class PlayerService
{
    private val playerRepository: PlayerRepository

    constructor(playerRepository: PlayerRepository)
    {
        this.playerRepository = playerRepository
    }

    fun listAllPlayers(): List<Player> = playerRepository.getAllPlayers()

    fun addNewPlayer(player: Player): Player = playerRepository.addPlayer(player)

}