package com.example.a25810032_votanphu
fun main() {
    val soLuong: Int = 5
    val donGia: Double = 25000.0
    val tienHang: Double = soLuong.toDouble() * donGia
    val thueSuat: Double = 0.08
    val tienThue: Double = tienHang * thueSuat
    val tongTien: Double = tienHang + tienThue
    println("Số lượng sản phẩm: $soLuong")
    println("Đơn giá: $donGia VND")
    println("Tiền hàng: $tienHang VND")
    println("Tiền thuế (8%): $tienThue VND")
    println("Tổng tiền phải trả: $tongTien VND")
}
