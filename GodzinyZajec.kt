fun obliczGodziny(godzinyTygodniowo: Int, liczbaTygodni: Int): Int {
    return godzinyTygodniowo * liczbaTygodni
}

fun main() {
    val wynik1 = obliczGodziny(10, 4)
    val wynik2 = obliczGodziny(8, 6)

    println("===== LICZBA GODZIN ZAJĘĆ =====")

    println("10 godzin tygodniowo przez 4 tygodnie:")
    println("$wynik1 godzin")

    println("8 godzin tygodniowo przez 6 tygodni:")
    println("$wynik2 godzin")
}
