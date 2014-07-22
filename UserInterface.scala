// Reads the user input
import java.io.File

class UserInterface {
	def getDirectoryName(): String = {
    println("Enter a directory name: ")
    val dir = readLine()
    dir
  }

  def getFilePattern(): String = {
    println("What pattern of files? ")
    val pattern = readLine()
    pattern
  }

}

val ui = new UserInterface
println(ui.getDirectoryName)
println(ui.getFilePattern)
