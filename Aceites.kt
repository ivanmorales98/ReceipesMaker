package Reto

class Aceites: Ingredients("aceites") {
    override fun showList() {
        super.showList()
        println("""
            1. De oliva
            2. De cáñamo
            3. De girasol
            4. De palma
            5. De coco
            6. De almendras
        """.trimIndent())
    }

}