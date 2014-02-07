package africa.coin.crypto.hash

import java.security.MessageDigest
import africa.coin.crypto.CryptographicHash


object SHA256Hash extends CryptographicHash {
  private val hasher = MessageDigest.getInstance("SHA-256")

  override def hash(byteSequence: Seq[Byte]): Vector[Byte] =
    hasher.digest(byteSequence.toArray).toVector
}