package 软件工程;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

import javax.management.RuntimeErrorException;

public class Test {

	
	public static void main(String[] args) throws FileNotFoundException {
		

		System.out.println("请输入题目个数：");
		Scanner reader=new Scanner(System.in);//控制题目数量
		int geshu=reader.nextInt();
		
		System.out.println("是否含有乘除法");//控制题目操作符
		System.out.println("1、含有乘除法\t2、不含乘除法");
		Scanner sc=new Scanner(System.in);
		int chengchu=sc.nextInt();//
		
		System.out.println("操作数范围：");// 控制题目结果取值范围
		System.out.println("1、100以内\t2、1000以内");
		Scanner scn=new Scanner(System.in);
		int fanwei=scn.nextInt();
		
		System.out.println("是否含有负数");//控制题目是否含有负数
		System.out.println("1、不含有负数\t2、含有负数");
		Scanner scan=new Scanner(System.in);
		int fushu=scan.nextInt();
		PrintStream ps = new PrintStream("D:/result.txt");
		
		switch(chengchu){                //当用户要求运算符包括乘除法的时候执行下面程序段
		case 1:
		
			char a1[]=new char[4];                    //定义数组存储四个运算符+-*/
			a1[0]='+';
			a1[1]='-';
			a1[2]='*';
			a1[3]='/';
			
			
			for(int i=0;i<geshu;i++){
				Random random1=new Random();
				int first1=random1.nextInt(100);              //随机生成第一个100以内的数
				int second1=random1.nextInt(100);             //随机生成第二个100以内的数
				int yunsuanfu1=random1.nextInt(4);            //随机生成一个4以内的数用来访问数组里的运算符+-*/
				
				
				char b1= a1[yunsuanfu1];            
				int result1=0;                                //定义result1变量来存储最后计算得到的结果
				switch(b1){                                   //判断生成的是什么运算符，并计算结果
				case '+':result1=first1+second1;break;
				case '-':result1=first1-second1;break;
				case '*':result1=first1*second1;break;
				case '/':result1=first1/second1;break;
				}
				
				
				
				if(fanwei==1){                                          //当用户要求算数结果在100以内时
					if(result1>=100){                                   //判断结果是否在100以内，如果不是，再进行一次循环
						i--;
					}
					else{

  //如果结果在100以内，就输出
					}
				}
				else if(fanwei==2){                                    //当客户要求算数结果在1000以内时
					if(result1>=1000){                                  //判断是否在1000以内，如果不是，再进行一次循环
						i--;
					}else{
						 System.setOut(ps);
						System.out.println(first1+" "+b1+second1+"=");  //如果结果在1000以内，就输出
					}
				}
		
		
		}break;
		
			
			
			
		                                                        //当客户要求运算符不包括乘除法的时候执行下面程序段
			case 2:   char a2[]=new char[2];                              //定义一个数组存储运算符+-
			
			
					a2[0]='+';
					a2[1]='-';
					for(int j=0;j<geshu;j++){
						Random random2=new Random();
						int first2=random2.nextInt(100);                 //生成第一个100以内的随机数
						int second2=random2.nextInt(100);				 //生成第二个100以内的随机数
						int yunsuanfu2=random2.nextInt(2);               //随机生成一个2以内的数来访问数组里的运算符
						char b2= a2[yunsuanfu2];
						int result2=0;                                   //定义result2变量来存储计算结果
						switch(b2){                                      //判断运算符是+还是-
						case '+':result2=first2+second2;break;
						case '-':result2=first2-second2;break;
												}
						if(fanwei==1){                                    //当用户要求算数结果在100以内时
							if(result2>=100){                             //判断结果是否在100以内，如果不是，再进行一次循环
								j--;
							}else{                                        //如果结果在100以内，就输出
								 System.setOut(ps);
							    System.out.println(first2+" "+b2+second2+"=");
							}
						}
						else if(fanwei==2){                              //当客户要求算数结果在1000以内时
							if(result2>=1000){                            //判断是否在1000以内，如果不是，再进行一次循环
								j--;
							}else{       
								 System.setOut(ps);                        //如果结果在1000以内，就输出
								System.out.println(first2+" "+b2+second2+"=");
							}
						}	
				   }
			   }
		   }                        
	   
   }
