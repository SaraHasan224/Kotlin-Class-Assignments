fun main(args: Array<String>) {

    // 1. Declare an array print all values of an array using for loop.

    var friends = arrayOf("Sara","Raham","Mahrukh","Khadija","Hiba","Saba")
    for ((i,v) in friends.withIndex()){
        println("index ${i.plus(1)} has value $v")
    }

    //2. Take a number in user input and find it in array

    println("\n\nEnter any number:")
    var l_im : Int = readLine()!!.toInt()
    var _array: Array<Int> = Array(l_im,{2})
    println("Enter value in your array list: \n")
    for(i in 0 until l_im){
        var list : Int = readLine()!!.toInt()
        _array[i] = list
    }

    println("Enter value you want to search in your array: ")
    var search: Int = readLine()!!.toInt()
    for((i,v) in _array.withIndex()){
        if( v == search)
        { println("index ${i.plus(1)} has value $v")}
    }

    // 3. Write a program to declare an array of size 5.take input in an array from user.find the maximum and minimum value of an array.

    var store  = arrayOf(125,68,5,96,2)
    println("Array: \n")
    for((i,v) in store.withIndex()){
        println("index ${i.plus(1)} has value $v")
    }
    var min = store.min()
    var max = store.max()
    println("Minimum value of array is:" + ' '+ min+"\t Maximum value of array is:" + ' '+ max)

     //4. Print Sum of array of size 10

    println("\n\nEnter any number:")
    var array  = arrayOf(1,2,3,4,5,6,7,8,9,10)
    println("Array: \n")
    var sum = 0
    for((i,v) in array.withIndex()){
        println("index ${i.plus(1)} has value $v")
        sum = sum + v
    }
    println("Sum of array list: "+sum)

    //5. Declare an array of 10 numbers and multiply each element by 2 and replace the answer in that index

    println("\n\nEnter any number:")
    var storage  = arrayOf(1,2,3,4,5,6,7,8,9,10)
    println("Array: \n")
    for((i,v) in storage.withIndex()){
        println("index ${i.plus(1)} has value ${v.times(2)}")
    }

}