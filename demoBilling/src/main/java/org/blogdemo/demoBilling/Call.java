package org.blogdemo.demoBilling;

public class Call {

	private String sender="";
	private String receiver="";
	private int mins = 0;
	private double charge = 0;
	
	public String getSender() {
		return sender;
	}
	public void setSender(String sender) {
		this.sender = sender;
	}
	public String getReceiver() {
		return receiver;
	}
	public void setReceiver(String receiver) {
		this.receiver = receiver;
	}
	public int getMins() {
		return mins;
	}
	public void setMins(int mins) {
		this.mins = mins;
	}
	public double getCharge() {
		return charge;
	}
	public void setCharge(double charge) {
		this.charge = charge;
	}
	
	
	public boolean sameAreaCode(){
		String senderAreaCode= sender.substring(0, 3);
		String receiverAreaCode= receiver.substring(0, 3);
		
		if(senderAreaCode != null && senderAreaCode.equals(receiverAreaCode) )
			return true;
		return false;
	}
	
	
	public String toString(){
		
		return "Call sender:["+sender+"] receiver:["+receiver+"] call last:["+mins+"] mins charge:["+charge+"]";
	} 
}
