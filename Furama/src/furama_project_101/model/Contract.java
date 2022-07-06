package furama_project_101.model;

public class Contract {
    private String contractNum;
    private  String bookingCode;
    private int deposit;
    private int totalPaid;
    private String customerId;
    public Contract(){}

    public Contract(String contractNum, String bookingCode, int deposit, int totalPaid, String customerId) {
        this.contractNum = contractNum;
        this.bookingCode = bookingCode;
        this.deposit = deposit;
        this.totalPaid = totalPaid;
        this.customerId = customerId;
    }

    public String getContractNum() {
        return contractNum;
    }

    public void setContractNum(String contractNum) {
        this.contractNum = contractNum;
    }

    public String getBookingCode() {
        return bookingCode;
    }

    public void setBookingCode(String bookingCode) {
        this.bookingCode = bookingCode;
    }

    public int getDeposit() {
        return deposit;
    }

    public void setDeposit(int deposit) {
        this.deposit = deposit;
    }

    public int getTotalPaid() {
        return totalPaid;
    }

    public void setTotalPaid(int totalPaid) {
        this.totalPaid = totalPaid;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    @Override
    public String toString() {
        return "Contract{" +
                "contractNum='" + contractNum + '\'' +
                ", bookingCode='" + bookingCode + '\'' +
                ", deposit=" + deposit +
                ", totalPaid=" + totalPaid +
                ", customerId='" + customerId + '\'' +
                '}';
    }
    public String getInfoToCSVContract(){
        return getContractNum()+","+getBookingCode()+","+getDeposit()+","+getTotalPaid()+","+getCustomerId();
    }
}
