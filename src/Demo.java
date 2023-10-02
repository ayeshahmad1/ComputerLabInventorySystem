public class Demo {
    public static void main(String[] args) {
        Computer c1 = new Computer("12","dell",6, 512,true );
        Computer c2 = new Computer("12","dell",6, 512,true );
        Lab l1 = new Lab("Comp",new Computer[]{c1,c2},LabStatus.OPERATIONAL,new Employee("12","Hi"));
        l1.addComputer(new Computer("12","heheheh",12,20,true));
        l1.addComputer(new Computer("14","ahahahha",12,20,true));
        System.out.println(l1.computers[0]);
        System.out.println(l1.computers[1]);
        l1.removeComputer("14");
        System.out.println(l1.computers[1]);

    }
}
