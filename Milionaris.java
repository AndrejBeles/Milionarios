/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication6;   

import java.util.Scanner;
import java.util.Random; 

public class JavaApplication6 {

  
   
   
    public static void main(String[] args) {
      System.out.println("                          Ahoj, vítam ťa v hre  MILIONÁR");
      System.out.println("                              -----Pravidlá hry-----");
      System.out.println("1.Cieľom hry Milionár je odpovedať na 15 otázok, ktorých obtiažnosť postupne rastie.")
      System.out.println("  Ku kažej otázke máte štyri možnosti, z ktorých vždy práve jedna je správna.");
      System.out.println("2.Ak odpoviete na otázku správne, tak postupujete na ďalšiu, ak nesprávne, tak hra sa končí.");
      System.out.println("3.Hru Milionár môžete ukončiť kedykoľvek a na akejkoľvek otázke.");
      System.out.println("4.Počas hry Milionár máte k dispozícii troch žolíkov: '50 na 50', 'zavolám známemu' a 'opýtam sa");
      System.out.println("  publika'.Kvôli rozpočtu a náročnosti otázok žolíkov môžete použiť každú 2. otázku a to ešte náhodne.")
      System.out.println("-----------------------------------------------------------------------------------------------------");
      System.out.println("Tieto otáky boli vytvorené profesionálným tímom za učelom ,nedať milion len tak hoci komu");
      System.out.println("+ ako bonus tieto otázky prevria či si priravený na život");
       Scanner scan = new Scanner(System.in);
       System.out.println("-----------------------------------------------------------------------------------------------------");
      System.out.println("Si pripravený? ano/nie");
      System.out.println("-----------------------------------------------------------------------------------------------------");
     String input = scan.nextLine();

    if (input.equals("ano")) {
        
    } else {
         System.out.println("kočíš a nie si pripravený na život");
        System.exit(0);
    } 
    /*1.Otázka*/
    
   System.out.println("-----------------------------------------------------------------------------------------------------");
   System.out.println("                                             1.Otázka za 100 €");
   System.out.println("                                 Možeš na tuto otazku odpovedat zle?");
   
   System.out.println("A.nie                                               C.NIE ,ale s velkymi pismenami");
   System.out.println("B.určite nie                                        D.akože vôbec");
   System.out.print("Odpoveď je ");
    String prva = scan.nextLine();
    System.out.println("-----------------------------------------------------------------------------------------------------");
    if (prva.equals("D")) {
        System.out.println("Tvoja odpoveď bola správna,získavaš 100 €");
    } else {
         System.out.println("Tvoja odpoveď bola správna,získavaš 100 €");
        
    }
    System.out.println("-----------------------------------------------------------------------------------------------------");
    
    System.out.println("Chceš porkačovať ano/nie");
    System.out.println("-----------------------------------------------------------------------------------------------------");
    String dd = scan.nextLine();

    if (dd.equals("ano")) {
        
    } else {
         System.out.println("Domov si odnášaš 100 €");
         System.out.println("Výhru si môžeš vybrať pomocou linku -https://www.youtube.com/watch?v=d1YBv2mWll0&ab_channel=Sordiway");
        System.exit(0);
       }
    
    
    
    
    /*2.Otázka*/
      Scanner scan = new Scanner(System.in);
      Random rn = new Random();
        
  System.out.println("-----------------------------------------------------------------------------------------------------");
  System.out.println("                                             2.Otázka za 200 €");
  System.out.println("                             Prečo je tehotný kôn rýchlejší ako normálny?");
  System.out.println("                                             Lebo...");
  System.out.println("A.neplatí na neho gravitácia a lieta                              C.viac hláv ,viac rozumu");
  System.out.println("B. ¯\_(ツ)_/¯                                                      D.má viac koní");
  System.out.println("-----------------------------------------------------------------------------------------------------");
  System.out.println( "Odpovedať (napíš 1 )"  );
  System.out.println( "Požiadať o pomoc polobohov (napíš 2 )"  );
  System.out.println("-----------------------------------------------------------------------------------------------------");
  String neviem = scan.nextLine();
      
    if (neviem.equals("1")) {
        System.out.print("Odpoveď je ");
        String prva = scan.nextLine();
        if (prva.equals("D")) {
        System.out.println("Získavaš 200 €");
        } else {
         System.out.println("Prehral si na druhej otázke celkom trápne,ale nič nenarobiš serus");
         System.exit(0);
         }
    } else {
         for(int i =0; i < 1; i++)
{  
    int answer = rn.nextInt(3) + 1;
    System.out.println("--- ");
    System.out.print("¦");
    System.out.print(answer);
    System.out.println("¦");
  System.out.println("---");
  
}
    System.out.print("Napíšte číslo,ktoré vám vypísla tabuľka : ");
    String ddd = scan.nextLine();
    
   if (ddd.equals("1")) {
       System.out.println("Vybral si si 50/50"); 
       System.out.println("D.má viac koní/C.viac hláv ,viac rozumu");
        System.out.print("Odpoveď je ");
         String prva = scan.nextLine();

        if (prva.equals("D")) {
        System.out.println("Získavaš 200 €");
        } else {
         System.out.println("Prehral si na druhej otázke celkom trápne,ale nič nenarobiš serus");
         System.exit(0);
         }
    }
    
    
    
    if (ddd.equals("2")) {
        System.out.println("Vybral si si opýtam sa publika");
        System.out.println("A.22% B.14% C.12% D.52%");
        System.out.print("Odpoveď je ");
    String prva = scan.nextLine();

        if (prva.equals("D")) {
        System.out.println("Získavaš 200 €");
        } else {
         System.out.println("Prehral si na druhej otázke celkom trápne,ale nič nenarobiš serus");
         System.exit(0);
         }
    }
    
    
    
    
    if (ddd.equals("3")) {
        System.out.println("Vybral si si zavolám známemu");
        System.out.println("Je to D :) ");
        System.out.print("Odpoveď je ");
    String prva = scan.nextLine();

        if (prva.equals("D")) {
        System.out.println("Získavaš 200 €");
        } else {
         System.out.println("Prehral si na druhej otázke celkom trápne,ale nič nenarobiš serus");
         System.exit(0);
         }
    }
    
       }

  System.out.println("-----------------------------------------------------------------------------------------------------");
    
    System.out.println("Chceš porkačovať ano/nie");
    System.out.println("-----------------------------------------------------------------------------------------------------");
    String dd = scan.nextLine();

    if (dd.equals("ano")) {
        
    } else {
         System.out.println("Domov si odnášaš 200 €.");
         System.out.println("Výhru si môžeš vybrať pomocou linku - https://www.youtube.com/watch?v=d1YBv2mWll0&ab_channel=Sordiway");
        System.exit(0);
       }



/*3.Otázka*/
    System.out.println("-----------------------------------------------------------------------------------------------------");
   System.out.println("                                             3.Otázka za 300 €");
   System.out.println("                                              Kto je podvodnik?");
   
   System.out.println("A.ten typco čo býva pod vodou                          C.chelba s malsom");
   System.out.println("B.niekto kto nám chce pomôcť                           D.niekto kto sa nás snaží okabátiť");
   System.out.print("Odpoveď je ");
    String prva = scan.nextLine();
    System.out.println("-----------------------------------------------------------------------------------------------------");
    if (prva.equals("A")) {
        System.out.println("Tvoja odpoveď bola správna,získavaš 300 €");
    } else {
         System.out.println("Tvoja odpoveď bola nesprávna,ak si dal D som z teba sklamaný");
         System.exit(0);
    }
    System.out.println("-----------------------------------------------------------------------------------------------------");
    
    System.out.println("Chceš porkačovať ano/nie");
    System.out.println("-----------------------------------------------------------------------------------------------------");
    String dd = scan.nextLine();

    if (dd.equals("ano")) {
        
    } else {
         System.out.println("Domov si odnášaš 300 €");
         System.out.println("Výhru si môžeš vybrať pomocou linku - https://www.youtube.com/watch?v=d1YBv2mWll0&ab_channel=Sordiway");
        System.exit(0);
       }
    


/*4.Otázka*/
    System.out.println("-----------------------------------------------------------------------------------------------------");
  System.out.println("                                             4.Otázka za 500 €");
  System.out.println("                             Čo možeš vložit do kýbla aby bol svetelejši?");
 
  System.out.println("A.konzervovaný smiech                                    C.pigmenťákov");
  System.out.println("B.pochodeň                                               D.dieru");
  System.out.println("-----------------------------------------------------------------------------------------------------");
  System.out.println( "Odpovedať (napíš 1 )"  );
  System.out.println( "Požiadať o pomoc polobohov (napíš 2 )"  );
  System.out.println("-----------------------------------------------------------------------------------------------------");
  String neviem = scan.nextLine();
      
    if (neviem.equals("1")) {
        System.out.print("Odpoveď je ");
        String prva = scan.nextLine();
        if (prva.equals("B")) {
        System.out.println("Získavaš 500 €");
        } else {
         System.out.println("Prehral si ,ale nič nenarobiš serus");
         System.exit(0);
         }
    } else {
         for(int i =0; i < 1; i++)
{  
    int answer = rn.nextInt(3) + 1;
    System.out.println("--- ");
    System.out.print("¦");
    System.out.print(answer);
    System.out.println("¦");
  System.out.println("---");
  
}
    System.out.print("Napíšte číslo,ktoré vám vypísla tabuľka : ");
    String ddd = scan.nextLine();
    
   if (ddd.equals("1")) {
       System.out.println("Vybral si si 50/50"); 
       System.out.println("C.pigmenťákov/B.pochodeň");
        System.out.print("Odpoveď je ");
         String prva = scan.nextLine();

        if (prva.equals("B")) {
        System.out.println("Získavaš 500 €");
        } else {
         System.out.println("Prehral si ,ale nič nenarobiš serus");
         System.exit(0);
         }
    }
    
    
    
    if (ddd.equals("2")) {
        System.out.println("Vybral si si opýtam sa publika");
        System.out.println("A.15% B.30% C.40% D.15%");
        System.out.print("Odpoveď je ");
    String prva = scan.nextLine();

        if (prva.equals("B")) {
        System.out.println("Získavaš 200 €");
        } else {
         System.out.println("Prehral si ,ale nič nenarobiš serus");
         System.exit(0);
         }
    }
    
    
    
    
    if (ddd.equals("3")) {
        System.out.println("Vybral si si zavolám známemu");
        System.out.println("Však B.pochodeň aby si videl ty maďar :) ");
        System.out.print("Odpoveď je ");
    String prva = scan.nextLine();

        if (prva.equals("B")) {
        System.out.println("Získavaš 500 €");
        } else {
         System.out.println("Prehral si ,ale nič nenarobiš serus");
         System.exit(0);
         }
    }
    
       }

  System.out.println("-----------------------------------------------------------------------------------------------------");
    
    System.out.println("Chceš porkačovať ano/nie");
    System.out.println("-----------------------------------------------------------------------------------------------------");
    String dd = scan.nextLine();

    if (dd.equals("ano")) {
        
    } else {
         System.out.println("Domov si odnášaš 500 €.");
         System.out.println("Výhru si môžeš vybrať pomocou linku - https://www.youtube.com/watch?v=d1YBv2mWll0&ab_channel=Sordiway");
        System.exit(0);
       }
    


/*5.Otázka*/
    System.out.println("-----------------------------------------------------------------------------------------------------");
   System.out.println("                                             5.Otázka za 1000 €");
   System.out.println("                                              Ako zabiješ vlkodlaka?");
   
   System.out.println("A.Čierny pudin                                         C.Cillit bang");
   System.out.println("B.Lakom na topánky                                     D.Škaredo sa na neho pozrieš");
   System.out.print("Odpoveď je ");
    String prva = scan.nextLine();
    System.out.println("-----------------------------------------------------------------------------------------------------");
    if (prva.equals("B")) {
        System.out.println("Tvoja odpoveď bola správna,získavaš 1000 €");
    } else {
         System.out.println("Smola prehral si ");
         System.exit(0);
    }
    System.out.println("-----------------------------------------------------------------------------------------------------");
    
    System.out.println("Chceš porkačovať ano/nie");
    System.out.println("-----------------------------------------------------------------------------------------------------");
    String dd = scan.nextLine();

    if (dd.equals("ano")) {
        
    } else {
         System.out.println("Domov si odnášaš 1000 €");
         System.out.println("Výhru si môžeš vybrať pomocou linku - https://www.youtube.com/watch?v=d1YBv2mWll0&ab_channel=Sordiway");
        System.exit(0);
       }
    


/*6.Otázka*/
     System.out.println("-----------------------------------------------------------------------------------------------------");
  System.out.println("                                             6.Otázka za 2000 €");
  System.out.println("                                    Aké je Drakulove obľubené  jedlo?");
 
  System.out.println("A.Kuracie mäso                                           C.Krv");
  System.out.println("B.Pastiersky koláč                                       D.Urán");
  System.out.println("-----------------------------------------------------------------------------------------------------");
  System.out.println( "Odpovedať (napíš 1 )"  );
  System.out.println( "Požiadať o pomoc polobohov (napíš 2 )"  );
  System.out.println("-----------------------------------------------------------------------------------------------------");
  String neviem = scan.nextLine();
      
    if (neviem.equals("1")) {
        System.out.print("Odpoveď je ");
        String prva = scan.nextLine();
        if (prva.equals("C")) {
        System.out.println("Získavaš 2000 €");
        } else {
         System.out.println("Prehral si ,ale nič nenarobiš serus");
         System.exit(0);
         }
    } else {
         for(int i =0; i < 1; i++)
{  
    int answer = rn.nextInt(3) + 1;
    System.out.println("--- ");
    System.out.print("¦");
    System.out.print(answer);
    System.out.println("¦");
  System.out.println("---");
  
}
    System.out.print("Napíšte číslo,ktoré vám vypísla tabuľka : ");
    String ddd = scan.nextLine();
    
   if (ddd.equals("1")) {
       System.out.println("Vybral si si 50/50"); 
       System.out.println("C.Krv/D.Urán");
        System.out.print("Odpoveď je ");
         String prva = scan.nextLine();

        if (prva.equals("C")) {
        System.out.println("Získavaš 2000€");
        } else {
         System.out.println("Prehral si ,ale nič nenarobiš serus");
         System.exit(0);
         }
    }
    
    
    
    if (ddd.equals("2")) {
        System.out.println("Vybral si si opýtam sa publika");
        System.out.println("A.5% B.3% C.80% D.12%");
        System.out.print("Odpoveď je ");
    String prva = scan.nextLine();

        if (prva.equals("C")) {
        System.out.println("Získavaš 2000 €");
        } else {
         System.out.println("Prehral si ,ale nič nenarobiš serus");
         System.exit(0);
         }
    }
    
    
    
    
    if (ddd.equals("3")) {
        System.out.println("Vybral si si zavolám známemu");
        System.out.println("Krv to je bráško :) ");
        System.out.print("Odpoveď je ");
    String prva = scan.nextLine();

        if (prva.equals("C")) {
        System.out.println("Získavaš 2000€");
        } else {
         System.out.println("Prehral si ,ale nič nenarobiš serus");
         System.exit(0);
         }
    }
    
       }

  System.out.println("-----------------------------------------------------------------------------------------------------");
    
    System.out.println("Chceš porkačovať ano/nie");
    System.out.println("-----------------------------------------------------------------------------------------------------");
    String dd = scan.nextLine();

    if (dd.equals("ano")) {
        
    } else {
         System.out.println("Domov si odnášaš 2000 €.");
         System.out.println("Výhru si môžeš vybrať pomocou linku - https://www.youtube.com/watch?v=d1YBv2mWll0&ab_channel=Sordiway");
        System.exit(0);
       }
    


/*7.Otázka*/
    System.out.println("-----------------------------------------------------------------------------------------------------");
   System.out.println("                                             7.otázka za 4000 €");
   System.out.println("                                                 Meno vtipnej ženy");
   
   System.out.println("A.?                                                     C.?");
   System.out.println("B.?                                                     D.?");
   System.out.print("Odpoveď je ");
    String prva = scan.nextLine();
    System.out.println("-----------------------------------------------------------------------------------------------------");
    if (prva.equals("A")) {
        System.out.println("Neexistuje získavaš 4000 €");
    } else {
         System.out.println("Neexistuje získavaš 4000 €");
         
    }
    System.out.println("-----------------------------------------------------------------------------------------------------");
    
    System.out.println("Chceš porkačovať ano/nie");
    System.out.println("-----------------------------------------------------------------------------------------------------");
    String dd = scan.nextLine();

    if (dd.equals("ano")) {
        
    } else {
         System.out.println("Domov si odnášaš 4000 €");
         System.out.println("Výhru si môžeš vybrať pomocou linku - https://www.youtube.com/watch?v=d1YBv2mWll0&ab_channel=Sordiway");
        System.exit(0);
       }
    


/*8.Otázka*/
     System.out.println("-----------------------------------------------------------------------------------------------------");
  System.out.println("                                             8.Otázka za 8000 €");
  System.out.println("                 Čo dostaneme ,ked napíšeme do kalukalčky  číslo 1 a pridáme číslo 2 a dáme rovnása");
 
  System.out.println("A.Error                                                  C.Správnu odpoveď");
  System.out.println("B.12                                                     D.3/5");
  System.out.println("-----------------------------------------------------------------------------------------------------");
  System.out.println( "Odpovedať (napíš 1 )"  );
  System.out.println( "Požiadať o pomoc polobohov (napíš 2 )"  );
  System.out.println("-----------------------------------------------------------------------------------------------------");
  String neviem = scan.nextLine();
      
    if (neviem.equals("1")) {
        System.out.print("Odpoveď je ");
        String prva = scan.nextLine();
        if (prva.equals("C")) {
        System.out.println("Získavaš 8000 €");
        } else {
         System.out.println("Prehral si ,ale nič nenarobiš serus");
         System.exit(0);
         }
    } else {
         for(int i =0; i < 1; i++)
{  
    int answer = rn.nextInt(3) + 1;
    System.out.println("--- ");
    System.out.print("¦");
    System.out.print(answer);
    System.out.println("¦");
  System.out.println("---");
  
}
    System.out.print("Napíšte číslo,ktoré vám vypísla tabuľka : ");
    String ddd = scan.nextLine();
    
   if (ddd.equals("1")) {
       System.out.println("Vybral si si 50/50"); 
       System.out.println("C.Správnu odpoveď/A.Error ");
        System.out.print("Odpoveď je ");
         String prva = scan.nextLine();

        if (prva.equals("B")) {
        System.out.println("Získavaš 8000 €");
        } else {
         System.out.println("Prehral si ,ale nič nenarobiš serus");
         System.exit(0);
         }
    }
    
    
    
    if (ddd.equals("2")) {
        System.out.println("Vybral si si opýtam sa publika");
        System.out.println("A.20% B.15% C.50% D.15%");
        System.out.print("Odpoveď je ");
    String prva = scan.nextLine();

        if (prva.equals("B")) {
        System.out.println("Získavaš 8000 €");
        } else {
         System.out.println("Prehral si ,ale nič nenarobiš serus");
         System.exit(0);
         }
    }
    
    
    
    
    if (ddd.equals("3")) {
        System.out.println("Vybral si si zavolám známemu");
        System.out.println("Však správnu odpoveď ty marha :) ");
        System.out.print("Odpoveď je ");
    String prva = scan.nextLine();

        if (prva.equals("B")) {
        System.out.println("Získavaš 8000 €");
        } else {
         System.out.println("Prehral si ,ale nič nenarobiš serus");
         System.exit(0);
         }
    }
    
       }

  System.out.println("-----------------------------------------------------------------------------------------------------");
    
    System.out.println("Chceš porkačovať ano/nie");
    System.out.println("-----------------------------------------------------------------------------------------------------");
    String dd = scan.nextLine();

    if (dd.equals("ano")) {
        
    } else {
         System.out.println("Domov si odnášaš 8000 €.");
         System.out.println("Výhru si môžeš vybrať pomocou linku - https://www.youtube.com/watch?v=d1YBv2mWll0&ab_channel=Sordiway");
        System.exit(0);
       }

/*9.Otázka*/
    System.out.println("-----------------------------------------------------------------------------------------------------");
   System.out.println("                                             9.Otázka za 16 000 €");
   System.out.println("                                             Je to C ale zároveň B");
   
   System.out.println("A.D                                                     C.B");
   System.out.println("B.C                                                     D.A");
   System.out.print("Odpoveď je ");
    String prva = scan.nextLine();
    System.out.println("-----------------------------------------------------------------------------------------------------");
    if (prva.equals("C")) {
        System.out.println("Tvoja odpoveď bola správna,získavaš 16 000 €");
    } else {
         System.out.println("Tvoja odpoveď bola nesprávna,hovoril som ,že to je C.");
         System.exit(0);
    }
    System.out.println("-----------------------------------------------------------------------------------------------------");
    
    System.out.println("Chceš porkačovať ano/nie");
    System.out.println("-----------------------------------------------------------------------------------------------------");
    String dd = scan.nextLine();

    if (dd.equals("ano")) {
        
    } else {
         System.out.println("Domov si odnášaš 16 000 €");
         System.out.println("Výhru si môžeš vybrať pomocou linku - https://www.youtube.com/watch?v=d1YBv2mWll0&ab_channel=Sordiway");
        System.exit(0);
       }
    




/*10.Otázka*/
     System.out.println("-----------------------------------------------------------------------------------------------------");
  System.out.println("                                             10.Otázka za 32 000 €");
  System.out.println("                                             Najlepí čelen Fizi crew?");
 
  System.out.println("A.HUMI                                                   C.tá baba");
  System.out.println("B.FIZI                                                   D.ďaľších už neviem");
  System.out.println("-----------------------------------------------------------------------------------------------------");
  System.out.println( "Odpovedať (napíš 1 )"  );
  System.out.println( "Požiadať o pomoc polobohov (napíš 2 )"  );
  System.out.println("-----------------------------------------------------------------------------------------------------");
  String neviem = scan.nextLine();
      
    if (neviem.equals("1")) {
        System.out.print("Odpoveď je ");
        String prva = scan.nextLine();
        if (prva.equals("A")) {
        System.out.println("Získavaš 32 000 €");
        } else {
         System.out.println("Prehral si ,ale nič nenarobiš serus");
         System.exit(0);
         }
    } else {
         for(int i =0; i < 1; i++)
{  
    int answer = rn.nextInt(3) + 1;
    System.out.println("--- ");
    System.out.print("¦");
    System.out.print(answer);
    System.out.println("¦");
  System.out.println("---");
  
}
    System.out.print("Napíšte číslo,ktoré vám vypísla tabuľka : ");
    String ddd = scan.nextLine();
    
   if (ddd.equals("1")) {
       System.out.println("Vybral si si 50/50"); 
       System.out.println("A.HUMI/A.HUMI");
        System.out.print("Odpoveď je ");
         String prva = scan.nextLine();

        if (prva.equals("A")) {
        System.out.println("Získavaš 32 000 €");
        } else {
         System.out.println("Prehral si ,ale nič nenarobiš serus");
         System.exit(0);
         }
    }
    
    
    
    if (ddd.equals("2")) {
        System.out.println("Vybral si si opýtam sa publika");
        System.out.println("A.100% B.0% C.0% D.0%");
        System.out.print("Odpoveď je ");
    String prva = scan.nextLine();

        if (prva.equals("A")) {
        System.out.println("Získavaš 32 000 €");
        } else {
         System.out.println("Prehral si ,ale nič nenarobiš serus");
         System.exit(0);
         }
    }
    
    
    
    
    if (ddd.equals("3")) {
        System.out.println("Vybral si si zavolám známemu");
        System.out.println("A.HUMI A.HUMI A.HUMI A.HUMI :) ");
        System.out.print("Odpoveď je ");
    String prva = scan.nextLine();

        if (prva.equals("A")) {
        System.out.println("Získavaš 32 000 €");
        } else {
         System.out.println("Prehral si ,ale nič nenarobiš serus");
         System.exit(0);
         }
    }
    
       }

  System.out.println("-----------------------------------------------------------------------------------------------------");
    
    System.out.println("Chceš porkačovať ano/nie");
    System.out.println("-----------------------------------------------------------------------------------------------------");
    String dd = scan.nextLine();

    if (dd.equals("ano")) {
        
    } else {
         System.out.println("Domov si odnášaš 32 000 €.");
         System.out.println("Výhru si môžeš vybrať pomocou linku - https://www.youtube.com/watch?v=d1YBv2mWll0&ab_channel=Sordiway");
        System.exit(0);
       }
    



/*11.Otázka*/
    System.out.println("-----------------------------------------------------------------------------------------------------");
   System.out.println("                                             11.Otázka za 64 000 €");
   System.out.println("                                             Aká odpoveď bola v otákze 9.?");
   
   System.out.println("A.A                                                     C.C");
   System.out.println("B.B                                                     D.D");
   System.out.print("Odpoveď je ");
    String prva = scan.nextLine();
    System.out.println("-----------------------------------------------------------------------------------------------------");
    if (prva.equals("C")) {
        System.out.println("Tvoja odpoveď bola správna,získavaš 64 000 €");
    } else {
         System.out.println("Tvoja odpoveď bola nesprávna, som z teba sklamaný");
         System.exit(0);
    }
    System.out.println("-----------------------------------------------------------------------------------------------------");
    
    System.out.println("Chceš porkačovať ano/nie");
    System.out.println("-----------------------------------------------------------------------------------------------------");
    String dd = scan.nextLine();

    if (dd.equals("ano")) {
        
    } else {
         System.out.println("Domov si odnášaš 64 000 €");
         System.out.println("Výhru si môžeš vybrať pomocou linku - https://www.youtube.com/watch?v=d1YBv2mWll0&ab_channel=Sordiway");
        System.exit(0);
       }



/*12.Otázka*/
     System.out.println("-----------------------------------------------------------------------------------------------------");
  System.out.println("                                             12.Otázka za 125 000 €");
  System.out.println("                                          Z čoho je vytvorena cukrova vata?");
 
  System.out.println("A.Rúžových oblakov                                       C.Cukor");
  System.out.println("B.Bavlna                                                 D.Páperie");
  System.out.println("-----------------------------------------------------------------------------------------------------");
  System.out.println( "Odpovedať (napíš 1 )"  );
  System.out.println( "Požiadať o pomoc polobohov (napíš 2 )"  );
  System.out.println("-----------------------------------------------------------------------------------------------------");
  String neviem = scan.nextLine();
      
    if (neviem.equals("1")) {
        System.out.print("Odpoveď je ");
        String prva = scan.nextLine();
        if (prva.equals("A")) {
        System.out.println("Získavaš 125 000 €");
        } else {
         System.out.println("Prehral si ,ale nič nenarobiš serus");
         System.exit(0);
         }
    } else {
         for(int i =0; i < 1; i++)
{  
    int answer = rn.nextInt(3) + 1;
    System.out.println("--- ");
    System.out.print("¦");
    System.out.print(answer);
    System.out.println("¦");
  System.out.println("---");
  
}
    System.out.print("Napíšte číslo,ktoré vám vypísla tabuľka : ");
    String ddd = scan.nextLine();
    
   if (ddd.equals("1")) {
       System.out.println("Vybral si si 50/50"); 
       System.out.println("A.Rúžových oblakov/B.Bavlna");
        System.out.print("Odpoveď je ");
         String prva = scan.nextLine();

        if (prva.equals("B")) {
        System.out.println("Získavaš 125 000 €");
        } else {
         System.out.println("Prehral si ,ale nič nenarobiš serus");
         System.exit(0);
         }
    }
    
    
    
    if (ddd.equals("2")) {
        System.out.println("Vybral si si opýtam sa publika");
        System.out.println("A.75% B.5% C.5% D.5%");
        System.out.print("Odpoveď je ");
    String prva = scan.nextLine();

        if (prva.equals("B")) {
        System.out.println("Získavaš 125 000 €");
        } else {
         System.out.println("Prehral si ,ale nič nenarobiš serus");
         System.exit(0);
         }
    }
    
    
    
    
    if (ddd.equals("3")) {
        System.out.println("Vybral si si zavolám známemu");
        System.out.println("Však z Rúžových oblakov ,po kt. skáču jednorožce :) ");
        System.out.print("Odpoveď je ");
    String prva = scan.nextLine();

        if (prva.equals("B")) {
        System.out.println("Získavaš 125 000 €");
        } else {
         System.out.println("Prehral si ,ale nič nenarobiš serus");
         System.exit(0);
         }
    }
    
       }

  System.out.println("-----------------------------------------------------------------------------------------------------");
    
    System.out.println("Chceš porkačovať ano/nie");
    System.out.println("-----------------------------------------------------------------------------------------------------");
    String dd = scan.nextLine();

    if (dd.equals("ano")) {
        
    } else {
         System.out.println("Domov si odnášaš 125 000 €.");
         System.out.println("Výhru si môžeš vybrať pomocou linku - https://www.youtube.com/watch?v=d1YBv2mWll0&ab_channel=Sordiway");
        System.exit(0);
       }



/*13.Otázka*/
   System.out.println("-----------------------------------------------------------------------------------------------------");
   System.out.println("                                             ?.Otázka za 250 000 €");
   System.out.println("                                            Ake je toto čislo otázky?");
   
   System.out.println("A.√196                                                 C.√144");
   System.out.println("B.√121                                                 D.√169");
   System.out.print("Odpoveď je ");
    String prva = scan.nextLine();
    System.out.println("-----------------------------------------------------------------------------------------------------");
    if (prva.equals("D")) {
        System.out.println("Tvoja odpoveď bola správna,získavaš 250 000 €");
    } else {
         System.out.println("Tvoja odpoveď bola nesprávna,ak si dal D som z teba sklamaný");
         System.exit(0);
    }
    System.out.println("-----------------------------------------------------------------------------------------------------");
    
    System.out.println("Chceš porkačovať ano/nie");
    System.out.println("-----------------------------------------------------------------------------------------------------");
    String dd = scan.nextLine();

    if (dd.equals("ano")) {
        
    } else {
         System.out.println("Domov si odnášaš 250 000 €");
         System.out.println("Výhru si môžeš vybrať pomocou linku - https://www.youtube.com/watch?v=d1YBv2mWll0&ab_channel=Sordiway");
        System.exit(0);
       }




/*14.Otázka*/
     System.out.println("-----------------------------------------------------------------------------------------------------");
  System.out.println("                                             14.Otázka za 500 000 €");
  System.out.println("                                           Ako hráš s dieťaťom šípky ?");
 
  System.out.println("A.velmi bezpečne                                         C.nehráš");
  System.out.println("B.mieriš na tvar                                         D.proste nerob");
  System.out.println("-----------------------------------------------------------------------------------------------------");
  System.out.println( "Odpovedať (napíš 1 )"  );
  System.out.println( "Požiadať o pomoc polobohov (napíš 2 )"  );
  System.out.println("-----------------------------------------------------------------------------------------------------");
  String neviem = scan.nextLine();
      
    if (neviem.equals("1")) {
        System.out.print("Odpoveď je ");
        String prva = scan.nextLine();
        if (prva.equals("D")) {
        System.out.println("Získavaš 500 000 €");
        } else {
         System.out.println("Prehral si ,ale nič nenarobiš serus");
         System.exit(0);
         }
    } else {
         for(int i =0; i < 1; i++)
{  
    int answer = rn.nextInt(3) + 1;
    System.out.println("--- ");
    System.out.print("¦");
    System.out.print(answer);
    System.out.println("¦");
  System.out.println("---");
  
}
    System.out.print("Napíšte číslo,ktoré vám vypísla tabuľka : ");
    String ddd = scan.nextLine();
    
   if (ddd.equals("1")) {
       System.out.println("Vybral si si 50/50"); 
       System.out.println("D.proste nerob/C.nehráš");
        System.out.print("Odpoveď je ");
         String prva = scan.nextLine();

        if (prva.equals("D")) {
        System.out.println("Získavaš 500 000 €");
        } else {
         System.out.println("Prehral si ,ale nič nenarobiš serus");
         System.exit(0);
         }
    }
    
    
    
    if (ddd.equals("2")) {
        System.out.println("Vybral si si opýtam sa publika");
        System.out.println("A.0% B.0% C.25% D.75%");
        System.out.print("Odpoveď je ");
    String prva = scan.nextLine();

        if (prva.equals("D")) {
        System.out.println("Získavaš 500 000 €");
        } else {
         System.out.println("Prehral si ,ale nič nenarobiš serus");
         System.exit(0);
         }
    }
    
    
    
    
    if (ddd.equals("3")) {
        System.out.println("Vybral si si zavolám známemu");
        System.out.println("D.proste nerob :) ");
        System.out.print("Odpoveď je ");
    String prva = scan.nextLine();

        if (prva.equals("D")) {
        System.out.println("Získavaš 500 000 €");
        } else {
         System.out.println("Prehral si ,ale nič nenarobiš serus");
         System.exit(0);
         }
    }
    
       }

  System.out.println("-----------------------------------------------------------------------------------------------------");
    
    System.out.println("Chceš porkačovať ano/nie");
    System.out.println("-----------------------------------------------------------------------------------------------------");
    String dd = scan.nextLine();

    if (dd.equals("ano")) {
        
    } else {
         System.out.println("Domov si odnášaš 500 000 €.");
         System.out.println("Výhru si môžeš vybrať pomocou linku - https://www.youtube.com/watch?v=d1YBv2mWll0&ab_channel=Sordiway");
        System.exit(0);
       }


/*15.Otázka*/
   System.out.println("-----------------------------------------------------------------------------------------------------");
   System.out.println("                                             15.Otázka za 1 000 000 €");
   System.out.println("                                              Užil si si qiuz?");
   
   System.out.println("A.ano                                                   C.milujem ho");
   System.out.println("B.nie                                                   D.lol otazka čislo 15");
   System.out.print("Odpoveď je ");
    String prva = scan.nextLine();
    System.out.println("-----------------------------------------------------------------------------------------------------");
    if (prva.equals("D")) {
        System.out.println("Tvoja odpoveď bola správna,získavaš  1 000 000€");
        System.out.println("Výhru si môžeš vybrať pomocou linku - https://www.youtube.com/watch?v=d1YBv2mWll0&ab_channel=Sordiway");
        System.exit(0);
    } else {
         System.out.println("Tvoja odpoveď bola nesprávna,ak si dal D som z teba sklamaný");
         System.exit(0);
    }
   
    
