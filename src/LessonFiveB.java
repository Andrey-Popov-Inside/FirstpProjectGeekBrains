public class LessonFiveB {
    public static void main(String[] args)
    {
        LessonFiveA[] employees = {
                new LessonFiveA(
                        "Gromov Tor Odinsan",
                        "Director",
                        "Hammer@mail.ru",
                        "+7-111-111-11-11",
                        1000000,
                        1500),
                new LessonFiveA(
                        "Stark Tony Ironmanovich",
                        "Technical Director",
                        "IronMan@gmail.com",
                        "+7-111-222-22-22",
                        1005000,
                        46),
                new LessonFiveA(
                        "Romanova Natasha Ivanovna",
                        "Spy-manager",
                        "BlackWidow@mail.ru",
                        "+7-111-333-33-33",
                        112233,
                        36),
                new LessonFiveA(
                        "Banner Bruce Hulckovich",
                        "Security",
                        "Hulk@yandex.ru",
                        "+7-111-444-44-44",
                        1,
                        39),
                new LessonFiveA(
                        "Rodgers Stive Capitanovich",
                        "Capitan",
                        "America@yahoo.com",
                        "+7-111-555-55-55",
                        999999,
                        94)
        };

        int minAge = 40;
        for (LessonFiveA employee : employees)
        {
            if (employee.age > minAge)
            {
                employee.printInfo();
                System.out.println();
            }
        }
    }
}

