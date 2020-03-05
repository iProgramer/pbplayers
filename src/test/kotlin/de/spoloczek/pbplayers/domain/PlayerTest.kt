package de.spoloczek.pbplayers.domain

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
internal class PlayerTest
{
//    val repoMock: PlayerRepository = mock()
//    val playerService = PlayerService(repoMock);

    @BeforeEach
    fun init()
    {
//        whenever(repoMock.addPlayer()).thenReturn(1)
    }

    @Test
    fun `init player`()
    {
        val player = Player("Max", "Mustermann")

        assertEquals("Max", player.firstName)
        assertEquals("Mustermann", player.lastName)
    }

    @Test
    fun `add to a team`()
    {
        val player = Player("firstName", "lastName")
        val team = Team("abc")

        player.addToTeam(team)

        assertEquals(team, player.team)
        assertTrue(team.members.contains(player))
    }

}