
import java.text.SimpleDateFormat;
import java.util.Calendar;

import com.google.protobuf.InvalidProtocolBufferException;
import com.sasa5680.ProtoMessages.GeneralMSG.General;
import com.sasa5680.ProtoMessages.GeneralMSG.RoutingInfo;
import com.sasa5680.ProtoMessages.MessageWrapper;
import com.sasa5680.ProtoMessages.A2R.A2RDroneControl.A2R_DroneControl;
import com.sasa5680.ProtoMessages.C2S.C2SLoginRequest;
import com.sasa5680.ProtoMessages.C2S.C2SLoginRequest.C2S_LoginRequest;

public class Main {
	

	
	public static void main(String args[])  {
		
		
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String Time = sdf.format(cal.getTime());
		System.out.println(Time);
		
		
			
	}
	
	


}
