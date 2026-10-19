// Vo Tan Phu - 25810032

fun main() {
    val nhacCu = listOf("Piano", "Guitar", "Trong", "Violin", "Trumpet", "Flute", "Cello", "Trombone")
    val chuCai = 'T'

    val locEager = nhacCu.filter { it.startsWith(chuCai) }
    println("Loc eager: $locEager")


    val locLazy = nhacCu.asSequence().filter { it.startsWith(chuCai) }.toList()
    println("Loc lazy: $locLazy")
}
