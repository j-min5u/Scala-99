println("2. ");
def onebutlastRecursive[A](ls: List[A]): A = ls match {

  case h :: _ :: Nil  => h

  case _ :: _ :: tail => onebutlastRecursive(tail)

  case _         => throw new NoSuchElementException

}// Start writing your ScalaFiddle code here

println(onebutlastRecursive(List(1,1,2,3,4,5)))