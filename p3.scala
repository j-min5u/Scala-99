println("3. ");
def nth[A](num: Integer,ls: List[A]): A = num match {

  case x if x==0  => ls.head

  case _ => nth(num-1,ls.tail)

}// Start writing your ScalaFiddle code here

println(nth(3,List(1,1,2,3,4,5)))