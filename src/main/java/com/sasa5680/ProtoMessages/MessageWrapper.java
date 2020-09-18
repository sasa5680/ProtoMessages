package com.sasa5680.ProtoMessages;
import com.google.protobuf.Any;
import com.sasa5680.ProtoMessages.GeneralMSG.General;
import com.sasa5680.ProtoMessages.GeneralMSG.RoutingInfo;


public class MessageWrapper {
	
	
	
	public static GeneralMSG.General Wrap_NonRouting(com.google.protobuf.Message inner, boolean storeoption) {
		
		Any any = Any.pack(inner);
		General msg = General.newBuilder()
							 .addInnerMSG(any)
							 .setMessageType(inner.getClass().getSimpleName())
							 .setRouting(false)
							 .setStoreOption(storeoption)
							 .build();
		return msg;
	}
	
	public static General Wrap_Routing(com.google.protobuf.Message inner, RoutingInfo RI, boolean storeoption) {
		
		Any any = Any.pack(inner);
		
		General msg = General.newBuilder()
				 			 .addInnerMSG(any)
				 			 .setMessageType(inner.getClass().getSimpleName())
				 			 .addRoutingInfo(RI)
				 			 .setRouting(true)
				 			 .setStoreOption(storeoption)
				 			 .build();
		
		return msg;
	}
}
