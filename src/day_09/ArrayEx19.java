/*
 * # 배열 컨트롤러[1단계] : 추가
 */

package day_09;

import java.util.Scanner;

public class ArrayEx19 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] arr = {10,20,0,0,0};
		int count = 2;
		
		while(true)
		{
			for(int i=0; i<count; i++)
			{
				System.out.print(arr[i] + " ");
			}
			System.out.println("");
			
			System.out.println("[1] 추가");
			
			System.out.println("메뉴 선택: ");
			int select = sc.nextInt();
			
			if(select == 1)
			{
				if(count == 5)
				{
					System.out.println("더이상 추가할 수 없습니다.");
					continue;
				}
				
				System.out.println("추가할 값 입력: ");
				int data = sc.nextInt();
				
				arr[count] = data;
				
				count++;
			}
		}
	}
}
