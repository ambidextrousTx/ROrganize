import java.io.File

class FileSystemHandler {
	def getAllFiles(dir: String) = {
		for (file <- new File(dir).listFiles) {
      println(file)
    }
  }
}

new FileSystemHandler().getAllFiles("./")
