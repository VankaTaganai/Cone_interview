package models

class Shape(val bases: Base*) {

  val isCorrect: Boolean = {
    bases.map(_.isCorrect).forall(_ == true) &&
      bases(0).squares(0).nums(1) + bases(4).squares(0).nums(0) + bases(1).squares(0).nums(2) <= 10 &&
      bases(1).squares(1).nums(3) + bases(4).squares(1).nums(1) + bases(2).squares(1).nums(0) <= 10 &&
      bases(0).squares(2).nums(3) + bases(4).squares(2).nums(2) + bases(3).squares(2).nums(0) <= 10 &&
      bases(3).squares(3).nums(1) + bases(4).squares(3).nums(3) + bases(2).squares(3).nums(2) <= 10
  }

  override def toString: String = {
    Array((1, 0), (1, 1), (0, 0), (0, 1), (2, 0), (2, 1), (0, 2), (0, 3), (2, 2), (2, 3), (3, 2), (3, 3)).
    map{case(f, s) => bases(f).squares(s).toString + "\n"}.reduce(_ + _)
  }

  override def equals(obj: Any): Boolean = {
    obj match {
      case obj: Shape => (0 until 5).map(a => bases(a).equals(obj.bases(a))).forall(_ == true)
      case _ => false
    }
  }

  override def hashCode(): Int = bases.hashCode()
}
