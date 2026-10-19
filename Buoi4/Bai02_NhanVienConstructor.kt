// Vo Tan Phu - 25810032

class NhanVien(maNhanVien: String, val ten: String, var luongThang: Double) {
    constructor(ten: String) : this("TAM", ten, 0.0)
}

fun main() {
    val nv1 = NhanVien("NV001", "Nguyen Van Tuan", 8000000.0)
    val nv2 = NhanVien("Tran Thi B")


    println("NV1: ${nv1.ten}, luong: ${nv1.luongThang}")
    println("NV2: ${nv2.ten}, luong: ${nv2.luongThang}")
}
