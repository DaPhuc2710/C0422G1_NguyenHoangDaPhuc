package furama_project_101.commom;

import furama_project_101.model.human.Customer;
import furama_project_101.model.human.Employee;
import furama_project_101.ultil.ReadAndWriteOfCustomer;
import furama_project_101.ultil.ReadAndWriteOfEmployee;

import java.util.List;

public class CheckPerson {
    private static final String REGEX_NAME = "^[A-Z][a-z]*(\\s[A-Z][a-z]*)+$";

    public static boolean checkName(String name) {
        return name.matches(REGEX_NAME);
    }

    private static final String REGEX_ID_number = "^[0-9]{9}$";

    public static boolean checkIdNumber(String idNumber) {

        return idNumber.matches(REGEX_ID_number);
    }

    private static final String REGEX_TELEPHONE = "^[0][0-9]{9}$";

    public static boolean checkTelephone(String telephone) {
        return telephone.matches(REGEX_TELEPHONE);
    }

    private static final String REGEX_EMAIL = "^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z]+)$";

    public static boolean checkEmail(String email) {
        return email.matches(REGEX_EMAIL);
    }

    private static final String REGEX_EMPLOYEE_ID = "^[A-Z]{2}[0-9]{3}$";

    public static boolean checkEmpId(String employeeId) {
        return employeeId.matches(REGEX_EMPLOYEE_ID);
    }

    private static final String REGEX_CUSTOMER_ID = "^[A-Z]{2}[0-9]{3}$";

    public static boolean checkCustomerId(String customerId) {
        return customerId.matches(REGEX_CUSTOMER_ID);
    }

    private static final String REGEX_ADDRESS = "^[0-9]{1,4}+(\\s[A-Z][a-z]*)+$";

    public static boolean checkAddress(String address) {
        return address.matches(REGEX_ADDRESS);
    }

    public static boolean checkExistIdIEmployee(String id) {
        List<Employee> employeeList = ReadAndWriteOfEmployee.readFileEmployee("src/furama_project_101/data/employee_data/file_source_employee.csv");
        for (int i = 0; i < employeeList.size(); i++) {
            if (employeeList.get(i).getIdNumber().equals(id)) {
                return false; // là 2 số ID đang trùng nhau
            }
        }
        return true;
    }

    public static boolean checkExistIdICustomer(String id) {
        List<Customer> customerList = ReadAndWriteOfCustomer.readFileCustomer("src/furama_project_101/data/customer_data/file_source_customer.csv");
        for (int i = 0; i < customerList.size(); i++) {
            if (customerList.get(i).getIdNumber().equals(id)) {
                return true; // là 2 số ID đang trùng nhau
            }
        }
        return false;
    }
}

