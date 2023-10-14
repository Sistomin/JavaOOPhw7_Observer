package observer;
// ИстоминСА / группа 4832
public class Program {

    /**
     *  TODO: Доработать приложение, которое разрабатывалось на семинаре, поработать с шаблоном проектирования Observer,
     *  добавить новый тип соискателя.
     *  Добавить новую сущность "Вакансия", компания должна рассылать вакансии.
     *  Только после этого вы можете усложнить ваше приложение (при желании), например, добавить тип вакансии (enum),
     *  учитывать тип вакансии при отправке предложения соискателю.
     * @param args
     */
    public static void main(String[] args) {
        Publisher jobAgency = new JobAgency();
        Company google = new Company("Google", jobAgency, 120000);
        Company yandex = new Company("Yandex", jobAgency, 95000);
        Company geekBrains = new Company("GeekBrains", jobAgency, 98000);

        Student student1 = new Student("Студент #1");
        Master master1 = new Master("Мастер #1");
        Middle middle1 = new Middle("Мидл #1");

        jobAgency.registerObserver(student1);
        jobAgency.registerObserver(master1);
        jobAgency.registerObserver(middle1);

        for (int i = 0; i < 5; i++){
            google.needEmployee();
            yandex.needEmployee();
            geekBrains.needEmployee();
            System.out.println(" ");
        }

    }

}
