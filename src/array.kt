fun main (){

    var languages = arrayOf("kotlin","python","java")
    println(languages[1])
    //reassinging an  element in an array
    languages[1]="c++"
    println(languages[1])


    //adding a new element in an array

    var all = languages.plus("PHP")
    for ( lang in all ){
        println(lang)



    }

  //size of an array

    println(all.size)











}