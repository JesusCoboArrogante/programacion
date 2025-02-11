package org.example.mappers

import org.example.dto.AlumnadoDto
import org.example.models.Alumnado
import java.time.LocalDate



fun Alumnado.dto()= AlumnadoDto(
    id = id,
    nombre = nombre,
    createAt = createAt.toString(),
    tipo = tipo,
    edad = edad,
)

fun AlumnadoDto.toModel() = Alumnado(
    id = id,
    nombre = nombre,
    createAt = LocalDate.parse(createAt),
    tipo = tipo,
    edad = edad,
)
