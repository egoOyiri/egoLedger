package africa.coin.crypto.hash

import org.bouncycastle.jce.provider.JDKMessageDigest 

object RIPEMD160Hash extends CryptographicHash {
  private val hasher = new JDKMessageDigest.RIPEMD160

  override def hash(byteSequence: Seq[Byte]): Vector[Byte] =
    hasher.digest(byteSequence.toArray).toVector
}