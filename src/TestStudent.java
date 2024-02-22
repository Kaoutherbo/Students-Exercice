public class TestStudent {
    public static void main(String[] args) {

        Student etud1 = new Student("Kaouther");
        Student etud4 = new Student();
        Student etud3 = new Student(299,"Adel");
        etud1.specialty="Informatique";
        Student etud2 = new Student(544,"Haroun","Math");
        etud2.specialty=etud1.specialty;
        System.out.println(etud1.name+" "+etud1.specialty);
        System.out.println(etud2.name+" "+etud2.specialty + " " + etud2.Id);
        etud1=etud2;
        etud2.name="Meriem";
        System.out.println(etud1.name+" "+etud1.specialty);

    }
}

