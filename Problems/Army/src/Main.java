class Army {

    public static void createArmy() {
        // Implement this method
        Unit unit1 = new Unit("One");
        Unit unit2 = new Unit("Two");
        Unit unit3 = new Unit("Three");
        Unit unit4 = new Unit("Four");
        Unit unit5 = new Unit("Five");

        Knight knight1 = new Knight("Jon");
        Knight knight2 = new Knight("Eddard");
        Knight knight3 = new Knight("Bran");

        General general = new General("Shang");

        Doctor doctor = new Doctor("Doc");
    }


    // Don't change the code below
    static class Unit {
        static String nameUnit;
        static int countUnit;

        public Unit(String name) {
            countUnit++;
            nameUnit = name;

        }
    }

    static class Knight {
        static String nameKnight;
        static int countKnight;

        public Knight(String name) {
            countKnight++;
            nameKnight = name;

        }
    }

    static class General {
        static String nameGeneral;
        static int countGeneral;

        public General(String name) {
            countGeneral++;
            nameGeneral = name;

        }
    }

    static class Doctor {
        static String nameDoctor;
        static int countDoctor;

        public Doctor(String name) {
            countDoctor++;
            nameDoctor = name;

        }
    }

    public static void main(String[] args) {
        createArmy();
        System.out.println(Unit.countUnit);
        System.out.println(Knight.countKnight);
        System.out.println(General.countGeneral);
        System.out.println(Doctor.countDoctor);
    }

}