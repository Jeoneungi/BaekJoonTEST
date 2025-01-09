import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        
        String input =  sc.nextLine();
        String[] cro = {"c=","c-","dz=","d-","lj","nj","s=","z="};
        
        for(String c : cro){
            input = input.replaceAll(c, "a");
        }
        
        System.out.println(input.length());
        
        sc.close();
        
	}

}
