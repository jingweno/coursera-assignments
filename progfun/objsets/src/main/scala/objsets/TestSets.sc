import objsets._

object TestSets {
  val set1 = new Empty                            //> set1  : objsets.Empty = .
  val set2 = set1.incl(new Tweet("a", "a body", 20))
                                                  //> set2  : objsets.TweetSet = {.a.}
  val set3 = set2.incl(new Tweet("b", "b body", 20))
                                                  //> set3  : objsets.TweetSet = {.a{.b.}}
  val c = new Tweet("c", "c body", 7)             //> c  : objsets.Tweet = User: c
                                                  //| Text: c body [7]
  val d = new Tweet("d", "d body", 9)             //> d  : objsets.Tweet = User: d
                                                  //| Text: d body [9]
  val set4c = set3.incl(c)                        //> set4c  : objsets.TweetSet = {.a{.b{.c.}}}
  val set4d = set3.incl(d)                        //> set4d  : objsets.TweetSet = {.a{.b{.d.}}}
  val set5 = set4c.incl(d)                        //> set5  : objsets.TweetSet = {.a{.b{.c{.d.}}}}
}