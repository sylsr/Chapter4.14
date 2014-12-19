package chapter;

public class Project
{

	public static void main(String[] args)
	{
		String twelve="Twelve drummers drumming,";
		String eleven="Eleven pipers piping,";
		String ten="Ten lords a leaping,";
		String nine="Nine ladies dancing,";
		String eight="Eight maids a milking,";
		String seven="Seven swans a swimming,";
		String six="Six geese a laying,";
		String five="Five golden rings,";
		String four="Four calling birds,";
		String three="Three French hens,";
		String two="Two turtle doves, and";
		String one="A partidge in a pear tree.";
		int x=1;
		while(x<=12)
		{
			if(x==1)
			{
				System.out.println("On the "+x+"st day of Christmas my true love gave to me.");
			}
			if(x==2)
			{
				System.out.println("On the "+x+"nd day of Christmas my true love gave to me.");
			}
			if(x==3)
			{
				System.out.println("On the "+x+"rd day of Christmas my true love gave to me.");
			}
			if(x>3)
			{
				System.out.println("On the "+x+"th day of Christmas my true love gave to me.");
			}
			switch(x)
			{
			case 1:
				{
					System.out.println(one);
				}break;
			case 2:
				{
					System.out.println(two);
					System.out.println(one);
				}break;
			case 3:
			{
				System.out.println(three);
				System.out.println(two);
				System.out.println(one);
			}break;
			case 4:
			{
				System.out.println(four);
				System.out.println(three);
				System.out.println(two);
				System.out.println(one);
			}break;
			case 5:
			{
				System.out.println(five);
				System.out.println(four);
				System.out.println(three);
				System.out.println(two);
				System.out.println(one);
			}break;
			case 6:
			{
				System.out.println(six);
				System.out.println(five);
				System.out.println(four);
				System.out.println(three);
				System.out.println(two);
				System.out.println(one);
			}break;
			case 7:
			{
				System.out.println(seven);
				System.out.println(six);
				System.out.println(five);
				System.out.println(four);
				System.out.println(three);
				System.out.println(two);
				System.out.println(one);
			}break;
			case 8:
			{
				System.out.println(eight);
				System.out.println(seven);
				System.out.println(six);
				System.out.println(five);
				System.out.println(four);
				System.out.println(three);
				System.out.println(two);
				System.out.println(one);
			}break;
			case 9:
			{
				System.out.println(nine);
				System.out.println(eight);
				System.out.println(seven);
				System.out.println(six);
				System.out.println(five);
				System.out.println(four);
				System.out.println(three);
				System.out.println(two);
				System.out.println(one);
			}break;
			case 10:
			{
				System.out.println(ten);
				System.out.println(nine);
				System.out.println(eight);
				System.out.println(seven);
				System.out.println(six);
				System.out.println(five);
				System.out.println(four);
				System.out.println(three);
				System.out.println(two);
				System.out.println(one);
			}break;
			case 11:
			{
				System.out.println(eleven);
				System.out.println(ten);
				System.out.println(nine);
				System.out.println(eight);
				System.out.println(seven);
				System.out.println(six);
				System.out.println(five);
				System.out.println(four);
				System.out.println(three);
				System.out.println(two);
				System.out.println(one);
			}break;
			case 12:
			{
				System.out.println(twelve);
				System.out.println(eleven);
				System.out.println(ten);
				System.out.println(nine);
				System.out.println(eight);
				System.out.println(seven);
				System.out.println(six);
				System.out.println(five);
				System.out.println(four);
				System.out.println(three);
				System.out.println(two);
				System.out.println(one);
			}break;
			default:
			}
			x++;
		}
	}

}
