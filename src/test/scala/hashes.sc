object hashes {
  val c = 0x81.toByte                             //> c  : Byte = -127
  val p = -127.toByte                             //> p  : Byte = -127

  (c ^ p).toByte                                  //> res0: Byte = 0
  (c | p).toByte                                  //> res1: Byte = -127

  val m = 10000000.toByte                         //> m  : Byte = -128
  val k   = 00000001.toByte                       //> k  : Byte = 1

  (m ^ k).toByte == 10000001.toByte               //> res2: Boolean = true
  
  (0xf0 | 0xaa) == 0xfa                           //> res3: Boolean = true
  (0x00 ^ 0x0f) == 0x0f                           //> res4: Boolean = true

  (m + k).toByte == 10000001.toByte               //> res5: Boolean = true

  val msg =  00110111.toByte                      //> msg  : Byte = 73
  val key =  01011001.toByte                      //> key  : Byte = 1
 
  (msg ^ key).toByte == 01101110.toByte           //> res6: Boolean = true
}