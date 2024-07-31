class  Shape {

    open fun draw() {
        println("Drawing a shape")
    }
}
class Rectangle{

    fun draw(){
        println("Drawing a rectangle")
    }
}

class circle(){
    fun draw(){
        println("Drawing a circle")
    }
}
fun main() {
    var myshape = Shape()

    var myrectangle = Rectangle()

    var mycircle =circle()

}

