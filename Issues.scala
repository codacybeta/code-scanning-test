case class Issues(val name: String, val count: Int) {

  def complexShennanigans(simpleStuff: Seq[String]): Seq[String] = {
    simpleStuff.map(s => s.replace(name, count.toString)
  }
}
