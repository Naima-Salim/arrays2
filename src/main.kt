fun main() {
    var e = numbers(arrayOf(4,7,9,5))
   println(e)

    var f=mixedType(arrayOf(2, 3.5, "naima", 5.2F, 2.2F, 8, "salim"))
    println(f)

   var k=letters(arrayOf('a','d', 'l', 'e','i','j','o','b','u'))
   println(k)
}
//write a function that takes in an array of integers and returns the product of all the elements.

fun numbers(num:Array<Int>):Int {
    var product = 1
    num.forEach { naima->
        product*=naima
    }
    return product
}
//write a function that takes in an array of mixed types and returns the sum of
//all the decimal elements.

fun mixedType(numbers: Array<Any>):Float {
    var sum = 0.0F
    numbers.forEach { naima ->
        if (naima is Float || naima is Double) {
            sum+=naima.toString().toFloat()

        }
    }
    return sum

      }
//write a function that takes in an array of characters and return the number of
//vowels in the array

fun letters(vowels: Array<Char>):Int {
    var num= 0
    vowels.forEach { mima->
        if(mima =='a' || mima =='e' || mima =='i' || mima =='o' || mima =='u'){
            num++

            }

        }
          return num

}




