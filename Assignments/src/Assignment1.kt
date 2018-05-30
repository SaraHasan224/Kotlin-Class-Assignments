fun main(args: Array<String>) {
    //print("Hello World")

    //Declare all datatype variable
    var num1:Int    = 10
    var num2:Short  = 100
    var num3:Long   = 104567L
    var num4:Float  = 10.5F
    var num5:Double = 1045.6523
    var num6:Byte   = 1
    var num7:String   = "SaraHasan"
    var num8:Char   = '5'
    var num9:Boolean   = false
    var num10:Any   = "A4"

    /*Declare string variables and explicitly convert them into int.
    short and other datatypes and save them in respective variable*/

    var int_num    : Int = num8.toInt()
    var Short_num  : Short = num8.toShort()
    var Long_num   : Long = num8.toLong()
    var Float_num  : Float = num8.toFloat()
    var Double_num : Double = num8.toDouble()
    var String_num : String = num7.toString()
    var Byte_num   : Byte = num8.toByte()

    //var CharNum1   : Char = num7.toChar()     Error:(26, 34) Kotlin: Unresolved reference: toChar

    var Boolean_num: Boolean = num7.toBoolean()

    //var Any_num    : Any = num7.toAny()       Error:(28, 33) Kotlin: Unresolved reference: toAny


    /*Similarly Declare Rest of data type variables and convert
    them Into String and save them in String variable*/
        //var a: String = myName.toInt()

    var IntNum    : String = num1.toString()
    var ShortNum  : String = num2.toString()
    var LongNum   : String = num3.toString()
    var FloatNum  : String = num4.toString()
    var DoubleNum : String = num5.toString()
    var ByteNum   : String = num6.toString()
    var CharNum   : String = num8.toString()
    var BooleanNum: String = num9.toString()
    var AnyNum    : String = num10.toString()

    /*Declare (Any) type Variable and use when and apply some
    functionality of Int, String etc ... by using cases Is String ,Is Int etc.*/

//num10 is any type variable
        when(num10)
        {
            is String -> { println("This is a string"+' '+num10.compareTo("A4"))}
            is Char   -> { println(num10.compareTo('A'))}
            is Short  -> { println(num10.minus(11))}
            is Long   -> { println(num10.div(1034))}
            is Int    -> { println(num10.times(2))}
            is Float  -> { println(num10.times(5))}
            is Double -> { println(num10.div(0))}
            is Boolean-> { println(num10.compareTo(false))}
            is Byte   -> { println(num10.dec())}
        }
    /*Declare two variables with different data types But Same name.*/

        // var MyName:String = "Sara Hasan"    Error:(65, 13) Kotlin: Conflicting declarations: var MyName: String, var MyName: Int
        //  var MyName:Int = 1023     Error:(66, 13) Kotlin: Conflicting declarations: var MyName: String, var MyName: Int

    /*Declare some Variables Using the name of Reserved Key Words (for ,public ,int etc)*/

        //  var for: String = "ABC"     Error:(71, 13) Kotlin: Expecting property name or receiver type
        //var public: String = "ABC"
        //var int: String = "ABC"

    /*Create Constant variable(Val ) and try to change their value(just to understand concept)*/

        val number :Int = 96
        //number=4        Error:(77, 9) Kotlin: Val cannot be reassigned



    /*Create your mark sheet (hard coded)*/

    print("\t\t\tMarksheet\n")
    var CCN:Int = 76
    var SQE:Int = 96
    var EC :Int = 94
    var SPM:Int = 85
    var AI :Int = 76
    println("Marks obtained in CCN:"+' '+CCN)
    println("Marks obtained in SQE:"+' '+SQE)
    println("Marks obtained in EC:"+' '+EC)
    println("Marks obtained in SPM:"+' '+SPM)
    println("Marks obtained in AI:"+' '+AI)

    print("\n\nTotal marks obtained:"+' '+(CCN+SQE+EC+SPM+AI))
    print("\tPercentage:"+' '+((CCN+SQE+EC+SPM+AI)*100)/500+'%')

    /*Create your mark sheet(using Readline())*/

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

}