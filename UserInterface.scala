// Reads the user input

class UserInterface {
	def getDirectoryName(): String = {
    println("Enter a directory name: ")
    val dir = readLine()
    dir
  }

}

val ui = new UserInterface
println(ui.getDirectoryName)
