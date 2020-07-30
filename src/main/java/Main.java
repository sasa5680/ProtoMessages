
import com.google.protobuf.InvalidProtocolBufferException;
import com.sasa5680.ProtoMessages.GeneralMSG.General;
import com.sasa5680.ProtoMessages.GeneralMSG.RoutingInfo;
import com.sasa5680.ProtoMessages.MessageWrapper;
import com.sasa5680.ProtoMessages.A2R.A2RDroneControl.A2R_DroneControl;
import com.sasa5680.ProtoMessages.C2S.C2SLoginRequest;
import com.sasa5680.ProtoMessages.C2S.C2SLoginRequest.C2S_LoginRequest;

public class Main {
	

		
	public static void main(String args[])  {
		
		RoutingInfo info = RoutingInfo.newBuilder().setDestinationId("111").build();
		A2R_DroneControl msg = A2R_DroneControl.newBuilder().addRoutingInfo(info).build();
		
		
		
		General g = MessageWrapper.Wrap_Routing(msg, info);
		
		A2R_DroneControl msg2;
		try {
			msg2 = g.getInnerMSG(0).unpack(A2R_DroneControl.class);
			
			System.out.println(g.getMessageType());
			System.out.println(msg2.getRoutingInfo(0).getDestinationId());
			
			System.out.println(msg2.getRoutingInfo(0).getDestinationType());
			
		} catch (InvalidProtocolBufferException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
	}

}
