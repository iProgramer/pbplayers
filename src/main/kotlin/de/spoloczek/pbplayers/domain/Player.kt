package de.spoloczek.pbplayers.domain

class Player
{
    val id: Int
    var firstName: String; private set
    var lastName: String; private set
    var team: Team? = null; private set

    constructor(id: Int, firstName: String, lastName: String)
    {
        this.id = id
        this.firstName = firstName
        this.lastName = lastName
    }

    fun addToTeam(team: Team)
    {
        this.team = team;
        team.addMember(this)
    }
}
