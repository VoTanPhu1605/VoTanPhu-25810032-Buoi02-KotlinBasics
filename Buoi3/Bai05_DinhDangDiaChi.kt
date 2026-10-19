// Vo Tan Phu - 25810032

fun dinhDangDiaChi(
    soNha: String,
    tenDuong: String,
    phuong: String = "Khong xac dinh",
    quan: String = "Khong xac dinh",
    thanhPho: String = "TP Ho Chi Minh"
): String {
    return "$soNha $tenDuong, $phuong, $quan, $thanhPho"
}

fun main() {
    val diaChi = dinhDangDiaChi(
        "11",
        "Nguyen Trai",
        phuong = "Phuong Binh Chan",
        quan = "Quan 7",
        thanhPho = "TP Ho Chi Minh"
    )
    println(diaChi)
}
