package de.spoloczek.pbplayers.application

import de.spoloczek.pbplayers.service.PlayerService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("players")
class PlayerController
{
    val playerService : PlayerService

    @Autowired
    constructor(playerService: PlayerService)
    {
        this.playerService = playerService
    }

    @GetMapping
    fun getAllPlayers() = playerService.listAllPlayers()

}