public class Main {
    public static void main(String[] args) {

//        Shark, Parrot, Lion деген класс түзүңүз
//        Алардын поляларын ойлоп табыңыз
//        Класстарга конструкторлордун баардык түрүн түзүңүз
//        Бир канча объекттерин түзүп, аларга маанилерин бериңиз
//        Аларды консольго чыгарыңыз

        Shark shark = new Shark("Jaw","Mako",230,7);
        System.out.println(shark.getSharkName()+"\n"+shark.getBreeds()+"\n"+shark.getWeight()+"\n"+shark.getLength());

        System.out.println("--------");


        Parrot parrot = new Parrot("bird","Kesha","Ara",35,45);
        System.out.println(parrot.getViev()+"\n"+parrot.getParrotName()+
                "\n"+parrot.getBreeds()+"\n"+parrot.getWeight()+"\n"+parrot.getLength());

        System.out.println("--------");

        Lion lion = new Lion("Simba","Filadae","Pantera",250,3);
        System.out.println(lion.getLionName()+"\n"+lion.getFamillies()+
                "\n"+lion.getGenus()+"\n"+lion.getWeight()+"\n"+lion.getLength());


        }


    }
