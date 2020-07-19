public class EmpWageBuilderUC7{
public static final int IS_PART_TIME = 1;
public static final int IS_FULL_TIME = 2;
public static final int EMP_RATE_PER_HOUR = 20;
public static final int NUM_OF_WORKING_DAYS = 20;
public static final int MAX_HRS_IN_MONTH = 120;
public static int computeWage(){
int emphrs = 0;
int totalemphrs = 0;
int empwage = 0;
int totalworkingdays = 0;
int Totalempwage=0;
while(totalemphrs <= MAX_HRS_IN_MONTH && totalworkingdays < NUM_OF_WORKING_DAYS){
		totalworkingdays++;
double  empcheck = Math.floor(Math.random() * 10) % 3;

switch ((int)empcheck){
  case IS_PART_TIME:
	emphrs = 8;
	break;
	case IS_FULL_TIME:
        emphrs = 12;
	break;
	default:
	emphrs = 0;
       }
totalemphrs += emphrs;
System.out.println("Day#: " + totalworkingdays + "Emp Hr: " +emphrs);
}
Totalempwage = totalemphrs * EMP_RATE_PER_HOUR;
System.out.println("Total Emp Wage: " + Totalempwage);
return Totalempwage;
}

public static void main(String[] agrs){
computeWage();

}
 }

