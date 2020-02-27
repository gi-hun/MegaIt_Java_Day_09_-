/*
 * # 배열 컨트롤러[1단계] : 삽입
 */

package day_09;

import java.util.Scanner;

public class ArrayEx21 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] arr = {10,20,0,0,0};
		int count = 2;
		
		while(true)
		{
			for(int i=0; i<count; i++)
			{
				System.out.println(arr[i] + " ");
			}
			System.out.println();
			
			System.out.println("[3]삽입");
			
			System.out.print("메뉴 선택:");
			int select = sc.nextInt();
			
			if(select == 3)
			{
				if(count == 5)
				{
					System.out.println("더이상 삽입할 수 없습니다.");
					continue;
				}
				
				System.out.println("삽입할 위치 입력:");
				int idx = sc.nextInt();
				
				if(count <idx || idx<0)
				{
					System.out.println("해당 위치에는 삽입할 수 없습니다.");
					continue;
				}
				
				System.out.println("삽입할 값 입력:");
				int data = sc.nextInt();
				
				for(int i=count; i>idx; i--)
				{
					arr[i] = arr[i-1];
				}
				
				arr[idx] = data;
				count++;
			}
		}
	}
}
