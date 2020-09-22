
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import com.google.protobuf.ByteString;
import com.google.protobuf.InvalidProtocolBufferException;
import com.sasa5680.SerialClassConvertor;
import com.sasa5680.CommonIndex.Drone.Drone_Info;
import com.sasa5680.CommonIndex.SerialClass.AndroidLoading.AndroidLoading;
import com.sasa5680.ProtoMessages.GeneralMSG.General;
import com.sasa5680.ProtoMessages.GeneralMSG.RoutingInfo;
import com.sasa5680.ProtoMessages.MessageWrapper;
import com.sasa5680.ProtoMessages.A2R.A2RDroneControl.A2R_DroneControl;
import com.sasa5680.ProtoMessages.C2S.C2SLoginRequest;
import com.sasa5680.ProtoMessages.C2S.C2SLoginRequest.C2S_LoginRequest;
import com.sasa5680.ProtoMessages.S2C.S2CSerialEx.S2C_ex;

public class Main {
	

	
	public static void main(String args[])  {
		
		
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String Time = sdf.format(cal.getTime());
		System.out.println(Time);
		
		Drone_Info d1 = new Drone_Info();
		d1.ID = "1001";
		
		Drone_Info d2 = new Drone_Info();
		Drone_Info d3 = new Drone_Info();
		
		AndroidLoading al = new AndroidLoading();
		
		al.list.add(d1);
		al.list.add(d2);
		al.list.add(d3);
		try {
			byte[] array = SerialClassConvertor.ClassToByte(al);
			
			ByteString b = ByteString.copyFrom(array);
			
			S2C_ex ex  = S2C_ex.newBuilder().setSerialClass(b).build();
			
			System.out.println(ex.toByteArray().length);
			ByteString c= ex.getSerialClass();
			
			byte[] d = c.toByteArray();
			
			System.out.println(d.length);

			
			AndroidLoading al2 =  (AndroidLoading) SerialClassConvertor.ByteToClass(d);
			
			System.out.println(al.list.get(0).ID);

			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		

	}
	
	


}
