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



val hello:Vector[Byte] = Vector(0x48.toByte, 0x65.toByte, 0x6c.toByte, 0x6c.toByte, 0x6f.toByte)
                                                  //> hello  : Vector[Byte] = Vector(72, 101, 108, 108, 111)
hello.map(ascii(_)).mkString                      //> res0: String = Hello

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
                                                  
   def toByteVector(x: String) = (x.toSeq.grouped(2).map( x => Integer.parseInt(x.toString, 16).toByte)).toVector
                                                  //> toByteVector: (x: String)Vector[Byte]
   def toHex(vb: Vector[Byte]) = vb.map("%02x".format(_)).mkString
                                                  //> toHex: (vb: Vector[Byte])String
                                                  
                                                  
    // simple test on 2 ciphertexts
    val ct1 = (cts(0).toSeq.grouped(2).map( x => Integer.parseInt(x.toString, 16).toByte)).toVector
                                                  //> ct1  : Vector[Byte] = Vector(49, 92, 78, -22, -88, -75, -8, -86, -7, 23, 65
                                                  //| , 69, -65, 67, -31, 120, 75, -113, -96, 13, -57, 29, -120, 90, -128, 78, 94
                                                  //| , -23, -6, 64, -79, 99, 73, -63, 70, -5, 119, -116, -33, 45, 58, -1, 2, 29,
                                                  //|  -1, -11, -76, 3, -75, 16, -48, -48, 69, 84, 104, -82, -71, -122, 34, -79, 
                                                  //| 55, -38, -24, 87, 85, 60, -51, -120, -125, -89, -68, 55, 82, 14, 6, -27, 21
                                                  //| , -46, 44, -107, 78, -70, 80, 37, -72, -52, 87, -18, 89, 65, -116, -25, -36
                                                  //| , 107, -60, 21, 86, -67, -77, 107, -68, -93, -24, 119, 67, 1, -5, -54, -93,
                                                  //|  -72, 59, 34, 8, 9, 86, 9, -121, -127, 95, 101, 40, 103, 100, 112, 61, -32,
                                                  //|  -13, -43, 36, 64, 10, 25, -79, 89, 97, 11, 17, -17, 62)
                                                  
  ct1.map("%02x".format(_)).mkString              //> res1: String = 315c4eeaa8b5f8aaf9174145bf43e1784b8fa00dc71d885a804e5ee9fa40
                                                  //| b16349c146fb778cdf2d3aff021dfff5b403b510d0d0455468aeb98622b137dae857553ccd8
                                                  //| 883a7bc37520e06e515d22c954eba5025b8cc57ee59418ce7dc6bc41556bdb36bbca3e87743
                                                  //| 01fbcaa3b83b220809560987815f65286764703de0f3d524400a19b159610b11ef3e
  ct1.map(ascii(_)).mkString                      //> res2: String = 1\N.......AE.C.xK......Z.N^..@.cI.F.w..-:...........ETh...".
                                                  //| 7..WU<.....7R.....,.N.P%..W.YA...k..V..k...wC.....;"..V..._e(gdp=...$@...Ya
                                                  //| ...>
   
  val ct2 = (cts(1).toSeq.grouped(2).map( x => Integer.parseInt(x.toString, 16).toByte)).toVector
                                                  //> ct2  : Vector[Byte] = Vector(35, 76, 2, -20, -69, -5, -81, -93, -19, 24, 81
                                                  //| , 10, -67, 17, -6, 114, 79, -51, -94, 1, -118, 26, -125, 66, -49, 6, 75, -6
                                                  //| 7, -27, 72, -79, 43, 7, -33, 68, -70, 113, -111, -39, 96, 110, -12, 8, 31, 
                                                  //| -3, -27, -83, 70, -91, 6, -99, -97, 127, 84, 59, -19, -71, -56, 97, -65, 41
                                                  //| , -57, -30, 5, 19, 46, -38, -109, -126, -80, -68, 44, 92, 75, 69, -7, 25, -
                                                  //| 49, 58, -97, 28, -73, 65, 81, -10, -43, 81, -12, 72, 12, -126, -78, -53, 36
                                                  //| , -52, 91, 2, -118, -89, 110, -73, -76, -85, 36, 23, 26, -77, -51, -83, -72
                                                  //| , 53, 111)
  
  ct2.map("%02x".format(_)).mkString              //> res3: String = 234c02ecbbfbafa3ed18510abd11fa724fcda2018a1a8342cf064bbde548
                                                  //| b12b07df44ba7191d9606ef4081ffde5ad46a5069d9f7f543bedb9c861bf29c7e205132eda9
                                                  //| 382b0bc2c5c4b45f919cf3a9f1cb74151f6d551f4480c82b2cb24cc5b028aa76eb7b4ab2417
                                                  //| 1ab3cdadb8356f
  ct2.map(ascii(_)).mkString                      //> res4: String = #L........Q....rO......B..K..H.+..D.q..`n......F.....T;...a.
                                                  //| )..........,\KE...:...AQ..Q.H....$.[...n...$......5o
  
  val xor1_and_2 = ct1 zip ct2 map (x => (x._1 ^ x._2).toByte )
                                                  //> xor1_and_2  : scala.collection.immutable.Vector[Byte] = Vector(18, 16, 76, 
                                                  //| 6, 19, 78, 87, 9, 20, 15, 16, 79, 2, 82, 27, 10, 4, 66, 2, 12, 77, 7, 11, 2
                                                  //| 4, 79, 72, 21, 84, 31, 8, 0, 72, 78, 30, 2, 65, 6, 29, 6, 77, 84, 11, 10, 2
                                                  //| , 2, 16, 25, 69, 16, 22, 77, 79, 58, 0, 83, 67, 0, 78, 67, 14, 30, 29, 10, 
                                                  //| 82, 70, 18, 23, 27, 1, 23, 0, 27, 14, 69, 67, 28, 12, 29, 22, 10, 82, 13, 1
                                                  //| 7, 116, 78, 25, 6, 26, 17, 77, 14, 85, 23, 79, 8, 78, 84, 55, 20, 5, 11, 23
                                                  //| , 67, 83, 84, 27, 72, 7, 14, 0, 14, 77)
  xor1_and_2.map("%02x".format(_)).mkString       //> res5: String = 12104c06134e5709140f104f02521b0a0442020c4d070b184f4815541f08
                                                  //| 00484e1e0241061d064d540b0a020210194510164d4f3a005343004e430e1e1d0a524612171
                                                  //| b0117001b0e45431c0c1d160a520d11744e19061a114d0e55174f084e543714050b17435354
                                                  //| 1b48070e000e4d

  (0x31 ^ 0x23).toByte ==  xor1_and_2(0)          //> res6: Boolean = true
  (0x5c ^ 0x4c).toByte ==  xor1_and_2(1)          //> res7: Boolean = true
  
  xor1_and_2.map(ascii(_)).mkString               //> res8: String = ..L..NW....O.R...B..M...OH.T...HN..A...MT......E..MO:.SC.NC.
                                                  //| ...RF........EC.....R..tN....M.U.O.NT7....CST.H....M
 
 // test on ciphertext loops
 // Slide down by 2 lists
  val xor_all = cts.sliding(2).map( x =>
        {
        // take 1st and 2nd slide
        val a = x.slice(0,1)
        val b = x.slice(1,2)
        println(a(0).size,b(0).size)
        val c = if (a(0).size < b(0).size) a zip b else b zip a
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
    ).toVector                                    //> (278,224)
                                                  //| (224,190)
                                                  //| (190,288)
                                                  //| (288,244)
                                                  //| (244,344)
                                                  //| (344,372)
                                                  //| (372,254)
                                                  //| (254,312)
                                                  //| (312,190)
                                                  //| xor_all  : Vector[List[scala.collection.immutable.Vector[Byte]]] = Vector(L
                                                  //| ist(Vector(18, 16, 76, 6, 19, 78, 87, 9, 20, 15, 16, 79, 2, 82, 27, 10, 4, 
                                                  //| 66, 2, 12, 77, 7, 11, 24, 79, 72, 21, 84, 31, 8, 0, 72, 78, 30, 2, 65, 6, 2
                                                  //| 9, 6, 77, 84, 11, 10, 2, 2, 16, 25, 69, 16, 22, 77, 79, 58, 0, 83, 67, 0, 7
                                                  //| 8, 67, 14, 30, 29, 10, 82, 70, 18, 23, 27, 1, 23, 0, 27, 14, 69, 67, 28, 12
                                                  //| , 29, 22, 10, 82, 13, 17, 116, 78, 25, 6, 26, 17, 77, 14, 85, 23, 79, 8, 78
                                                  //| , 84, 55, 20, 5, 11, 23, 67, 83, 84, 27, 72, 7, 14, 0, 14, 77)), List(Vecto
                                                  //| r(17, 29, 9, 69, 28, 73, 20, 10, 85, 24, 12, 73, 30, 21, 79, 3, 3, 13, 25, 
                                                  //| 13, 0, 46, 11, 15, 22, 21, 79, 5, 72, 8, 7, 0, 0, 0, 0, 0, 31, 12, 83, 67, 
                                                  //| 6, 17, 21, 27, 29, 2, 31, 65, 18, 13, 6, 29, 30, 69, 16, 65, 15, 0, 7, 29, 
                                                  //| 27, 24, 0, 82, 65, 83, 24, 0, 26, 69, 79, 9, 70, 7
                                                  //| Output exceeds cutoff limit.
 val A = 0x41.toByte                              //> A  : Byte = 65
 val Z = 0x5a.toByte                              //> Z  : Byte = 90
 val a = 0x61.toByte                              //> a  : Byte = 97
 val z = 0x7a.toByte                              //> z  : Byte = 122
 val sp = 0x20.toByte                             //> sp  : Byte = 32
 
 (a ^ sp).toByte == A                             //> res9: Boolean = true
 (A ^ sp).toByte == a                             //> res10: Boolean = true
 (z ^ sp).toByte == Z                             //> res11: Boolean = true
 (z ^ sp).toByte == Z                             //> res12: Boolean = true
 
 
 
 toHex(xor_all.last(0))                           //> res13: String = 61744015522a190f170c5e0e453651464f170a271b1a041d06010f520a4
                                                  //| 340575d55165a5405118adfa15d45124c041d0b1900074d125f001a0908450d0b54414f1652
                                                  //| 4f14170d011b0b47460052524716010904081a0e4e044f0f000a5d0c
 val xorSpace = xor_all.last(0).map(x => (if ((x>=A && x<=Z)||(x>=a && x<=z)) x^sp else x).toByte)
                                                  //> xorSpace  : scala.collection.immutable.Vector[Byte] = Vector(65, 84, 64, 21
                                                  //| , 114, 42, 25, 15, 23, 12, 94, 14, 101, 54, 113, 102, 111, 23, 10, 39, 27, 
                                                  //| 26, 4, 29, 6, 1, 15, 114, 10, 99, 64, 119, 93, 117, 22, 122, 116, 5, 17, -1
                                                  //| 18, -33, -95, 93, 101, 18, 108, 4, 29, 11, 25, 0, 7, 109, 18, 95, 0, 26, 9,
                                                  //|  8, 101, 13, 11, 116, 97, 111, 22, 114, 111, 20, 23, 13, 1, 27, 11, 103, 10
                                                  //| 2, 0, 114, 114, 103, 22, 1, 9, 4, 8, 26, 14, 110, 4, 111, 15, 0, 10, 93, 12
                                                  //| )
 toHex(xorSpace)                                  //> res14: String = 41544015722a190f170c5e0e653671666f170a271b1a041d06010f720a6
                                                  //| 340775d75167a7405118adfa15d65126c041d0b1900076d125f001a0908650d0b74616f1672
                                                  //| 6f14170d011b0b67660072726716010904081a0e6e046f0f000a5d0c
 xorSpace.map(ascii(_)).mkString                  //> res15: String = AT@.r*....^.e6qfo..'.......r.c@w]u.zt.....]e.l......m._....
                                                  //| e..tao.ro......gf.rrg.......n.o...].
 val dt = toByteVector(target)                    //> dt  : Vector[Byte] = Vector(50, 81, 11, -87, -70, -66, -69, -66, -3, 0, 21,
                                                  //|  71, -88, 16, -26, 113, 73, -54, -18, 17, -39, 69, -51, 127, -56, 26, 5, -2
                                                  //| 3, -8, 90, -84, 101, 14, -112, 82, -70, 106, -116, -40, 37, 123, -15, 77, 1
                                                  //| 9, -26, -16, -88, 3, -75, 79, -34, -98, 119, 71, 45, -65, -8, -99, 113, -75
                                                  //| , 123, -35, -17, 18, 19, 54, -53, -123, -52, -72, -13, 49, 95, 75, 82, -29,
                                                  //|  1, -47, 110, -97, 82, -7, 4)
 toHex(dt)                                        //> res16: String = 32510ba9babebbbefd001547a810e67149caee11d945cd7fc81a05e9f85
                                                  //| aac650e9052ba6a8cd8257bf14d13e6f0a803b54fde9e77472dbff89d71b57bddef121336cb
                                                  //| 85ccb8f3315f4b52e301d16e9f52f904
 val decrypt = dt zip xor_all.last(0) map (x => (x._1 ^ x._2).toByte )
                                                  //> decrypt  : scala.collection.immutable.Vector[Byte] = Vector(83, 37, 75, -68
                                                  //| , -24, -108, -94, -79, -22, 12, 75, 73, -19, 38, -73, 55, 6, -35, -28, 54, 
                                                  //| -62, 95, -55, 98, -50, 27, 10, -69, -14, 25, -20, 50, 83, -59, 68, -32, 62,
                                                  //|  -119, -55, -81, -92, 80, 16, 86, -12, -68, -84, 30, -66, 86, -34, -103, 58
                                                  //| , 85, 114, -65, -30, -108, 121, -16, 118, -42, -69, 83, 92, 32, -103, -54, 
                                                  //| -40, -81, -2, 48, 68, 64, 21, -91, 1, -125, 60, -40, 68, -8, 13)
 toHex(decrypt)                                   //> res17: String = 53254bbce894a2b1ea0c4b49ed26b73706dde436c25fc962ce1b0abbf21
                                                  //| 9ec3253c544e03e89c9afa4501056f4bcac1ebe56de993a5572bfe29479f076d6bb535c2099
                                                  //| cad8affe30444015a501833cd844f80d
decrypt.map(ascii(_)).mkString                    //> res18: String = S%K.......KI.&.7...6._.b.......2S.D.>....P.V.....V..:Ur...y
                                                  //| .v..S\	.....0D@....<.D..
                                                  
val decrypt2 = dt zip xor_all(3)(0) map (x => (x._1 ^ x._2).toByte )
                                                  //> decrypt2  : scala.collection.immutable.Vector[Byte] = Vector(63, 86, 27, -8
                                                  //| 7, -67, -72, -91, -15, -20, 82, 22, 67, -66, 16, -26, 117, 84, -123, -24, 1
                                                  //| 7, -61, 0, -56, 127, -39, 6, 81, -88, -73, 75, -23, 103, 4, -62, 23, -65, 1
                                                  //| 08, -121, -46, 117, 105, -22, 77, 16, -26, -16, -28, 3, -81, 68, -105, -99,
                                                  //|  119, 69, 45, -96, -25, -105, 121, -81, 58, -48, -11, 72, 17, 42, -124, -12
                                                  //| 0, -126, -7, -13, 101, 89, 67, 78, -30, 10, -60, 58, -103, 75, -1, 87)
 decrypt2.map(ascii(_)).mkString                  //> res19: String = ?V.......R.C...uT.........Q..K.g....l..ui.M......D..wE-...y
                                                  //| .:..H.*.....eYCN...:.K.W
}