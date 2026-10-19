// Vo Tan Phu - 25810032

val kiemTraDoDai: (String) -> Boolean = { matKhau -> matKhau.length >= 8 }

fun main() {
    val matKhau1 = "phu123"
    val matKhau2 = "matkhau123!@#"
    val matKhau3 = "123456780@"

    println("$matKhau1 -> ${kiemTraDoDai(matKhau1)}")
    println("$matKhau2 -> ${kiemTraDoDai(matKhau2)}")
    println("$matKhau3 -> ${kiemTraDoDai(matKhau3)}")
}
