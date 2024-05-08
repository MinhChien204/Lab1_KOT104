package learn.fpoly.lab1

//fun main (){
//    println("Hello world")
//    bai1()
//}
//
//fun bai1(){
//    val a = 3
//    var b = 4
//
//    b =3
//
//    val c= (a + b)
//    val  d: String  = "Tổng hai số $a và $b : $c"
//    println(d)
//
//    val  kq = phepchia(1,3f)
//
//    println(kq)
//
//    val  arrX = intArrayOf(1,2,3,4)
//
//    arrX[arrX.size - 1] = 5
//
//    println(arrX.asList())
//
//    for(i in arrX.indices){
//        println("Phần tử thứ $i trong mảng là: ${arrX[i]}")
//    }

//}
//
//fun phepchia(soA:Int,soB:Float):String{
//    if(soB == 0f){
//        return "số B phải khác 0"
//    }
//    val  c = soA / soB
//    return "Thương 2 số $soA và $soB :${String.format("%.2f",c)}"
//}
//

//Bài2

//fun printMessage(message: String): Unit {                               // 1
//    println(message)
//}
//
//fun printMessageWithPrefix(message: String, prefix: String = "Info") {  // 2
//    println("[$prefix] $message")
//}
//
//fun sum(x: Int, y: Int): Int {                                          // 3
//    return x + y
//}
//
//fun multiply(x: Int, y: Int) = x * y                                    // 4
//
//fun main() {
//    printMessage("Hello")                                               // 5
//    printMessageWithPrefix("Hello", "Log")                              // 6
//    printMessageWithPrefix("Hello")                                     // 7
//    printMessageWithPrefix(prefix = "Log", message = "Hello")           // 8
//    println(sum(1, 2))                                                  // 9
//    println(multiply(2, 4))                                             // 10
//}

//Bài3

fun main() {

    infix fun Int.times(str: String) = str.repeat(this)        // 1
    println(2 times "Bye ")                                    // 2

    val pair = "Ferrari" to "Katrina"                          // 3
    println(pair)

    infix fun String.onto(other: String) = Pair(this, other)   // 4
    val myPair = "McLaren" onto "Lucas"
    println(myPair)

    val sophia = Person("Sophia")
    val claudia = Person("Claudia")
    sophia likes claudia                                       // 5
}

class Person(val name: String) {
    val likedPeople = mutableListOf<Person>()
    infix fun likes(other: Person) { likedPeople.add(other) }  // 6
}

//Bài4

//fun main() {
//    var a: String = "initial"  // 1
//    println(a)
//    val b: Int = 1             // 2
//    val c = 3

//    var e: Int  // 1
//    println(e)  // 2

//    val d: Int  // 1
//
//    if (someCondition()) {
//        d = 1   // 2
//    } else {
//        d = 2   // 2
//    }
//
//    println(d) // 3
//    describeString(maybeString = String())
//}

//fun describeString(maybeString: String?): String {              // 1
//    if (maybeString != null && maybeString.length > 0) {        // 2
//        return "String of length ${maybeString.length}"
//    } else {
//        return "Empty or null string"                           // 3
//    }
//}

//class Customer                                  // 1
//
//class Contact(val id: Int, var email: String)   // 2
//
//fun main() {
//
//    val customer = Customer()                   // 3
//
//    val contact = Contact(1, "mary@gmail.com")  // 4
//
//    println(contact.id)                         // 5
//    contact.email = "jane@gmail.com"            // 6
//
//    MutableStack(1,2,3)
//}
//class MutableStack<E>(vararg items: E) {              // 1
//
//    private val elements = items.toMutableList()
//
//    fun push(element: E) = elements.add(element)        // 2
//
//    fun peek(): E = elements.last()                     // 3
//
//    fun pop(): E = elements.removeAt(elements.size - 1)
//
//    fun isEmpty() = elements.isEmpty()

//    fun size() = elements.size
//
//    override fun toString() = "MutableStack(${elements.joinToString()})"
//}