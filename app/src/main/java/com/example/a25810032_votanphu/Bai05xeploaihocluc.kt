package com.example.a25810032_votanphu

// Họ tên: Võ Tấn Phú - MSSV: 25810032

fun main() {
    val diemTrungBinh: Double = 8.7

    val xepLoai: String = when (diemTrungBinh) {
        in 8.5..10.0 -> "Xuất sắc"
        in 8.0..8.49 -> "Giỏi"
        in 6.5..7.99 -> "Khá"
        in 5.0..6.49 -> "Trung bình"
        else -> "Yếu"
    }

    println("Điểm trung bình: $diemTrungBinh")
    println("Xếp loại học lực: $xepLoai")
}
