//信1605-3  20163429  刘瑞欣
package Ktcs1114;
import java.io.IOException;
import java.util.Scanner;
class Scan{
	public static Scanner s = new Scanner(System.in);
}
abstract class Subway 
{
	private int XianluNumber;//线路号
	protected static String ZhanName1;//线路的起始站名
	protected static String ZhanName2;//线路的终点站名
	private String Massage ;//换乘车站的信息
	static int i;//初始站和终点站的序号
	static int j;
	public void show()
	{
		System.out.println(XianluNumber);
		System.out.println(Massage);
	}
	public void Chaxun()
	{
		Scanner in=new Scanner(System.in);
		System.out.println("请输入起始站名：");
		i=in.nextInt();
		System.out.println("请输入终点站名：");
		j=in.nextInt();
		System.out.println("经历的站的个数："+(j-i)+"站");
		System.out.println("经历的路径：");
		for(int n=i;n>j;n++)
		{
			if(n==15)
			{
				System.out.println(n+"换乘3号线");
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
    	System.out.println("欢迎乘坐石家庄地铁");
    	System.out.println("***************************************");
    	System.out.print("输入起始站:");
    	ZhanName1 = Scan.s.next();
    	System.out.print("输入终点站:");
    	ZhanName2 = Scan.s.next();
    	System.out.println("输入购票数量:");
    	ticketnum = Scan.s.nextInt();
	    int sum = 0;
	    if((i-j)%3==0)sum = (i-j)/3;
	    else sum = (i-j)/3+1;
	    System.out.println("单票价:"+sum);
	    System.out.println("总价:"+(int)(sum*ticketnum));
	}
}
class FirstLineSubway extends Subway//FirstLineSubway类继承Subway实现并实现上述Subway的相关功能
{
	public String[] a;

	public void zhan()
	{
		String a[]= {"洨河大道","南村","石家庄东站","火炬广场","留村","白佛","朝晖桥",
				"谈固","北宋","体育场","博物院","北国商城","平安大街","解放广场","新百广场","烈士陵园","和平医院","长城桥","时光街","西王"};
		/*1-20站分别为：洨河大道、南村、石家庄东站、火炬广场、留村、白佛、朝晖桥、
		谈固、北宋、体育场、博物院、北国商城、平安大街、解放广场、新百广场、烈士陵园、和平医院、长城桥、时光街、西王*/	
		return;
	}
}
class ThirdLineSubway extends Subway//ThirdLineSubway类继承Subway实现并实现上述Subway的相关功能
{
	public String[] b;

	public void zhan()
	{
		String b[]= {"市二中","新百广场","东里","槐安桥","西三教","石家庄站"};/*1-6站分别为：市二中、新百广场、东里、槐安桥、西三教、石家庄站。*/	
		return;
	}
}
public class SubwayManager extends Subway
{
	 public static void main(String[] grges) throws IOException
	    {
		 	String a[]= {"洨河大道","南村","石家庄东站","火炬广场","留村","白佛","朝晖桥",
					"谈固","北宋","体育场","博物院","北国商城","平安大街","解放广场","新百广场","烈士陵园","和平医院","长城桥","时光街","西王"};
		 	String b[]= {"市二中","新百广场","东里","槐安桥","西三教","石家庄站"};/*1-6站分别为：市二中、新百广场、东里、槐安桥、西三教、石家庄站。*/
	    	System.out.println("****************************************\n");
	    	System.out.println("          欢迎乘坐石家庄地铁\n" );
	    	System.out.println("****************************************\n");
	    	System.out.println("          1、显示具体线路信息\n");
	    	System.out.println("          2、购票\n");
	    	System.out.println("****************************************\n");
	    	int x;
	    	Scanner in1=new Scanner(System.in);
	    	x=in1.nextInt();
	    	FirstLineSubway A=new FirstLineSubway();
	    	A.zhan();
	    	ThirdLineSubway B=new ThirdLineSubway();
	    	B.zhan();
	    	if(x==1)//显示具体线路信息
	    	{
	    		System.out.println("****************************************\n");
		    	System.out.println("          石家庄地铁线路图\n" );
		    	System.out.println("****************************************\n");
		    	System.out.println("请输入你想查询的线路图：\n0：全部      1：1号线     3：3号线");
		    	int y;
		    	y=in1.nextInt();
		    	if(y==0)
		    	{System.out.println("地铁1号线：");
		    	System.out.println("站点1：洨河大道       站点2：南村       站点3：石家庄东站       站点4：火炬广场        站点5：留村\n"
		    				+ "站点6:白佛   站点7：朝晖桥  站点8:谈固  站点9：北宋  站点10：体育场\n"
		    				+ "站点11:博物院   站点12：北国商城  站点13:平安大街  站点14：解放广场  站点15：新百广场\n"
		    				+ "站点16:烈士陵园   站点17：和平医院  站点18:长城桥  站点19：时光街  站点20：西王\n");
		    	System.out.println("地铁3号线：");
		    	System.out.println("站点21：市二中       站点22：新百广场       站点23：东里       站点24：槐安桥       站点25：西三教  站点26:石家庄站\n");
		    	}
		    	if(y==1)
		    	{System.out.println("地铁1号线：");
		    	System.out.println("站点1：洨河大道       站点2：南村       站点3：石家庄东站       站点4：火炬广场        站点5：留村\n"
		    				+ "站点6:白佛   站点7：朝晖桥  站点8:谈固  站点9：北宋  站点10：体育场\n"
		    				+ "站点11:博物院   站点12：北国商城  站点13:平安大街  站点14：解放广场  站点15：新百广场\n"
		    				+ "站点16:烈士陵园   站点17：和平医院  站点18:长城桥  站点19：时光街  站点20：西王\n");
		    	}	
		    	if(y==3)
		    	{
		    		System.out.println("地铁3号线：");
			    	System.out.println("站点21：市二中       站点22：新百广场       站点23：东里       站点24：槐安桥       站点25：西三教  站点26:石家庄站\n");
		    	}
	    	}
	    	if(x==2)//购票
	    	{
	    		System.out.println("****************************************\n");
		    	System.out.println("          欢迎乘坐石家庄地铁\n" );
		    	System.out.println("****************************************\n");
		    	System.out.println("地铁1号线：");
		    	System.out.println("站点1：洨河大道       站点2：南村       站点3：石家庄东站       站点4：火炬广场        站点5：留村\n"
	    				+ "站点6:白佛   站点7：朝晖桥  站点8:谈固  站点9：北宋  站点10：体育场\n"
	    				+ "站点11:博物院   站点12：北国商城  站点13:平安大街  站点14：解放广场  站点15：新百广场\n"
	    				+ "站点16:烈士陵园   站点17：和平医院  站点18:长城桥  站点19：时光街  站点20：西王\n");
		    	System.out.println("地铁3号线：");
		    	System.out.println("站点21：市二中       站点22：新百广场       站点23：东里       站点24：槐安桥       站点25：西三教  站点26:石家庄站\n");
		    	System.out.println("请问是否需要换乘：");
		    	System.out.println("1：需要换乘   \n2：不需要换乘");
		    	int z;
		    	z=in1.nextInt();
		    	if(z==1)//需要换乘
		    	{	System.out.println("若需换乘请注意：");
		    		System.out.println("起始站的序号：");
		    		i=in1.nextInt();
		    		System.out.println("终点站的序号：");
		    		j=in1.nextInt(); 
		    		int m,n;
		    		if(j>22)
		    			j=j-7;
		    		else //不同方向的计算站数。	
		    			j=j-5;
		    		m=Math.abs(15-i)/3;
					n=Math.abs(j-15)/3;
					if(Math.abs(15-i)%3!=0)
						m=m+1;
					if(Math.abs(j-15)%3!=0)
						n=n+1;
					System.out.println("购票数量：");
			    	int num;
			    	num=in1.nextInt();
			    	System.out.println("****************************************\n");
			    	System.out.println("          欢迎乘坐石家庄地铁\n" );
			    	System.out.println("****************************************\n");
			    	System.out.println("经历的站的个数："+Math.abs(j-i)+"站");
			    	System.out.println("经历的站为：");
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
			    	System.out.println("\n购票单价：3元");
					System.out.println("购票金额"+(m+n)*num+"元");
		    	}
		    	if(z==2) //不需要换乘
		    	{
		    		System.out.println("起始站的序号：");
		    		i=in1.nextInt();
		    		System.out.println("终点站的序号：");
		    		j=in1.nextInt();  
		    		int m=0,n=0;
					m=Math.abs(j-i)/3;
					if(Math.abs(j-i)%3!=0);
					m=m+1;
					System.out.println("购票数量：");
			    	int num;
			    	num=in1.nextInt();
			    	System.out.println("****************************************\n");
			    	System.out.println("          欢迎乘坐石家庄地铁\n" );
			    	System.out.println("****************************************\n");
			    	System.out.println("经历的站的个数："+Math.abs(j-i)+"站");
			    	System.out.println("\n购票单价：3元");
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
					System.out.println("购票金额"+(m+n)*num+"元");
		    	}
	    	}
	    }
}
