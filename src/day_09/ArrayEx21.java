/*
 * # �迭 ��Ʈ�ѷ�[1�ܰ�] : ����
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
			
			System.out.println("[3]����");
			
			System.out.print("�޴� ����:");
			int select = sc.nextInt();
			
			if(select == 3)
			{
				if(count == 5)
				{
					System.out.println("���̻� ������ �� �����ϴ�.");
					continue;
				}
				
				System.out.println("������ ��ġ �Է�:");
				int idx = sc.nextInt();
				
				if(count <idx || idx<0)
				{
					System.out.println("�ش� ��ġ���� ������ �� �����ϴ�.");
					continue;
				}
				
				System.out.println("������ �� �Է�:");
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
