public class Disciplines_info {
        public static void main(String[] args) {
            Disciplines_info myApp = new Disciplines_info();
            myApp.sayHello();
        }
        public void sayHello() {
            Disciplines Databases = new SayDicipline();
            Disciplines VVS = new Disciplines() {
                String name = "Введение в специальность";
                public void name() {
                    activity_type(name);
                }
                public void activity_type(String someone) {
                    name = someone;
                    System.out.println(name + " - Лабораторная работа");
                }
            };
            Disciplines spanishGreeting = new Disciplines() {
                String name = "Экономика";
                public void name() {
                    activity_type(name);
                }
                public void activity_type(String someone) {
                    name = someone;
                    System.out.println(name + " - Лекция");
                }
            };
            Databases.name();
            VVS.name();
            spanishGreeting.name();
        }
    }