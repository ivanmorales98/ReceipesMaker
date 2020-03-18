package Reto

abstract class Ingredients(val categoria:String){

    open fun showList(){
        println("La lista de ingredientes de la categoria ${categoria} es: \n")
    }
}