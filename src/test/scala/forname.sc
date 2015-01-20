object forname {
  class Foo {
    def hello(name: String): String = "Hello there, %s".format(name)
  }

val server = management.ManagementFactory.getPlatformMBeanServer()
                                                  //> server  : javax.management.MBeanServer = com.sun.jmx.mbeanserver.JmxMBeanSer
                                                  //| ver@40dcdc8b
   val clazz = Class.forName("com.sun.management.HotSpotDiagnosticMXBean")//.newInstance.asInstanceOf[{ def hello(name: String): String }]
                                                  //> clazz  : Class[_] = interface com.sun.management.HotSpotDiagnosticMXBean
   val hotspotMBean = management.ManagementFactory.newPlatformMXBeanProxy(server,"com.sun.management:type=HotSpotDiagnostic",clazz);
                                                  //> hotspotMBean  : Any = MXBeanProxy(com.sun.jmx.mbeanserver.JmxMBeanServer@40d
                                                  //| cdc8b[com.sun.management:type=HotSpotDiagnostic])

   val that = Class.forName("java.lang.String")   //> that  : Class[_] = class java.lang.String
  val method = hotspotMBean.getClass.getMethod("hash", that)
                                                  //> java.lang.NoSuchMethodException: com.sun.proxy.$Proxy0.hash(java.lang.String
                                                  //| )
                                                  //| 	at java.lang.Class.getMethod(Class.java:1665)
                                                  //| 	at forname$$anonfun$main$1.apply$mcV$sp(forname.scala:11)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$$anonfun$$exe
                                                  //| cute$1.apply$mcV$sp(WorksheetSupport.scala:76)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$.redirected(W
                                                  //| orksheetSupport.scala:65)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$.$execute(Wor
                                                  //| ksheetSupport.scala:75)
                                                  //| 	at forname$.main(forname.scala:4)
                                                  //| 	at forname.main(forname.scala)
}