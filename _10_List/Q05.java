package _10_List;

import java.util.ArrayList;
import java.util.Scanner;

public class Q05 {
    public static void main(String[] args) {
    	
        // Kullanıcıdan alacagınız 6 elemanları bir dizinin
        // sadece tek elemanlarını ayrı diziye bir metodda atayarak
        // main de yazdırınız.


    	Scanner scan = new Scanner(System.in);
    	scan.close();
    	
    	int arr[]=new int[6];
    	
		for (int i = 0; i < 6; i++) {
			
    		System.out.print("Sayi Giriniz : ");
    		
    		arr[i]=scan.nextInt();
		}
    	
    	System.out.println(tekEleman(arr));
    	
    	
    	
    }

	private static ArrayList<Integer> tekEleman(int[] arr) {
		
		ArrayList<Integer> list=new ArrayList<>(); // Bos list icine tek elemanlar atanacak
		
		for (int i = 0; i < arr.length; i++) {
			
			if (arr[i] % 2 == 1) {
				
				list.add(arr[i]);
				
			}
		}
		
		return list;
		
	}


}
