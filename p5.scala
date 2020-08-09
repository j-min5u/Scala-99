println("5. ");
def Rev[A](ls: List[A]): List[A] =ls match
{
  case h::tail=> Rev(tail):::List(h)
  case _=> ls

}
println(Rev(List(1,1,2,3,5,6)))