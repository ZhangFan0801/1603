//��1605-3  20163429  ������
package Ktcs1114;
import java.io.IOException;
import java.util.Scanner;
class Scan{
	public static Scanner s = new Scanner(System.in);
}
abstract class Subway 
{
	private int XianluNumber;//��·��
	protected static String ZhanName1;//��·����ʼվ��
	protected static String ZhanName2;//��·���յ�վ��
	private String Massage ;//���˳�վ����Ϣ
	static int i;//��ʼվ���յ�վ�����
	static int j;
	public void show()
	{
		System.out.println(XianluNumber);
		System.out.println(Massage);
	}
	public void Chaxun()
	{
		Scanner in=new Scanner(System.in);
		System.out.println("��������ʼվ����");
		i=in.nextInt();
		System.out.println("�������յ�վ����");
		j=in.nextInt();
		System.out.println("������վ�ĸ�����"+(j-i)+"վ");
		System.out.println("������·����");
		for(int n=i;n>j;n++)
		{
			if(n==15)
			{
				System.out.println(n+"����3����");
			}
			else
			{
				System.out.println(n);
			}
		}
	}
	public void Goupiao()
	{
	  	String ZhanName1 = null;
    	String ZhanName2 = null;
    	int ticketnum = 0;
    	System.out.println("��ӭ����ʯ��ׯ����");
    	System.out.println("***************************************");
    	System.out.print("������ʼվ:");
    	ZhanName1 = Scan.s.next();
    	System.out.print("�����յ�վ:");
    	ZhanName2 = Scan.s.next();
    	System.out.println("���빺Ʊ����:");
    	ticketnum = Scan.s.nextInt();
	    int sum = 0;
	    if((i-j)%3==0)sum = (i-j)/3;
	    else sum = (i-j)/3+1;
	    System.out.println("��Ʊ��:"+sum);
	    System.out.println("�ܼ�:"+(int)(sum*ticketnum));
	}
}
class FirstLineSubway extends Subway//FirstLineSubway��̳�Subwayʵ�ֲ�ʵ������Subway����ع���
{
	public String[] a;

	public void zhan()
	{
		String a[]= {"���Ӵ��","�ϴ�","ʯ��ׯ��վ","���㳡","����","�׷�","������",
				"̸��","����","������","����Ժ","�����̳�","ƽ�����","��Ź㳡","�°ٹ㳡","��ʿ��԰","��ƽҽԺ","������","ʱ���","����"};
		/*1-20վ�ֱ�Ϊ�����Ӵ�����ϴ塢ʯ��ׯ��վ�����㳡�����塢�׷𡢳����š�
		̸�̡����Ρ�������������Ժ�������̳ǡ�ƽ����֡���Ź㳡���°ٹ㳡����ʿ��԰����ƽҽԺ�������š�ʱ��֡�����*/	
		return;
	}
}
class ThirdLineSubway extends Subway//ThirdLineSubway��̳�Subwayʵ�ֲ�ʵ������Subway����ع���
{
	public String[] b;

