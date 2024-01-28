/*
Crear una clase Coche, a través de la cual se pueda conocer el color del coche,
 la marca, el modelo, el número de caballos, el número de puertas y la matrícula.

 Crear el constructor del coche, así como el método toString().
    - Marca y modelo no podrán ser blancos ni nulos y no podrán modificarse.
    - Número de caballos, número de puertas y matrícula no podrán modificarse, ni podrán ser nulos.
    - Color podrá modificarse, pero no podrá ser nulo.

Recuerda que Kotlin añade los getters y setters con el comportamiento por defecto,
 por lo que no es necesario que los implementes, a no ser que tengas que añadir alguna funcionalidad extra.

    - Modifica el atributo matricula para que no permita actualizar la matrícula con un valor que
        no tenga 7 caracteres.
    - Los atributos de modelo y marca siempre se devolverán con la primera letra en mayúscula.
    - Realiza también una modificación del atributo número de caballos,
        para que no permita actualizar el atributo numCaballos con un valor inferior a 70, ni superior a 700.
    - Realiza una modificación del atributo número de puertas,
        para que no permita actualizar el atributo numPuertas con un valor inferior a 3, ni superior a 5.
    - Ten en cuenta todas estas condiciones a la hora de crear el constructor de la clase.

En el programa principal, instancia varios coches y muéstralos por pantalla.
 Probar las modificaciones anteriores, modifica el número de caballos para un coche
 y haz lo mismo para el número de puertas, el color, la marca y modelo.
 Vuelve a mostrarlos por pantalla.

    - Intenta instanciar y modificar con la marca y modelo con valores nulos o blancos y comprueba que no es posible.
    - Intenta instanciar y modificar con el número de caballos con un valor inferior a 70 o superior a 700
        y comprueba que no es posible.
    - Intenta instanciar y modificar con el número de puertas con un valor inferior a 3 o superior a 5
        y comprueba que no es posible.
    - Intenta instanciar y modificar con la matrícula con un valor que no tenga 7 caracteres
        y comprueba que no es posible.
    - Intenta instanciar y modificar con el color, el número de caballos, el número de puertas y la matrícula
        con valores nulos/blancos y comprueba que no es posible.
 */

package org.example

fun main() {
    /* A ver, el ejercicio dice claramente que la única propiedad que se puede modificar es color,
        pero luego pide que intente modificar las demás propiedades lo cual es imposible porque son de solo lectura.
        El enunciado está un poco raro
     */

    val coche0 = Car("blanco", "honda", "hondureño", 170, 4, "AAAA000")

    try {
        val coche1 = Car("   ", "seat", "panda", 110, 3, "ABCD123")
    } catch (e: IllegalArgumentException) {
        println("Vemos que al intentar crear un coche con el color con solo espacios nos da un error")
        println("** ERROR ** - $e")
        println()
    }

    try {
        coche0.color = ""
    } catch (e: IllegalArgumentException) {
        println("Al intentar cambiar el color por una cadena vacía nos da un error")
        println("** ERROR ** - $e")
        println()
    }

    try {
        val coche1 = Car("rojo", "", "kebab", 250, 5, "ZZZZ999")
    } catch (e: IllegalArgumentException) {
        println("Al intentar crear un coche con marca vacía da error")
        println("** ERROR ** - $e")
        println()
    }

    try {
        val coche1 = Car("azul", "renault", "", 95, 3, "QWER456")
    } catch (e: IllegalArgumentException) {
        println("Al intentar crear un coche con modelo vacío da error")
        println("** ERROR ** - $e")
        println()
    }

    try {
        val coche1 = Car("azul", "renault", "kebab", 50, 3, "QWER456")
    } catch (e: IllegalArgumentException) {
        println("Al intentar crear un coche con menos de 70 caballos da error")
        println("** ERROR ** - $e")
        println()
    }

    try {
        val coche1 = Car("azul", "renault", "kebab", 950, 3, "QWER456")
    } catch (e: IllegalArgumentException) {
        println("Al intentar crear un coche con más de 700 caballos da error")
        println("** ERROR ** - $e")
        println()
    }

    try {
        val coche1 = Car("azul", "renault", "kebab", 500, 2, "QWER456")
    } catch (e: IllegalArgumentException) {
        println("Al intentar crear un coche con menos de 3 puertas da error")
        println("** ERROR ** - $e")
        println()
    }

    try {
        val coche1 = Car("azul", "renault", "kebab", 500, 6, "QWER456")
    } catch (e: IllegalArgumentException) {
        println("Al intentar crear un coche con más de 5 puertas da error")
        println("** ERROR ** - $e")
        println()
    }

    try {
        val coche1 = Car("azul", "renault", "kebab", 500, 4, "HOLA")
    } catch (e: IllegalArgumentException) {
        println("Al intentar crear un coche cuya matrícula no tiene 7 caracteres da error")
        println("** ERROR ** - $e")
        println()
    }

    try {
        val coche1 = Car("azul", "renault", "kebab", 500, 4, "       ")
    } catch (e: IllegalArgumentException) {
        println("Si la matrícula llega a 7 caracteres pero estos son espacios en blanco tambien da error")
        println("** ERROR ** - $e")
        println()
    }

    println("El programa controla que no se puedan usar nulos porque no usa tipos nulables")
}