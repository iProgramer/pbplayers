package de.spoloczek.pbplayers.domain

class Team
{
    var name: String; private set
    val members = mutableSetOf<Player>();

    constructor(name: String)
    {
        this.name = name
    }

    fun addMember(player: Player)
    {
        members.add(player)
    }
}