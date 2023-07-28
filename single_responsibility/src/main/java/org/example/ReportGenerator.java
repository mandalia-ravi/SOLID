package org.example;

public class ReportGenerator {

    public void generateReport(Customer customer, String reportType) {
        if(reportType.equalsIgnoreCase("CSV")) {
            System.out.println("CSV Report Generated");
        }
        if(reportType.equalsIgnoreCase("XML")) {
            System.out.println("XML Report Generated");
        }
    }
}
