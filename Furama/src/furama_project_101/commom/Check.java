package furama_project_101.commom;

public class Check {
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
    private static final String REGEX_ADDRESS="^[0-9]{1,4}+(\\s[A-Z][a-z]*)+$";
    public static boolean checkAddress(String address){
        return address.matches(REGEX_ADDRESS);
    }

}