	public void zhan()
	{
		String b[]= {"�ж���","�°ٹ㳡","����","������","������","ʯ��ׯվ"};/*1-6վ�ֱ�Ϊ���ж��С��°ٹ㳡����������š������̡�ʯ��ׯվ��*/	
		return;
	}
}
public class SubwayManager extends Subway
{
	 public static void main(String[] grges) throws IOException
	    {
		 	String a[]= {"���Ӵ��","�ϴ�","ʯ��ׯ��վ","���㳡","����","�׷�","������",
					"̸��","����","������","����Ժ","�����̳�","ƽ�����","��Ź㳡","�°ٹ㳡","��ʿ��԰","��ƽҽԺ","������","ʱ���","����"};
		 	String b[]= {"�ж���","�°ٹ㳡","����","������","������","ʯ��ׯվ"};/*1-6վ�ֱ�Ϊ���ж��С��°ٹ㳡����������š������̡�ʯ��ׯվ��*/
	    	System.out.println("****************************************\n");
	    	System.out.println("          ��ӭ����ʯ��ׯ����\n" );
	    	System.out.println("****************************************\n");
	    	System.out.println("          1����ʾ������·��Ϣ\n");
	    	System.out.println("          2����Ʊ\n");
	    	System.out.println("****************************************\n");
	    	int x;
	    	Scanner in1=new Scanner(System.in);
	    	x=in1.nextInt();
	    	FirstLineSubway A=new FirstLineSubway();
	    	A.zhan();
	    	ThirdLineSubway B=new ThirdLineSubway();
	    	B.zhan();
	    	if(x==1)//��ʾ������·��Ϣ
	    	{
	    		System.out.println("****************************************\n");
		    	System.out.println("          ʯ��ׯ������·ͼ\n" );
		    	System.out.println("****************************************\n");
		    	System.out.println("�����������ѯ����·ͼ��\n0��ȫ��      1��1����     3��3����");
		    	int y;
		    	y=in1.nextInt();
		    	if(y==0)
		    	{System.out.println("����1���ߣ�");
		    	System.out.println("վ��1�����Ӵ��       վ��2���ϴ�       վ��3��ʯ��ׯ��վ       վ��4�����㳡        վ��5������\n"
		    				+ "վ��6:�׷�   վ��7��������  վ��8:̸��  վ��9������  վ��10��������\n"
		    				+ "վ��11:����Ժ   վ��12�������̳�  վ��13:ƽ�����  վ��14����Ź㳡  վ��15���°ٹ㳡\n"
		    				+ "վ��16:��ʿ��԰   վ��17����ƽҽԺ  վ��18:������  վ��19��ʱ���  վ��20������\n");
		    	System.out.println("����3���ߣ�");
		    	System.out.println("վ��21���ж���       վ��22���°ٹ㳡       վ��23������       վ��24��������       վ��25��������  վ��26:ʯ��ׯվ\n");
		    	}
		    	if(y==1)
		    	{System.out.println("����1���ߣ�");
		    	System.out.println("վ��1�����Ӵ��       վ��2���ϴ�       վ��3��ʯ��ׯ��վ       վ��4�����㳡        վ��5������\n"
		    				+ "վ��6:�׷�   վ��7��������  վ��8:̸��  վ��9������  վ��10��������\n"
		    				+ "վ��11:����Ժ   վ��12�������̳�  վ��13:ƽ�����  վ��14����Ź㳡  վ��15���°ٹ㳡\n"
		    				+ "վ��16:��ʿ��԰   վ��17����ƽҽԺ  վ��18:������  վ��19��ʱ���  վ��20������\n");
		    	}	
		    	if(y==3)
		    	{
		    		System.out.println("����3���ߣ�");
			    	System.out.println("վ��21���ж���       վ��22���°ٹ㳡       վ��23������       վ��24��������       վ��25��������  վ��26:ʯ��ׯվ\n");
		    	}
	    	}
	    	if(x==2)//��Ʊ
	    	{
	    		System.out.println("****************************************\n");
		    	System.out.println("          ��ӭ����ʯ��ׯ����\n" );
		    	System.out.println("****************************************\n");
		    	System.out.println("����1���ߣ�");
		    	System.out.println("վ��1�����Ӵ��       վ��2���ϴ�       վ��3��ʯ��ׯ��վ       վ��4�����㳡        վ��5������\n"
	    				+ "վ��6:�׷�   վ��7��������  վ��8:̸��  վ��9������  վ��10��������\n"
	    				+ "վ��11:����Ժ   վ��12�������̳�  վ��13:ƽ�����  վ��14����Ź㳡  վ��15���°ٹ㳡\n"
	    				+ "վ��16:��ʿ��԰   վ��17����ƽҽԺ  վ��18:������  վ��19��ʱ���  վ��20������\n");
		    	System.out.println("����3���ߣ�");
		    	System.out.println("վ��21���ж���       վ��22���°ٹ㳡       վ��23������       վ��24��������       վ��25��������  վ��26:ʯ��ׯվ\n");
		    	System.out.println("�����Ƿ���Ҫ���ˣ�");
		    	System.out.println("1����Ҫ����   \n2������Ҫ����");
		    	int z;
		    	z=in1.nextInt();
		    	if(z==1)//��Ҫ����
		    	{	System.out.println("���軻����ע�⣺");
		    		System.out.println("��ʼվ����ţ�");
		    		i=in1.nextInt();
		    		System.out.println("�յ�վ����ţ�");
		    		j=in1.nextInt(); 
		    		int m,n;
		    		if(j>22)
		    			j=j-7;
		    		else //��ͬ����ļ���վ����	
		    			j=j-5;
		    		m=Math.abs(15-i)/3;
					n=Math.abs(j-15)/3;
					if(Math.abs(15-i)%3!=0)
						m=m+1;
					if(Math.abs(j-15)%3!=0)
						n=n+1;
					System.out.println("��Ʊ������");
			    	int num;
			    	num=in1.nextInt();
			    	System.out.println("****************************************\n");
			    	System.out.println("          ��ӭ����ʯ��ׯ����\n" );
			    	System.out.println("****************************************\n");
			    	System.out.println("������վ�ĸ�����"+Math.abs(j-i)+"վ");
			    	System.out.println("������վΪ��");
			    	if(i<=15)
			    	{	for(int p=i-1;p<15;p++)
			    		{
			    			System.out.println(a[p]);
			    		}
			    		if(j>15)
			    			{
			    				for(int p=2;p<=j-14;p++)
			    				{
					    			System.out.println(b[p]);
					    		}
			    			}
			    	}
			    	System.out.println("\n��Ʊ���ۣ�3Ԫ");
					System.out.println("��Ʊ���"+(m+n)*num+"Ԫ");
		    	}
		    	if(z==2) //����Ҫ����
		    	{
		    		System.out.println("��ʼվ����ţ�");
		    		i=in1.nextInt();
		    		System.out.println("�յ�վ����ţ�");
		    		j=in1.nextInt();  
		    		int m=0,n=0;
					m=Math.abs(j-i)/3;
					if(Math.abs(j-i)%3!=0);
					m=m+1;
					System.out.println("��Ʊ������");
			    	int num;
			    	num=in1.nextInt();
			    	System.out.println("****************************************\n");
			    	System.out.println("          ��ӭ����ʯ��ׯ����\n" );
			    	System.out.println("****************************************\n");
			    	System.out.println("������վ�ĸ�����"+Math.abs(j-i)+"վ");
			    	System.out.println("\n��Ʊ���ۣ�3Ԫ");
					if(i<=20)
					{
						for(int q=i;q<=j;q++)
						{
							System.out.println(a[q]);
						}
					}
					if(i>20)
					{
						for(int q=i;q<=j;q++)
						{
							System.out.println(b[q]);
						}
					}
					System.out.println("��Ʊ���"+(m+n)*num+"Ԫ");
		    	}
	    	}
	    }
}
