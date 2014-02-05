package africa.coin.crypto

import java.security.MessageDigest


object SHA256Hash extends CryptographicHash {
  private val hasher = MessageDigest.getInstance("SHA-256")

  override def hash(byteSequence: Seq[Byte]): Vector[Byte] =
    hasher.digest(byteSequence.toArray).toVector
}