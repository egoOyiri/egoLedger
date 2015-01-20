object week1 {

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

 val A = 0x41.toByte                              //> A  : Byte = 65
 val Z = 0x5a.toByte                              //> Z  : Byte = 90
 val a = 0x61.toByte                              //> a  : Byte = 97
 val z = 0x7a.toByte                              //> z  : Byte = 122
 val sp = 0x20.toByte                             //> sp  : Byte = 32
 val t = 0x74.toByte                              //> t  : Byte = 116
 
 

  def toHex(x: String) = x.toSeq.grouped(2).map( x => Integer.parseInt(x.toString, 16).toByte).toVector
                                                  //> toHex: (x: String)Vector[Byte]
   
   // xor chars
   def strxor(y: String, z: String): String = (toHex(y) zip toHex(z) map (x => (x._1 ^ x._2).toByte )).map("%02x".format(_)).mkString
                                                  //> strxor: (y: String, z: String)String
   
   def toAscii(x: String) = (x.toSeq.grouped(2).map( x => Integer.parseInt(x.toString, 16).toByte)).toVector.map(ascii(_)).mkString
                                                  //> toAscii: (x: String)String

 val Hello = Vector(0x48.toByte, 0x65.toByte, 0x6C.toByte, 0x6C.toByte, 0x6F.toByte )
                                                  //> Hello  : scala.collection.immutable.Vector[Byte] = Vector(72, 101, 108, 108
                                                  //| , 111)
 toAscii(Hello.map("%02x".format(_)).mkString)    //> res0: String = Hello

 val World = Vector(0x57.toByte, 0x6F.toByte, 0x72.toByte, 0x6C.toByte, 0x64.toByte )
                                                  //> World  : scala.collection.immutable.Vector[Byte] = Vector(87, 111, 114, 108
                                                  //| , 100)
                                                  
 toAscii(World.map("%02x".format(_)).mkString)    //> res1: String = World

  val cts: List[String] = (
    "052b9073e72012d46e23"
    ::
    "04249000e65112d46e51"
    ::
    Nil)                                          //> cts  : List[String] = List(052b9073e72012d46e23, 04249000e65112d46e51)
                                                  
  val target = "04249000e65112d46e51"             //> target  : String = 04249000e65112d46e51
                                                  
   toAscii(cts(0))                                //> res2: String = .+.s.	..n#
   toAscii(target)                                //> res3: String = .$...Q..nQ
                                                  
   val tr = strxor(target,strxor(cts(0),cts(1)))  //> tr  : String = 052b9073e72012d46e23

  val end = toHex(tr).map(x => (if ((x>=A && x<=Z)||(x>=a && x<=z)) x^sp else x).toByte)
                                                  //> end  : scala.collection.immutable.Vector[Byte] = Vector(5, 43, -112, 83, -2
                                                  //| 5, 32, 18, -44, 78, 35)
  toAscii(end.map("%02x".format(_)).mkString)     //> res4: String = .+.S.	..N#
  
 
//  val c1 = "6c73d5240a948c86981bc294814d"
  val c1 = "09e1c5f70a65ac519458e7e53f36"         //> c1  : String = 09e1c5f70a65ac519458e7e53f36
  val p1 = "attack at dawn"                       //> p1  : String = attack at dawn
  val p2 = "attack at dusk"                       //> p2  : String = attack at dusk
 
  val m1 = p1.seq.map(_.toByte).map("%02x".format(_)).mkString
                                                  //> m1  : String = 61747461636b206174206461776e
  val m2 = p2.seq.map(_.toByte).map("%02x".format(_)).mkString
                                                  //> m2  : String = 61747461636b206174206475736b
  
  m1.length                                       //> res5: Int = 28
  m2.length                                       //> res6: Int = 28
   
  val k = strxor(c1,m1)                           //> k  : String = 6895b196690e8c30e07883844858
  val c2 = strxor(k,m2)                           //> c2  : String = 09e1c5f70a65ac519458e7f13b33
  strxor(k,c2)                                    //> res7: String = 61747461636b206174206475736b
  
  toAscii("61747461636b206174206475736b")         //> res8: String = attack	at	dusk

}