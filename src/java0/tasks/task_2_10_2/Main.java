package java0.tasks.task_2_10_2;

/* реализуйте метод main и класс Human здесь */
public class Main {
    public static void main(String[] args) {
        Human human = new Human("Aleksandr", 35);

        human.sayHello();
    }

    public static class Human {
        String name;
        int age;

        public Human(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public void sayHello() {
            System.out.println("Привет, меня зовут " + name + ", мне " + age + " лет.");
        }
    }
}
