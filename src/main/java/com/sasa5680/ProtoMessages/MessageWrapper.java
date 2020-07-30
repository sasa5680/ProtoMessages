package com.sasa5680.ProtoMessages;
import com.google.protobuf.Any;
import com.sasa5680.ProtoMessages.GeneralMSG.General;
import com.sasa5680.ProtoMessages.GeneralMSG.RoutingInfo;


public class MessageWrapper {
	
	
	
	public static GeneralMSG.General Wrap_NonRouting(com.google.protobuf.Message inner) {
		
		Any any = Any.pack(inner);
		General msg = General.newBuilder()
							 .addInnerMSG(any)
							 .setMessageType(inner.getClass().getSimpleName())
							 .setRouting(false)
							 .build();
		return msg;
	}
	
	public static General Wrap_Routing(com.google.protobuf.Message inner, RoutingInfo RI) {
		
		Any any = Any.pack(inner);
		
		General msg = General.newBuilder()
				 			 .addInnerMSG(any)
				 			 .setMessageType(inner.getClass().getSimpleName())
				 			 .addRoutingInfo(RI)
				 			 .setRouting(true)
				 			 .build();
		
		return msg;
	}
}
