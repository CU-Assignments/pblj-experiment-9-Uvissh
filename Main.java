public class Main {
    public static void main(String[] args) {
        StudentDAO dao = new StudentDAO();

        Student s1 = new Student("Rahul", 21);
        dao.createStudent(s1);

        Student fetched = dao.readStudent(s1.getId());
        System.out.println("Fetched Student: " + fetched.getName());

        fetched.setAge(22);
        dao.updateStudent(fetched);
        System.out.println("Updated Age: " + fetched.getAge());

        dao.deleteStudent(fetched.getId());
        System.out.println("Student deleted.");
    }
}
