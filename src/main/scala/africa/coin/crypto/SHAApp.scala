package africa.coin.crypto

object SHAApp {
  def main(args: Array[String]) {

    val hello = "hello"
    val hash256 = SHA256Hash.hash(hello.getBytes())
    val doubleHash256 = SHA256Hash.hash(SHA256Hash.hash(hello.getBytes()))
    val ripemd160Hash = RIPEMD160Hash.hash(SHA256Hash.hash(hello.getBytes()))
    
    println("Example of double-SHA-256 encoding of string \"hello\": \n")
    println(hello)
    println(s"${hash256.map("%02x".format(_)).mkString} (first round of sha-256)")
    println(s"${doubleHash256.map("%02x".format(_)).mkString} (second round of sha-256)")

    println()

    println("For bitcoin addresses (RIPEMD-160) this would give: ")
    println(hello)
    println(s"${hash256.map("%02x".format(_)).mkString} (first round of sha-256)")
    println(s"${ripemd160Hash.map("%02x".format(_)).mkString} (with ripemd-160)")

  }
}
