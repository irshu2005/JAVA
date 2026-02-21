class Three{
	String brand;
	String color;
	int speed;
	
	public void printDetails() {
		System.out.println(brand+" is a driving at "+speed);
	}
	
	//Getters & Setters
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public int getSpeed() {
		return speed;
	}
	
	//Record
	public record User(int id, String name, String email) {}
	
    public static void main(String[] args){
    	Three ob = new Three();
    	ob.brand = "Suzuki";
    	ob.color = "Red";
    	ob.speed = 150;
    	
        ob.printDetails();
         
        System.out.print(ob.getSpeed());
        
        
    }
}