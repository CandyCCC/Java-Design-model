package prototype.greatestage;

import java.io.Serializable;

public class GoldRingedStaff implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private float height = 100;
	private float diameter = 10;//Ö±¾¶
	
	public void grow(){
		this.diameter*=2;
		this.height*=2;
	}
	
	public void shrink(){
		this.diameter/=2;
		this.height/=2;
	}
	
}
