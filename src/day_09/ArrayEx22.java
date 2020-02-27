/*
 * # 배열 컨트롤러[1단계] : 최종
 * 1) 추가
 * 2) 삭제
 * 3) 삽입
 */

package day_09;

import java.util.Scanner;

public class ArrayEx22 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] arr = {10,20,0,0,0};
		int count = 2;
		
		while(true)
		{
			for(int i=0;i<count;i++)
			{
				System.out.print(arr[i]+" ");
			}
			System.out.println();
			
			System.out.println("[1] 추가");
			System.out.println("[2] 삭제");
			System.out.println("[3] 삽입");
			System.out.println("[4] 종료");
			
			System.out.println("메뉴 선택: ");
			int select = sc.nextInt();
			
			if(select == 1)
			{
				
				if(count == 5)
				{
					System.out.println("더 이상 추가 할 수 없습니다.");
					continue;
				}
				
				System.out.println("추가할 값 입력:");
				int data = sc.nextInt();
				System.out.println();
				
				arr[count] = data;
				count++;
			}
			else if(select == 2)
			{
				System.out.println("삭제할 값 입력");
				int data = sc.nextInt();
				
				int delIdx = -1;
				for(int i=0;i<count;i++)
				{
					if(data==arr[i])
					{
						delIdx = i;
					}
				}
				
				if(delIdx == -1)
				{
					System.out.println("삭제할 값이 존재히지 않습니다.");
					continue;
				}
				else
				{
					for(int i=0; i<count-1;i++)
					{
						arr[i] = arr[i+1];
					}
					count--;
				}
				
			}
			else if(select == 3)
			{
				if(count == 5)
				{
					System.out.println("값을 넣을 수 없습니다.");
					continue;
				}
				
				System.out.println("삽입할 위치 입력:");
				int idx = sc.nextInt();
				
				if(idx<0 || idx>count)
				{
					System.out.println("값을 넣을 수 없습니다.");
					continue;
				}
				
				System.out.println("삽입할 값 입력:");
				int data = sc.nextInt();
				
				for(int i=count; i<idx; i--)
				{
					arr[i] = arr[i-1];
				}
				arr[idx] = data;
				count++;
			}
			else if(select == 4)
			{
				System.out.println("프로그램 종료");
				break;
			}
		}
	}
}
