package fi.ptm.cardviewexample;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by pasi on 20/10/16.
 */

public class Employees {
    // employees list
    private List<Employee> employeeList;

    // just fake some data
    public void initializeData() {
        employeeList = new ArrayList<>();
        employeeList.add(new Employee("Jerry Elliott","Account Coordinator","jelliott0@miitbeian.gov.cn","47-(691)872-9398",R.drawable.employee01));
        employeeList.add(new Employee("Angela Porter","Senior Sales Associate","aporter1@typepad.com","60-(429)569-1985",R.drawable.employee02));
        employeeList.add(new Employee("George Perry","Systems Administrator","gperry2@ow.ly","48-(725)921-7325",R.drawable.employee03));
        employeeList.add(new Employee("Debra Frazier","Office Assistant","dfrazier3@nydailynews.com","86-(966)340-2300",R.drawable.employee04));
        employeeList.add(new Employee("Phyllis Kim","Marketing Manager","pkim4@stumbleupon.com","86-(362)499-3458",R.drawable.employee05));
        employeeList.add(new Employee("Brenda Powell","Software Test Engineer","bpowell5@wikia.com","86-(215)925-3477",R.drawable.employee06));
        employeeList.add(new Employee("Sandra Jacobs","Financial Analyst","sjacobs6@sohu.com","17-(849)957-3077",R.drawable.employee07));
        employeeList.add(new Employee("Nancy Ortiz","Community Outreach Specialist","nortiz7@youtube.com","55-(747)877-0210",R.drawable.employee08));
        employeeList.add(new Employee("Andrew Parker","Senior Cost Accountant","aparker8@redcross.org","11-(646)964-8069",R.drawable.employee09));
        employeeList.add(new Employee("Juan Martin","VP Product Management","jmartin9@omniture.com","17-(415)900-8667",R.drawable.employee10));
    }

    // return employee list
    public List<Employee> getEmployees() {
        return employeeList;
    }

    // just add a new employee, called from fab
    public void addEmployee() {
        employeeList.add(new Employee("Jerry Elliott","Account Coordinator","jelliott0@miitbeian.gov.cn","47-(691)872-9398",R.drawable.employee01));
    }
}
