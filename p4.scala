println("4. ");
def length[A](ls: List[A]): Int =

{

  ls match {

    case _::Nil => 1

    case _::tail => 1+length(tail)

    case _         => throw new NoSuchElementException

  }// Start writing your ScalaFiddle code here

}

println(length(List(1,1,2,3,4,5)))
