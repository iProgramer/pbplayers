package de.spoloczek.pbplayers.domain

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

}