// Reads the user input
import java.io.File
import FileSystemHandler._

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

  def getOption(): Int = {
    println("0 moves, 1 renames. ")
    val opt: Int = readInt()
    opt
  }

}

val ui = new UserInterface
println(ui.getDirectoryName)
// println(ui.getFilePattern)
// println(ui.getOption)
new FileSystemHandler().getAllFiles("./")
new FileSystemHandler().getFilesWithExtension("./", "scala")
