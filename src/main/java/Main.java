import com.greatLearning.Departments.AdminDepartment;
import com.greatLearning.Departments.HrDepartment;
import com.greatLearning.Departments.SuperDepartment;
import com.greatLearning.Departments.TechDepartment;

public class Main
{
    public static void main(String[] args)
    {
        SuperDepartment hr = new HrDepartment();
        SuperDepartment tech = new TechDepartment();
        SuperDepartment admin = new AdminDepartment();

        Main.printMessage("Welcome to " + admin.departmentName());
        Main.printMessage(admin.getTodaysWork());
        Main.printMessage(admin.getWorkDeadline());
        Main.printMessage(admin.isTodayAHoliday());

        System.out.println("\n");

        Main.printMessage("Welcome to " + hr.departmentName());
        //type cast
        Main.printMessage(((HrDepartment)hr).doActivity());
        Main.printMessage(hr.getTodaysWork());
        Main.printMessage(hr.getWorkDeadline());
        Main.printMessage(hr.isTodayAHoliday());

        System.out.println("\n");

        Main.printMessage("Welcome to " + tech.departmentName());
        Main.printMessage(tech.getTodaysWork());
        Main.printMessage(tech.getWorkDeadline());
        //type cast
        Main.printMessage(((TechDepartment)tech).getTechStackInformation());
        Main.printMessage(tech.isTodayAHoliday());

    }

    public static void printMessage(String message)
    {
        System.out.println(message);
    }
}
