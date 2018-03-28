
///Ã°ÅÝ
public class mydemo1
{
	public static void main(String args[])
	{
		int data [] = new int [] {1,2,3,4,5,6,7,9,0,8};
		sort(data);
		printArray(data);
} 
    public static void sort(int arr[])
	{
		for (int x = 0 ; x < (arr.length - 1); x++)
		{
			for (int y = 0; y < (arr.length - x - 1) ; y++)
			{
				if (arr[y] > arr[y+1])
				{
					int temp = arr[y];
					arr [y] = arr [y+1];
                    arr [y+1] = temp;
				}
			}
		}
	}
	public static void printArray(int temp[])
	{
		for (int i = 0;i<temp.length ; i++)
		{
			System.out.print(temp[i] +"¡¢");
		}
        System.out.println();

}
}
