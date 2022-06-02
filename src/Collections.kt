data class Recipe(var name: String)
fun main(args: Array<String>) {
    var myShoppingList = mutableListOf("Tea", "Milk", "Eggs")
    println("myShoppingList original: $myShoppingList")

    val extraShopping = listOf("Cookies", "sugar", "Eggs")
    myShoppingList.addAll(extraShopping)

    println("myShoppingList items added: $myShoppingList")

    if (myShoppingList.contains("Tea")){
        myShoppingList.set(myShoppingList.indexOf("Tea"), "Coffee")
    }

    myShoppingList.sort()
    println("myShoppingList sorted: $myShoppingList")

    myShoppingList.reverse()
    println("myShoppingList reversed: $myShoppingList")

    val mShoppingSet = myShoppingList.toMutableSet()
    println("mShoppingSet: $mShoppingSet")
    val moreShopping = setOf("Chives", "Spinach", "Milk")
    mShoppingSet.addAll(moreShopping)
    println("mShoppingSet items added: $mShoppingSet")
    myShoppingList = mShoppingSet.toMutableList()
    println("myShoppingList new version: $myShoppingList")

    val r1 = Recipe("Chicken soup")
    val r2 = Recipe("Quinoa salad")
    val r3 = Recipe("Thai Curry")
    val r4 = Recipe("Jambalaya")
    val r5 = Recipe("Sausage Rolls")

    val mRecipeMap = mutableMapOf("Recipe1" to r1, "Recipe2" to r2,
        "Recipe3" to r3)
    println("mRecipeMap origginal: $mRecipeMap")

    val recipesToAdd = mapOf("Recipe4" to r4, "Recipe5" to r5)
    mRecipeMap.putAll(recipesToAdd)
    println("mRecipeMap updated: $mRecipeMap")

    if (mRecipeMap.containsKey("Recipe1")){
        println("Recipe1 is: ${mRecipeMap.getValue("Recipe1")}")
    }
}