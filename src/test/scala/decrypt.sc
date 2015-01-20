package africa.coin.crypto.hash

object decrypt {
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

  val key = "835c57232a3b48e70fef0922f7a093c8824f79f4416d0f4804bec204c7fdfd1b3380e84e555b16885d2b7f9e968734fc8c577bc2b0c36f1cc2df7bd365c13776146c4342a72cc41d5271717ee50a5718a6acaca70afa30fe4f7d1783a82b1397ca332c659c4d20c38afca2a37a4086b9fcf919513f4090a52c647e84302b292e24c523b8416c1e2bd62eb1ce73e48c3c277e90e8ef5d45ed945000c00db188ea2f908f36d30c1be686cc2d13c5649e613528a28cd35df69e1eed715a0b5eb36d7e1679cf4832a1f7eebbd9f132aefc4544c1d8f2194b9e03a918836da95fb6d448cd65e6fc5c953b6a9e8f2d4c9500b77ed11631fa4175ac75f7b1da2bf365ff7da1f6414a7e622b5c1fa4b850e48d9d4abf4349573a69dd0dee15f779942821aea9bc43a8643205edd72bfee83522a6f75accc75f4db8ac96edffe8517b4557ecdf7dd11eee525d3d07eec69d370f973c8f707221b0a93ed7393903ef8a1ed8120ae9e7e44db06f1f5c2657bc7b50106db0f77a8158b029d170505c78035576aef9cfd356972e1e1fbc90daf5b2ba945bc0a70f03fd69d420a244849b99875f8e5d9e40854f61783a27bb2836dd223671c0fb5fec335dfaab6fff744e568eed70f2bdaffb4fefb016eece5be24942aa4ca46399ca15c782887f31566945aa7982e4c8865270afcda4543551a8f4cddb294d93ba4be627eae3994a118982890ccb3821638bfd5bf2b55920f6b35c9696af0e1354c3b2d811f5f0d4598b38faf8250fd7310a96c4ecbd914f5568b08dc74ab60b40653c1971009308c70e790991aafdfb651ab53e099ae1aee4349255669369539a2396cbabbc2f8ec4af15772c87beb8d14d1e231be8029a2a27feacbf1b082ed44c5fe9e644d14fbc1b27bb76f71acb00d6e4450e8ff5bf1822ec35cc6c1d308a5b4a43bbe5d3d55785c56d23553ae012151af4f7148525ce8cf2620db0aa70c5ea42290147350e920f2f457810a751101e980d8428ffbf3c0b9f2a0a5d5406b1dec82140282f70cbc4ecb38458056027023951e35e53b5611515f536e5e595b8b66aa0b6b67a34f6c8166e52640375f6de24dec8414176b7959cc52c981cc6b015e20a2745b136a6d896b390e2216ef320746f4b3fde26302918825c03e83b1eec56ba741a6752c6f32a8cd68c4a75aef7b62f3ffa7d0cdf4f517bada884db495a012bdef66039792fc0511d1fde30af059c7afbb02c786ec936538cee9e23ac1a2e91fb9162bca67be42f3986aa392e36c69cc2fc5f97bc70c3e6aaaf505a433d059de2ef7f25df174e502a046cdc2331719ee0c0e4becef13ef8ed2618f9ceb12e97e4762fbeb23ab53c9e21bd497c9656a460b0d158883c3cbce7b16d122a3848b796d5660766667555e4eb25aeb5a8f9a636b4d2c72d01ae5cd966fdbea84e592dbb52a384bdd7e97039"
                                                  //> key  : String = 835c57232a3b48e70fef0922f7a093c8824f79f4416d0f4804bec204c7f
                                                  //| dfd1b3380e84e555b16885d2b7f9e968734fc8c577bc2b0c36f1cc2df7bd365c13776146c43
                                                  //| 42a72cc41d5271717ee50a5718a6acaca70afa30fe4f7d1783a82b1397ca332c659c4d20c38
                                                  //| afca2a37a4086b9fcf919513f4090a52c647e84302b292e24c523b8416c1e2bd62eb1ce73e4
                                                  //| 8c3c277e90e8ef5d45ed945000c00db188ea2f908f36d30c1be686cc2d13c5649e613528a28
                                                  //| cd35df69e1eed715a0b5eb36d7e1679cf4832a1f7eebbd9f132aefc4544c1d8f2194b9e03a9
                                                  //| 18836da95fb6d448cd65e6fc5c953b6a9e8f2d4c9500b77ed11631fa4175ac75f7b1da2bf36
                                                  //| 5ff7da1f6414a7e622b5c1fa4b850e48d9d4abf4349573a69dd0dee15f779942821aea9bc43
                                                  //| a8643205edd72bfee83522a6f75accc75f4db8ac96edffe8517b4557ecdf7dd11eee525d3d0
                                                  //| 7eec69d370f973c8f707221b0a93ed7393903ef8a1ed8120ae9e7e44db06f1f5c2657bc7b50
                                                  //| 106db0f77a8158b029d170505c78035576aef9cfd356972e1e1fbc90daf5b2ba945bc0a70f0
                                                  //| 3fd69d420a244849b99875f8e5d9e40854f61783a27bb2836dd223671c0fb5fec335dfaab6f
                                                  //| ff744e568eed70f2bdaffb4
                                                  //| Output exceeds cutoff limit.
                                                  
