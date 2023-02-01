public class Main {
    public static void main(String[] args) {
        //___Задача_1_____
        //Объявите переменные типа int, byte, short, long, float, double. Название переменных может быть
        // любым, но если состоит из двух слов и более, должно придерживаться правила camelCase.
        //Выведите в консоль значение каждой переменной в формате "Значение переменной … с типом … равно …"
        //Критерии оценки
        // Объявлены типы переменных int, byte, short, long, float, double.
        //Переменные названы согласно правилам Java
        //Пунктуация не нарушена
        //Значения всех переменных выведены в консоль
        byte car = 10;
        System.out.println("Значение переменной car с типом byte равно " + car + " " + "штук.");
        short bus = 5;
        System.out.println("Значение переменной bus с типом short равно " + bus + " " + "штук.");
        int nut = 153;
        System.out.println("Значение переменной nut с типом int равно " + nut + " " + "штук.");
        long bolt = 555;
        System.out.println("Значение переменной bolt с типом long равно " + bolt + " " + "штук.");
        float gasolineCanister = 563.5f;
        System.out.println("Значение переменной gasolineCanister с типом float равно " + gasolineCanister +
                " " + "штук.");
        double tubeLithol = 2345.25d;
        System.out.println("Значение переменной tubeLithol с типом double равно " + tubeLithol + " " + "штук.");

        //Задача 2.
        //Ниже дан список различных значений. Инициализируйте переменные,
        // используя изученные ранее типы переменных.
        //Значения:
        //27.12 ,  987 678 965 549 , 2,786 , false, 569 , -159 , 27897 , 67.
        //Объявите переменные всех типов, присвойте им любые значения (инициализируйте их).
        float a = 27.12f;
        long b = 987678965549L;
        double c = 2.786;
        boolean d = false;
        short e = -159;
        int f = 27897;
        byte g = 67;
        System.out.println("float " + a + ";" + "long " + b + ";" + "double " + c + ";" +"boolean " + d + ";" +
        " short " + e + ";" + " int " + f + ";" + "byte " + g + ".");
        //Задача 3.
        //Трое школьных учителей, Людмила Павловна, Анна Сергеевна и Екатерина Андреевна, ведут три класса.
        //У Людмилы Павловны 23 ученика , у Анны Сергеевны 27 учеников и у Екатерины Андреевны – 30 учеников.
        //Три учительницы закупили все вместе 480 листов бумаги на все три класса. Посчитайте, сколько
        // достанется листов каждому ученику.
        //Результат задачи выведите в консоль в формате "На каждого ученика рассчитано … листов бумаги".
        //Для объявления переменных не используйте тип var.
        int ludmilaPavlovnaPupils = 23;
        int annaSergeevnaPupils = 27;
        int ekaterinaAndreevnaPupils = 30;
        int quantityPupils = ludmilaPavlovnaPupils + annaSergeevnaPupils + ekaterinaAndreevnaPupils;
        int numberSheetsPaper = 480;
        int quantitySheetsPerPupil = numberSheetsPaper/quantityPupils ;
        System.out.println("На каждого ученика рассчитано " + quantitySheetsPerPupil + " " + "листов бумаги.");
        //Задача 4.
        //Производительность машины для изготовления бутылок - 16 бутылок за 2 минуты. Какая производительность
        // машины будет:
        //за 20 минут
        //в сутки
        //за 3 дня
        //за 1 месяц
        //Рассчитывайте продолжительность работы машины в том случае, если она работает без перерыва заданный
        // промежуток времени.
        //Результаты подсчетов выведите в консоль в формате "За … машины произвела бутылок … штук "
        //Для объявления переменных не используйте тип var.
        int bottlePerformanceTwoMin = 16;
        int bottlePerformanceTwentyMin =  bottlePerformanceTwoMin * 10;
        int bottlePerfomanceDay = bottlePerformanceTwoMin  * 720;
        int bottlePerfomanceThreeDay = bottlePerformanceTwoMin * 2160;
        int bottlePerfomanceMonth = bottlePerformanceTwoMin * 21600;
        System.out.println("За 20 минут машина произвела " + bottlePerformanceTwentyMin + " " +"бутылок.");
        System.out.println("За один день машина произвела " + bottlePerfomanceDay + " " +"бутылок.");
        System.out.println("За три дня машина произвела " + bottlePerfomanceThreeDay + " " +"бутылок.");
        System.out.println("За один месяц машина произвела " + bottlePerfomanceMonth + " " +"бутылок.");
        //Задача 5.
        //На ремонт школы нужно 120 банок краски двух цветов: белой и коричневой. На один класс уходит 2 банки
        // белой и 4 банки коричневой краски. Сколько банок каждой краски было куплено?
        //Выведите результат задачи в консоль в формате
        // "В школе, где … классов, нужно … банок белой краски и … банок коричневой краски".
        int quantityCansPaint = 120;
        int whiteCanPaintPerClass = 2;
        int brownCanPaintPerClass = 4;
        int quantityPaintPerClass = whiteCanPaintPerClass + brownCanPaintPerClass;
        int quantityClasses = quantityCansPaint / quantityPaintPerClass;
        int quantityCansPaintWhite = quantityClasses * whiteCanPaintPerClass;
        int quantityCansPaintBrown = quantityClasses * brownCanPaintPerClass;
        System.out.println("В школе, где " + quantityClasses + " " + "классов, нужно "
        + quantityCansPaintWhite + " " + "банок белой краски и " + quantityCansPaintBrown + " " +
                "банок коричневой краски.");
        //Задача 6.
        //Повар, когда готовит еду, взвешивает все продукты, чтобы добиться нужной консистенции.
        //То же делают и спортсмены, которые сидят на правильном питании и тщательно относятся к тому,
        // что и сколько они едят.
        //Вот один из рецептов, который использует наш спортсмен перед тренировкой:
        //Бананы – 5 штук (1 банан - 80 грамм);
        //Молоко – 200 мл (100 мл = 105 грамм);
        //Мороженое пломбир – 2 брикета по 100 грамм;
        //Яйца сырые – 4 яйца (1 яйцо - 70 грамм).
        //Смешать всё в блендере и готово.
        //Подсчитайте вес (количество грамм) такого спорт-завтрака, а затем переведите его в килограммы.
        //Результат напечатайте в консоль.
        //Важное условие: если в рецепт нужно добавить несколько единиц какого-то продукта
        // (с определенным весом), то нужно умножать количество единиц на вес в граммах. Например,
        // если в рецепте указано, что нужно добавить 5 бананов по 80 грамм, то нужно количество (5 бананов)
        // умножить на вес одного (80 грамм), а не считать самому общую сумму грамм.
        int bananasOneWeight = 80;
        short bananasQuantity = 5;
        int bananas = bananasQuantity * bananasOneWeight;
        int milkOneWeight = 105;
        short milkQuantity = 2;
        int milk = milkOneWeight * milkQuantity;
        int iceCreamPlombirOneWeight = 100;
        short iceCreamPlombirQuantity = 2;
        int iceCreamPlombir = iceCreamPlombirQuantity * iceCreamPlombirOneWeight;
        int eggOneWeight = 70;
        short eggsQuantity = 4;
        int eggs = eggsQuantity * eggOneWeight;
        double sportBreakfast = bananas + milk + iceCreamPlombir + eggs;
        double sportBrefkfastKg = sportBreakfast / 1000;
        System.out.println("Вес спорт-завтрака " + sportBreakfast + " " + " грамм." );
        System.out.println("Вес спорт-завтрака " + sportBrefkfastKg + " " + " кг." );
        //Задача 7.
        //Правила соревнований обновились, и теперь нашему спортсмену нужно сбросить 7 кг,
        // чтобы оставаться в своей весовой категории.
        //Тренер скорректировал рацион так, чтобы спортсмен мог терять в весе от 250 до 500 грамм в день.
        //Посчитайте, сколько дней уйдёт на похудение, если спортсмен будет терять каждый день по 250 грамм и
        // сколько, если каждый день будет худеть на 500 грамм.
        //Посчитайте, сколько может потребоваться дней в среднем, чтобы добиться результата похудения.
        //Результаты всех подсчетов выведите в консоль.
        int sportsmanWeightTarget = 7000;
        int dayMinTarget = 250;
        int dayMaxTarget = 500;
        int dayMiddleTarget = dayMinTarget + ((dayMaxTarget - dayMinTarget)/2);
        int moveMin = sportsmanWeightTarget / dayMinTarget;
        int moveMax = sportsmanWeightTarget / dayMaxTarget;
        int moveMiddle = sportsmanWeightTarget / dayMiddleTarget;
        //int moveMiddle = (moveMax + moveMin) / 2;
        System.out.println("Для достижения целевого веса,при минимальной интенсивности тренировок, нужно "
                + moveMin + " " + " дней.");
        System.out.println("Остаток сотавил " + sportsmanWeightTarget % dayMinTarget + " " + "грамм.");
        System.out.println("Для достижения целевого веса,при максимальной интенсивности тренировок, нужно "
                + moveMax + " " + " дней.");
        System.out.println("Остаток сотавил " + sportsmanWeightTarget % dayMaxTarget + " " + "грамм.");
        System.out.println("Для достижения целевого веса,при средней интенсивности тренировок, нужно "
                + moveMiddle + " " + " дней.");
        System.out.println("Остаток сотавил " + sportsmanWeightTarget % dayMiddleTarget + " " + "грамм.");
        //Задача 8.
        //Отойдем от спорта и представим, что мы работаем в большой компании, штат которой состоит из
        // нескольких сотен сотрудников. В компании есть правило, что чем дольше сотрудник работает в компании,
        // тем ценнее он для бизнеса. Поэтому сотрудники, которые работают в компании дольше 3 лет, получают
        // повышение зарплаты раз в год. Каждый год повышение составляет 10% от текущей зарплаты.
        //К вам пришел руководитель с задачей автоматизировать повышение зарплаты, а также провести расчет
        // для следующих сотрудников:
        //Маша получает 67 760 рублей в месяц
        //Денис получает 83 690 рублей в месяц
        //Кристина получает 76 230 рублей в месяц
        //Каждому нужно увеличить зарплату на 10% от текущей месячной. Дополнительно руководитель попросил
        // посчитать разницу между годовым доходом с нынешней зарплатой и после повышения. Посчитайте,
        // сколько будет получать каждый из сотрудников, а также разницу между годовым доходом до и после
        // повышения.
        //Выведите в консоль информацию по каждому сотруднику.
        //Например, "Маша теперь получает **** рублей. Годовой доход вырос на **** рублей".
        int salaryMasha = 67760;
        double increaseSalaryMasha = salaryMasha * 0.1 * 12;
        double addSalaryMasha = salaryMasha + salaryMasha * 0.1;
        System.out.println("Зарплата Маши сегодня,составляет: " + salaryMasha + " " + "рублей.");
        System.out.println("Зарплата Маши после повышения,составит: " + addSalaryMasha + " " + "рублей.");
        System.out.println("Годовое повышение дохода по зарплате Маши составит:" + increaseSalaryMasha +
                " рублей.");
        int salaryDenis = 83690;
        double increaseSalaryDenis = salaryDenis * 0.1 * 12;
        double addSalaryDenis = salaryDenis + salaryDenis * 0.1;
        System.out.println("Зарплата Дениса сегодня,составляет: " + salaryDenis + " " + "рублей.");
        System.out.println("Зарплата Дениса после повышения,составит: " + addSalaryDenis + " " + "рублей.");
        System.out.println("Годовое повышение дохода по зарплате Дениса составит:" + increaseSalaryDenis +
                " рублей.");
        int salaryKristina = 76230;
        double increaseSalaryKristina = salaryKristina * 0.1 * 12;
        double addSalaryKristina = salaryKristina + salaryKristina * 0.1;
        System.out.println("Зарплата Кристины сегодня,составляет: " + salaryKristina + " " + "рублей.");
        System.out.println("Зарплата Кристины после повышения,составит: " + addSalaryKristina + " " + "рублей.");
        System.out.println("Годовое повышение дохода по зарплате Кристины составит:" + increaseSalaryKristina +
                " рублей.");


        System.out.println("Триал есть триал!");
        System.out.println("Hello Russia!Hello China!Hello world!");
    }
}