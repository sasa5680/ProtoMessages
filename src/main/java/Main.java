
import com.google.protobuf.InvalidProtocolBufferException;
import com.sasa5680.ProtoMessages.GeneralMSG.General;
import com.sasa5680.ProtoMessages.GeneralMSG.RoutingInfo;
import com.sasa5680.ProtoMessages.MessageWrapper;
import com.sasa5680.ProtoMessages.C2S.C2SLoginRequest;
import com.sasa5680.ProtoMessages.C2S.C2SLoginRequest.C2S_LoginRequest;

public class Main {
	

		
	public static void main(String args[])  {
		
		C2SLoginRequest.C2S_LoginRequest  msg = C2S_LoginRequest.newBuilder()
														   		.setID("111")
														   		.setType("111")
														   		.build();
		
		RoutingInfo r = RoutingInfo.newBuilder().setDestinationId("asdd").setDestinationType("111").build();
		General g = General.newBuilder().addRoutingInfo(r).build();
		
		RoutingInfo r1 = g.getRoutingInfo(0);
		
		System.out.println(r1.getDestinationId());
		
		
		
		
	}

}
