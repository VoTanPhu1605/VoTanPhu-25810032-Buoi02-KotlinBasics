// Vo Tan Phu - 25810032

open class DongVat(val ten: String) {
    open fun keu(): String {
        return "..."
    }
}

class Cho(ten: String) : DongVat(ten) {
    override fun keu(): String {
        return "Gau gau"
    }
}

class Meo(ten: String) : DongVat(ten) {
    override fun keu(): String {
        return "Meo meo"
    }
}

fun main() {
    val danhSach = listOf(Cho("Lu"), Meo("Mimi"))

    for (dongVat in danhSach) {
        println("${dongVat.ten} keu: ${dongVat.keu()}")
    }
}
