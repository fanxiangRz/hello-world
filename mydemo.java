//public class mydemo {
//	public static void main(String args[]){
//		for (int x = 1; x <= 9; x++)
//		{
//			for(int y =1; y<= x;y++){
//				System.out.print(x+ "*" + y + "=" + x * y +"\t");
//		}
//		System.out.println();
//        System.out.println(liancheng(5));
//	}
//		public static int liancheng(int x){
//			if (x == 1)
//			{
//				return 1;
//			}
//			return x * liancheng(x - 1);
//			
//		}
//	
//}
//public class mydemo {
//	public static void main(String args[])
//		{
//		int data[] = new int []{1,2,3,4,5,6,7,8,9,66};
//	    int max = data[0];
//		int min = data[0];
//		int sum = 0;
//		for (int x = 0; x < data.length ; x++)
//		{ 
//			sum +=data[x];
//			if (data[x]>max){
//			max = data[x] ;
//		}
//            if (data[x]<min){
//			min = data[x] ;
//		}
//		}
//		System.out.println("最大值：" + max);
//		System.out.println("最小值：" + min);
//		System.out.println("总和：" + sum);
//		}
//
//	public static void printArray(int temp[])
//	{
//		for (int i = 0;i<temp.length ; i++)
//		{
//			System.out.print(temp[i] + '、');
//		}
//        System.out.println();
//
//}
//}
//public class mydemo
//{
//	public static void main(String args[]){
//	int data[] = new int []{1,2,3,4,5,6,7,8,9,66};
//	double result[] = chl(data);
//	System.out.println("最大值：" + result[0]);
//	System.out.println("最小值：" + result[1]);
//	System.out.println("总和：" + result[2]);
//	System.out.println("平均值：" + result[3]);
//	}
//	public static double[] chl(int temp[])
//	{   
//		double arr[] = new double [4];
//			arr [0] = temp [0];
//		    arr [1] = temp [0];
//		    arr [2] = temp [0];
//		    arr [3] = temp [0]; 	
//		for (int x = 1;x < temp.length ;x++ )
//		{
//			arr[2] += temp[x];
//			
//			if (temp[x]>arr[0]){
//			arr[0] = temp[x] ;
//		}
//            if (temp[x]<arr[1]){
//			arr[1] = temp[x] ;
//		}
//		}
//        arr[3] = arr[2]/temp.length;
//		return arr;
//}
//
//}
//public class mydemo
//{
//	public static void main(String args[])
//	{
//		int data [] = new int [] {9,7,2,3,4,5,6,8,1,0};
//		sort(data);
//		printArray(data);
//} 
//    public static void sort(int arr[])
//	{
//		for (int x = 0 ; x < (arr.length - 1); x++)
//		{
//			for (int y = 0; y < (arr.length - x - 1) ; y++)
//			{
//				if (arr[y] > arr[y+1])
//				{
//					int temp = arr[y];
//					arr [y] = arr [y+1];
//                    arr [y+1] = temp;
//				}
//			}
//		}
//	}
//	public static void printArray(int temp[])
//	{
//		for (int i = 0;i<(temp.length-1) ; i++)
//		{
//			System.out.print(temp[i] + '、');
//		}
//        System.out.println();
//
//}
//}
//*****单列数组转置****//
//public class mydemo
//{
//	public static void main(String args[])
//	{
//		int data [] = new int [] {1,2,3,4,5,6,7,8,9};
//		reverse(data);
//		printArray(data);
//	}
//	public static void reverse(int arr[])
//	{
//		int center = arr.length/2;
//		int head = 0;//头部开始索引
//		int tail = arr.length -1 ;//尾部开始索引
//		for (int x = 0 ; x < center ; x++)
//		{ 
//			int temp = arr[head];
//			arr[head] = arr[tail];
//			arr[tail] = temp;
//			head++;
//			tail--;
//		}
//	}
//	public static void printArray(int temp[])
//	{
//         for (int i = 0;i<(temp.length-1) ; i++)
//		{
//			System.out.print(temp[i] + "、");
//		}
//        System.out.println();
//	}
//	}
//*****多行多列数组转置****//
//public class mydemo
//{	public static void main(String args[])
//	{
//		int data[][] = new int [][]{{1,2,3},{4,5,6},{7,8,9}};
//        reverse(data);
//		printArray(data);
//	}
//	public static void reverse(int arr[][])
//    {
//		for (int x = 0;x<arr.length ; x++)
//		{
//			for (int y = x;y<arr[x].length ; y++ )
//			{
//				if(x != y)
//				{
//					int temp = arr[x][y];
//					arr[x][y] = arr[y][x];
//					arr[y][x] = temp;
//			    }
//
//		    }
//	     }
//	}
//	public static void printArray(int temp[][])
//	{
//         for (int i = 0;i<temp.length ; i++)
//		{
//           for (int j = 0; j<temp[i].length ; j++)
//			{
//			System.out.print(temp[i][j] + " ");
//			}
//			System.out.println();
//		}
//		System.out.println();
//	}
//}
//*****多行多列数组转置****//
//*****穷举查找****//
//public class mydemo
//{
//	public static void main(String args[])
//	{
//		int data [] = new int [] {1,2,3,4,5,6,7,8,9};
//		int tag = 7;
//		System.out.println(find(data,tag));
//	}
//	public static int find(int temp[],int x)
//	{
//		for (int i = 0; i<temp.length;i++ )
//		{
//			if (temp[i] ==  x)
//			{
//				return i;
//			}		
//		}
//		return -1;
//	}
//}
//*****穷举查找****//
//*****二分查找****//
//public class mydemo
//{
//	public static void main(String args[])
//	{
//		int data [] = new int [] {1,2,3,4,5,6,7,8,9};
//		int search = 8;
//		System.out.println(binarySearch(data,0,data.length-1,search));
//	}
//	public static int binarySearch(int temp[],int from,int to,int key)
//	{
//		if (from<to)
//		{
//			int mid = from/2+to/2;
//			if (key == temp[mid])
//			{
//				return mid;
//			}
//			else if (key > temp[mid])
//			{
//				return binarySearch(temp,mid+1,to,key);
//			}
//			else if (key < temp[mid])
//			{
//				return binarySearch(temp,from,mid-1,key);
//			}			
//		}
//        return -1;
//	}
//}
//****二分查找****//
//****对象数组动态初始化****//
//字符串拆分//
//public class mydemo
//{
//	public static void main(String args[])
//	{
//		String str = "xiaoming:10|xiaozhang:20";
//		String result[] = str.split("\\|");
//		for (int x = 0 ; x<result.length ; x++)
//		{
//			String temp[] = result[x].split(":");
//			System.out.println(temp[0]+"="+temp[1]);
//		}
//	}
//}
//首字母大写
//public class mydemo
//{
//	public static void main(String args[])
//	{
//		String name = "jack";
//		System.out.println(initcap(name));
//	}
//    public static String initcap(String str)
//	{
//		if(str == null || "".equals(str))
//		{
//			return str;
//		}
//		if(str.length()>1)
//		{
//			return str.substring(0,1).toUpperCase()+str.substring(1);
//        }
//        return str.toUpperCase();
//	}
//}
//数据表与简单java类,多对多
//class Student
//{
//	private int stuid ;
//	private String name ;
//	private int age ;
//	//private Course courses [] ;
//	private StudentCourse studentCourses[] ;
//	public Student(){} 
//	public Student(int stuid,String name,int age){
//            this.stuid = stuid ;
//            this.name = name ;
//			this.age = age ;
//	}
//	public void setStudentCourses(StudentCourse studentCourses[] ){
//        this.studentCourses = studentCourses ;
//	}
//	public StudentCourse[] getStudentCourses(){
//        return this.studentCourses;
//	}
////	public void setCourses(Course courses []){
////		this.courses = courses ;
////	}
////    public Course [] getCourses(){
////		return this.courses ;
////	}
//	public String getInfo(){
//		return "学生编号：" + this.stuid + ",姓名：" + this.name + ",年龄:" + this.age ;
//    }
//}
//class Course
//{
//	private int cid ;
//	private String name ;
//	private int credit ;
//	//private Student students[] ;
//	private StudentCourse studentCourses[] ;
//	public Course(){} 
//	public Course(int cid,String name,int credit){
//            this.cid = cid ;
//            this.name = name ;
//			this.credit = credit ;
//	}
//	public void setStudentCourses(StudentCourse studentCourses[] ){
//        this.studentCourses = studentCourses ;
//	}
//	public StudentCourse[] getStudentCourses(){
//        return this.studentCourses;
//	}
////	public void setStudents(Student students[]){
////		this.students = students ;
////	}
////    public Student [] getStudents(){
////		return this.students;
////	}
//	public String getInfo(){
//		return "课程编号：" + this.cid + ",课程名：" + this.name + ",学分:" + this.credit ;
//    }
//}
//class StudentCourse{ //学生选课
//	private Student student ;
//	private Course course ;
//	private double score ;
//	public StudentCourse(){}
//	public StudentCourse(Student student,Course course,double score){
//	    this.student = student ;
//        this.course = course;
//	    this.score = score ;
//	}
//    public Student getStudent(){
//		return this.student;
//	}
//	public Course getCourse(){
//		return this.course;
//	}
//	public double getScore(){
//		return this.score;
//}
//}
//public class mydemo
//{
//	public static void main(String args[])
//	{   //关系设置
//		//1.创建各自的独立对象
//		Student stu1 = new Student(1,"张三",18) ;
//		Student stu2 = new Student(2,"李四",19) ;
//		Student stu3 = new Student(3,"王五",20) ;
//		Course ca = new Course(1001,"马克思",2) ;
//		Course cb = new Course(1002,"线代",3) ;
//		//Course cc = new Course(1003,"高数",4) ;
//          //2.设置学生和课程关系，准备出成绩
//		stu1.setStudentCourses(new StudentCourse[]{
//			new StudentCourse(stu1,ca,99.9),
//			new StudentCourse(stu1,cb,87.0)
//		});
//		stu2.setStudentCourses(new StudentCourse[]{
//			new StudentCourse(stu2,ca,87.0)
//		});
//	    stu3.setStudentCourses(new StudentCourse[]{
//			new StudentCourse(stu3,cb,98.9)
//		});
//			//3.设置课程和学生关系
//		ca.setStudentCourses(new StudentCourse[]{
//			new StudentCourse(stu1,ca,99.9),
//			new StudentCourse(stu2,ca,87.0)
//		});
//		cb.setStudentCourses(new StudentCourse[]{
//			new StudentCourse(stu1,cb,87.0),
//			new StudentCourse(stu3,cb,98.9)
//		});
//	    stu3.setStudentCourses(new StudentCourse[]{
//			new StudentCourse(stu3,cb,98.9)
//		});
//		System.out.println(ca.getInfo());
//		for (int x = 0 ; x < ca.getStudentCourses().length ; x++)
//		{
//			System.out.println("\t|-" + ca.getStudentCourses()[x].getStudent().getInfo() +",成绩: " + ca.getStudentCourses()[x].getScore());
//			System.out.println();
//		}
//		System.out.println("===========");
//        System.out.println(stu1.getInfo());
//		for (int x = 0 ; x < stu1.getStudentCourses().length ; x++)
//		{
//			System.out.println("\t|-" + stu1.getStudentCourses()[x].getCourse().getInfo() + ",成绩: " + stu1.getStudentCourses()[x].getScore());
//			System.out.println();
//		}
//	}
//}
////////////////////////////////////////
///////数据表与简单java类