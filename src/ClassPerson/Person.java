package ClassPerson;

public class Person {


        private String name;
        private int age;
        private String job;
        private int num;

        public Person(String name, int age, String job, int num) {
            this.name = name;
            this.age = age;
            this.job =  job;
            this.num = num;
        }
        public Person(){}

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getJob() {
            return job;
        }

        public void setJob(String job) {
            this.job = job;
        }

        public int getNum() {
            return num;
        }

        public void setNum(int num) {
            this.num = num;
        }

        @Override
        public String toString() {
            return "Nguoi{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    ", job='" + job + '\'' +
                    ", num=" + num +
                    '}';
        }


    }


