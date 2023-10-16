package com.example.rabbits

import java.math.BigInteger
//Код читается удобнее, но не работает с большим значением n из-за переполнения стека.
//fun countRab(N:Int,K:Int):Int{
//    var res:Int
//    if (N<=2){
//        res=1
//    }
//    else {return K * countRab(N-2,K) + countRab(N-1,K)
//    }
//    return res
//}

fun main(){
    val n=32
    val k=5
    val result=countRab(n,k)
    println(result)
}

fun countRab(months:Int,K:Int):String{
    var current=BigInteger.ONE
    var previous=BigInteger.ZERO

    for(month in 2..months){//Начинаем с 2 месяца
        val next=current+previous*K.toBigInteger()
        previous=current
        current=next
    }

    return current.toString()
}