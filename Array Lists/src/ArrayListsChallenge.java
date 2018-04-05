import java.util.ArrayList;
public class ArrayListsChallenge
	{
		static ArrayList <Double> temperaturesArray = new ArrayList <Double>( );
		static int fevers = 0;
		static double highestTemperature = 0;
		static double lowestTemperature = 0;
		public static void main(String[] args)
			{
				fillArray();
				removeHealthyPeople();
				printListFahrenheit();
				System.out.println();
				calculateNumberOfFevers();
				System.out.println();
				convertToCelsius();
				printListCelsius();
				System.out.println();
				clearList();
				fillArray();
				removeSickPeople();
				printListFahrenheit();
				System.out.println();
				findHighestTemperature();
				findLowestTemperature();
				printHighestAndLowestTemperatures();
			}
		public static void printListFahrenheit()
			{
//				for (int i = 0; i < temperaturesArray.size(); i++)
//					{
//						System.out.println(temperaturesArray.get(i) + " degrees Fahrenheit");
//					}
				for (Double d : temperaturesArray)
					{
						System.out.println(d + " degrees Fahrenheit");
					}
			}
		public static void fillArray()
			{
				temperaturesArray.add(98.6);
				temperaturesArray.add(102.2);
				temperaturesArray.add(96.4);
				temperaturesArray.add(97.4);
				temperaturesArray.add(98.4);
				temperaturesArray.add(97.9);
				temperaturesArray.add(101.1);
				temperaturesArray.add(99.3);
				temperaturesArray.add(100.3);
				temperaturesArray.add(103.0);
			}
		public static void removeHealthyPeople()
			{
				for (int i = 9; i >= 0; i--)
					{
						if (temperaturesArray.get(i) <= 98.6)
							{
								temperaturesArray.remove(i);
							}
					}
			}
		public static void calculateNumberOfFevers()
			{
				fevers = temperaturesArray.size();
				System.out.println(fevers + " people have fevers.");
			}
		public static void convertToCelsius()
			{
				for (int i = 0; i < temperaturesArray.size(); i++)
					{
						temperaturesArray.set(i, temperaturesArray.get(i) - 32);
						temperaturesArray.set(i, temperaturesArray.get(i) / 1.8);
					}
			}
		public static void printListCelsius()
			{
//				for (int i = 0; i < temperaturesArray.size(); i++)
//					{
//						System.out.println(temperaturesArray.get(i) + " degrees Celsius");
//					}
				for (Double d : temperaturesArray)
					{
						System.out.println(d + " degrees Celsius");
					}
			}
		public static void clearList()
			{
				for (int i = temperaturesArray.size() - 1; i >= 0; i--)
					{
						temperaturesArray.remove(i);
					}
			}
		public static void removeSickPeople()
			{
				for (int i = 9; i >= 0; i--)
					{
						if (temperaturesArray.get(i) > 98.6)
							{
								temperaturesArray.remove(i);
							}
					}
			}
		public static void findHighestTemperature()
			{
				highestTemperature = temperaturesArray.get(0);
				for (int i = 1; i < temperaturesArray.size(); i++)
					{
						if (temperaturesArray.get(i) > highestTemperature)
							{
								highestTemperature = temperaturesArray.get(i);
							}
					}
			}
		public static void findLowestTemperature()
			{
				lowestTemperature = temperaturesArray.get(0);
				for (int i = 1; i < temperaturesArray.size(); i++)
					{
						if (temperaturesArray.get(i) < lowestTemperature)
							{
								lowestTemperature = temperaturesArray.get(i);
							}
					}
			}
		public static void printHighestAndLowestTemperatures()
			{
				System.out.println("The highest healthy temperature is " + highestTemperature + " degrees Fahrenheit.");
				System.out.println("The lowest healthy temperature is "+ lowestTemperature + " degrees Farenheit.");
			}
	}
