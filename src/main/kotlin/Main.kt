fun main(){
   greet("Sharon")
   modulus(78, 12)
   add(22, 47, 64, 122)
    interestfactact(fact1 = "I", fact2 = "love", fact3 = "reading", fact4 = "novels")
}

   fun greet( name: String){
  var name = "Hello ${name}"
   println(name)

   }
  fun modulus(num1: Int, num2: Int){
      var result = num1 % num2
      println(result)
  }
  fun add(num1: Int, num2: Int, num3:Int, num4:Int){
      var result = num1 + num2 + num3 + num4
      println(result)
  }
   fun interestfactact( fact1: String, fact2: String, fact3: String, fact4: String){
       var result = fact1+" " + fact2 + " " + fact3 + " " + fact4
       println(result)
   }
