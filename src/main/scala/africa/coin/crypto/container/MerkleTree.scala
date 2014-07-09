package africa.coin.crypto.container

import africa.coin.crypto.hash.{SHA256Hash,CryptographicHash}
import math.{log,ceil,pow}

  sealed trait Tree[+A, Hash <: CryptographicHash] { val hash: Vector[Byte] }
  case class EmptyLeaf[Hash <: CryptographicHash](implicit hashFunction: Hash) extends Tree[Nothing, Hash] {
    override val hash: Vector[Byte] = Vector.empty[Byte]
  }
  case class Node[+A, Hash <: CryptographicHash](left: Tree[A, Hash], right: Tree[A, Hash])(implicit hashFunction: Hash) extends Tree[A, Hash] {
    override val hash: Vector[Byte] = hashFunction.hash(left.hash ++ right.hash)
  }
  case class Leaf[+A, Hash <: CryptographicHash](data: A)(implicit hashFunction: Hash) extends Tree[A, Hash] {
    override val hash: Vector[Byte] = hashFunction.hash(data.toString.getBytes)
  }

object MerkleTree {


  def apply[A, Hash <: CryptographicHash](dataBlocks: Seq[A])(implicit hashFunction: Hash = SHA256Hash): Tree[A, Hash] = {
	val level   = ceil(log(dataBlocks.size)/log(2))
    val padding = pow(2, level).toInt - dataBlocks.size
    search(dataBlocks.map(data => Leaf(data)) ++ Seq.fill(padding)(EmptyLeaf()))
  }

  def search[A, Hash <: CryptographicHash](trees: Seq[Tree[A, Hash]])(implicit hashFunction: Hash): Tree[A, Hash] = {
        trees match {
          case Nil           => EmptyLeaf()
          case x +: Nil      => trees.head
          case x +: y +: _   =>
		       search((trees.grouped(2).map( _ match { case l +: r +: _ => Node(l,r) })).toSeq)
        }
  }
  
}
