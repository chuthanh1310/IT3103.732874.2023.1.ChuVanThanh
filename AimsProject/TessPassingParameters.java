package AimsProject;

public class TessPassingParameters {
    public static void swap(Object o1, Object o2){
        Object tmp = o1;
        o1=o2;
        o2=tmp;
    }
    public static void changeTitle(DigitalVideoDisc dvd, String title){
        String oldTitle = dvd.getTitle();
        dvd.setTitle(title);
        dvd = new DigitalVideoDisc(oldTitle);
    }
    public static void main(String[] args) {
        DigitalVideoDisc jungleDVD = new DigitalVideoDisc("Jungle");
        DigitalVideoDisc cinderellaDVD = new DigitalVideoDisc("Cinderella");

        swap(jungleDVD, cinderellaDVD);
        System.out.println("Jungle DVD title: "+jungleDVD.getTitle());
        System.out.println("Cinderella DVD title: "+cinderellaDVD.getTitle());

        changeTitle(jungleDVD,cinderellaDVD.getTitle());
        System.out.println("Jungle DVD title: "+jungleDVD.getTitle());
        newSwap(jungleDVD,cinderellaDVD);
        System.out.println("Correct Swap:");
        System.out.println("Jungle DVD title: "+jungleDVD.getTitle());
    }
    public static void newSwap(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
        DigitalVideoDisc tmp = new DigitalVideoDisc(dvd1.getTitle());
        dvd1.setTitle(dvd2.getTitle());
        dvd2.setTitle(tmp.getTitle());
    }    
}
