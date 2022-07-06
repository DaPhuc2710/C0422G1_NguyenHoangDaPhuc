package furama_project_101.model;

import java.time.LocalDate;

public class Booking {
    private String bookingCode;
    private LocalDate beginDate;
    private LocalDate endDate;
    private String customerId;
    private String serviceName;
    private String typeOfService;

    public Booking() {
    }

    public Booking(String bookingCode, LocalDate beginDate, LocalDate endDate, String customerId, String serviceName, String typeOfService) {
        this.bookingCode = bookingCode;
        this.beginDate = beginDate;
        this.endDate = endDate;
        this.customerId = customerId;
        this.serviceName = serviceName;
        this.typeOfService = typeOfService;
    }

    public String getBookingCode() {
        return bookingCode;
    }

    public void setBookingCode(String bookingCode) {
        this.bookingCode = bookingCode;
    }

    public LocalDate getBeginDate() {
        return beginDate;
    }

    public void setBeginDate(LocalDate beginDate) {
        this.beginDate = beginDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getTypeOfService() {
        return typeOfService;
    }

    public void setTypeOfService(String typeOfService) {
        this.typeOfService = typeOfService;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "bookingCode='" + bookingCode + '\'' +
                ", beginDate=" + beginDate +
                ", endDate=" + endDate +
                ", customerId='" + customerId + '\'' +
                ", serviceName='" + serviceName + '\'' +
                ", typeOfService='" + typeOfService + '\'' +
                '}';
    }

    public String getInfoToCSVBooking() {
        return getBookingCode() + "," + getBeginDate() + "," + getEndDate() + "," + getCustomerId() + "," + getServiceName() + "," + getTypeOfService();
    }
}
