object crib_drag {

  // http://travisdazell.blogspot.com.es/2012/11/many-time-pad-attack-crib-drag.html
val ascii = Map((0x20.toByte->'	')
,(0x21.toByte->'!')
,(0x22.toByte->'"')
,(0x23.toByte->'#')
,(0x24.toByte->'$')
,(0x25.toByte->'%')
,(0x26.toByte->'&')
,(0x27.toByte->''')
,(0x28.toByte->'(')
,(0x29.toByte->')')
,(0x2A.toByte->'*')
,(0x2B.toByte->'+')
,(0x2C.toByte->',')
,(0x2D.toByte->'-')
,(0x2E.toByte->'.')
,(0x2F.toByte->'/')
,(0x30.toByte->'0')
,(0x31.toByte->'1')
,(0x32.toByte->'2')
,(0x33.toByte->'3')
,(0x34.toByte->'4')
,(0x35.toByte->'5')
,(0x36.toByte->'6')
,(0x37.toByte->'7')
,(0x38.toByte->'8')
,(0x39.toByte->'9')
,(0x3A.toByte->':')
,(0x3B.toByte->';')
,(0x3C.toByte->'<')
,(0x3D.toByte->'=')
,(0x3E.toByte->'>')
,(0x3F.toByte->'?')
,(0x40.toByte->'@')
,(0x41.toByte->'A')
,(0x42.toByte->'B')
,(0x43.toByte->'C')
,(0x44.toByte->'D')
,(0x45.toByte->'E')
,(0x46.toByte->'F')
,(0x47.toByte->'G')
,(0x48.toByte->'H')
,(0x49.toByte->'I')
,(0x4A.toByte->'J')
,(0x4B.toByte->'K')
,(0x4C.toByte->'L')
,(0x4D.toByte->'M')
,(0x4E.toByte->'N')
,(0x4F.toByte->'O')
,(0x50.toByte->'P')
,(0x51.toByte->'Q')
,(0x52.toByte->'R')
,(0x53.toByte->'S')
,(0x54.toByte->'T')
,(0x55.toByte->'U')
,(0x56.toByte->'V')
,(0x57.toByte->'W')
,(0x58.toByte->'X')
,(0x59.toByte->'Y')
,(0x5A.toByte->'Z')
,(0x5B.toByte->'[')
,(0x5C.toByte->'\\')
,(0x5D.toByte->']')
,(0x5E.toByte->'^')
,(0x5F.toByte->'_')
,(0x60.toByte->'`')
,(0x61.toByte->'a')
,(0x62.toByte->'b')
,(0x63.toByte->'c')
,(0x64.toByte->'d')
,(0x65.toByte->'e')
,(0x66.toByte->'f')
,(0x67.toByte->'g')
,(0x68.toByte->'h')
,(0x69.toByte->'i')
,(0x6A.toByte->'j')
,(0x6B.toByte->'k')
,(0x6C.toByte->'l')
,(0x6D.toByte->'m')
,(0x6E.toByte->'n')
,(0x6F.toByte->'o')
,(0x70.toByte->'p')
,(0x71.toByte->'q')
,(0x72.toByte->'r')
,(0x73.toByte->'s')
,(0x74.toByte->'t')
,(0x75.toByte->'u')
,(0x76.toByte->'v')
,(0x77.toByte->'w')
,(0x78.toByte->'x')
,(0x79.toByte->'y')
,(0x7A.toByte->'z')
,(0x7B.toByte->'{')
,(0x7C.toByte->'|')
,(0x7D.toByte->'}')
,(0x7E.toByte->'~')
).withDefaultValue('.')                           //> ascii  : scala.collection.immutable.Map[Byte,Char] = Map(69 -> E, 101 -> e,
                                                  //|  88 -> X, 115 -> s, 120 -> x, 56 -> 8, 42 -> *, 37 -> %, 52 -> 4, 110 -> n,
                                                  //|  125 -> }, 46 -> ., 93 -> ], 57 -> 9, 78 -> N, 106 -> j, 121 -> y, 84 -> T,
                                                  //|  61 -> =, 89 -> Y, 116 -> t, 74 -> J, 60 -> <, 117 -> u, 85 -> U, 102 -> f,
                                                  //|  38 -> &, 70 -> F, 33 -> !, 92 -> \, 65 -> A, 97 -> a, 53 -> 5, 109 -> m, 1
                                                  //| 24 -> |, 77 -> M, 96 -> `, 41 -> ), 73 -> I, 105 -> i, 32 -> 	, 34 -> 
                                                  //| ", 45 -> -, 64 -> @, 44 -> ,, 59 -> ;, 118 -> v, 71 -> G, 54 -> 6, 49 -> 1,
                                                  //|  86 -> V, 113 -> q, 81 -> Q, 76 -> L, 39 -> ', 98 -> b, 103 -> g, 91 -> [, 
                                                  //| 66 -> B, 108 -> l, 80 -> P, 35 -> #, 112 -> p, 123 -> {, 48 -> 0, 63 -> ?, 
                                                  //| 95 -> _, 50 -> 2, 67 -> C, 72 -> H, 43 -> +, 99 -> c, 87 -> W, 104 -> h, 40
                                                  //|  -> (, 55 -> 7, 114 -> r, 75 -> K, 119 -> w, 58 -> :, 82 -> R, 36 -> $, 51 
                                                  //| -> 3, 107 -> k, 126 -> ~, 79 -> O, 94 -> ^, 47 -> /, 68 -> D, 62 -> >, 90 -
                                                  //| > Z, 111 -> o, 122 -> z, 83 
                                                  //| Output exceeds cutoff limit.
  
  def toBytes(x: String) = x.toSeq.grouped(2).map( x => Integer.parseInt(x.toString, 16).toByte).toVector
                                                  //> toBytes: (x: String)Vector[Byte]

  def toAscii(x: String) = toBytes(x).map(ascii(_)).mkString
                                                  //> toAscii: (x: String)String
  
  def str2Hex(s: String) =  s.toSeq.map(c=>"%02x".format(c.toByte)).mkString
                                                  //> str2Hex: (s: String)String
  

  def char2Bytes(s: String, charset: Option[String] = None) = java.nio.charset.Charset.forName(charset getOrElse "ISO-8859-1").encode(s).array().toVector
                                                  //> char2Bytes: (s: String, charset: Option[String])Vector[Byte]
  
  def strxor(y: String, z: String): String = (toBytes(y) zip toBytes(z) map (x => (x._1 ^ x._2).toByte )).map("%02x".format(_)).mkString
                                                  //> strxor: (y: String, z: String)String
  val message = "Hello World"                     //> message  : String = Hello World
  val key = "supersecret"                         //> key  : String = supersecret
  
 
  val m1 = str2Hex(message)                       //> m1  : String = 48656c6c6f20576f726c64
  val k = str2Hex(key)                            //> k  : String = 7375706572736563726574
  
  m1 == "48656c6c6f20576f726c64"                  //> res0: Boolean = true
  k == "7375706572736563726574"                   //> res1: Boolean = true
  
  val c1 = strxor(k,m1)                           //> c1  : String = 3b101c091d53320c000910
  c1 == "3b101c091d53320c000910"                  //> res2: Boolean = true
  
  strxor(k,c1) == m1                              //> res3: Boolean = true

  val message2 = "the program"                    //> message2  : String = the program
  val m2 = str2Hex(message2)                      //> m2  : String = 7468652070726f6772616d
  
  val c2 = strxor(k,m2)                           //> c2  : String = 071d154502010a04000419
  
  c2 == "071d154502010a04000419"                  //> res4: Boolean = true
  val g1 = str2Hex("the")                         //> g1  : String = 746865
  
  g1 == "746865"                                  //> res5: Boolean = true
  
  val c1XORc2 = strxor(c1,c2)                     //> c1XORc2  : String = 3c0d094c1f523808000d09
  
  c1XORc2 == "3c0d094c1f523808000d09"             //> res6: Boolean = true
  
  toAscii(strxor(c1XORc2,g1))                     //> res7: String = Hel
  
  toAscii(strxor(c1XORc2,str2Hex("he")))          //> res8: String = Th
  
  for ( x <- c1XORc2.sliding(1,1) ) {
  	
  }
  
  char2Bytes("the").map("%02x".format(_)).mkString == g1
                                                  //> res9: Boolean = true
  val c = 'a'.toByte                              //> c  : Byte = 97
  
}