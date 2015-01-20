object hashes {
  val c = 0x81.toByte                             //> c  : Byte = -127
  val p = -127.toByte                             //> p  : Byte = -127

  (c ^ p).toByte                                  //> res0: Byte = 0
  (c | p).toByte                                  //> res1: Byte = -127

  val x80 = 10000000.toByte                       //> x80  : Byte = -128
  val k   = 00000001.toByte                       //> k  : Byte = 1

  (x80 ^ k).toByte == 10000001.toByte             //> res2: Boolean = true
  
  (0xf0 | 0xaa) == 0xfa                           //> res3: Boolean = true
  (0x00 ^ 0x0f) == 0x0f                           //> res4: Boolean = true

  (x80 + k).toByte == 10000001.toByte             //> res5: Boolean = true

  val msg =  00110111.toByte                      //> msg  : Byte = 73
  val key =  01011001.toByte                      //> key  : Byte = 1
 
  (msg ^ key).toByte == 01101110.toByte           //> res6: Boolean = true
  
  val ct = "00ff80"                               //> ct  : String = 00ff80
  
  val pt = ct.toSeq.grouped(2).map( x => Integer.parseInt(x.toString, 16).toByte).toVector
                                                  //> pt  : Vector[Byte] = Vector(0, -1, -128)
  val pt1 = ct.toSeq.grouped(2).map(x=>x).toVector//> pt1  : Vector[Seq[Char]] = Vector(00, ff, 80)

  
  x80 == pt(2)                                    //> res7: Boolean = true
  
  
  def toHex(x: String) = x.toSeq.grouped(2).map( x => Integer.parseInt(x.toString, 16).toByte).toVector
                                                  //> toHex: (x: String)Vector[Byte]
   
   // xor chars
   def strxor(y: String, z: String): String = (toHex(y) zip toHex(z) map (x => (x._1 ^ x._2).toByte )).map("%02x".format(_)).mkString
                                                  //> strxor: (y: String, z: String)String
   
   strxor("00ff0f","ff000f")                      //> res8: String = ffff00
   
   strxor("0f","0f")                              //> res9: String = 00
   
   "ff".toVector                                  //> res10: Vector[Char] = Vector(f, f)
   
   ('f'.toByte ^ 'f'.toByte).toByte               //> res11: Byte = 0
   
   "00".toSeq.grouped(2).map( x => Integer.parseInt(x.toString, 16).toByte).toVector zip "ff".toSeq.grouped(2).map( x => Integer.parseInt(x.toString, 16).toByte).toVector
                                                  //> res12: scala.collection.immutable.Vector[(Byte, Byte)] = Vector((0,-1))
   val xor = (toHex("00") zip toHex("ff") map (x => (x._1 ^ x._2).toByte )).map("%x".format(_)).mkString
                                                  //> xor  : String = ff
   toHex("00") zip toHex("ff")                    //> res13: scala.collection.immutable.Vector[(Byte, Byte)] = Vector((0,-1))
   
   
 }