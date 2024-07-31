class Dog(
    var name:String,
    var breed:String,
    var age:Int
){
    fun main(){

        var dog1=Dog("rex","husky",12)
        println(dog1.name +" "+dog1.breed)
        var dog2=Dog("ace","german shepherd",3)
        println(dog2.name+" "+dog2.breed)
        var dog3=Dog("blue","mutina",33)
        println(dog3.name+" "+dog3.breed)



    }




}