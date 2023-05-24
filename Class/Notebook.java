/* Урок 6. Хранение и обработка данных ч3: множество коллекций Set
Подумать над структурой класса Ноутбук для магазина техники — выделить поля и методы. Реализовать в Java.
Создать множество ноутбуков.
Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации 
и выведет ноутбуки, отвечающие фильтру. Критерии фильтрации можно хранить в Map. Например:
“Введите цифру, соответствующую необходимому критерию:
1 - ОЗУ
2 - Объём ЖД
3 - Операционная система
4 - Цвет …

Далее нужно запросить минимальные значения для указанных критериев 
— сохранить параметры фильтрации можно также в Map.
Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.
Формат сдачи: файл с расширением java или ссылка на гит с подписанными ФИ и номером группы. 
{
    
*/

/**
 * 
 * @param id - ID
 * @param brand - Название производителя
 * @param model - Модель
 * @param nameOS - Нименование операционнйо системы
 * @param color - Цвет
 * @param ofRAM - Объем ОЗУ
 * @param ofHDD - Объем жёсткого диска
 */
public class Notebook {
    
    private Integer id = null;
    private String brand = null;
    private String model = null;
    private String nameOS = null;
    private String color = null;
    private Integer ofRAM = null;
    private Integer ofHDD = null;


    public Notebook(String model,Integer id, String brand){
        this.model = model;
        this.id = id;
        this.brand = brand;
        System.out.println("Ноутбук марки "+"'"+ this.brand+"'"+" Модель "+this.model+" С id " +Integer.toString(this.id));
        }

    public String getColor(){
        return this.color;
    }
    public Integer getRAM(){
        return this.ofRAM;
    }
    public String getOS(){
        return this.nameOS;
    }
    public Integer getHDD(){
        return this.ofHDD;
    }
    public Integer getid(){
        return this.id;
    }
    public String getBrand(){
        return this.brand;
    }
    public String getModel(){
        return this.model;
    }
    
    public void setColor(String color){
        this.color =color;
    }
    public void setRAM(Integer ofRAM){
        this.ofRAM = ofRAM;
    }
    public void setOS(String OS){
        this.nameOS = nameOS;
    }
    public void setHDD(Integer ofHDD){
        this.ofHDD = ofHDD;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Ноутбук ");
        sb.append(this.id);
        sb.append(System.lineSeparator());
        sb.append(this.color);
        sb.append(" ");
        sb.append(this.brand);
        sb.append(" ");
        sb.append(this.model);
        sb.append(System.lineSeparator());
        sb.append("OS "+this.nameOS);
        sb.append(System.lineSeparator());
        sb.append("HDD "+this.ofHDD);
        sb.append(System.lineSeparator());
        sb.append("RAM "+this.ofRAM);
        sb.append(System.lineSeparator());
        
        return(sb.toString());
    }

}
