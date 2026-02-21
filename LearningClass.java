class LearningClass{
	String brand;
	String color;
	int speed;
	
	public void printDetails() {
		System.out.println(brand+" is a driving at "+speed);
	}
	
    public static void main(String[] args){
    	LearningClass ob = new LearningClass();
    	ob.brand = "Suzuki";
    	ob.color = "Red";
    	ob.speed = 150;
    	
        ob.printDetails();
    }
}