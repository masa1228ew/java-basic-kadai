package kadai_015;

public class Car_Chapter15 {

		private int gear = 1;
		private int beforeGear = 1;
		private int speed = 10;
		
	public Car_Chapter15(int gear,int speed) {
		this.gear = gear;
		this.speed = speed;
	}
		public void gearChange(int afterGear) {
			this.beforeGear=this.gear;
			this.gear = afterGear;
			
			this.speed=
			switch(afterGear) {
			case 1 -> 10;
			case 2 ->  20;
			case 3 -> 30;
			case 4 -> 40;
			case 5 -> 50;
			default -> 10;
			};		
			
	    }
		 public void run() {
		    	System.out.println("ギア"+this.beforeGear+("から")+this.gear+"に切り替わりました");
		    	System.out.println("速度は時速"+this.speed+"kmです");
		    }
	}

