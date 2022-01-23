package fujiyama;

import java.util.Scanner;

public class fujiyama {

	public static void main(String[] args) {
		
		int [] fullList = {0,0,0,0,0,0,0,0,0,0,0,0};
		int [] list = {0,0,0,0,0,0,0,0,0,0,0,0};
		int hibachiChoice;
		int comboChoice;
		int val = new fujiyama().mainMenu();
		boolean con = true;
		do {
			if(val == 1) {
				comboChoice = new fujiyama().ComboMenu();
				list = new fujiyama().calculateOrder(comboChoice);
				for(int i = 0; i < 12; i++) {
					fullList[i] = fullList[i] + list[i];
				}
				val = new fujiyama().mainMenu();
			
			}else if(val == 2) {
				hibachiChoice = new fujiyama().HibachiMenu();
				list = new fujiyama().calculateOrder(hibachiChoice);
				for(int i = 0; i < 12; i++) {
					fullList[i] = fullList[i] + list[i];
				}
				val = new fujiyama().mainMenu();
			
			}else if (val == 3) {
				new fujiyama().print(fullList);
				val = new fujiyama().mainMenu();
			
			}else if (val == 4) {
				fullList = new fujiyama().reset(fullList);
				val = new fujiyama().mainMenu();
			}else if (val == 5) {
				con = false;
			}else {
				System.out.println("invalid input");
				val = new fujiyama().mainMenu();
			}
		}while(con == true);
		
		
	}
	public int mainMenu() {
		int selection;
        Scanner input = new Scanner(System.in);

        /***************************************************/

        System.out.println("Choose from these choices");
        System.out.println("-------------------------\n");
        System.out.println("1 - Combo Dinners");
        System.out.println("2 - Hibachi Dinners");
        System.out.println("3 - Done with Order");
        System.out.println("4 - Reset");
        System.out.println("5 - Quit");
        

        selection = input.nextInt();
        if(selection < 1 || selection > 5) {
        	System.out.println("Invalid input");
        	mainMenu();
        }
        return selection; 
	}
	public int ComboMenu() {
		int selection;
        Scanner input = new Scanner(System.in);

        /***************************************************/

        System.out.println("Choose from these choices");
        System.out.println("-------------------------\n");
        System.out.println("1 - rockyesChoice");
        System.out.println("2 - jackeisChoice");
        System.out.println("3 - samari");
        System.out.println("4 - primeRibMeal");
        System.out.println("5 - landAndSea");
        System.out.println("6 - shogun");
        System.out.println("7 - surfAndTruf");
        System.out.println("8 - imperial");
        System.out.println("9 - OlympiaDeluxe");
        System.out.println("10 - pacificMarina");
        System.out.println("11 - fujiyamaDeluxe");

        selection = input.nextInt();
        if(selection < 1 || selection > 11) {
        	System.out.println("Invalid input");
        	ComboMenu();
        }
        return selection;
	}
	public int HibachiMenu() {
		int selection;
        Scanner input = new Scanner(System.in);

        /***************************************************/

        System.out.println("Choose from these choices");
        System.out.println("-------------------------\n");
        System.out.println("1 - hibachi Chicken");
        System.out.println("2 - hibachi Salmon");
        System.out.println("3 - hibachi Calamari");
        System.out.println("4 - hibachi Sukiyaki Stake");
        System.out.println("5 - hibachi NewYork Stake");
        System.out.println("6 - hibachi Shrimp");
        System.out.println("7 - hibachi Scallops");

        selection = input.nextInt();
        if(selection < 1 || selection > 7) {
        	System.out.println("Invalid input");
        	HibachiMenu();
        }
        return selection;
	}
	public int[] calculateOrder(int input) {
	
		int [] rockyesChoice = {1,0,0,0,0,8,0,0,0,0,1,1};
		int [] jackeisChoice = {1,0,0,0,0,8,0,0,0,0,1,1};
		int [] samuri = {1,0,0,0,0,8,0,0,0,0,1,1};
		int [] primeRibMeal = {1,0,0,0,0,8,0,0,0,0,1,1};
		int [] landAndSea = {1,0,0,0,0,8,0,0,0,0,1,1};
		int [] shogun = {1,0,0,0,0,8,0,0,0,0,1,1};
		int [] surfAndTruf = {1,0,0,0,0,8,0,0,0,0,1,1};
		int [] imperial = {1,0,0,0,0,8,0,0,0,0,1,1};
		int [] OlympiaDeluxe = {1,0,0,0,0,8,0,0,0,0,1,1};
		int [] pacificMarina = {1,0,0,0,0,8,0,0,0,0,1,1};
		int [] fujiyamaDeluxe = {1,0,0,0,0,8,0,0,0,0,1,1};
		
		
		int [] fullList = {0,0,0,0,0,0,0,0,0,0,0,0};
		
		
		switch(input) {
			case 1:
				for(int i = 0; i < 12; i++) 
					fullList[i] = rockyesChoice[i] + fullList[i];
				break;
			case 2:
				for(int i = 0; i < 12; i++) 
					fullList[i] = jackeisChoice[i] + fullList[i];
				break;
			case 3:
				for(int i = 0; i < 12; i++) 
					fullList[i] = samuri[i] + fullList[i];
				break;
			case 4:
				for(int i = 0; i < 12; i++) 
					fullList[i] = primeRibMeal[i] + fullList[i];
				break;
			case 5:
				for(int i = 0; i < 12; i++) 
					fullList[i] = landAndSea[i] + fullList[i];
				break;
			case 6:
				for(int i = 0; i < 12; i++) 
					fullList[i] = shogun[i] + fullList[i];
				break;
			case 7:
				for(int i = 0; i < 12; i++) 
					fullList[i] = surfAndTruf[i] + fullList[i];
				break;
			case 8:
				for(int i = 0; i < 12; i++) 
					fullList[i] = imperial[i] + fullList[i];
				break;
			case 9:
				for(int i = 0; i < 12; i++) 
					fullList[i] = OlympiaDeluxe[i] + fullList[i];
				break;
			case 10:
				for(int i = 0; i < 12; i++) 
					fullList[i] = pacificMarina[i] + fullList[i];
				break;
			case 11:
				for(int i = 0; i < 12; i++) 
					fullList[i] = fujiyamaDeluxe[i] + fullList[i];
				break;
		}
		return fullList;
	}
	public int[] calculateOrderHibatchi(int input) {
		
		
		int [] hibachiChicken = {1,0,0,0,0,8,0,0,0,0,1,1};
		int [] hibachiSalmon = {1,0,0,0,0,8,0,0,0,0,1,1};
		int [] hibachiCalamari = {1,0,0,0,0,8,0,0,0,0,1,1};
		int [] hibachiSukiyakiStake = {1,0,0,0,0,8,0,0,0,0,1,1};
		int [] hibachiNewYorkStake = {1,0,0,0,0,8,0,0,0,0,1,1};
		int [] hibachiShrimp = {1,0,0,0,0,8,0,0,0,0,1,1};
		int [] hibachiScallops = {1,0,0,0,0,8,0,0,0,0,1,1};
		
		int [] fullList = {0,0,0,0,0,0,0,0,0,0,0,0};
		
		
		switch(input) {
			
			case 1:
				for(int i = 0; i < 12; i++) 
					fullList[i] = hibachiChicken[i] + fullList[i];
				break;
			case 2:
				for(int i = 0; i < 12; i++) 
					fullList[i] = hibachiSalmon[i] + fullList[i];
				break;
			case 3:
				for(int i = 0; i < 12; i++) 
					fullList[i] = hibachiCalamari[i] + fullList[i];
				break;
			case 4:
				for(int i = 0; i < 12; i++) 
					fullList[i] = hibachiSukiyakiStake[i] + fullList[i];
				break;
			case 5:
				for(int i = 0; i < 12; i++) 
					fullList[i] = hibachiNewYorkStake[i] + fullList[i];
				break;
			case 6:
				for(int i = 0; i < 12; i++) 
					fullList[i] = hibachiShrimp[i] + fullList[i];
				break;
			case 7:
				for(int i = 0; i < 12; i++) 
					fullList[i] = hibachiScallops[i] + fullList[i];
				break;
		}
		return fullList;
	}
	public void print(int list[]) {
		int comboStake = list[0];
		int hibatchiStakeSukiyaki = list[1];
		int filet = list[2];
		int primeRib = list[3];
		int chicken = list[4];
		int shrimp = list[5];
		int scallops = list[6];
		int lobster = list[7];
		int calamari = list[8];
		int salmon = list[9];
		int rice = list[10];
		int vegetables = list[11];
		
		for(int i = 0; i < 12; i++) {
			
			if(list[i] > 0) {
				if(i == 0) {
					System.out.println("Combo Stakes: " + comboStake);
				}else if(i == 1) {
					System.out.println("Hibachi Sukiyaki oz: " + hibatchiStakeSukiyaki);
				}else if(i == 2) {
					System.out.println("Filet: " + filet);
				}else if(i == 3) {
					System.out.println("PrimeRib: " + primeRib);
				}else if(i == 4) {
					System.out.println("Chicken: " + chicken);
				}else if(i == 5) {
					System.out.println("Shrimp: " + shrimp);
				}else if(i == 6) {
					System.out.println("Scallops: " + scallops);
				}else if(i == 7) {
					System.out.println("Lobster: " + lobster);
				}else if(i == 8) {
					System.out.println("Calamari: " + calamari);
				}else if(i == 9) {
					System.out.println("Salmon: " + salmon);
				}else if(i == 10) {
					System.out.println("Rice: " + rice);
				}else if(i == 11) {
					System.out.println("Vegetables: " + vegetables);
				}
			}
		}
	}
	public int[] reset(int reset[]) {
		int [] fullList = {0,0,0,0,0,0,0,0,0,0,0,0};
		reset = fullList;
		return reset;
		
	}
}
