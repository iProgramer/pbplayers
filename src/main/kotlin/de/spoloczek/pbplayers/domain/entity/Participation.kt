package de.spoloczek.pbplayers.domain.entity

class Participation
{
    val event: Event
    val player: Player

    constructor(event: Event, player: Player)
    {
        this.event = event
        this.player = player
    }
}