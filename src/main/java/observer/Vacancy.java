package observer;

import java.util.Random;

public enum Vacancy {
    Программист,
    Специалист_техподдерки,
    Менеджер,
    HR_специалист;

    private static final Random PRNG = new Random();

    public static Vacancy randomDirection()  {
        Vacancy[] vacancies = values();
        return vacancies[PRNG.nextInt(vacancies.length)];
    }
}
