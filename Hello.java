public class Hello {
	public static void main(String args[]){
		int line = 10;
		for(int x=1;x<=line;x++){//������
			for(int y=0;y<=line-x;y++){//���ƿո�
				System.out.print(" ");
			}
			for(int y=1;y<=x;y++){//�����Ǻ�
                 System.out.print("* ");
			}

		System.out.println();
		}
	}
}