import africa.coin.crypto.hash.{RIPEMD160Hash,SHA1Hash,SHA256Hash}
import africa.coin.crypto.container.MerkleTree
import africa.coin.crypto.container.{Node,Leaf,EmptyLeaf,Tree}

object trees {
   val hash = SHA256Hash                          //> hash  : africa.coin.crypto.hash.SHA256Hash.type = africa.coin.crypto.hash.SH
                                                  //| A256Hash$@48ca42a9
    val data1 = List(1, 2, 3)                     //> data1  : List[Int] = List(1, 2, 3)
    val merkle1 = MerkleTree(data1)(hash)         //> merkle1  : africa.coin.crypto.container.Tree[Int,africa.coin.crypto.hash.SHA
                                                  //| 256Hash.type] = Node(Node(Leaf(1),Leaf(2)),Node(Leaf(3),EmptyLeaf(africa.coi
                                                  //| n.crypto.hash.SHA256Hash$@48ca42a9)))
    merkle1.hash.map("%02x".format(_)).mkString   //> res0: String = a9c7a47752cb1abf8db99d67430b37d4f19ec559fea7c33edd06c8f971a7a
                                                  //| 1e0
                                                  
                                                  
   val merkle2 = new Node(
   	 Node(Leaf(1)(hash),     Leaf(2)(hash))(hash)
   	,Node(Leaf(3)(hash),EmptyLeaf( )(hash))(hash)
   	)(hash)                                   //> merkle2  : africa.coin.crypto.container.Node[Int,africa.coin.crypto.hash.SHA
                                                  //| 256Hash.type] = Node(Node(Leaf(1),Leaf(2)),Node(Leaf(3),EmptyLeaf(africa.coi
                                                  //| n.crypto.hash.SHA256Hash$@48ca42a9)))
   val merkle3 = Node(Leaf(1)(hash),Leaf(2)(hash))(hash)
                                                  //> merkle3  : africa.coin.crypto.container.Node[Int,africa.coin.crypto.hash.SHA
                                                  //| 256Hash.type] = Node(Leaf(1),Leaf(2))
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
   
   
   val leftChild = Leaf(1)(hash)                  //> leftChild  : africa.coin.crypto.container.Leaf[Int,africa.coin.crypto.hash.S
                                                  //| HA256Hash.type] = Leaf(1)
   val rightChild = Leaf(2)(hash)                 //> rightChild  : africa.coin.crypto.container.Leaf[Int,africa.coin.crypto.hash.
                                                  //| SHA256Hash.type] = Leaf(2)
    leftChild.hash.size*8                         //> res4: Int = 256
    Node(leftChild,rightChild)(hash)              //> res5: africa.coin.crypto.container.Node[Int,africa.coin.crypto.hash.SHA256Ha
                                                  //| sh.type] = Node(Leaf(1),Leaf(2))
    val merkle4 = MerkleTree(List())(hash)        //> merkle4  : africa.coin.crypto.container.Tree[Nothing,africa.coin.crypto.has
                                                  //| h.SHA256Hash.type] = EmptyLeaf(africa.coin.crypto.hash.SHA256Hash$@48ca42a9
                                                  //| )
    val trees = leftChild :: rightChild :: leftChild :: rightChild :: Nil
                                                  //> trees  : List[africa.coin.crypto.container.Leaf[Int,africa.coin.crypto.hash
                                                  //| .SHA256Hash.type]] = List(Leaf(1), Leaf(2), Leaf(1), Leaf(2))
   val t = trees.grouped(2)                       //> t  : Iterator[List[africa.coin.crypto.container.Leaf[Int,africa.coin.crypto
                                                  //| .hash.SHA256Hash.type]]] = non-empty iterator
	 t.mkString                               //> res6: String = List(Leaf(1), Leaf(2))List(Leaf(1), Leaf(2))
	 
	 val leftChild1 +: rightChild2 +: _ = trees
                                                  //> leftChild1  : africa.coin.crypto.container.Leaf[Int,africa.coin.crypto.hash
                                                  //| .SHA256Hash.type] = Leaf(1)
                                                  //| rightChild2  : africa.coin.crypto.container.Leaf[Int,africa.coin.crypto.has
                                                  //| h.SHA256Hash.type] = Leaf(2)
	 t.take(1)                                //> res7: Iterator[List[africa.coin.crypto.container.Leaf[Int,africa.coin.crypt
                                                  //| o.hash.SHA256Hash.type]]] = empty iterator
	 
	 Node(leftChild1,rightChild2)(hash)       //> res8: africa.coin.crypto.container.Node[Int,africa.coin.crypto.hash.SHA256H
                                                  //| ash.type] = Node(Leaf(1),Leaf(2))

}