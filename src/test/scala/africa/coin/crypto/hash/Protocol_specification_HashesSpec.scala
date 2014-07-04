package africa.coin.crypto.hash

import org.junit.runner.RunWith
import org.scalatest._
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class Protocol_specification_HashesSpec extends FreeSpec {

  val hello = "hello"

  hello - {

    val hash256 = SHA256Hash.hash(hello.getBytes())
    val doubleHash256 = SHA256Hash.hash(SHA256Hash.hash(hello.getBytes()))

    "2cf24dba5fb0a30e26e83b2ac5b9e29e1b161e5c1fa7425e73043362938b9824" - {
      "(in first round of sha-256)" in {
        assert(hash256.map("%02x".format(_)).mkString equals "2cf24dba5fb0a30e26e83b2ac5b9e29e1b161e5c1fa7425e73043362938b9824")
      }
    }
    "9595c9df90075148eb06860365df33584b75bff782a510c6cd4883a419833d50" - {
      "(in second round of sha-256)" in {
        assert(doubleHash256.map("%02x".format(_)).mkString equals "9595c9df90075148eb06860365df33584b75bff782a510c6cd4883a419833d50")
      }
    }

    val ripemd160Hash = RIPEMD160Hash.hash(SHA256Hash.hash(hello.getBytes()))
    "b6a9c8c230722b7c748331a8b450f05566dc7d0f" - {
      "(with ripemd-160)" in {
        assert(ripemd160Hash.map("%02x".format(_)).mkString equals "b6a9c8c230722b7c748331a8b450f05566dc7d0f")
      }
    }

  }

}