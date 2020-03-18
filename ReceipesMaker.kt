import Reto.Aceites
import Reto.Cereales
import Reto.Frutas
import Reto.Verduras

fun main(args: Array<String>){
    println(":: Bienvenido a Receipe Maker ::")
    //val ingredientes:List<String> = listOf<String>("Agua", "Leche", "Carne", "Verduras", "Frutas", "Cereal", "Huevos", "Aceite")

    println("""
        Selecciona la opción deseada
        1. Hacer una receta
        2. Ver mis recetas
        3. Salir
    """.trimIndent())

    var response:String? = readLine()

    while(response != "3"){
        when(response){
            "1" -> makeRecipe()
            "2" -> viewRecipe()
            else -> println("El valor que has introducido no es valido. Por favor, intentelo de nuevo.")
        }
    }
    println("Finalizado con éxito.")

}


fun makeRecipe(){

    println("""
        Hacer receta
        Selecciona por categoría el ingrediente que buscas
        1. Agua
        2. Leche
        3. Carne
        4. Verduras
        5. Frutas
        6. Cereal
        7. Huevos
        8. Aceites
    """.trimIndent())
    val aceites:Aceites = Aceites()
    val cereales:Cereales = Cereales()
    val frutas:Frutas = Frutas()
    val verduras:Verduras = Verduras()

    var response:String? = readLine()

    when(response){
        "1" -> println("Has seleccionado Agua")
        "2" -> println("Has seleccionado Leche")
        "3" -> println("Has seleccionado Carne")
        "4" -> verduras.showList()
        "5" -> frutas.showList()
        "6" -> cereales.showList()
        "7" -> println("Has seleccionado Huevos")
        "8" -> aceites.showList()


        else -> println("El valor que has introducido no es valido. Por favor, intentelo de nuevo.")
    }
}

fun viewRecipe(){
    println("Ver mis recetas")
}