package com.example.a25810032_votanphu

// Họ tên: Võ Tấn Phú - MSSV: 25810032

fun main() {

    val danhSachSach = mutableListOf(
        "Nhà Giả Kim",
        "Đắc Nhân Tâm",
        "Sapiens",
        "Tuổi Trẻ Đáng Giá Bao Nhiêu",
        "Kotlin Cơ Bản"
    )

    println("Danh sách sách ban đầu:")
    println(danhSachSach)

    // Thêm vào danh sách hai cuốn sách mới
    danhSachSach.add("Nhà Lãnh Đạo Không Chức Danh")
    danhSachSach.add("Clean Code")


    danhSachSach.remove("Sapiens")


    danhSachSach.sort()

    println("Danh sách sách sau khi thêm, xoá, sắp xếp:")
    println(danhSachSach)
}
