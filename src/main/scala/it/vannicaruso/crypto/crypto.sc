import it.vannicaruso.crypto.HEX
import it.vannicaruso.crypto.HEX._
import it.vannicaruso.crypto.crypto._

import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
//val all = traverseList(ciphers).length
object crypto {
"abcd" xor "abcd"                                 //> res0: it.vannicaruso.crypto.HEX = 0000
val the = stringToHex(" the ")                    //> the  : String = 2074686520
val cipher_1_2 = cipher1 xor cipher2              //> cipher_1_2  : it.vannicaruso.crypto.HEX = 12104c06134e5709140f104f02521b0a04
                                                  //| 42020c4d070b184f4815541f0800484e1e0241061d064d540b0a020210194510164d4f3a0053
                                                  //| 43004e430e1e1d0a524612171b0117001b0e45431c0c1d160a520d11744e19061a114d0e5517
                                                  //| 4f084e543714050b174353541b48070e000e4d
val asciiEncoder =
  Charset.forName("ISO-8859-1").newEncoder()      //> asciiEncoder  : java.nio.charset.CharsetEncoder = sun.nio.cs.ISO_8859_1$Enco
                                                  //| der@2c886c40

def scan(ciphertext: HEX, guess: HEX) =
  ciphertext.hex.sliding(guess.hex.length, 1).foreach {
    window =>
      val xored = window xor guess
      val ascii_string = xored.toASCII
      if (asciiEncoder.canEncode(ascii_string))
        print("|" + ascii_string + "|")
  }                                               //> scan: (ciphertext: it.vannicaruso.crypto.HEX, guess: it.vannicaruso.crypto.H
                                                  //| EX)Unit
  }
  