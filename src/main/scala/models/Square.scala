package models

class Square(val nums: Array[Int]) {
  override def toString: String = nums.mkString(" ")
  override def equals(obj: Any): Boolean = {
    obj match {
      case obj: Square => this.nums.sameElements(obj.nums)
      case _ => false
    }
  }

  override def hashCode(): Int = nums.toSeq.hashCode()
}
