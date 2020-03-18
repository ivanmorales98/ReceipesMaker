package Reto

class Frutas: Ingredients("frutas") {
    override fun showList() {
        super.showList()
        println("""
            1. Fresa
            2. Plátano
            3. Uvas
            4. Manzana
            5. Naranja
            6. Pera
            7. Cereza
        """.trimIndent())
    }
}