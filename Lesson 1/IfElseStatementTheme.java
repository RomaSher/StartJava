package HW2;

public class ifElseStatementTheme {

    public static void main(String[] args) {
        
        int age = 28;
        boolean sexMen = true;
        double height = 177;
        String name = "Raman";

        System.out.println("\n1. Translation of pseudocode into Java language\n");

        if (age > 20) {
            System.out.println("Age more then 20");
        } else {
            System.out.println("Age less then 20");
        }

        if (!sexMen) {
            System.out.println("Sex: Woman");            
        } else {
            System.out.println("Sex: Men");
        }

        if (height < 180) {
            System.out.println("Less middle height");
        } else {
            System.out.println("More middle height");
        }

        char firstLetName = name.charAt(0);
        if (firstLetName == 'M') {
            System.out.println("The first letter of name: M");
        } else if (firstLetName == 'I') {
            System.out.println("The first letter of name: I");
        } else {
            System.out.println("Another first letter of name");
        }

        System.out.println("\n2. Finding max and min numbers\n");

        int a1 = 123;
        int b1 = 124;

        if (a1 > b1) {
            System.out.println("Maximum number a = " + a1);
            System.out.println("Minimum number b = " + b1);
        } else if (a1 < b1) {
            System.out.println("Maximum number b = " + b1);
            System.out.println("Minimum number a = " + a1);
        } else {
            System.out.println("The numbers are equal: " + a1 + " = " + b1);
        }

        System.out.println("\n3. Number check\n");

        long number = -2L;
        if (number == 0) {
            System.out.println("Number is 0: " + number);          
        } else {
            if ((number % 2) == 0) {
            System.out.println("Number is even: " + number);            
            } else {
                System.out.println("Number is not even: " + number);
            }
            if (number > 0) {
                System.out.println("Number is positive: " + number);
            } else {
                System.out.println("Number is negative: " + number);
            }    
        }

        System.out.println("\n4. Finding the same digits in numbers\n");

        int a2 = 666;
        int b2 = 665;

        int sotie1 = a2/100;
        int desiatie1 = (a2%100)/10;
        int edinici1 = (a2%100)%10;
        int sotie2 = b2/100;
        int desiatie2 = (b2%100)/10;
        int edinici2 = (b2%100)%10;

        if (sotie1 == sotie2) {
            if (desiatie1 == desiatie2) {
                if (edinici1 == edinici2) {
                    System.out.println("Ishodnie chisla: " + a2 + " | " + b2);
                    System.out.println("Odinakovie cifri: " + sotie1 + " | " + sotie2 + "; " + desiatie1
                        + " | " + desiatie2 + "; " + edinici1 + " | " + edinici2);
                    System.out.println("Nomera razriada: 1, 2, 3");
                } else {
                    System.out.println("Ishodnie chisla: " + a2 + " | " + b2);
                    System.out.println("Odinakovie cifri: " + sotie1 + " | " + sotie2 + "; " + desiatie1
                        + " | " + desiatie2);
                    System.out.println("Nomera razriada: 2, 3");
                }
                
            } else if (edinici1 == edinici2) {
                System.out.println("Ishodnie chisla: " + a2 + " | " + b2);
                System.out.println("Odinakovie cifri: " + sotie1 + " | " + sotie2 + "; " + edinici1
                    + " | " + edinici2);
                System.out.println("Nomera razriada: 1, 3");
            } else {
                System.out.println("Ishodnie chisla: " + a2 + " | " + b2);
                System.out.println("Odinakovie cifri: " + sotie1 + " | " + sotie2);
                System.out.println("Nomera razriada: 3");
            }
        } else if (desiatie1 == desiatie2) {
                if (edinici1 == edinici2) {
                    System.out.println("Ishodnie chisla: " + a2 + " | " + b2);
                    System.out.println("Odinakovie cifri: " + desiatie1 + " | " + desiatie2 + "; "
                        + edinici1 + " | " + edinici2);
                    System.out.println("Nomera razriada: 1, 2");
                } else {
                    System.out.println("Ishodnie chisla: " + a2 + " | " + b2);
                    System.out.println("Odinakovie cifri: " + desiatie1 + " | " + desiatie2);
                    System.out.println("Nomera razriada: 2");
                }
                
            } else if (edinici1 == edinici2) {
                System.out.println("Ishodnie chisla: " + a2 + " | " + b2);
                System.out.println("Odinakovie cifri: " + edinici1 + " | " + edinici2);
                System.out.println("Nomera razriada: 1");
            } else {
                System.out.println("Net odinakovih cifr");
            }

        System.out.println("\n5. Determining a symbol by its code\n");

        char c = '\u0057';
        int i = c;

        if (48 <= i && i <= 57) {
            System.out.println("Chislo: " + c);            
        } else if (65 <= i && i <= 90) {
            System.out.println("Bolshaia bykva: " + c);
        } else if (97 <= i && i <= 122) {
            System.out.println("Malenkaia bykva: " + c);
        } else {
            System.out.println("Ni bykva i ni chislo: " + c);
        }

        System.out.println("\n6. Calculation of the deposit amount and % accrued by the bank\n");

        double vklad = 300_000;
        double procent1 = 5;
        double procent2 = 7;
        double procent3 = 10;

        if (vklad <= 100_000) {
            System.out.println("Summa vklada: " + vklad);
            System.out.println("Nachislennii procent: " + vklad*procent1/100);
            System.out.println("Summa + %: " + (vklad + vklad*procent1/100));
        } else if (vklad >= 300_000) {
            System.out.println("Summa vklada: " + vklad);
            System.out.println("Nachislennii procent: " + vklad*procent3/100);
            System.out.println("Summa + %: " + (vklad + vklad*procent3/100));
        } else {
            System.out.println("Summa vklada: " + vklad);
            System.out.println("Nachislennii procent: " + vklad*procent2/100);
            System.out.println("Summa + %: " + (vklad + vklad*procent2/100));
        }

        System.out.println("\n7. Determination of grade in subjects\n");

        int procentIstoria = 59;
        int ocenkaIstoria;
        int procentProgram = 91;
        int ocenkaProgram;

        if (procentIstoria > 91) {
            ocenkaIstoria = 5;
        } else if (procentIstoria > 73) {
            ocenkaIstoria = 4;
        } else if (procentIstoria > 60) {
            ocenkaIstoria = 3;
        } else {
            ocenkaIstoria = 2;
        }

        if (procentProgram > 91) {
            ocenkaProgram = 5;
        } else if (procentProgram > 73) {
            ocenkaProgram = 4;
        } else if (procentProgram > 60) {
            ocenkaProgram = 3;
        } else {
            ocenkaProgram = 2;
        }

        System.out.println(ocenkaIstoria + " - ocenka po istorii");
        System.out.println(ocenkaProgram + " - ocenka po programirovaniiy");
        System.out.println((ocenkaIstoria + ocenkaProgram)/2 + " - sredniia ocenka");
        System.out.println((procentIstoria + procentProgram)/2 + " - srednii %");

        System.out.println("\n8. Profit calculation for the year\n");

        int arenda = 5_000;
        int pribil = 15_000;
        int sebestoimost = 9_000;

        int pribilGod = pribil*12 - arenda*12 - sebestoimost*12;

        if (pribilGod > 0) {
            System.out.println("Pribil za god: +" + pribilGod);
        } else {
            System.out.println("Pribil za god: " + pribilGod);
        }

        System.out.println("\n9. Counting the number of banknotes\n");

        int cash = 567;

        int nominal100 = 100;
        int nominal10 = 10;
        int nominal1 = 1;

        int bankomat100 = 10;
        int bankomat10 = 5;
        int bankomat1 = 50;
        int cashBankomat = 100*bankomat100 + 10*bankomat10 + 1*bankomat1;

        int skolko100 = cash/100;
        int ostatok = cash%100;
        int skolko10 = ostatok/10;
        int skolko1 = ostatok%10;

        if (cash <= cashBankomat) {
            if (skolko100 <= bankomat100) {
                if (skolko10 <= bankomat10) {
                    if (skolko1 <= bankomat1) {
                        System.out.println("Nominali: " + nominal100 + "; " + nominal10 + "; " + nominal1);
                        System.out.println("Kolichestvo: " + skolko100 + "; " + skolko10 + "; " + skolko1);
                        System.out.println("Summa: " + cash);
                    } else {
                        System.out.println("Nedostatochno banknot dlia vidachi nyznoi summi!");
                    }
                } else {
                    int neHvataet10 = skolko10 - bankomat10;
                    int dobavit1 = (neHvataet10*nominal10)/nominal1;
                    skolko1 += dobavit1;
                    if (skolko1 <= bankomat1) {
                        System.out.println("Nominali: " + nominal100 + "; " + nominal10 + "; " + nominal1);
                        System.out.println("Kolichestvo: " + skolko100 + "; " + bankomat10 + "; " + skolko1);
                        System.out.println("Summa: " + cash);
                    } else {
                        System.out.println("Nedostatochno banknot dlia vidachi nyznoi summi!");
                    }
                }
            } else {
                int neHvataet100 = skolko100 - bankomat100;
                int dobavit10 = (neHvataet100*nominal100)/nominal10;
                skolko10 += dobavit10;
                if (skolko10 <= bankomat10) {
                    if (skolko1 <= bankomat1) {
                        System.out.println("Nominali: " + nominal100 + "; " + nominal10 + "; " + nominal1);
                        System.out.println("Kolichestvo: " + bankomat100 + "; " + skolko10 + "; " + skolko1);
                        System.out.println("Summa: " + cash);
                    } else {
                        System.out.println("Nedostatochno banknot dlia vidachi nyznoi summi!");
                    }
                } else {
                    int neHvataet10 = skolko10 - bankomat10;
                    int dobavit1 = (neHvataet10*nominal10)/nominal1;
                    skolko1 += dobavit1;
                    if (skolko1 <= bankomat1) {
                        System.out.println("Nominali: " + nominal100 + "; " + nominal10 + "; " + nominal1);
                        System.out.println("Kolichestvo: " + bankomat100 + "; " + bankomat10 + "; " + skolko1);
                        System.out.println("Summa: " + cash);
                    } else {
                        System.out.println("Nedostatochno banknot dlia vidachi nyznoi summi!");
                    }
                }
            }
            
        } else {
            System.out.println("V bankomate nedostatochno sredstv!");
        }


    }
}