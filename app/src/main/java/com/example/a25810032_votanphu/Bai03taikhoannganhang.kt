package com.example.a25810032_votanphu

// Họ tên: Võ Tấn Phú - MSSV: 25810032

fun main() {

    val soDuBanDau: Double = 5_000_000.0

    var soDuHienTai: Double = soDuBanDau

    println("Số dư ban đầu: $soDuBanDau VND")

    val tienGui: Double = 2_000_000.0
    soDuHienTai += tienGui
    println("Sau khi gửi thêm $tienGui VND, số dư hiện tại: $soDuHienTai VND")

    val tienRut: Double = 1_500_000.0
    soDuHienTai -= tienRut
    println("Sau khi rút $tienRut VND, số dư hiện tại: $soDuHienTai VND")

    println("Số dư ban đầu để đối chiếu (không đổi): $soDuBanDau VND")
}
