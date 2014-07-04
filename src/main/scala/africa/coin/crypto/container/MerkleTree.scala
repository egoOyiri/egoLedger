package africa.coin.crypto.container

import africa.coin.crypto.hash.{SHA1Hash,CryptographicHash}
import math.{log,ceil,pow}

object MerkleTree {

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

  def apply[A, Hash <: CryptographicHash](dataBlocks: Seq[A])(implicit hashFunction: Hash = SHA1Hash): Tree[A, Hash] = {
	val level         = ceil(log(dataBlocks.size)/log(2))
	val paddingNeeded = pow(2, level).toInt - dataBlocks.size
	val padding       = Seq.fill(paddingNeeded)(EmptyLeaf())

	def search[A, Hash <: CryptographicHash](trees: Seq[Tree[A, Hash]])(implicit hashFunction: Hash): Tree[A, Hash] = {
		def createParent(treePair: Seq[Tree[A, Hash]]): Node[A, Hash] = {
		  val leftChild +: rightChild +: _ = treePair
		  this.++(leftChild, rightChild)
		}
		
		if (trees.size == 0) {
		  EmptyLeaf()
		} else if (trees.size == 1) {
		  trees.head
		} else {
		  search(trees.grouped(2).map(createParent).toSeq)
		}
	}
    search(dataBlocks.map(data => Leaf(data)) ++ padding)
  }

  // merge
  def ++[A, Hash <: CryptographicHash](leftChild: Tree[A, Hash],rightChild: Tree[A, Hash])(implicit hashFunction: Hash): Node[A, Hash] = {
    Node(leftChild, rightChild)
  }

  
}
