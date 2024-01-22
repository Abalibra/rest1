package RestFiles;

public class s {

	int x=4; 
	
	public static s given (s obj) {
		obj.x++;
		return obj;
	}
	
	public static s when (s obj) {
		obj.x++;
		return obj;
	}
	
	public static s then (s obj) {
		obj.x++;
		return obj;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		s obj = new s(); 
		given(obj).
		when(obj). 
		then(obj) ; 
		
		
		System.out.print(obj.x);

	}

}
