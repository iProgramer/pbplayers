package de.spoloczek.pbplayers.domain

class Player
{
    var firstName: String; private set
    var lastName: String; private set
    var team: Team? = null; private set

    constructor(firstName: String, lastName: String)
    {
        this.firstName = firstName
        this.lastName = lastName
    }

    fun addToTeam(team: Team)
    {
        this.team = team;
        team.addMember(this)
    }
}
