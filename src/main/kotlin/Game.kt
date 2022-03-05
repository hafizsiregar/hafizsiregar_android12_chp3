class Game {

    fun rulesGame(): String {
        println("1. Masukkan Pemain 1 : ")
        val user1 = readLine()?.toLowerCase()
        println("2.Masukkan Pemain 2 : ")
        val user2 = readLine()?.toLowerCase()
        return (if (user1 == user2) {
            println("Hasil: DRAW!")
        } else if (user1 == "batu" && user2 == "gunting") {
            println("Hasil: Pemain 1 MENANG!")
        } else if (user1 == "batu" && user2 == "kertas") {
            println("Hasil: Pemain 2 MENANG!")
        } else if (user1 == "kertas" && user2 == "gunting") {
            println("Hasil: Pemain 2 MENANG!")
        } else if (user1 == "kertas" && user2 == "batu") {
            println("Hasil: Pemain 1 MENANG!")
        } else if (user1 == "gunting" && user2 == "batu") {
            println("Hasil: Pemain 2 MENANG!")
        } else if (user1 == "gunting" && user2 == "kertas") {
            println("Hasil: Pemain 1 MENANG!")
        } else {
            println("WRONG INPUT!")
        }
                ).toString()

    }

    fun headerGame() {
        println("==========================")
        println("GAME SUIT TERMINAL VERSION")
        println("==========================")
    }

    fun result() {
        Game().rulesGame()
    }
}