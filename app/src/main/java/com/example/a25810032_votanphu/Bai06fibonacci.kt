package com.example.a25810032_votanphu

// Họ tên: Võ Tấn Phú - MSSV: 25810032

fun main() {
    var a = 0
    var b = 1
    var chiSo = 0

    println("Dãy số Fibonacci nhỏ hơn 100:")

    for (i in 0..100) {
        if (a >= 100) break

        println("Vị trí $chiSo: $a")

        val tiep = a + b
        a = b
        b = tiep
        chiSo++
    }
}