     key.size/2                                   //> res0: Int = 1024
     def toHex(x: String) = x.toSeq.grouped(2).map( x => Integer.parseInt(x.toString, 16).toByte).toVector
                                                  //> toHex: (x: String)Vector[Byte]
     def strxor(y: String, z: String): String = (toHex(y) zip toHex(z) map (x => (x._1 ^ x._2).toByte )).map("%02x".format(_)).mkString
                                                  //> strxor: (y: String, z: String)String
     def toAscii(x: String) = (x.toSeq.grouped(2).map( x => Integer.parseInt(x.toString, 16).toByte)).toVector.map(ascii(_)).mkString
                                                  //> toAscii: (x: String)String
     
     val Hello = Vector(0x48.toByte, 0x65.toByte, 0x6C.toByte, 0x6C.toByte, 0x6F.toByte )
                                                  //> Hello  : scala.collection.immutable.Vector[Byte] = Vector(72, 101, 108, 108
                                                  //| , 111)
     val Cruel = Vector(0x43.toByte, 0x72.toByte, 0x75.toByte, 0x65.toByte, 0x6C.toByte )
                                                  //> Cruel  : scala.collection.immutable.Vector[Byte] = Vector(67, 114, 117, 101
                                                  //| , 108)
     val World = Vector(0x57.toByte, 0x6F.toByte, 0x72.toByte, 0x6C.toByte, 0x64.toByte )
                                                  //> World  : scala.collection.immutable.Vector[Byte] = Vector(87, 111, 114, 108
                                                  //| , 100)
    toHex(key).size                               //> res1: Int = 1024
                                                  
    val c1 = "cb393b4f45"                         //> c1  : String = cb393b4f45
    val c2 = "c02e224646"                         //> c2  : String = c02e224646
    val c3 = "d433254f4e"                         //> c3  : String = d433254f4e
    val m1 = strxor(key,c1)                       //> m1  : String = 48656c6c6f
    if (toHex(m1) == Hello) toAscii(m1) else "(null)"
                                                  //> res2: String = Hello
    val m2 = strxor(key,c2)                       //> m2  : String = 437275656c
    if (toHex(m2) == Cruel) toAscii(m2) else "(null)"
                                                  //> res3: String = Cruel
    val m3 = strxor(key,c3)                       //> m3  : String = 576f726c64
    if (toHex(m3) == World) toAscii(m3) else "(null)"
                                                  //> res4: String = World
    
    val m1XORm2 = strxor(c1,c2)                   //> m1XORm2  : String = 0b17190903
    
    val end = toHex(m1XORm2).map(x => (if ((x>=0x41.toByte && x<=0x5A.toByte)||(x>=0x61.toByte && x<=0x7A.toByte)) 0x20.toByte^x else x).toByte)
                                                  //> end  : scala.collection.immutable.Vector[Byte] = Vector(11, 23, 25, 9, 3)
    
    val m2XORm3 = strxor(c2,c3)                   //> m2XORm3  : String = 141d070908
    
    //Decrypt
    toAscii(strxor(m1,m1XORm2))                   //> res5: String = Cruel
    toAscii(strxor(m3,m2XORm3))                   //> res6: String = Cruel
    val m1XORm3 = strxor(c1,c3)                   //> m1XORm3  : String = 1f0a1e000b
    
    strxor(strxor(m1XORm3,c2),c3) ==   strxor(c1,c2)
                                                  //> res7: Boolean = true
    strxor(strxor(m1XORm3,m2XORm3),m2) == m1      //> res8: Boolean = true
    toAscii(strxor(m1,m1XORm2))                   //> res9: String = Cruel
    val other = toHex(strxor(m1XORm3,c1)).map(x => (if ((x>=0x41.toByte && x<=0x5A.toByte)||(x>=0x61.toByte && x<=0x7A.toByte)) 0x20.toByte^x else x).toByte)
                                                  //> other  : scala.collection.immutable.Vector[Byte] = Vector(-44, 51, 37, 111,
                                                  //|  110)
                                                  toAscii(other.map("%02x".format(_)).mkString)
                                                  //> res10: String = .3%on
}