package de.spoloczek.pbplayers.domain.repository

import de.spoloczek.pbplayers.domain.entity.Player

interface PlayerRepository
{
    fun addPlayer(player: Player): Player

    fun getPlayerById(id: Int): Player

    fun deletePlayer(id: Int): Boolean

    fun getAllPlayers(): List<Player>
}