package africa.coin.crypto.hash

import org.junit.runner.RunWith
import org.scalatest._
import org.scalatest.junit.JUnitRunner
import africa.coin.crypto.container.MerkleTree

@RunWith(classOf[JUnitRunner])
class Protocol_specification_Merkle_TreesSpec extends FreeSpec {

    val data1 = List(1, 2, 3)
    val merkle1 = MerkleTree(data1)(SHA256Hash)
    val hash1 = merkle1.hash

  "Hash of tree #1 and #2 should match" - {

    val data2 = List(3, 2, 1).reverse
    val merkle2 = MerkleTree(data2)(SHA256Hash)
    val hash2 = merkle2.hash

    "#1: "  + hash1.map("%02x".format(_)).mkString - {
      " #2: "  + hash2.map("%02x".format(_)).mkString in {
        assert(hash1.map("%02x".format(_)).mkString equals hash2.map("%02x".format(_)).mkString)
      }
    }
  }

  "Hash of tree #1 and #3 should be different" - {

    val data3 = List(1, 2, 3, 4)
    val merkle3 = MerkleTree(data3)(SHA256Hash)
    val hash3 = merkle3.hash

    "#1: "  + hash1.map("%02x".format(_)).mkString - {
      " #3: "  + hash3.map("%02x".format(_)).mkString in {
        assert(!(hash1.map("%02x".format(_)).mkString equals hash3.map("%02x".format(_)).mkString))
      }
    }
  }
}