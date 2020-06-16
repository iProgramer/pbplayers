package de.spoloczek.pbplayers.domain.entity

import org.hibernate.validator.internal.util.stereotypes.Immutable

class Event
{
    val name: String
    val field: Field

    private val participants: MutableSet<Player> = hashSetOf()

    constructor(name: String, field: Field)
    {
        this.name = name;
        this.field = field;
    }

    fun addPlayer(player: Player) = participants.add(player)

    fun getParticipants() = setOf(participants)

}