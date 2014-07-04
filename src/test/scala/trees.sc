import africa.coin.crypto.hash.SHA256Hash
import africa.coin.crypto.container.MerkleTree
import africa.coin.crypto.container.MerkleTree.{Node,Leaf,EmptyLeaf}

object trees {
   val hash = SHA256Hash                          //> hash  : africa.coin.crypto.hash.SHA256Hash.type = africa.coin.crypto.hash.SH
                                                  //| A256Hash$@56d5e457
    val data1 = List(1, 2, 3)                     //> data1  : List[Int] = List(1, 2, 3)
    val merkle1 = MerkleTree(data1)(hash)         //> merkle1  : africa.coin.crypto.container.MerkleTree.Tree[Int,africa.coin.cryp
                                                  //| to.hash.SHA256Hash.type] = Node(Node(Leaf(1),Leaf(2)),Node(Leaf(3),EmptyLeaf
                                                  //| (africa.coin.crypto.hash.SHA256Hash$@56d5e457)))
    merkle1.hash.map("%02x".format(_)).mkString   //> res0: String = a9c7a47752cb1abf8db99d67430b37d4f19ec559fea7c33edd06c8f971a7a
                                                  //| 1e0
                                                  
                                                  
   val merkle2 = Node(
   	 Node(Leaf(1)(hash),     Leaf(2)(hash))(hash)
   	,Node(Leaf(3)(hash),EmptyLeaf( )(hash))(hash)
   	)(hash)                                   //> merkle2  : africa.coin.crypto.container.MerkleTree.Node[Int,africa.coin.cryp
                                                  //| to.hash.SHA256Hash.type] = Node(Node(Leaf(1),Leaf(2)),Node(Leaf(3),EmptyLeaf
                                                  //| (africa.coin.crypto.hash.SHA256Hash$@56d5e457)))
   val merkle3 = Node(Leaf(1)(hash),Leaf(2)(hash))(hash)
                                                  //> merkle3  : africa.coin.crypto.container.MerkleTree.Node[Int,africa.coin.cryp
                                                  //| to.hash.SHA256Hash.type] = Node(Leaf(1),Leaf(2))
   merkle2.hash.map("%02x".format(_)).mkString    //> res1: String = a9c7a47752cb1abf8db99d67430b37d4f19ec559fea7c33edd06c8f971a7a
                                                  //| 1e0
   merkle1 == merkle2                             //> res2: Boolean = true
   
   val hashStr1 = merkle1.hash.map("%02x".format(_)).mkString
                                                  //> hashStr1  : String = a9c7a47752cb1abf8db99d67430b37d4f19ec559fea7c33edd06c8f
                                                  //| 971a7a1e0
   val hashStr2 = merkle1.hash.map("%02x".format(_)).mkString
                                                  //> hashStr2  : String = a9c7a47752cb1abf8db99d67430b37d4f19ec559fea7c33edd06c8f
                                                  //| 971a7a1e0
   hashStr1 == hashStr2                           //> res3: Boolean = true
   
   
   
   val leftChild = Leaf(1)(hash)                  //> leftChild  : africa.coin.crypto.container.MerkleTree.Leaf[Int,africa.coin.cr
                                                  //| ypto.hash.SHA256Hash.type] = Leaf(1)
   val rightChild = Leaf(2)(hash)                 //> rightChild  : africa.coin.crypto.container.MerkleTree.Leaf[Int,africa.coin.c
                                                  //| rypto.hash.SHA256Hash.type] = Leaf(2)
    leftChild.hash.size*8                         //> res4: Int = 256
    Node(leftChild,rightChild)(hash)              //> res5: africa.coin.crypto.container.MerkleTree.Node[Int,africa.coin.crypto.ha
                                                  //| sh.SHA256Hash.type] = Node(Leaf(1),Leaf(2))
                                                  
}