import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Map.Entry;

public class taskNotebook{
    public static void main(String[] args) {
        Notebook inst1 = new Notebook("FDG34S",2784,"SAMSUNG");
        inst1.setColor("black");
        inst1.setHDD(500);
        inst1.setOS("Windows");
        inst1.setRAM(8);
        
        Notebook inst2=new Notebook("3JLK",11847,"HP");
        inst2.setColor("white");
        inst2.setHDD(4000);
        inst2.setOS("MAC");
        inst2.setRAM(16);

        Notebook inst3=new Notebook("74OD9",2357,"LENOVO");
        inst3.setColor("rose");
        inst3.setHDD(1000);
        inst3.setOS("Windows");
        inst3.setRAM(32);

        Notebook inst4=new Notebook("SD21SA",6587,"APPLE");
        inst4.setColor("black");
        inst4.setHDD(800);
        inst4.setOS("Linux");
        inst4.setRAM(16);

        Notebook inst5=new Notebook("HJ7YT",875255,"ACER");
        inst5.setColor("Black");
        inst5.setHDD(2000);
        inst5.setOS("macOS");
        inst5.setRAM(32);
        
        
        HashSet <Notebook> Notebooks = new HashSet<>(Arrays.asList(inst1,inst2,inst3,inst4,inst5));
        HashSet <Notebook> res = new HashSet<>();

        System.out.println("_______________");
        System.out.print("Введите цифру, соответствующую необходимому критерию:\n 1 - ОЗУ \n 2 - Объем ЖД \n 3 - Операционная система \n 4 - цвет \n или 5, чтобы осуществить поиск\n");
        Scanner sc = new Scanner(System.in);
        Integer n = sc.nextInt();
        sc.nextLine();
        HashMap<String, Object> filters = new HashMap<>();
        while(n!=5){
        if(n==1){
            System.out.println("Введите минимальную оперативную память");
            Integer temp = sc.nextInt();
            sc.nextLine();
            filters.put("RAM", temp);
        }
        if(n==2){
            System.out.println("Введите минимальный объем ЖД" );
            Integer temp = sc.nextInt();
            sc.nextLine();
            filters.put("HDD", temp);
        }
        if(n==3){
            System.out.println("Введите ОС");
            String temp = sc.nextLine();
            filters.put("OS", temp);
        }
        if(n==4){
            System.out.println("Введите цвет");
            String temp = sc.nextLine();
            filters.put("color", temp);
        }
        System.out.print("Введите цифру, соответствующую необходимому критерию:\n 1 - ОЗУ \n 2 - Объем ЖД \n 3 - Операционная система \n 4 - цвет \n или 5, чтобы осуществить поиск\n");
        n = sc.nextInt();
        sc.nextLine();
    }
        for (Entry<String, Object> entry : filters.entrySet()) {
            if(entry.getKey().equals("RAM")){
                Iterator it = Notebooks.iterator();
                while(it.hasNext()){
                    Notebook lap = (Notebook) it.next();
                    if(lap.getRAM()>=(Integer)entry.getValue()){
                        res.add(lap);
                    }
                }
                }
            if(entry.getKey().equals("HDD")){
                Iterator it = Notebooks.iterator();
                while(it.hasNext()){
                    Notebook lap = (Notebook)it.next();
                    if(lap.getHDD()>=(Integer)entry.getValue()){
                        res.add(lap);
                        }
                    }
                    }
            if(entry.getKey().equals("OS")){
                Iterator it = Notebooks.iterator();
                while(it.hasNext()){
                    Notebook lap = (Notebook)it.next();
                        if(lap.getOS().equals(entry.getValue())){
                            res.add(lap);
                            }
                        }
                        }
            if(entry.getKey().equals("color")){
                Iterator it = Notebooks.iterator();
                while(it.hasNext()){
                    Notebook lap = (Notebook)it.next();
                        if(lap.getColor().equals(entry.getValue())){
                            res.add(lap);
                                    }
                                }
                                }
            }
        
            Iterator it = res.iterator();
            while(it.hasNext()){
                Notebook lap = (Notebook)it.next();
            System.out.println(lap.toString());
            System.out.println();
        }
        
        
    }
}