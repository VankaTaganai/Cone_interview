import models.{Base, Square, Shape}

import scala.io.StdIn.readLine

object Main extends App {
  val squares = for (i <- 0 until 12) yield (i, new Square(readLine().split("\\s+").map(x => x.toInt)))
  val valid = (for ((i_ind, i) <- squares; (j_ind, j) <- squares;
                   (k_ind, k) <- squares; (l_ind, l) <- squares; center = new Base(i, j, k, l)
                   if Set(i_ind, j_ind, k_ind, l_ind).size == 4 && center.isCorrect)
    yield (center, (squares.toSet -- Set((i_ind, i), (j_ind, j), (k_ind, k), (l_ind, l))).toArray.map(_._2))).
  groupBy(a => a._1).map(_._2.head).toArray

  val correctShapes = (for((inner, other) <- valid; squares: Array[Square] <- other.permutations;
                          leftSq = inner.getLeft(squares(0), squares(1));
                          upSq = inner.getUp(squares(2), squares(3));
                          rightSq = inner.getRight(squares(4), squares(5));
                          downSq = inner.getDown(squares(6), squares(7));
                          shape = new Shape(leftSq, upSq, rightSq, downSq, inner)
                          if shape.isCorrect)
    yield shape).distinct
  for (out: Shape <- correctShapes) println(out)
}
