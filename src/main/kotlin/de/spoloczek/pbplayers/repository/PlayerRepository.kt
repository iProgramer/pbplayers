package de.spoloczek.pbplayers.repository

import de.spoloczek.pbplayers.domain.Player

interface PlayerRepository
{
    fun addPlayer(player: Player): Player

    fun getPlayerById(id: Int): Player

    fun deletePlayer(id: Int): Boolean

    fun getAllPlayers(): List<Player>
}