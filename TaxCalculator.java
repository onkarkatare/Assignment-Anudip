package com.cognizant.tax;

public class TaxCalculator {
    private float basicSalary;
    private boolean citizenship;
    private float tax;
    private int nettSalary;

    public void calculateTax() {
        tax = 30 * basicSalary / 100;
        System.out.println("The Tax of the employee for the " + basicSalary + " is " + tax);
    }

    public void deductTax() {
        nettSalary = (int) (basicSalary - tax);
        System.out.println("The nett salary of the employee " + nettSalary);
    }

    public void validateSalary() {
        boolean response = (basicSalary > 100000 && citizenship);
        System.out.println("The salary and citizenship eligibility: " + response);
    }

    // getter and setter methods for the instance variables
    public void setBasicSalary(float basicSalary) {
        this.basicSalary = basicSalary;
    }

    public void setCitizenship(boolean citizenship) {
        this.citizenship = citizenship;
    }
    public static void main(String[] args) {
        TaxCalculator taxCalculator = new TaxCalculator();
        taxCalculator.setBasicSalary(25000);
        taxCalculator.setCitizenship(true);
        taxCalculator.calculateTax();
        taxCalculator.deductTax();
        taxCalculator.validateSalary();
    }
}
