package ch11_access_modifier;

import java.util.Scanner;

public class AccessModifierMain {
    public static void main(String[] args) {
        BankAccessModifier bankAccessModifier1 = new BankAccessModifier(12334, "양지은", 90, 7878);
        BankAccessModifier bankAccessModifier2 = new BankAccessModifier(67879, "지은", 89, 6767);

        bankAccessModifier1.showInfo();
        System.out.println();
        bankAccessModifier2.showInfo();
        System.out.println();

        bankAccessModifier1.deposit(7890,7878);
        bankAccessModifier2.deposit(879,6767);

        bankAccessModifier1.withdraw(8990,7878);
        bankAccessModifier2.withdraw(879,6767);

    }

    }

