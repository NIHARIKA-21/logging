package cleancode.houseconstruction;

import java.util.Scanner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {
	private static final Logger LOGGER= LogManager.getLogger(Main.class);
	public static void main(String [] args)
	{
		HouseCost cost=new HouseCost();
		int materialType;
		int fullyAutomated=2;
		double areaInSquareFeet;
		Scanner sc=new Scanner(System.in);
		LOGGER.info("Available materials types\n");
		LOGGER.info("1.Standard materials\n2.Above standard materials\n3.High Standard material\n");
		LOGGER.info("Choose a material type:");
		materialType=sc.nextInt();
		if(materialType==3)
		{
			LOGGER.info("Do you want fully automated home\n1.yes 2.no  :");
			fullyAutomated=sc.nextInt();
			if(fullyAutomated!=1 && fullyAutomated!=2)
			{
				LOGGER.info("Invalid choice\n");
				return;
			}
		}
		else if(materialType<1 || materialType>3)
		{
			LOGGER.info("Invalid choice\n");
			return;
		}
		LOGGER.info("Enter area in square feet:");
		areaInSquareFeet=sc.nextDouble();
		LOGGER.info("Cost of construction is : "+cost.calculateHouseCost(materialType,fullyAutomated,areaInSquareFeet)+"\n");
	}
}
