/*
 * # �迭 ��Ʈ�ѷ�[1�ܰ�] : ����
 * 1) �߰�
 * 2) ����
 * 3) ����
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
			
			System.out.println("[1] �߰�");
			System.out.println("[2] ����");
			System.out.println("[3] ����");
			System.out.println("[4] ����");
			
			System.out.println("�޴� ����: ");
			int select = sc.nextInt();
			
			if(select == 1)
			{
				
				if(count == 5)
				{
					System.out.println("�� �̻� �߰� �� �� �����ϴ�.");
					continue;
				}
				
				System.out.println("�߰��� �� �Է�:");
				int data = sc.nextInt();
				System.out.println();
				
				arr[count] = data;
				count++;
			}
			else if(select == 2)
			{
				System.out.println("������ �� �Է�");
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
					System.out.println("������ ���� �������� �ʽ��ϴ�.");
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
					System.out.println("���� ���� �� �����ϴ�.");
					continue;
				}
				
				System.out.println("������ ��ġ �Է�:");
				int idx = sc.nextInt();
				
				if(idx<0 || idx>count)
				{
					System.out.println("���� ���� �� �����ϴ�.");
					continue;
				}
				
				System.out.println("������ �� �Է�:");
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
				System.out.println("���α׷� ����");
				break;
			}
		}
	}
}
