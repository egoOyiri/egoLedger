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

  val cts: List[String] = (
    "315c4eeaa8b5f8aaf9174145bf43e1784b8fa00dc71d885a804e5ee9fa40b16349c146fb778cdf2d3aff021dfff5b403b510d0d0455468aeb98622b137dae857553ccd8883a7bc37520e06e515d22c954eba5025b8cc57ee59418ce7dc6bc41556bdb36bbca3e8774301fbcaa3b83b220809560987815f65286764703de0f3d524400a19b159610b11ef3e"
    ::
    "234c02ecbbfbafa3ed18510abd11fa724fcda2018a1a8342cf064bbde548b12b07df44ba7191d9606ef4081ffde5ad46a5069d9f7f543bedb9c861bf29c7e205132eda9382b0bc2c5c4b45f919cf3a9f1cb74151f6d551f4480c82b2cb24cc5b028aa76eb7b4ab24171ab3cdadb8356f"
    ::
    "32510ba9a7b2bba9b8005d43a304b5714cc0bb0c8a34884dd91304b8ad40b62b07df44ba6e9d8a2368e51d04e0e7b207b70b9b8261112bacb6c866a232dfe257527dc29398f5f3251a0d47e503c66e935de81230b59b7afb5f41afa8d661cb"
    ::
    "32510ba9aab2a8a4fd06414fb517b5605cc0aa0dc91a8908c2064ba8ad5ea06a029056f47a8ad3306ef5021eafe1ac01a81197847a5c68a1b78769a37bc8f4575432c198ccb4ef63590256e305cd3a9544ee4160ead45aef520489e7da7d835402bca670bda8eb775200b8dabbba246b130f040d8ec6447e2c767f3d30ed81ea2e4c1404e1315a1010e7229be6636aaa"
    ::
    "3f561ba9adb4b6ebec54424ba317b564418fac0dd35f8c08d31a1fe9e24fe56808c213f17c81d9607cee021dafe1e001b21ade877a5e68bea88d61b93ac5ee0d562e8e9582f5ef375f0a4ae20ed86e935de81230b59b73fb4302cd95d770c65b40aaa065f2a5e33a5a0bb5dcaba43722130f042f8ec85b7c2070"
    ::
    "32510bfbacfbb9befd54415da243e1695ecabd58c519cd4bd2061bbde24eb76a19d84aba34d8de287be84d07e7e9a30ee714979c7e1123a8bd9822a33ecaf512472e8e8f8db3f9635c1949e640c621854eba0d79eccf52ff111284b4cc61d11902aebc66f2b2e436434eacc0aba938220b084800c2ca4e693522643573b2c4ce35050b0cf774201f0fe52ac9f26d71b6cf61a711cc229f77ace7aa88a2f19983122b11be87a59c355d25f8e4"
    ::
    "32510bfbacfbb9befd54415da243e1695ecabd58c519cd4bd90f1fa6ea5ba47b01c909ba7696cf606ef40c04afe1ac0aa8148dd066592ded9f8774b529c7ea125d298e8883f5e9305f4b44f915cb2bd05af51373fd9b4af511039fa2d96f83414aaaf261bda2e97b170fb5cce2a53e675c154c0d9681596934777e2275b381ce2e40582afe67650b13e72287ff2270abcf73bb028932836fbdecfecee0a3b894473c1bbeb6b4913a536ce4f9b13f1efff71ea313c8661dd9a4ce"
    ::
    "315c4eeaa8b5f8bffd11155ea506b56041c6a00c8a08854dd21a4bbde54ce56801d943ba708b8a3574f40c00fff9e00fa1439fd0654327a3bfc860b92f89ee04132ecb9298f5fd2d5e4b45e40ecc3b9d59e9417df7c95bba410e9aa2ca24c5474da2f276baa3ac325918b2daada43d6712150441c2e04f6565517f317da9d3"
    ::
    "271946f9bbb2aeadec111841a81abc300ecaa01bd8069d5cc91005e9fe4aad6e04d513e96d99de2569bc5e50eeeca709b50a8a987f4264edb6896fb537d0a716132ddc938fb0f836480e06ed0fcd6e9759f40462f9cf57f4564186a2c1778f1543efa270bda5e933421cbe88a4a52222190f471e9bd15f652b653b7071aec59a2705081ffe72651d08f822c9ed6d76e48b63ab15d0208573a7eef027"
    ::
    "466d06ece998b7a2fb1d464fed2ced7641ddaa3cc31c9941cf110abbf409ed39598005b3399ccfafb61d0315fca0a314be138a9f32503bedac8067f03adbf3575c3b8edc9ba7f537530541ab0f9f3cd04ff50d66f1d559ba520e89a2cb2a83"
    ::
    Nil)                                          //> cts  : List[String] = List(315c4eeaa8b5f8aaf9174145bf43e1784b8fa00dc71d885a
                                                  //| 804e5ee9fa40b16349c146fb778cdf2d3aff021dfff5b403b510d0d0455468aeb98622b137d
                                                  //| ae857553ccd8883a7bc37520e06e515d22c954eba5025b8cc57ee59418ce7dc6bc41556bdb3
                                                  //| 6bbca3e8774301fbcaa3b83b220809560987815f65286764703de0f3d524400a19b159610b1
                                                  //| 1ef3e, 234c02ecbbfbafa3ed18510abd11fa724fcda2018a1a8342cf064bbde548b12b07df
                                                  //| 44ba7191d9606ef4081ffde5ad46a5069d9f7f543bedb9c861bf29c7e205132eda9382b0bc2
                                                  //| c5c4b45f919cf3a9f1cb74151f6d551f4480c82b2cb24cc5b028aa76eb7b4ab24171ab3cdad
                                                  //| b8356f, 32510ba9a7b2bba9b8005d43a304b5714cc0bb0c8a34884dd91304b8ad40b62b07d
                                                  //| f44ba6e9d8a2368e51d04e0e7b207b70b9b8261112bacb6c866a232dfe257527dc29398f5f3
                                                  //| 251a0d47e503c66e935de81230b59b7afb5f41afa8d661cb, 32510ba9aab2a8a4fd06414fb
                                                  //| 517b5605cc0aa0dc91a8908c2064ba8ad5ea06a029056f47a8ad3306ef5021eafe1ac01a811
                                                  //| 97847a5c68a1b78769a37bc8f4575432c198ccb4ef63590256e305cd3a9544ee4160ead45ae
                                                  //| f520489e7da7d835402bca6
                                                  //| Output exceeds cutoff limit.
                                                  
    val target = "32510ba9babebbbefd001547a810e67149caee11d945cd7fc81a05e9f85aac650e9052ba6a8cd8257bf14d13e6f0a803b54fde9e77472dbff89d71b57bddef121336cb85ccb8f3315f4b52e301d16e9f52f904"
                                                  //> target  : String = 32510ba9babebbbefd001547a810e67149caee11d945cd7fc81a05e9
                                                  //| f85aac650e9052ba6a8cd8257bf14d13e6f0a803b54fde9e77472dbff89d71b57bddef12133
                                                  //| 6cb85ccb8f3315f4b52e301d16e9f52f904
  def toHex(x: String) = x.toSeq.grouped(2).map( x => Integer.parseInt(x.toString, 16).toByte).toVector
                                                  //> toHex: (x: String)Vector[Byte]
   
   // xor chars
   def strxor(y: String, z: String): String = (toHex(y) zip toHex(z) map (x => (x._1 ^ x._2).toByte )).map("%02x".format(_)).mkString
                                                  //> strxor: (y: String, z: String)String
   
   def toAscii(x: String) = (x.toSeq.grouped(2).map( x => Integer.parseInt(x.toString, 16).toByte)).toVector.map(ascii(_)).mkString
                                                  //> toAscii: (x: String)String
                                                  
   toAscii(cts(0))                                //> res0: String = 1\N.......AE.C.xK......Z.N^..@.cI.F.w..-:...........ETh...".
                                                  //| 7..WU<.....7R.....,.N.P%..W.YA...k..V..k...wC.....;"..V..._e(gdp=...$@...Ya
                                                  //| ...>
   toAscii(target)                                //> res1: String = 2Q.........G...qI....E.......Z.e..R.j..%{.M......O..wG-...q.
                                                  //| {....6.....1_KR...n.R..
                                                  
   strxor(target,target)                          //> res2: String = 000000000000000000000000000000000000000000000000000000000000
                                                  //| 000000000000000000000000000000000000000000000000000000000000000000000000000
                                                  //| 0000000000000000000000000000000
   strxor(cts(0),cts(1))                          //> res3: String = 12104c06134e5709140f104f02521b0a0442020c4d070b184f4815541f08
                                                  //| 00484e1e0241061d064d540b0a020210194510164d4f3a005343004e430e1e1d0a524612171
                                                  //| b0117001b0e45431c0c1d160a520d11744e19061a114d0e55174f084e543714050b17435354
                                                  //| 1b48070e000e4d
   // identity
   strxor(target,target) ==  Seq.fill(target.size)("0").mkString
                                                  //> res4: Boolean = true
  // commutative
  strxor(cts(1),cts(0)) == strxor(cts(0),cts(1))  //> res5: Boolean = true
  val t = strxor(strxor(strxor(strxor(strxor(strxor(strxor(strxor(strxor(strxor(cts(0),cts(1)),cts(2)),cts(3)),cts(4)),cts(5)),cts(6)),cts(7)),cts(8)),cts(9)),target)
                                                  //> t  : String = 4f3f52f9f3dba8e1aa40101fff76ac2812d6fb3a9521ca7a904f00b0e219e
                                                  //| 92a099e47a462c7d4eceb4d4a50a1baa457ed03c4cb1c4d23a9d6cf62e9239db808437ac8da
                                                  //| 99bfe0240b1945a65e8c218f1fbd02
  toAscii(t)                                      //> res6: String = O?R......@...v.(...:.!.z.O.....*..G.b....MJP...W.....M#...b.
                                                  //| #...Cz.....$..E.^.!....
                                                  
  val tr = strxor(target,strxor(strxor(strxor(strxor(strxor(strxor(strxor(strxor(strxor(cts(9),cts(8)),cts(7)),cts(6)),cts(5)),cts(4)),cts(3)),cts(2)),cts(1)),cts(0)))
                                                  //> tr  : String = 4f3f52f9f3dba8e1aa40101fff76ac2812d6fb3a9521ca7a904f00b0e219
                                                  //| e92a099e47a462c7d4eceb4d4a50a1baa457ed03c4cb1c4d23a9d6cf62e9239db808437ac8d
                                                  //| a99bfe0240b1945a65e8c218f1fbd02
 toAscii(tr)                                      //> res7: String = O?R......@...v.(...:.!.z.O.....*..G.b....MJP...W.....M#...b.
                                                  //| #...Cz.....$..E.^.!....
 val end = toHex(tr).map(x => (if ((x>=A && x<=Z)||(x>=a && x<=z)) x^sp else x).toByte)
                                                  //> end  : scala.collection.immutable.Vector[Byte] = Vector(111, 63, 114, -7, -
                                                  //| 13, -37, -88, -31, -86, 64, 16, 31, -1, 86, -84, 40, 18, -42, -5, 58, -107,
                                                  //|  33, -54, 90, -112, 111, 0, -80, -30, 25, -23, 42, 9, -98, 103, -92, 66, -5
                                                  //| 7, -44, -20, -21, 109, 106, 112, -95, -70, -92, 119, -19, 3, -60, -53, 28, 
                                                  //| 109, 35, -87, -42, -49, 66, -23, 35, -99, -72, 8, 99, 90, -56, -38, -103, -
                                                  //| 65, -32, 36, 11, 25, 101, -90, 94, -116, 33, -113, 31, -67, 2)
 toAscii(end.map("%02x".format(_)).mkString)      //> res8: String = o?r......@...V.(...:.!.Z.o.....*..g.B....mjp...w.....m#...B.
                                                  //| #...cZ.....$..e.^.!....
   val tnull = strxor(strxor(strxor(strxor(strxor(strxor(strxor(strxor(strxor(cts(0),cts(1)),cts(2)),cts(3)),cts(4)),cts(5)),cts(6)),cts(7)),cts(8)),cts(9))
                                                  //> tnull  : String = 7d6e59504965135f5740055857664a595b1c152b4c640705585505591
                                                  //| a43454f070e151e084b0cc990bc0743474a0c54584c1a556b0a0e162e52135c5840571a504c
                                                  //| 035f55071315545217455f5d4f104d4406674a4a180b1a5a6b3b19541d
                                                  tnull.toVector
                                                  //> res9: Vector[Char] = Vector(7, d, 6, e, 5, 9, 5, 0, 4, 9, 6, 5, 1, 3, 5, f,
                                                  //|  5, 7, 4, 0, 0, 5, 5, 8, 5, 7, 6, 6, 4, a, 5, 9, 5, b, 1, c, 1, 5, 2, b, 4,
                                                  //|  c, 6, 4, 0, 7, 0, 5, 5, 8, 5, 5, 0, 5, 5, 9, 1, a, 4, 3, 4, 5, 4, f, 0, 7,
                                                  //|  0, e, 1, 5, 1, e, 0, 8, 4, b, 0, c, c, 9, 9, 0, b, c, 0, 7, 4, 3, 4, 7, 4,
                                                  //|  a, 0, c, 5, 4, 5, 8, 4, c, 1, a, 5, 5, 6, b, 0, a, 0, e, 1, 6, 2, e, 5, 2,
                                                  //|  1, 3, 5, c, 5, 8, 4, 0, 5, 7, 1, a, 5, 0, 4, c, 0, 3, 5, f, 5, 5, 0, 7, 1,
                                                  //|  3, 1, 5, 5, 4, 5, 2, 1, 7, 4, 5, 5, f, 5, d, 4, f, 1, 0, 4, d, 4, 4, 0, 6,
                                                  //|  6, 7, 4, a, 4, a, 1, 8, 0, b, 1, a, 5, a, 6, b, 3, b, 1, 9, 5, 4, 1, d)
                                                  
   val cnull = tnull.toVector.map(x => (if ((x>=A && x<=Z)||(x>=a && x<=z)) x^sp else x).toByte).mkString
                                                  //> cnull  : String = 556854695357534852575453495153705355524848535356535554545
                                                  //| 265535753664967495350665267545248554853535653534853535749655251525352704855
                                                  //| 486949534969485652664867675757486667485552515255526548675352535652674965535
                                                  //| 354664865486949545069535049515367535652485355496553485267485153705353485549
                                                  //| 514953535253504955525353705368527049485268525248545455526552654956486649655
                                                  //| 36554665166495753524968
 
   toAscii(strxor(cnull,target))                  //> res10: String = g9_......WA..A.....Y...).OQ..?.2]...#..C)..A...P....?.~...#
                                                  //| .)..b[c.....X....I.....b
}