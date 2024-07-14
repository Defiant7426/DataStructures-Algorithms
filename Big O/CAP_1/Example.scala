object Example {
	def main(args: Array[String]): Unit = {
	val Ocean = Array("Nemo")

  def findNemo(array: Array[String]): Unit ={
    for(i <- array){
      if(i == "Nemo"){
        println("Found Nemo")
      }
    }
  }

  findNemo(Ocean)
	}
}