package africa.coin.crypto

trait CryptographicHash {
  def hash(byteSequence: Seq[Byte]): Vector[Byte]
}
