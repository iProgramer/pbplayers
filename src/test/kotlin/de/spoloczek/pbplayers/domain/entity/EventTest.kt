package de.spoloczek.pbplayers.domain.entity

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class EventTest
{
    @Test
    fun `init field`()
    {
        val event = Event("Random Event")

        Assertions.assertEquals("Random Event", event.name)
    }

    fun `add player to event`()
    {
        val event = Event("Random Event")
        val player = Player(1, "Max", "Mustermann")

        val participation = event.addPlayer(player)

    }

}