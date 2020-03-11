package de.spoloczek.pbplayers.domain.entity

import de.spoloczek.pbplayers.domain.entity.Field
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