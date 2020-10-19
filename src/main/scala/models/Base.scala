package models

class Base(val squares: Square*) {

  val isGreen: Boolean = squares.zip(3 to 0 by -1).map(x => x._1.nums(x._2)).sum == 10

  val isCorrectBorer: Boolean = {
    Array((0, 1), (1, 3), (2, 3), (0, 2)).
      map(a => squares(a._1).nums(a._2) + squares(a._2).nums(a._1) <= 10).forall(_ == true)
  }

  val isCorrect: Boolean = isGreen && isCorrectBorer

  def getLeft(first: Square, third: Square): Base =
    new Base(first, squares(0), third, squares(2))

  def getUp(first: Square, second: Square): Base =
    new Base(first, second, squares(0), squares(1))

  def getRight(second: Square, fourth: Square): Base =
    new Base(squares(1), second, squares(3), fourth)

  def getDown(third: Square, fourth: Square): Base =
    new Base(squares(2), squares(3), third, fourth)

  override def toString: String = squares.mkString("\n")

  override def equals(obj: Any): Boolean = {
    obj match {
      case obj: Base => (0 until 4).map(a => squares(a).equals(obj.squares(a))).forall(_ == true)
      case _ => false
    }
  }

  override def hashCode(): Int = squares.hashCode()
}
