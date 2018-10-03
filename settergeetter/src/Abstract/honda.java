package Abstract;

public class honda extends bike{

	@Override
	void run() {
		// TODO Auto-generated method stub
	System.out.println("running");
		
	}
	
	public static void main(String[] args) {
		bike h=new honda();
		h.run();
		
	}
}