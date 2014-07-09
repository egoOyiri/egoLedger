egoLedger
=========

This is an attempt to duplicate and understand the Bictoin Protocol. The ultimate goal is to provide a library managing the Bitcoin BlockChain

`sbt test`

`sbt eclipse`

Hash Testing Site
http://gobittest.appspot.com/Address

Hash Libraries:
- java.security.MessageDigest (SHA-1,HA-256)
- org.bouncycastle.jce.provider.JDKMessageDigest (RIPEMD160)

Container Code Source: (initially derived from)
- Merkle Tree https://github.com/adelbertc/scala-playground.git

Signature Source Code:
- ECDSA https://github.com/baturinsky/Scala-Ecc

Reference:
https://en.bitcoin.it/wiki/Protocol_Specification
