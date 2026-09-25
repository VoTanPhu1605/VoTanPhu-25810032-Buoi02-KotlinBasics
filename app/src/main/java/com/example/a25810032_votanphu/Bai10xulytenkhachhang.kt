package com.example.a25810032_votanphu

// Họ tên: Võ Tấn Phú - MSSV: 25810032

fun main() {
    val tenKhachHang1: String? = "Nguyễn Văn A"
    val tenKhachHang2: String? = null

    val doDai1 = tenKhachHang1?.length
    val doDai2 = tenKhachHang2?.length
    println("Độ dài tên khách hàng 1: $doDai1")
    println("Độ dài tên khách hàng 2 (null): $doDai2")

    val tenHienThi = tenKhachHang2 ?: "Khách vãng lai"
    println("Tên hiển thị khi rỗng: $tenHienThi")

    val tenChacChanKhongRong: String? = "Trần Thị B"
    val doDaiChacChan = tenChacChanKhongRong!!.length
    println("Độ dài tên (dùng !!, biến chắc chắn không null): $doDaiChacChan")
}
main()