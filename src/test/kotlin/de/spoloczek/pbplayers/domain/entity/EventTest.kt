package de.spoloczek.pbplayers.domain.entity

import org.junit.jupiter.api.Assertions.assertEquals

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class EventTest
{
    @Test
    fun `init event`()
    {
        var field = Field("Karlsruhe Paintball Ranch")
        val event = Event("Random Event", field)

        assertEquals("Random Event", event.name)
        assertEquals(field, event.field)
    }

    @Test
    fun `add player to event`()
    {
        var field = Field("Karlsruhe Paintball Ranch")
        val event = Event("Random Event", field)
        val player = Player(1, "Max", "Mustermann")

        event.addPlayer(player)

        assertEquals(1, event.getParticipants().size)


    }

}