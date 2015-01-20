object cribWeek1 {

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
  val XORs = cts.sliding(2).map( x =>
        {
        val c = x.slice(0,1) zip x.slice(1,2)
   	    c map ( y =>
   	                  // convert into Byte Vectors
   	                  (y._1.toSeq.grouped(2).map( x => Integer.parseInt(x.toString, 16).toByte)).toVector
   	                  zip
   	                  (y._2.toSeq.grouped(2).map( x => Integer.parseInt(x.toString, 16).toByte)).toVector
   	                  // XOR
   	                  map (x => (x._1 ^ x._2).toByte )
   	            )
   	  }
   	// pick the last vector
    ).toVector                                    //> XORs  : Vector[List[scala.collection.immutable.Vector[Byte]]] = Vector(List
                                                  //| (Vector(18, 16, 76, 6, 19, 78, 87, 9, 20, 15, 16, 79, 2, 82, 27, 10, 4, 66,
                                                  //|  2, 12, 77, 7, 11, 24, 79, 72, 21, 84, 31, 8, 0, 72, 78, 30, 2, 65, 6, 29, 
                                                  //| 6, 77, 84, 11, 10, 2, 2, 16, 25, 69, 16, 22, 77, 79, 58, 0, 83, 67, 0, 78, 
                                                  //| 67, 14, 30, 29, 10, 82, 70, 18, 23, 27, 1, 23, 0, 27, 14, 69, 67, 28, 12, 2
                                                  //| 9, 22, 10, 82, 13, 17, 116, 78, 25, 6, 26, 17, 77, 14, 85, 23, 79, 8, 78, 8
                                                  //| 4, 55, 20, 5, 11, 23, 67, 83, 84, 27, 72, 7, 14, 0, 14, 77)), List(Vector(1
                                                  //| 7, 29, 9, 69, 28, 73, 20, 10, 85, 24, 12, 73, 30, 21, 79, 3, 3, 13, 25, 13,
                                                  //|  0, 46, 11, 15, 22, 21, 79, 5, 72, 8, 7, 0, 0, 0, 0, 0, 31, 12, 83, 67, 6, 
                                                  //| 17, 21, 27, 29, 2, 31, 65, 18, 13, 6, 29, 30, 69, 16, 65, 15, 0, 7, 29, 27,
                                                  //|  24, 0, 82, 65, 83, 24, 0, 26, 69, 79, 9, 70, 70, 2, 28, 26, 9, 84, 12, 65,
                                                  //|  95, 83, 97, 67, 78, 43, 15, 23, 77, 45, 26, 29, 69, 7)), List(Vector(0, 0,
                                                  //|  0, 0, 13, 0, 19, 13, 6
                                                  //| Output exceeds cutoff limit.
                                                  
  def str2Bytes(x: String) = x.toSeq.grouped(2).map( x => Integer.parseInt(x.toString, 16).toByte).toVector
                                                  //> str2Bytes: (x: String)Vector[Byte]
  
  def toAscii(x: String) = (x.toSeq.grouped(2).map( x => Integer.parseInt(x.toString, 16).toByte)).toVector.map(ascii(_)).mkString
                                                  //> toAscii: (x: String)String
  def str2Hex[A](s: Seq[A]) =  s.map(c=>"%02x".format(_)).mkString
                                                  //> str2Hex: [A](s: Seq[A])String
                                                     
   // xor chars
   def strxor(y: String, z: String): String = (str2Bytes(y) zip str2Bytes(z) map (x => (x._1 ^ x._2).toByte )).map("%02x".format(_)).mkString
                                                  //> strxor: (y: String, z: String)String
  val target = "32510ba9babebbbefd001547a810e67149caee11d945cd7fc81a05e9f85aac650e9052ba6a8cd8257bf14d13e6f0a803b54fde9e77472dbff89d71b57bddef121336cb85ccb8f3315f4b52e301d16e9f52f904"
                                                  //> target  : String = 32510ba9babebbbefd001547a810e67149caee11d945cd7fc81a05e9
                                                  //| f85aac650e9052ba6a8cd8257bf14d13e6f0a803b54fde9e77472dbff89d71b57bddef12133
                                                  //| 6cb85ccb8f3315f4b52e301d16e9f52f904
  XORs.last(0).map("%02x".format(_)).mkString     //> res0: String = 61744015522a190f170c5e0e453651464f170a271b1a041d06010f520a43
                                                  //| 40575d55165a5405118adfa15d45124c041d0b1900074d125f001a0908450d0b54414f16524
                                                  //| f14170d011b0b47460052524716010904081a0e4e044f0f000a5d0c
  val str = strxor(target,XORs.last(0).map("%02x".format(_)).mkString)
                                                  //> str  : String = 53254bbce894a2b1ea0c4b49ed26b73706dde436c25fc962ce1b0abbf21
                                                  //| 9ec3253c544e03e89c9afa4501056f4bcac1ebe56de993a5572bfe29479f076d6bb535c2099
                                                  //| cad8affe30444015a501833cd844f80d
                                                  
  val beg = str2Bytes(str).map(x => (if (x==0x20) 'a'.toByte^x else x).toByte)
                                                  //> beg  : scala.collection.immutable.Vector[Byte] = Vector(83, 37, 75, -68, -2
                                                  //| 4, -108, -94, -79, -22, 12, 75, 73, -19, 38, -73, 55, 6, -35, -28, 54, -62,
                                                  //|  95, -55, 98, -50, 27, 10, -69, -14, 25, -20, 50, 83, -59, 68, -32, 62, -11
                                                  //| 9, -55, -81, -92, 80, 16, 86, -12, -68, -84, 30, -66, 86, -34, -103, 58, 85
                                                  //| , 114, -65, -30, -108, 121, -16, 118, -42, -69, 83, 92, 65, -103, -54, -40,
                                                  //|  -81, -2, 48, 68, 64, 21, -91, 1, -125, 60, -40, 68, -8, 13)
  val end = str2Bytes(str).map(x => (if ((x>=0x41.toByte && x<=0x5A.toByte)||(x>=0x61.toByte && x<=0x7A.toByte)) ' '.toByte^x else x).toByte)
                                                  //> end  : scala.collection.immutable.Vector[Byte] = Vector(115, 37, 107, -68, 
                                                  //| -24, -108, -94, -79, -22, 12, 107, 105, -19, 38, -73, 55, 6, -35, -28, 54, 
                                                  //| -62, 95, -55, 66, -50, 27, 10, -69, -14, 25, -20, 50, 115, -59, 100, -32, 6
                                                  //| 2, -119, -55, -81, -92, 112, 16, 118, -12, -68, -84, 30, -66, 118, -34, -10
                                                  //| 3, 58, 117, 82, -65, -30, -108, 89, -16, 86, -42, -69, 115, 92, 32, -103, -
                                                  //| 54, -40, -81, -2, 48, 100, 64, 21, -91, 1, -125, 60, -40, 100, -8, 13)
  toAscii(beg.map("%02x".format(_)).mkString)     //> res1: String = S%K.......KI.&.7...6._.b.......2S.D.>....P.V.....V..:Ur...y.
                                                  //| v..S\A.....0D@....<.D..
  toAscii(end.map("%02x".format(_)).mkString)     //> res2: String = s%k.......ki.&.7...6._.B.......2s.d.>....p.v.....v..:uR...Y.
                                                  //| V..s\	.....0d@....<.d..
  toAscii(str)                                    //> res3: String = S%K.......KI.&.7...6._.b.......2S.D.>....P.V.....V..:Ur...y.
                                                  //| v..S\	.....0D@....<.D..
                                                  
  val ttttt = "..................................................................................."
                                                  //> ttttt  : String = .........................................................
                                                  //| ..........................
  val guess = """
!"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\]^_`abcdefgh
"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\]^_`abcdefghi
#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\]^_`abcdefghij
$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\]^_`abcdefghijk
%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\]^_`abcdefghijkl
&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\]^_`abcdefghijklm
'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\]^_`abcdefghijklmn
()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\]^_`abcdefghijklmno
)*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\]^_`abcdefghijklmnop
*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\]^_`abcdefghijklmnopq
+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\]^_`abcdefghijklmnopqr
,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\]^_`abcdefghijklmnopqrs
-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\]^_`abcdefghijklmnopqrst
./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\]^_`abcdefghijklmnopqrstu
/0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\]^_`abcdefghijklmnopqrstuv
^]
"""                                               //> guess  : String = "
                                                  //| !"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\]^_`abcdefgh
                                                  //| "#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\]^_`abcdefghi
                                                  //| #$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\]^_`abcdefghij
                                                  //| $%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\]^_`abcdefghijk
                                                  //| %&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\]^_`abcdefghijkl
                                                  //| &'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\]^_`abcdefghijklm
                                                  //| '()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\]^_`abcdefghijklmn
                                                  //| ()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\]^_`abcdefghijklmno
                                                  //| )*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\]^_`abcdefghijklmnop
                                                  //| *+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\]^_`abcdefghijklmnopq
                                                  //| +,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\]^_`abcdefghijklmnopqr
                                                  //| ,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\]^_`abcdefghijklmnopqrs
                                                  //| -./0123456789:;<=>?@ABCDEFGHIJKLMN
                                                  //| Output exceeds cutoff limit.
  guess.size                                      //> res4: Int = 1099
  target.size/2                                   //> res5: Int = 83
                                                   
  str2Hex("a")                                    //> res6: String = <function1>
  str2Hex(Seq.fill(target.size/2)("e").mkString)  //> res7: String = <function1><function1><function1><function1><function1><func
                                                  //| tion1><function1><function1><function1><function1><function1><function1><fu
                                                  //| nction1><function1><function1><function1><function1><function1><function1><
                                                  //| function1><function1><function1><function1><function1><function1><function1
                                                  //| ><function1><function1><function1><function1><function1><function1><functio
                                                  //| n1><function1><function1><function1><function1><function1><function1><funct
                                                  //| ion1><function1><function1><function1><function1><function1><function1><fun
                                                  //| ction1><function1><function1><function1><function1><function1><function1><f
                                                  //| unction1><function1><function1><function1><function1><function1><function1>
                                                  //| <function1><function1><function1><function1><function1><function1><function
                                                  //| 1><function1><function1><function1><function1><function1><function1><functi
                                                  //| on1><function1><function1><function1><function1><function1><function1><func
                                                  //| tion1><function1><funct
                                                  //| Output exceeds cutoff limit.
  val d1 = strxor(str2Hex(guess),str)             //> java.lang.NumberFormatException: For input string: "<f"
                                                  //| 	at java.lang.NumberFormatException.forInputString(NumberFormatException.
                                                  //| java:65)
                                                  //| 	at java.lang.Integer.parseInt(Integer.java:492)
                                                  //| 	at cribWeek1$$anonfun$main$1$$anonfun$str2Bytes$1$1.apply(cribWeek1.scal
                                                  //| a:137)
                                                  //| 	at cribWeek1$$anonfun$main$1$$anonfun$str2Bytes$1$1.apply(cribWeek1.scal
                                                  //| a:137)
                                                  //| 	at scala.collection.Iterator$$anon$11.next(Iterator.scala:328)
                                                  //| 	at scala.collection.Iterator$class.foreach(Iterator.scala:727)
                                                  //| 	at scala.collection.AbstractIterator.foreach(Iterator.scala:1157)
                                                  //| 	at scala.collection.generic.Growable$class.$plus$plus$eq(Growable.scala:
                                                  //| 48)
                                                  //| 	at scala.collection.immutable.VectorBuilder.$plus$plus$eq(Vector.scala:7
                                                  //| 16)
                                                  //| 	at scala.collection.immutable.VectorBuilder.$plus$plus$eq(Vector.scala:6
                                                  //| 92)
                                                  //| 	at scala.collection.TraversableOnce$class.to(TraversableOnce.scala:273)
                                                  //| 	at scala.collection.AbstractIterator.to(Iterator.sca
                                                  //| Output exceeds cutoff limit.
  toAscii(d1)
                                                  
  val sh1 = "29b0502b3a50d2066e614e6f0836645a09b6b06b"
  sh1.size/2

  val sh1B = str2Bytes(sh1)
  sh1B.length
  
  str2Hex(sh1B)  == sh1
}