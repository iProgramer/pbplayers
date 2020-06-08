package de.spoloczek.pbplayers.adapter

import de.spoloczek.pbplayers.domain.entity.Player
import de.spoloczek.pbplayers.domain.repository.PlayerRepository
import org.springframework.stereotype.Repository

@Repository
class RandomPlayerRepository : PlayerRepository
{
    var counter = 0
    val playerList: MutableSet<Player> = hashSetOf()

    override fun addPlayer(player: Player): Player
    {
        val newPlayer = Player(counter, player.firstName, player.lastName)
        playerList.add(newPlayer)
        counter++
        return newPlayer
    }

    override fun getAllPlayers(): List<Player> = playerList.toList()

    override fun getPlayerById(id: Int): Player =
            playerList.stream()
                    .filter { it.id == id }
                    .findFirst()
                    .orElseThrow()

    override fun deletePlayer(id: Int) = playerList.removeIf { it.id == id }

}