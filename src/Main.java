public class Main {
    public static void main(String[] args) {
        // Задача 6
        int age = 19;
        double salary = 58000;

        if (age >= 23) {
            if (salary >= 80000) {
                salary = salary * 3 * 1.5;
                System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + salary + " рублей");
            } else if (salary >= 50000) {
                salary = salary * 3 * 1.2;
                System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + salary + " рублей");
            } else {
                salary = salary * 3;
                System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + salary + " рублей");
            }
        } else {
            if (salary >= 80000) {
                salary = salary * 2 * 1.5;
                System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + salary + " рублей");
            } else if (salary >= 50000) {
                salary = salary * 2 * 1.2;
                System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + salary + " рублей");
            } else {
                salary = salary * 2;
                System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + salary + " рублей");
            }
        }

        // Задание 7
        int age1 = 25;
        double salary1 = 60_000;
        double wantedSum = 330_000;
        double baseRate = 10;
        int loanTerm = 12;
        double maxMonthlyPayment = salary1 / 2;
        double payment = (wantedSum + wantedSum / 100 * baseRate) / loanTerm;
        double goodSalary = 80_000;
        double discont = 0.7;
        int clientsAge1 = 23;
        double bidIncrease1 = 1;
        int clientsAge2 = 30;
        double bidIncrease2 = 0.5;

        if (age1 < clientsAge1 && salary1 > goodSalary) {
            baseRate = baseRate - discont + bidIncrease1;
            if (maxMonthlyPayment < payment) {
                System.out.println("Максимальный платеж при ЗП " + salary1 + " равен " + maxMonthlyPayment + " рублей. Платеж по кредиту " + payment + " рублей. Отказано");
            } else {
                System.out.println("Максимальный платеж при ЗП " + salary1 + " равен " + maxMonthlyPayment + " рублей. Платеж по кредиту " + payment + " рублей. Одобрено");
            }
        } else if (age1 < clientsAge2 && salary1 > goodSalary) {
            baseRate = baseRate - discont + bidIncrease2;
            if (maxMonthlyPayment < payment) {
                System.out.println("Максимальный платеж при ЗП " + salary1 + " равен " + maxMonthlyPayment + " рублей. Платеж по кредиту " + payment + " рублей. Отказано");
            } else {
                System.out.println("Максимальный платеж при ЗП " + salary1 + " равен " + maxMonthlyPayment + " рублей. Платеж по кредиту " + payment + " рублей. Одобрено");
            }
        } else if (salary1 > goodSalary) {
            baseRate = baseRate - discont;
            if (maxMonthlyPayment < payment) {
                System.out.println("Максимальный платеж при ЗП " + salary1 + " равен " + maxMonthlyPayment + " рублей. Платеж по кредиту " + payment + " рублей. Отказано");
            } else {
                System.out.println("Максимальный платеж при ЗП " + salary1 + " равен " + maxMonthlyPayment + " рублей. Платеж по кредиту " + payment + " рублей. Одобрено");
            }
        } else if (age1 < clientsAge1) {
            baseRate = baseRate + bidIncrease1;
            if (maxMonthlyPayment < payment) {
                System.out.println("Максимальный платеж при ЗП " + salary1 + " равен " + maxMonthlyPayment + " рублей. Платеж по кредиту " + payment + " рублей. Отказано");
            } else {
                System.out.println("Максимальный платеж при ЗП " + salary1 + " равен " + maxMonthlyPayment + " рублей. Платеж по кредиту " + payment + " рублей. Одобрено");
            }
        } else if (age1 < clientsAge2) {
            baseRate = baseRate + bidIncrease2;
            if (maxMonthlyPayment < payment) {
                System.out.println("Максимальный платеж при ЗП " + salary1 + " равен " + maxMonthlyPayment + " рублей. Платеж по кредиту " + payment + " рублей. Отказано");
            } else {
                System.out.println("Максимальный платеж при ЗП " + salary1 + " равен " + maxMonthlyPayment + " рублей. Платеж по кредиту " + payment + " рублей. Одобрено");
            }
        } else {
            if (maxMonthlyPayment < payment) {
                System.out.println("Максимальный платеж при ЗП " + salary1 + " равен " + maxMonthlyPayment + " рублей. Платеж по кредиту " + payment + " рублей. Отказано");
            } else {
                System.out.println("Максимальный платеж при ЗП " + salary1 + " равен " + maxMonthlyPayment + " рублей. Платеж по кредиту " + payment + " рублей. Одобрено");
            }
        }
    }
}