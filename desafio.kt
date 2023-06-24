// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

val Contents1 = listOf("HTML básico na prática", "Estruturando seu HTML", "Ampliando o conhecimento")
val Contents2 = listOf("Linguagem de programação Kotlin", "Desenvolvimento Mobile nativo para Android", "Dominando o android Jetpack")
val Contents3 = listOf("Fundamentos do TypeScript", "Introdução ao React com TypeScript", "Introdução ao Node com TypeScript")

val users = mutableListOf<String>()

data class Formacoes (var name: String, var time: Int, var level: String, var contents: List<String>)

fun menu(){
    val formacoes1 = Formacoes("Formação HTML Developer", 30, "Básico", Contents1)
    val formacoes2 = Formacoes("Formação Android Developer", 48, "Intermediario", Contents2)
    val formacoes3 = Formacoes("Formação Fullstack TypeScript Developer", 69, "Avançado", Contents3)

    while (true) {
        println("Escolha uma das opçoes abaixo.")
        println("(1) Matricular-se em uma formação")
        println("(2) Ver pessoas matriculadas")
        println("(3) Sair")

        print("Escolha a opção digitando o número dela: ")
        val question1 = readLine()?.toIntOrNull()

        when (question1) {
            1 -> {
                println("")
                println("Escolha uma das formações abaixo.")
                println("(1) Formação HTML Developer")
                println("(2) Formação Android Developer")
                println("(3) Formação Fullstack TypeScript Developer")

                print("Escolha a formação que deseja digitando o número dela:  ")
                val question2 = readLine()?.toIntOrNull()

                when (question2) {
                    1 -> {
                        print("Digite seu nome para se matricular: ")
                        val matricula1 = readLine().toString().lowercase()
                        users.add(matricula1)

                        println("")

                        println("Você se matriculou na ${formacoes1.name}!!")
                        println("Tempo: ${formacoes1.time}h")
                        println("Nível: ${formacoes1.level}")
                        println("Conteúdos:")

                        for (dado in formacoes1.contents) {
                            println(">>> $dado.")
                        }
                    }
                    2 -> {
                        print("Digite seu nome para se matricular: ")
                        val matricula2 = readLine().toString().lowercase()
                        users.add(matricula2)

                        println("")

                        println("Você se matriculou na ${formacoes2.name}!!")
                        println("Tempo: ${formacoes2.time}h")
                        println("Nível: ${formacoes2.level}")
                        println("Conteúdos:")

                        for (dado in formacoes2.contents) {
                            println(">>> $dado.")
                        }
                    }
                    3 -> {
                        print("Digite seu nome para se matricular: ")
                        val matricula3 = readLine().toString().lowercase()
                        users.add(matricula3)

                        println("")

                        println("Você se matriculou na ${formacoes3.name}!!")
                        println("Tempo: ${formacoes3.time}h")
                        println("Nível: ${formacoes3.level}")
                        println("Conteúdos:")

                        for (dado in formacoes3.contents) {
                            println(">>> $dado.")
                        }
                    }
                    else -> println("Ops, algo deu errado na sua escolha, tente novamente!!")
                }
                println("")
                println("")
            }
            2 -> {
                println("")
                println("As pessoas matriculadas são:")
                for (people in users) {
                    println("Usuário>>> $people")
                }
                println("")
                println("")
            }
            3 -> break
            else -> {
                println("")
                println("Ops, algo deu errado na sua escolha, tente novamente!!")
                println("")
            }
        }
    }
    println("Você saiu!")
}

fun main() {
    menu()
}