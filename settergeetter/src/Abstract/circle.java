package Abstract;

public class circle extends shape{

	@Override
	void draw() {
		// TODO Auto-generated method stub
		System.out.println("circle");
	}
public static void main(String[] args) {
	/*shape s=new rectangle();*/
	shape s=new circle();
	s.draw();
}
}
