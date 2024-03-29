package org.example

class Car(color: String, brand: String, model: String, horsePower: Int, doorNum: Int, licensePlate: String) {

    var color: String = color
        set(value) {
            verifyColor(value)
            field = value
        }

    private val brand: String = brand
        get() = field.replaceFirstChar {it.uppercase()}

    private val model: String = model
        get() = field.replaceFirstChar {it.uppercase()}

    private val horsePower: Int = horsePower

    private val doorNum: Int = doorNum

    private val licensePlate: String = licensePlate

    init {
        verifyColor(color)
        verifyBrand(brand)
        verifyModel(model)
        verifyHorsePower(horsePower)
        verifyDoorNum(doorNum)
        verifyLicensePlate(licensePlate)
    }

    /** Verifica que el color no sea una cadena vacía o en blanco
     *
     * @param color
     */
    private fun verifyColor(color: String) {
        require(color.trim().isNotEmpty()) {"La propiedad color no puede estar vacía"}
    }

    /** Verifica que la marca no sea una cadena vacía o en blanco
     *
     * @param brand
     */
    private fun verifyBrand(brand: String) {
        require(brand.trim().isNotEmpty()) {"La marca no puede estar vacía"}
    }

    /** Verifica que el modelo no sea una cadena vacía o en blanco
     *
     * @param model
     */
    private fun verifyModel(model: String) {
        require(model.trim().isNotEmpty()) {"El modelo no puede estar vacío"}
    }

    /** Verifica que el numero de caballos esté entre 70 y 700
     *
     * @param horsePower
     */
    private fun verifyHorsePower(horsePower: Int) {
        require(horsePower in 70..700) {"El número de caballos no puede ser menor de 70 ni mayor de 700"}
    }

    /** Verifica que el numero de puertas esté entre 3 y 5
     *
     * @param doorNum
     */
    private fun verifyDoorNum(doorNum: Int) {
        require(doorNum in 3..5) {"El número de puertas no puede ser menor de 3 ni mayor de 5"}
    }

    /** Verifica que la matrícula tenga 7 caracteres
     *
     * @param licensePlate
     */
    private fun verifyLicensePlate(licensePlate: String) {
        require(licensePlate.trim().length == 7) {"La matrícula debe tener 7 caracteres"}
    }

    override fun toString(): String {
        return "color: $color, marca: $brand, modelo: $model, numero de caballos: $horsePower, " +
                "numero de puertas: $doorNum, matrícula: $licensePlate"
    }
}