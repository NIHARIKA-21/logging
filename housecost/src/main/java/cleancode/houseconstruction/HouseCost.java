package cleancode.houseconstruction;

public class HouseCost {
	int [] costOfMaterial={1200,1500,1800,2500};
	double calculateHouseCost(int materialType,int fullyAutomated,double areaInSquareFeet)
	{
		if(fullyAutomated==1 && materialType==3)
		{
			return costOfMaterial[3]*areaInSquareFeet;
		}
		else
		{
			return costOfMaterial[materialType-1]*areaInSquareFeet;
		}	 
	}

}
