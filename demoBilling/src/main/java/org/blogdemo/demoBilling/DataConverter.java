package org.blogdemo.demoBilling;

import java.util.ArrayList;

public class DataConverter {
	
	public ArrayList<Call> processData(ArrayList<String> inputs){
		ArrayList<Call> calls = new ArrayList<Call>();
		
		for(String input:inputs){
			Call call = new Call();
			String[] params = input.split("\t");
			call.setSender(params[0]);
			call.setReceiver(params[1]);
			call.setMins(Integer.valueOf(params[2]));
			calls.add(call);
			//System.out.println(call);
		}
		
		return calls;
	}
	
	
	public Call calculateChargeInSameArea(Call call)throws Exception{
		call.setCharge(0.02*call.getMins());
		
		if(call.getSender().endsWith(call.getReceiver())){
			throw new Exception("Same number calling!");
		}
		
		return call;
	}

	public Call calculateChargeNormal(Call call){
		call.setCharge(0.15*call.getMins());
		return call;
	}
	
	public Call sumup(double oldCharge, Call call){
		call.setCharge(oldCharge+call.getCharge());
		return call;
	}
}
