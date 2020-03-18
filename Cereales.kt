package Reto

class Cereales: Ingredients("cereales") {
    override fun showList() {
        super.showList()
        println("""
            1. Avena
            2. Trigo
            3. Arroz
            4. Maiz
        """.trimIndent())
    }

}