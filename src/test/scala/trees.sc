import africa.coin.crypto.hash.{RIPEMD160Hash,SHA1Hash,SHA256Hash}
import africa.coin.crypto.container.MerkleTree
import africa.coin.crypto.container.MerkleTree.{Node,Leaf,EmptyLeaf}

object trees {
   val hash = RIPEMD160Hash                       //> hash  : africa.coin.crypto.hash.RIPEMD160Hash.type = africa.coin.crypto.hash
                                                  //| .RIPEMD160Hash$@3770bf4d
    val data1 = List(1, 2, 3)                     //> data1  : List[Int] = List(1, 2, 3)
    val merkle1 = MerkleTree(data1)(hash)         //> merkle1  : africa.coin.crypto.container.MerkleTree.Tree[Int,africa.coin.cryp
                                                  //| to.hash.RIPEMD160Hash.type] = Node(Node(Leaf(1),Leaf(2)),Node(Leaf(3),EmptyL
                                                  //| eaf(africa.coin.crypto.hash.RIPEMD160Hash$@3770bf4d)))
    merkle1.hash.map("%02x".format(_)).mkString   //> res0: String = b4a017211e8bcc31beeb81e5355418a5c6c65eb5
                                                  
                                                  
   val merkle2 = Node(
   	 Node(Leaf(1)(hash),     Leaf(2)(hash))(hash)
   	,Node(Leaf(3)(hash),EmptyLeaf( )(hash))(hash)
   	)(hash)                                   //> merkle2  : africa.coin.crypto.container.MerkleTree.Node[Int,africa.coin.cryp
                                                  //| to.hash.RIPEMD160Hash.type] = Node(Node(Leaf(1),Leaf(2)),Node(Leaf(3),EmptyL
                                                  //| eaf(africa.coin.crypto.hash.RIPEMD160Hash$@3770bf4d)))
   val merkle3 = Node(Leaf(1)(hash),Leaf(2)(hash))(hash)
                                                  //> merkle3  : africa.coin.crypto.container.MerkleTree.Node[Int,africa.coin.cryp
                                                  //| to.hash.RIPEMD160Hash.type] = Node(Leaf(1),Leaf(2))
   merkle2.hash.map("%02x".format(_)).mkString    //> res1: String = b4a017211e8bcc31beeb81e5355418a5c6c65eb5
   merkle1 == merkle2                             //> res2: Boolean = true
   
   val hashStr1 = merkle1.hash.map("%02x".format(_)).mkString
                                                  //> hashStr1  : String = b4a017211e8bcc31beeb81e5355418a5c6c65eb5
   val hashStr2 = merkle1.hash.map("%02x".format(_)).mkString
                                                  //> hashStr2  : String = b4a017211e8bcc31beeb81e5355418a5c6c65eb5
   hashStr1 == hashStr2                           //> res3: Boolean = true
   
   
   val leftChild = Leaf(1)(hash)                  //> leftChild  : africa.coin.crypto.container.MerkleTree.Leaf[Int,africa.coin.cr
                                                  //| ypto.hash.RIPEMD160Hash.type] = Leaf(1)
   val rightChild = Leaf(2)(hash)                 //> rightChild  : africa.coin.crypto.container.MerkleTree.Leaf[Int,africa.coin.c
                                                  //| rypto.hash.RIPEMD160Hash.type] = Leaf(2)
    leftChild.hash.size*8                         //> res4: Int = 160
    Node(leftChild,rightChild)(hash)              //> res5: africa.coin.crypto.container.MerkleTree.Node[Int,africa.coin.crypto.ha
                                                  //| sh.RIPEMD160Hash.type] = Node(Leaf(1),Leaf(2))
                                                  
}