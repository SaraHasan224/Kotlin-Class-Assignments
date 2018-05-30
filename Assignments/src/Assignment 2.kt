fun main(args: Array<String>) {

    //1. Create your mark sheet(using Readline())

    print("\n\n\t\t\tMarksheet\n")

    println("Enter number of subjects")
    var num  : String? = readLine()
    var express :Int = num!!.toInt()

    var marksobtained: Int = 0


    for (i in 0 until express)
    {
        println("Marks obtained in subject ${i.plus(1)}:"+ ' ')
        var sub : Array<Int> = Array(express,{it*2})
        var marks : String? = readLine()
        sub[i] = marks!!.toInt()

        marksobtained = marksobtained + sub[i]
    }
    var totalmarksObtained : Int = express.times(100)
    print("\n\nMarks Obtained:"+' '+marksobtained+'\t'+"Out of: "+totalmarksObtained+"\tPercentage:"+' '+((marksobtained)*100)/totalmarksObtained+'%')



    //2. Create a complete calculator Using ReadLine()
    println("\n\nWhat operation you want to perform:")

    var oper : String? = readLine()

    println("Enter number 1")
    var num1 = readLine()!!.toInt()


    println("Enter number 2")
    var num2 = readLine()!!.toInt()

    when(oper)
    {
        "+" -> { println("Result: "+num1.plus(num2))}
        "-" -> { println("Result: "+num1.minus(num2))}
        "*" -> { println("Result: "+num1.times(num2))}
        "/" -> { println("Result: "+num1.div(num2))}
        else   ->
        {   println("Invalid operation")    }
    }


    //3. Calculate Average and Percentage Using ReadLine()

   print("\n\n\t\t\t    Average & Percentage \n")

   println("Enter any number: ")
   var numb : Int =readLine()!!.toInt()

   var marksobtain: Int = 0


   for (i in 0 until numb)
   {
       println("Number ${i.plus(1)} = "+ ' ')
       var sub : Array<Int> = Array(numb,{it*2})
       var marks : String? = readLine()
       sub[i] = marks!!.toInt()

       marksobtain = marksobtain + sub[i]
   }
   var average : Int = marksobtain.div(numb)
   var tmarksObtained = numb.times(5)
   print("\n\nAverage:"+' '+average+'\t'+"Out of: "+tmarksObtained+"\nPercentage:"+' '+((marksobtain)*100)/tmarksObtained+'%')


//    4. Create table by taking user input

    print("\n\n\n\tTable \n")

    println("Enter any number: ")
    var numbe : Int =readLine()!!.toInt()

    println("Enter limit: ")
    var lim : Int =readLine()!!.toInt()

    for (i in 0 until lim)
    {
        println("$numbe * ${i.plus(1)} = ${numbe.times(i.plus(1))}")
    }

}