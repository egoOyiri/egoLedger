package africa.coin.crypto.hash

trait CryptographicHash {
  def hash(byteSequence: Seq[Byte]): Vector[Byte]
}
