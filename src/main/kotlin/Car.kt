package org.example

class Car(color: String, brand: String, model: String, horsePower: Int, doorNum: Int, licensePlate: String) {

    var color: String = color
        set(value) {
            verifyColor(value)
            field = value
        }

    val brand: String = brand
        get() = field.replaceFirstChar {it.uppercase()}

    val model: String = model
        get() = field.replaceFirstChar {it.uppercase()}

    val horsePower: Int = horsePower

    val doorNum: Int = doorNum

    val licensePlate: String = licensePlate

    init {
        verifyColor(color)
        verifyBrand(brand)
        verifyModel(model)
        verifyHorsePower(horsePower)
        verifyDoorNum(doorNum)
        verifyLicensePlate(licensePlate)
    }

    /** Verifica que el color no sea una cadena vacía o en blanco
     */
    private fun verifyColor(color: String) {
        require(color.trim().isNotEmpty()) {"La propiedad color no puede estar vacía"}
    }

    /** Verifica que la marca no sea una cadena vacía o en blanco
     */
    private fun verifyBrand(brand: String) {
        require(brand.trim().isNotEmpty()) {"La marca no puede estar vacía"}
    }

    /** Verifica que el modelo no sea una cadena vacía o en blanco
     */
    private fun verifyModel(model: String) {
        require(model.trim().isNotEmpty()) {"El modelo no puede estar vacío"}
    }

    /** Verifica que el numero de caballos esté entre 70 y 700
     */
    private fun verifyHorsePower(horsePower: Int) {
        require(horsePower in 70..700) {"El número de caballos no puede ser menor de 70 ni mayor de 700"}
    }

    /** Verifica que el numero de puertas esté entre 3 y 5
     */
    private fun verifyDoorNum(doorNum: Int) {
        require(doorNum in 3..5) {"El número de puertas no puede ser menor de 3 ni mayor de 5"}
    }

    /** Verifica que la matrícula tenga 7 caracteres
     */
    private fun verifyLicensePlate(licensePlate: String) {
        require(licensePlate.trim().length == 7) {"La matrícula debe tener 7 caracteres"}
    }
}