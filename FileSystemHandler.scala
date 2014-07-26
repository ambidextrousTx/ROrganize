import java.io.File

class FileSystemHandler {
  def getAllFiles(dir: String) = {
    for (file <- new File(dir).listFiles) {
      println(file)
    }
  }

  def getFilesWithExtension(dir: String, ext: String) = {
    for (file <- new File(dir).listFiles.filter(_.getName.endsWith(ext))) {
      println(file)
    }
  }
}

// new FileSystemHandler().getAllFiles("./")
new FileSystemHandler().getFilesWithExtension("./", "scala")
