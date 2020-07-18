# ProtoMessages
JAVA protocol buffer Messages

GroupID     - com.sasa5680 

arifactID   - ProtoMessages

******************** How to Use ********************

every message must be wrapped with "General" message
(pack message with "any" object)

example(Packing)   : 
  
  test t1 = test.newBuilder().setUsername("111").setPassword("111").build();
  Any any = Any.pack(t1);
  GeneralMSG.General msg = GeneralMSG.General.newBuilder().setMessageType("test").addInnerMSG(any).build();

example(UnPacking) :

  test t = msg.getInnerMSG(0).unpack(test.class);
  (!!! instance of "getInnerMSG" method is always '0' so be aware.)
  
-------------------------------------------------------------------------------
must include Type of the Message in "General"
(Type of the message is "Class Name" of the Message)


there are 4 types of the messages. distinguish them with prefixes.
(when add Message , type "option java_package = ..." keyword to generate stubs in right Package.)

Server to Client : S2C 
Client to Server : C2S
Android to Robot : A2R
Robot to Android : R2A

