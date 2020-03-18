package Reto

class Verduras: Ingredients("verduras") {
    override fun showList() {
        super.showList()
        println("""
            1. Brócoli
            2. Espinacas
            3. Rúcula
            4. Lechuga
            5. Alcachofa
            6. Cebolla
            7. Col
            
        """.trimIndent())
    }
}