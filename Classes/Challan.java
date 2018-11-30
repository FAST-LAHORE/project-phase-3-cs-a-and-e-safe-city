package safecity.Classes;

public class Challan {
    private int challanAmount;
    private String challanReason;
    private String dueDate;
    private String issueDate;
    private String registrationNumber;

    public Challan(int challanAmount, String challanReason, String dueDate, String issueDate, String registrationNumber) {
        this.challanAmount = challanAmount;
        this.challanReason = challanReason;
        this.dueDate = dueDate;
        this.issueDate = issueDate;
        this.registrationNumber = registrationNumber;
    }
    
    public int getChallanAmount() {
        return challanAmount;
    }

    public void setChallanAmount(int challanAmount) {
        this.challanAmount = challanAmount;
    }

    public String getChallanReason() {
        return challanReason;
    }

    public void setChallanReason(String challanReason) {
        this.challanReason = challanReason;
    }

    public String getDueDate() {
        return dueDate;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    public String getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(String issueDate) {
        this.issueDate = issueDate;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }
}
