package de.spoloczek.pbplayers.domain

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
internal class FieldTest
{

    @Test
    fun `init field`()
    {
        val field = Field("Paintball Ranch Karlsruhe")

        assertEquals("Paintball Ranch Karlsruhe", field.name)
    }

}