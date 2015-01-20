import scala.annotation.tailrec

object terrible {
  def fac(n: Int): Int =
     if (n == 0) 1
     else n * fac(n - 1)                          //> fac: (n: Int)Int

  def fac2(n: Int): Int = {
  @tailrec
     def go(i: Int, acc: Int): Int =
	     if (i == 0) acc
	     else go(i - 1, acc * i)
	 go(n, 1)
   }                                              //> fac2: (n: Int)Int
  
  fac(2)                                          //> res0: Int = 2
  fac2(2)                                         //> res1: Int = 2
}