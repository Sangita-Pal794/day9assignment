public class EmpWageBuilderUC5{
public static final int IS_PART_TIME = 1;
public static final int IS_FULL_TIME = 2;
public static final int EMP_RATE_PER_HOUR = 20;
public static final int NUM_OF_WORKING_DAYS = 20;
public static void main(String[] agrs){
int emphrs = 0;
int empwage = 0;
int Totalempwage = 0;
for(int day=0;day<=NUM_OF_WORKING_DAYS;day++){
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

empwage = emphrs * EMP_RATE_PER_HOUR;
Totalempwage += empwage;
System.out.println("Emp Wage: " + empwage);
}
System.out.println("Total Emp Wage: " + Totalempwage);
}
}
