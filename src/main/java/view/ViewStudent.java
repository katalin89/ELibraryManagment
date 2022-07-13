package view;

import model.Student;
import repository.RepositoryCourse;
import repository.RepositoryStudent;

import java.util.Scanner;

import static view.View.repositoryCourse;

public class ViewStudent {
    public ViewStudent(Student student) {
        RepositoryStudent repositoryStudent = new RepositoryStudent();
        RepositoryCourse repositoryCourse = new RepositoryCourse();

    }

    public void meniu() {
        System.out.println("Apasa tasta 1 pentru a afisa cursurile");
        System.out.println("Apasa tasta 2 pentru afisa cursurile studetului");
    }

    public void play() {
        Scanner scanner = new Scanner(System.in);
        boolean run = true;
        int alegere = 0;
        while (run == true) {
            meniu();
            alegere = Integer.parseInt(scanner.nextLine());
            switch (alegere) {
                case 1:
                    afisareCursuri();
                    break;
            }
        }
    }

    public void afisareCursuri() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti id");
        String i = scanner.nextLine();
        int id = Integer.parseInt(i);
        System.out.println("Introduceti studentID");
        String studId = scanner.nextLine();
        int studentId = Integer.parseInt(studId);
        System.out.println("Introduceti type");
        String type = scanner.nextLine();
        System.out.println("Introduceti description");
        String description = scanner.nextLine();
        System.out.println("Introduceti year");
        String year = scanner.nextLine();
        System.out.println("Logare");

        repositoryCourse.allCourses();

    }
}



/*//persoana este logat=nu mai trebuie sa citim id ul de ex
public class ViewStudent {
    private ControllerPersoana cotrollerPersoana;
    private ControllerBook controllerBook;
    private ControllerEnrolment controllerEnrolment;
    private ControllerCurs controllerCurs;

    Persoana persoana;

    public ViewStudent(Persoana persoana) {
        cotrollerPersoana = new ControllerPersoana(Path.of("src", "com", "company", "resources", "persoane.txt").toString());
        controllerBook = new ControllerBook(Path.of("src", "com", "company", "resources", "books.txt").toString());
        controllerEnrolment = new ControllerEnrolment(Path.of("src", "com", "company", "resources", "enrolments.txt").toString());
        controllerCurs = new ControllerCurs(Path.of("src", "com", "company", "resources", "cursuri.txt").toString());

        this.persoana=persoana;
//        play();
    }


    public void meniu() {
        System.out.println("*******************STUDENT**************************");
        System.out.println("Apasa tasta 1 pentru a afisa cursurile ");
        System.out.println("Apasa tasta 2 pentru a afisa toate cursurile la care este inscris studentul");
        System.out.println("Apasa tasta 3 pentru a inscrie la un curs");
        System.out.println("Apasa tasta 4 pentru unscribe curs");


    }

    public void play() {
        Scanner citeste = new Scanner(System.in);//System in = ami a  billentyuzetrol jon
        boolean run = true;
        int alegere = 0;
        meniu();
        //cotrollerPersoana.load();
        while (run = true) {
            alegere = Integer.parseInt(citeste.nextLine());//Beolvassa amit en irok(1,2),a citeste objektummal olvasok be
            switch (alegere) {
                case 1:
                    controllerCurs.afiseaza();
                    break;
                case 2:
                    cursurileStudentului();
                    break;
                case 3:
                    inscrieLaCurs();
                    break;

                case 4:
                    unscribeCurs();
                    break;
                default:
            }
        }
    }

    public void cursurileStudentului() {
        System.out.println("Sunti inscris la cursurile");
        ArrayList<Enrolment> studentEnrolments = controllerEnrolment.returnLista(this.persoana.getId());
        for (Enrolment enrolment : studentEnrolments) {
            System.out.println(controllerCurs.returnCurs(enrolment.getCourseId()).descriere());
        }
    }

    public void inscrieLaCurs() {
      Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti cursul la care doriti sa va inscrieti");
        String name =scanner.nextLine();

        Curs curs= controllerCurs.returnCursDupaNume(name);


        if(curs!=null){

            Enrolment x = new Enrolment(
                    controllerEnrolment.nextId(),//pentru obiectul nou x dam un id urmator
                    this.persoana.getId(),
                    curs.getId(),
                     "12.12.23"
                    );

            controllerEnrolment.adauga(x);
            controllerEnrolment.saveFiser();

            System.out.println("V-ati inscris la "+curs.getName());

        }

    }

    public void unscribeCurs() {

        Scanner scanner=new Scanner(System.in);
        ArrayList<Enrolment>enrolments=controllerEnrolment.returnLista(persoana.getId());
        System.out.println("Introduceti numele cursului");
        String  nume=scanner.nextLine();
         Curs curs =controllerCurs.returnCursDupaNume(nume);
         int persId= persoana.getId();
         int cursId= curs.getId();
         System.out.println("Studentul a renuntat la cursul introdus");
         controllerEnrolment.stergeDupaStCurs(persId,cursId);
         controllerEnrolment.saveFiser();

    }
}
*/