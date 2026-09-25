package com.example.a25810032_votanphu

// Họ tên: Võ Tấn Phú - MSSV: 25810032

fun main() {
    val diemSo = arrayOf(7.5, 8.0, 6.5, 9.0, 5.5, 7.0, 8.5, 6.0, 9.5, 4.5)

    var tongDiem = 0.0
    for (diem in diemSo) {
        tongDiem += diem
    }
    val diemTrungBinh = tongDiem / diemSo.size

    var diemCaoNhat = diemSo[0]
    var diemThapNhat = diemSo[0]
    for (diem in diemSo) {
        if (diem > diemCaoNhat) {
            diemCaoNhat = diem
        }
        if (diem < diemThapNhat) {
            diemThapNhat = diem
        }
    }

    println("Điểm trung bình của lớp: $diemTrungBinh")
    println("Điểm cao nhất: $diemCaoNhat")
    println("Điểm thấp nhất: $diemThapNhat")
}
