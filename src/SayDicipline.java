public class SayDicipline implements Disciplines {
    String name = "Проектирование баз данных";

    public void name() {
        activity_type(name);
    }

    public void activity_type(String someone) {
        name = someone;
        System.out.println(name + " - Практическое занятие");
    }
}
