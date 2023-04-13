package assignment;

class Bank {
    float getRateOfInterest() {
        return 0;
    }
}

class SBI extends Bank {
    
    float getRateOfInterest() {
        return 8.0f;
    }
}

class AXIS extends Bank {
    
    float getRateOfInterest() {
        return 9.0f;
    }
}

class ICICI extends Bank {
    
    float getRateOfInterest() {
        return 7.0f;
    }
}
public class BankInterest {
    public static void main(String[] args) {
        SBI sbi = new SBI();
        AXIS axis = new AXIS();
        ICICI icici = new ICICI();

        System.out.println("SBI Rate of Interest: " + sbi.getRateOfInterest() + "%");
        System.out.println("AXIS Rate of Interest: " + axis.getRateOfInterest() + "%");
        System.out.println("ICICI Rate of Interest: " + icici.getRateOfInterest() + "%");
    }
}

