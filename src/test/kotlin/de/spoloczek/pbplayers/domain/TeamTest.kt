package de.spoloczek.pbplayers.domain

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
internal class TeamTest
{

    @Test
    fun `init team`()
    {
        val team = Team("DNA Offenburg")

        assertEquals("DNA Offenburg", team.name)
    }

}