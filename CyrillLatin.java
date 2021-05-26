package module3.lesson5_WriteReadFile.ExtraTasks;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CyrillLatin {
    public static String[] latin = {"a", "b", "ch", "d", "e", "e", "f", "g", "g‘", "g'", "h", "i", "j", "k", "q", "l", "m", "n", "o", "o‘", "o'", "p", "r", "s", "sh", "t", "u", "v", "x", "y", "z", "’", "A", "B", "Ch", "D", "E", "E", "F", "G", "G‘", "G'", "H", "I", "J", "K", "Q", "L", "M", "N", "O", "O‘", "O'", "P", "R", "S", "Sh", "T", "U", "V", "X", "Y", "Z", "’", "“", "”", "’", "ya", "Ya", "yo", "Yo", "yu", "Yu"};
    public static String[] cyrill = {"а", "б", "ч", "д", "э", "е", "ф", "г", "ғ", "ғ", "ҳ", "и", "ж", "к", "қ", "л", "м", "н", "о", "ў", "ў", "п", "р", "с", "ш", "т", "у", "в", "х", "й", "з", "ъ", "А", "Б", "Ч", "Д", "Е", "Э", "Ф", "Г", "Ғ", "Ғ", "Ҳ", "И", "Ж", "К", "Қ", "Л", "М", "Н", "О", "Ў", "Ў", "П", "Р", "С", "Ш", "Т", "У", "В", "Х", "Й", "З", "Ъ", "«", "»", "ь", "я", "Я", "ё", "Ё", "ю", "Ю"};

    public static String[] latin_words_lower = {"abzas", "aksent", "avianoses", "batsilla", "biomitsin", "botsman", "bronenoses", "brutselloz", "cherepitsa", "dotsent", "fransuz", "gaubitsa", "gers", "glitserin", "gorchitsa", "gusenitsa", "inersiya", "inssenirovka", "kalsiy", "kansler", "koeffitsient", "konferens-zal", "konsepsiya", "konsern", "konsert", "konslager", "kultivatsiya", "kvars", "litsey", "lotsman", "marganes", "minonoses", "munitsipalitet", "ofitsiant", "penitsillin", "platsdarm", "platskarta", "politsmeyster", "jinsiyat", "pensiya", "ranes", "ritsar", "sellofan", "selluloid", "selluloza", "selsiy", "sement", "sentner", "sentrifuga", "senz", "senzor", "senzura", "sex", "shnitsel", "shveysar", "siferblat", "silindr", "silindrik", "singa", "sink", "sirk", "sirkulyar", "sisterna", "sitrus", "sotsiologik", "sotsiologiya", "ssenariy", "kultivator", "kultivatsiya", "kuryer", "lager", "losos", "mebel", "medal", "medalyon", "menshevik", "menshevizm", "migren", "mikrofilm", "mil", "model", "neft", "nikel", "nippel", "nol", "noyabr", "oktabr", "palto", "panel", "parallel", "parol", "parter", "patrul", "pavilyon", "pedal", "plastir", "pochtalyon", "porshen", "portfel", "povest", "predoxranitel", "premyera", "pristan", "puls", "pyesa", "rels", "relyef", "rentabel", "rezba", "ritsar", "rol", "royal", "rul", "seld", "selsiy", "sentabr", "shinel", "shnitsel", "shpatel", "shpilka", "shpindel", "shtapel", "shtempel", "shtepsel", "spektakl", "spiral", "sterjen", "sudya", "sulfat", "tabel", "tekstil", "tokar", "tulen", "tunnel", "umivalnik", "valeryanka", "vals", "veksel", "velvet", "ventil", "vermishel", "vimpel", "violonchel", "volfram", "volt", "volta", "voltmetr", "vulgar", "yakor", "yanvar", "yuriskonsult", "ansambl", "artel", "artikl", "aryergard", "asfalt", "atelye", "avtomobil", "balzam", "banderol", "batalyon", "bilyard", "binokl", "bolshevik", "budilnik", "bulvar", "dalton", "dekabr", "delfin", "devalvatsiya", "dirijabl", "dizel", "dizel-motor", "duel", "dvigatel", "emulsiya", "eskadrilya", "fakultativ", "fakultet", "falsifikator", "falsifikatsiya", "feldmarshal", "feldsher", "festival", "fevral", "filtr", "folklor", "fotoalbom", "fotoatelye", "gantel", "gastrol", "gilza", "gospital", "gotovalniy", "grifel", "impuls", "insult", "intervyu", "inyeksiya", "italyan", "iyul", "iyun", "kabel", "kalendar", "kanifol", "karamel", "kartel", "karusel", "katapulta", "kinofestival", "kinofilm", "kisel", "kitel", "kobalt", "kompanyon", "konferansye", "obyekt", "razyezd", "subyekt", "syezd", "syomka", "Abzas", "Aksent", "Avianoses", "Batsilla", "Biomitsin", "Botsman", "Bronenoses", "Brutselloz", "Cherepitsa", "Dotsent", "Fransuz", "Gaubitsa", "Gers", "Glitserin", "Gorchitsa", "Gusenitsa", "Inersiya", "Inssenirovka", "Kalsiy", "Kansler", "Koeffitsient", "Konferens-Zal", "Konsepsiya", "Konsern", "Konsert", "Konslager", "Kultivatsiya", "Kvars", "Litsey", "Lotsman", "Marganes", "Minonoses", "Munitsipalitet", "Ofitsiant", "Penitsillin", "Platsdarm", "Platskarta", "Politsmeyster", "Jinsiyat", "Pensiya", "Ranes", "Ritsar", "Sellofan", "Selluloid", "Selluloza", "Selsiy", "Sement", "Sentner", "Sentrifuga", "Senz", "Senzor", "Senzura", "Sex", "Shnitsel", "Shveysar", "Siferblat", "Silindr", "Silindrik", "Singa", "Sink", "Sirk", "Sirkulyar", "Sisterna", "Sitrus", "Sotsiologik", "Sotsiologiya", "Ssenariy", "Kultivator", "Kultivatsiya", "Kuryer", "Lager", "Losos", "Mebel", "Medal", "Medalyon", "Menshevik", "Menshevizm", "Migren", "Mikrofilm", " Mil ", "Model", "Neft", "Nikel", "Nippel", "Nol", "Noyabr", "Oktabr", "Palto", "Panel", "Parallel", "Parol", "Parter", "Patrul", "Pavilyon", "Pedal", "Plastir", "Pochtalyon", "Porshen", "Portfel", "Povest", "Predoxranitel", "Premyera", "Pristan", "Puls", "Pyesa", "Rels", "Relyef", "Rentabel", "Rezba", "Ritsar", "Rol", "Royal", "Rul", "Seld", "Selsiy", "Sentabr", "Shinel", "Shnitsel", "Shpatel", "Shpilka", "Shpindel", "Shtapel", "Shtempel", "Shtepsel", "Spektakl", "Spiral", "Sterjen", "Sudya", "Sulfat", "Tabel", "Tekstil", "Tokar", "Tulen", "Tunnel", "Umivalnik", "Valeryanka", "Vals", "Veksel", "Velvet", "Ventil", "Vermishel", "Vimpel", "Violonchel", "Volfram", "Volt", "Volta", "Voltmetr", "Vulgar", "Yakor", "Yanvar", "Yuriskonsult", "Ansambl", "Artel", "Artikl", "Aryergard", "Asfalt", "Atelye", "Avtomobil", "Balzam", "Banderol", "Batalyon", "Bilyard", "Binokl", "Bolshevik", "Budilnik", "Bulvar", "Dalton", "Dekabr", "Delfin", "Devalvatsiya", "Dirijabl", "Dizel", "Dizel-Motor", "Duel", "Dvigatel", "Emulsiya", "Eskadrilya", "Fakultativ", "Fakultet", "Falsifikator", "Falsifikatsiya", "Feldmarshal", "Feldsher", "Festival", "Fevral", "Filtr", "Folklor", "Fotoalbom", "Fotoatelye", "Gantel", "Gastrol", "Gilza", "Gospital", "Gotovalniy", "Grifel", "Impuls", "Insult", "Intervyu", "Inyeksiya", "Italyan", "Iyul", "Iyun", "Kabel", "Kalendar", "Kanifol", "Karamel", "Kartel", "Karusel", "Katapulta", "Kinofestival", "Kinofilm", "Kisel", "Kitel", "Kobalt", "Kompanyon", "Konferansye", "Obyekt", "Razyezd", "Subyekt", "Syezd", "Syomka", "ABZAS", "AKSENT", "AVIANOSES", "BATSILLA", "BIOMITSIN", "BOTSMAN", "BRONENOSES", "BRUTSELLOZ", "CHEREPITSA", "DOTSENT", "FRANSUZ", "GAUBITSA", "GERS", "GLITSERIN", "GORCHITSA", "GUSENITSA", "INERSIYA", "INSSENIROVKA", "KALSIY", "KANSLER", "KOEFFITSIENT", "KONFERENS-ZAL", "KONSEPSIYA", "KONSERN", "KONSERT", "KONSLAGER", "KULTIVATSIYA", "KVARS", "LITSEY", "LOTSMAN", "MARGANES", "MINONOSES", "MUNITSIPALITET", "OFITSIANT", "PENITSILLIN", "PLATSDARM", "PLATSKARTA", "POLITSMEYSTER", "JINSIYAT", "PENSIYA", "RANES", "RITSAR", "SELLOFAN", "SELLULOID", "SELLULOZA", "SELSIY", "SEMENT", "SENTNER", "SENTRIFUGA", "SENZ", "SENZOR", "SENZURA", "SEX", "SHNITSEL", "SHVEYSAR", "SIFERBLAT", "SILINDR", "SILINDRIK", "SINGA", "SINK", "SIRK", "SIRKULYAR", "SISTERNA", "SITRUS", "SOTSIOLOGIK", "SOTSIOLOGIYA", "SSENARIY", "KULTIVATOR", "KULTIVATSIYA", "KURYER", "LAGER", "LOSOS", "MEBEL", "MEDAL", "MEDALYON", "MENSHEVIK", "MENSHEVIZM", "MIGREN", "MIKROFILM", " MIL ", "MODEL", "NEFT", "NIKEL", "NIPPEL", "NOL", "NOYABR", "OKTABR", "PALTO", "PANEL", "PARALLEL", "PAROL", "PARTER", "PATRUL", "PAVILYON", "PEDAL", "PLASTIR", "POCHTALYON", "PORSHEN", "PORTFEL", "POVEST", "PREDOXRANITEL", "PREMYERA", "PRISTAN", "PULS", "PYESA", "RELS", "RELYEF", "RENTABEL", "REZBA", "RITSAR", "ROL", "ROYAL", "RUL", "SELD", "SELSIY", "SENTABR", "SHINEL", "SHNITSEL", "SHPATEL", "SHPILKA", "SHPINDEL", "SHTAPEL", "SHTEMPEL", "SHTEPSEL", "SPEKTAKL", "SPIRAL", "STERJEN", "SUDYA", "SULFAT", "TABEL", "TEKSTIL", "TOKAR", "TULEN", "TUNNEL", "UMIVALNIK", "VALERYANKA", "VALS", "VEKSEL", "VELVET", "VENTIL", "VERMISHEL", "VIMPEL", "VIOLONCHEL", "VOLFRAM", "VOLT", "VOLTA", "VOLTMETR", "VULGAR", "YAKOR", "YANVAR", "YURISKONSULT", "ANSAMBL", "ARTEL", "ARTIKL", "ARYERGARD", "ASFALT", "ATELYE", "AVTOMOBIL", "BALZAM", "BANDEROL", "BATALYON", "BILYARD", "BINOKL", "BOLSHEVIK", "BUDILNIK", "BULVAR", "DALTON", "DEKABR", "DELFIN", "DEVALVATSIYA", "DIRIJABL", "DIZEL", "DIZEL-MOTOR", "DUEL", "DVIGATEL", "EMULSIYA", "ESKADRILYA", "FAKULTATIV", "FAKULTET", "FALSIFIKATOR", "FALSIFIKATSIYA", "FELDMARSHAL", "FELDSHER", "FESTIVAL", "FEVRAL", "FILTR", "FOLKLOR", "FOTOALBOM", "FOTOATELYE", "GANTEL", "GASTROL", "GILZA", "GOSPITAL", "GOTOVALNIY", "GRIFEL", "IMPULS", "INSULT", "INTERVYU", "INYEKSIYA", "ITALYAN", "IYUL", "IYUN", "KABEL", "KALENDAR", "KANIFOL", "KARAMEL", "KARTEL", "KARUSEL", "KATAPULTA", "KINOFESTIVAL", "KINOFILM", "KISEL", "KITEL", "KOBALT", "KOMPANYON", "KONFERANSYE", "OBYEKT", "RAZYEZD", "SUBYEKT", "SYEZD", "SYOMKA", "korrupsiya", "Korrupsiya", "KORRUPSIYA", "konyuktura", "Konyuktura", "KONYUKTURA", "adyunktura", "Adyunktura", "ADYUNKTURA", "mil", "Mil", "MIL", "ssintigraf", "Ssintigraf", "SSINTIGRAF"};
    public static String[] cyrill_words_lower = {"абзац", "акцент", "авианосец", "бацилла", "биомицин", "боцман", "броненосец", "бруцеллоз", "черепица", "доцент", "француз", "гаубица", "герц", "глицерин", "горчица", "гусеница", "инерция", "инсценировка", "кальций", "канцлер", "коэффициент", "конференц-зал", "консепция", "концерн", "концерт", "концлагер", "культивация", "кварц", "лицей", "лоцман", "марганец", "миноносец", "муниципалитет", "официант", "пенициллин", "плацдарм", "плацкарта", "полицмейстер", "жинсият", "пенсия", "ранец", "рицар[ь]", "целлофан", "целлюлоид", "целлюлоза", "цельсий", "цемент", "центнер", "центрифуга", "ценз", "цензор", "цензура", "цех", "шницел[ь]", "швейцар", "циферблат", "цилиндр", "цилиндрик", "цинга", "цинк", "цирк", "циркуляр", "цистерна", "цитрус", "социологик", "социология", "сценарий", "культиватор", "культивация", "курьер", "лагер[ь]", "лосос[ь]", "мебел[ь]", "медал[ь]", "медальон", "меньшевик", "меньшевизм", "мигрен[ь]", "микрофильм", "мил[ь]", "модел[ь]", "нефт[ь]", "никел[ь]", "ниппел[ь]", "нол[ь]", "ноябр[ь]", "октябр[ь]", "пальто", "панел[ь]", "параллел[ь]", "парол[ь]", "партьер", "патрул[ь]", "павильон", "педал[ь]", "пластир[ь]", "почтальон", "поршен[ь]", "портфел[ь]", "повест[ь]", "предохранител[ь]", "премьера", "пристан[ь]", "пульс", "пьеса", "рельс", "рельеф", "рентабел[ь]", "резьба", "рицар[ь]", "рол[ь]", "роял[ь]", "рул[ь]", "сельд", "цельсий", "сентябр[ь]", "шинел[ь]", "шницел[ь]", "шпател[ь]", "шпилька", "шпиндел[ь]", "штапел[ь]", "штемпел[ь]", "штепсел[ь]", "спектакл[ь]", "спирал[ь]", "стержен[ь]", "судья", "сульфат", "табел[ь]", "текстил[ь]", "токар[ь]", "тюлен[ь]", "туннел[ь]", "умивальник", "валерьянка", "вальс", "вексел[ь]", "вельвет", "вентил[ь]", "вермишел[ь]", "вимпел[ь]", "виолончел[ь]", "вольфрам", "вольт", "вольта", "вольтметр", "вульгар", "якор[ь]", "январ[ь]", "юрисконсульт", "ансамбл[ь]", "артел[ь]", "артикл[ь]", "арьергард", "асфальт", "ателье", "автомобил[ь]", "бальзам", "бандерол[ь]", "батальон", "бильярд", "бинокл[ь]", "большевик", "будильник", "бульвар", "дальтон", "декабр[ь]", "дельфин", "девальвация", "дирижабл[ь]", "дизел[ь]", "дизель-мотор", "дуэл[ь]", "двигател[ь]", "эмульсия", "эскадрилья", "факультатив", "факультет", "фальсификатор", "фальсификация", "фельдмаршал", "фельдшер", "фестивал[ь]", "феврал[ь]", "фильтр", "фольклор", "фотоальбом", "фотоателье", "гантел[ь]", "гастрол[ь]", "гильза", "госпитал[ь]", "готовальний", "грифел[ь]", "импульс", "инсульт", "интервью", "иньекция", "итальян", "июл[ь]", "июн[ь]", "кабел[ь]", "календар[ь]", "канифол[ь]", "карамел[ь]", "картел[ь]", "карусел[ь]", "катапульта", "кинофестивал[ь]", "кинофильм", "кисел[ь]", "кител[ь]", "кобальт", "компаньон", "конферансье", "объект", "разъезд", "субъект", "съезд", "съёмка", "Абзац", "Акцент", "Авианосец", "Бацилла", "Биомицин", "Боцман", "Броненосец", "Бруцеллоз", "Черепица", "Доцент", "Француз", "Гаубица", "Герц", "Глицерин", "Горчица", "Гусеница", "Инерция", "Инсценировка", "Кальций", "Канцлер", "Коэффициент", "Конференц-Зал", "Консепция", "Концерн", "Концерт", "Концлагер", "Культивация", "Кварц", "Лицей", "Лоцман", "Марганец", "Миноносец", "Муниципалитет", "Официант", "Пенициллин", "Плацдарм", "Плацкарта", "Полицмейстер", "Жинсият", "Пенсия", "Ранец", "Рицар[ь]", "Целлофан", "Целлюлоид", "Целлюлоза", "Цельсий", "Цемент", "Центнер", "Центрифуга", "Ценз", "Цензор", "Цензура", "Цех", "Шницел[ь]", "Швейцар", "Циферблат", "Цилиндр", "Цилиндрик", "Цинга", "Цинк", "Цирк", "Циркуляр", "Цистерна", "Цитрус", "Социологик", "Социология", "Сценарий", "Культиватор", "Культивация", "Курьер", "Лагер[ь]", "Лосос[ь]", "Мебел[ь]", "Медал[ь]", "Медальон", "Меньшевик", "Меньшевизм", "Мигрен[ь]", "Микрофильм", " Миль ", "Модел[ь]", "Нефт[ь]", "Никел[ь]", "Ниппел[ь]", "Нол[ь]", "Ноябр[ь]", "Октябр[ь]", "Пальто", "Панел[ь]", "Параллел[ь]", "Парол[ь]", "Партьер", "Патрул[ь]", "Павильон", "Педал[ь]", "Пластир[ь]", "Почтальон", "Поршен[ь]", "Портфел[ь]", "Повест[ь]", "Предохранител[ь]", "Премьера", "Пристан[ь]", "Пульс", "Пьеса", "Рельс", "Рельеф", "Рентабел[ь]", "Резьба", "Рицар[ь]", "Рол[ь]", "Роял[ь]", "Рул[ь]", "Сельд", "Цельсий", "Сентябр[ь]", "Шинел[ь]", "Шницел[ь]", "Шпател[ь]", "Шпилька", "Шпиндел[ь]", "Штапел[ь]", "Штемпел[ь]", "Штепсел[ь]", "Спектакл[ь]", "Спирал[ь]", "Стержен[ь]", "Судья", "Сульфат", "Табел[ь]", "Текстил[ь]", "Токар[ь]", "Тюлен[ь]", "Туннел[ь]", "Умивальник", "Валерьянка", "Вальс", "Вексел[ь]", "Вельвет", "Вентил[ь]", "Вермишел[ь]", "Вимпел[ь]", "Виолончел[ь]", "Вольфрам", "Вольт", "Вольта", "Вольтметр", "Вульгар", "Якор[ь]", "Январ[ь]", "Юрисконсульт", "Ансамбл[ь]", "Артел[ь]", "Артикл[ь]", "Арьергард", "Асфальт", "Ателье", "Автомобил[ь]", "Бальзам", "Бандерол[ь]", "Батальон", "Бильярд", "Бинокл[ь]", "Большевик", "Будильник", "Бульвар", "Дальтон", "Декабр[ь]", "Дельфин", "Девальвация", "Дирижабл[ь]", "Дизел[ь]", "Дизель-Мотор", "Дуэл[ь]", "Двигател[ь]", "Эмульсия", "Эскадрилья", "Факультатив", "Факультет", "Фальсификатор", "Фальсификация", "Фельдмаршал", "Фельдшер", "Фестивал[ь]", "Феврал[ь]", "Фильтр", "Фольклор", "Фотоальбом", "Фотоателье", "Гантел[ь]", "Гастрол[ь]", "Гильза", "Госпитал[ь]", "Готовальний", "Грифел[ь]", "Импульс", "Инсульт", "Интервью", "Иньекция", "Итальян", "Июл[ь]", "Июн[ь]", "Кабел[ь]", "Календар[ь]", "Канифол[ь]", "Карамел[ь]", "Картел[ь]", "Карусел[ь]", "Катапульта", "Кинофестивал[ь]", "Кинофильм", "Кисел[ь]", "Кител[ь]", "Кобальт", "Компаньон", "Конферансье", "Объект", "Разъезд", "Субъект", "Съезд", "Съёмка", "АБЗАЦ", "АКЦЕНТ", "АВИАНОСЕЦ", "БАЦИЛЛА", "БИОМИЦИН", "БОЦМАН", "БРОНЕНОСЕЦ", "БРУЦЕЛЛОЗ", "ЧЕРЕПИЦА", "ДОЦЕНТ", "ФРАНЦУЗ", "ГАУБИЦА", "ГЕРЦ", "ГЛИЦЕРИН", "ГОРЧИЦА", "ГУСЕНИЦА", "ИНЕРЦИЯ", "ИНСЦЕНИРОВКА", "КАЛЬЦИЙ", "КАНЦЛЕР", "КОЭФФИЦИЕНТ", "КОНФЕРЕНЦ-ЗАЛ", "КОНСЕПЦИЯ", "КОНЦЕРН", "КОНЦЕРТ", "КОНЦЛАГЕР", "КУЛЬТИВАЦИЯ", "КВАРЦ", "ЛИЦЕЙ", "ЛОЦМАН", "МАРГАНЕЦ", "МИНОНОСЕЦ", "МУНИЦИПАЛИТЕТ", "ОФИЦИАНТ", "ПЕНИЦИЛЛИН", "ПЛАЦДАРМ", "ПЛАЦКАРТА", "ПОЛИЦМЕЙСТЕР", "ЖИНСИЯТ", "ПЕНСИЯ", "РАНЕЦ", "РИЦАР[Ь]", "ЦЕЛЛОФАН", "ЦЕЛЛЮЛОИД", "ЦЕЛЛЮЛОЗА", "ЦЕЛЬСИЙ", "ЦЕМЕНТ", "ЦЕНТНЕР", "ЦЕНТРИФУГА", "ЦЕНЗ", "ЦЕНЗОР", "ЦЕНЗУРА", "ЦЕХ", "ШНИЦЕЛ[Ь]", "ШВЕЙЦАР", "ЦИФЕРБЛАТ", "ЦИЛИНДР", "ЦИЛИНДРИК", "ЦИНГА", "ЦИНК", "ЦИРК", "ЦИРКУЛЯР", "ЦИСТЕРНА", "ЦИТРУС", "СОЦИОЛОГИК", "СОЦИОЛОГИЯ", "СЦЕНАРИЙ", "КУЛЬТИВАТОР", "КУЛЬТИВАЦИЯ", "КУРЬЕР", "ЛАГЕР[Ь]", "ЛОСОС[Ь]", "МЕБЕЛ[Ь]", "МЕДАЛ[Ь]", "МЕДАЛЬОН", "МЕНЬШЕВИК", "МЕНЬШЕВИЗМ", "МИГРЕН[Ь]", "МИКРОФИЛЬМ", " МИЛЬ ", "МОДЕЛ[Ь]", "НЕФТ[Ь]", "НИКЕЛ[Ь]", "НИППЕЛ[Ь]", "НОЛ[Ь]", "НОЯБР[Ь]", "ОКТЯБР[Ь]", "ПАЛЬТО", "ПАНЕЛ[Ь]", "ПАРАЛЛЕЛ[Ь]", "ПАРОЛ[Ь]", "ПАРТЬЕР", "ПАТРУЛ[Ь]", "ПАВИЛЬОН", "ПЕДАЛ[Ь]", "ПЛАСТИР[Ь]", "ПОЧТАЛЬОН", "ПОРШЕН[Ь]", "ПОРТФЕЛ[Ь]", "ПОВЕСТ[Ь]", "ПРЕДОХРАНИТЕЛ[Ь]", "ПРЕМЬЕРА", "ПРИСТАН[Ь]", "ПУЛЬС", "ПЬЕСА", "РЕЛЬС", "РЕЛЬЕФ", "РЕНТАБЕЛ[Ь]", "РЕЗЬБА", "РИЦАР[Ь]", "РОЛ[Ь]", "РОЯЛ[Ь]", "РУЛ[Ь]", "СЕЛЬД", "ЦЕЛЬСИЙ", "СЕНТЯБР[Ь]", "ШИНЕЛ[Ь]", "ШНИЦЕЛ[Ь]", "ШПАТЕЛ[Ь]", "ШПИЛЬКА", "ШПИНДЕЛ[Ь]", "ШТАПЕЛ[Ь]", "ШТЕМПЕЛ[Ь]", "ШТЕПСЕЛ[Ь]", "СПЕКТАКЛ[Ь]", "СПИРАЛ[Ь]", "СТЕРЖЕН[Ь]", "СУДЬЯ", "СУЛЬФАТ", "ТАБЕЛ[Ь]", "ТЕКСТИЛ[Ь]", "ТОКАР[Ь]", "ТЮЛЕН[Ь]", "ТУННЕЛ[Ь]", "УМИВАЛЬНИК", "ВАЛЕРЬЯНКА", "ВАЛЬС", "ВЕКСЕЛ[Ь]", "ВЕЛЬВЕТ", "ВЕНТИЛ[Ь]", "ВЕРМИШЕЛ[Ь]", "ВИМПЕЛ[Ь]", "ВИОЛОНЧЕЛ[Ь]", "ВОЛЬФРАМ", "ВОЛЬТ", "ВОЛЬТА", "ВОЛЬТМЕТР", "ВУЛЬГАР", "ЯКОР[Ь]", "ЯНВАР[Ь]", "ЮРИСКОНСУЛЬТ", "АНСАМБЛ[Ь]", "АРТЕЛ[Ь]", "АРТИКЛ[Ь]", "АРЬЕРГАРД", "АСФАЛЬТ", "АТЕЛЬЕ", "АВТОМОБИЛ[Ь]", "БАЛЬЗАМ", "БАНДЕРОЛ[Ь]", "БАТАЛЬОН", "БИЛЬЯРД", "БИНОКЛ[Ь]", "БОЛЬШЕВИК", "БУДИЛЬНИК", "БУЛЬВАР", "ДАЛЬТОН", "ДЕКАБР[Ь]", "ДЕЛЬФИН", "ДЕВАЛЬВАЦИЯ", "ДИРИЖАБЛ[Ь]", "ДИЗЕЛ[Ь]", "ДИЗЕЛЬ-МОТОР", "ДУЭЛ[Ь]", "ДВИГАТЕЛ[Ь]", "ЭМУЛЬСИЯ", "ЭСКАДРИЛЬЯ", "ФАКУЛЬТАТИВ", "ФАКУЛЬТЕТ", "ФАЛЬСИФИКАТОР", "ФАЛЬСИФИКАЦИЯ", "ФЕЛЬДМАРШАЛ", "ФЕЛЬДШЕР", "ФЕСТИВАЛ[Ь]", "ФЕВРАЛ[Ь]", "ФИЛЬТР", "ФОЛЬКЛОР", "ФОТОАЛЬБОМ", "ФОТОАТЕЛЬЕ", "ГАНТЕЛ[Ь]", "ГАСТРОЛ[Ь]", "ГИЛЬЗА", "ГОСПИТАЛ[Ь]", "ГОТОВАЛЬНИЙ", "ГРИФЕЛ[Ь]", "ИМПУЛЬС", "ИНСУЛЬТ", "ИНТЕРВЬЮ", "ИНЬЕКЦИЯ", "ИТАЛЬЯН", "ИЮЛ[Ь]", "ИЮН[Ь]", "КАБЕЛ[Ь]", "КАЛЕНДАР[Ь]", "КАНИФОЛ[Ь]", "КАРАМЕЛ[Ь]", "КАРТЕЛ[Ь]", "КАРУСЕЛ[Ь]", "КАТАПУЛЬТА", "КИНОФЕСТИВАЛ[Ь]", "КИНОФИЛЬМ", "КИСЕЛ[Ь]", "КИТЕЛ[Ь]", "КОБАЛЬТ", "КОМПАНЬОН", "КОНФЕРАНСЬЕ", "ОБЪЕКТ", "РАЗЪЕЗД", "СУБЪЕКТ", "СЪЕЗД", "СЪЁМКА", "коррупция", "Коррупция", "КОРРУПЦИЯ", "конъюнктура", "Конъюнктура", "КОНЪЮНКТУРА", "адъюнктура", "Адъюнктура", "АДЪЮНКТУРА", "мил[ь]", "Мил[ь]", "МИЛ[Ь]", "сцинтиграф", "Сцинтиграф", "СЦИНТИГРАФ"};

    public static String[] latin_words_upper = {"SINGARI", "Singari", "singari", "PRINSIP", "Prinsip", "prinsip", "KSIYA", "ksiya", "KSION", "ksion", "NSIYA", "nsiya", "NSION", "nsion", "RSION", "rsion", "TSION", "tsion", "TSIST", "tsist", "TSIZM", "tsizm", "TSIT", "tsit", "DETSI", "detsi", "TSEVT", "tsevt", "TSEPT", "tsept", "TSER", "tser", "TSIA", "tsia", "SIA", "sia", "TSIKL", "tsikl", "SIKL", "sikl", "VITSE", "vitse", "TSIYA", "tsiya", "TSIO", "tsio", "TSIU", "tsiu", "SIU", "siu"};
    public static String[] cyrill_words_upper = {"СИНГАРИ", "Сингари", "сингари", "ПРИНЦИП", "Принцип", "принцип", "КЦИЯ", "кция", "КЦИОН", "кцион", "НЦИЯ", "нция", "НЦИОН", "нцион", "РЦИОН", "рцион", "ЦИОН", "цион", "ЦИСТ", "цист", "ЦИЗМ", "цизм", "ЦИТ", "цит", "ДЕЦИ", "деци", "ЦЕВТ", "цевт", "ЦЕПТ", "цепт", "ЦЕР", "цер", "ЦИА", "циа", "ЦИА", "циа", "ЦИКЛ", "цикл", "ЦИКЛ", "цикл", "ВИЦЕ", "вице", "ЦИЯ", "ция", "ЦИО", "цио", "ЦИУ", "циу", "ЦИУ", "циу"};

    public static List<String> list = new ArrayList<>();
    public static String exportPath = " ";

    public static void main(String[] args) {
        System.out.println("==Welcome to KRILL<=>LATIN converter==");
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("File Path(in only txt format):  ");
            String filePath = scanner.nextLine();
            exportPathFinder(filePath);
            try (FileReader fileReader = new FileReader(filePath)) {
                System.out.println("1.krill-latin");
                System.out.println("2.latin-krill");
                int choice = scanner.nextInt();
                BufferedReader bufferedReader = new BufferedReader(fileReader);
                BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(exportPath));
                switch (choice) {
                    case 1:
                        krillLatin(bufferedReader);
                        break;
                    case 2:
                        latinKrill(bufferedReader);
                        break;
                    default:
                        break;
                }
            } catch (FileNotFoundException e) {
                System.out.println("File is not found");
            } catch (IOException e) {
                System.out.println("error occupied");
            }
        }
    }

    private static void exportPathFinder(String filePath) {
        exportPath = filePath.substring(0, filePath.lastIndexOf("\\") + 1) + "copy" + filePath.substring(filePath.lastIndexOf("\\") + 1);
    }

    private static void latinKrill(BufferedReader bufferedReader) throws IOException {
        String oneLine = " ";
        while ((oneLine = bufferedReader.readLine()) != null) {
            for (int i = 0; i < latin_words_upper.length; i++) {
                oneLine = oneLine.replaceAll(latin_words_upper[i], cyrill_words_upper[i]);
            }
            for (int i = 0; i < latin_words_lower.length; i++) {
                oneLine = oneLine.replaceAll(latin_words_lower[i], cyrill_words_lower[i]);
            }
            for (int i = 0; i < latin.length; i++) {
                oneLine = oneLine.replaceAll(latin[i], cyrill[i]);
            }
            list.add(oneLine);
        }
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(exportPath));) {

            for (String s : list) {
                bufferedWriter.write(s + System.getProperty("line.separator"));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Done!!!");

    }

    private static void krillLatin(BufferedReader bufferedReader) throws IOException {
        String oneLine = " ";
        while ((oneLine = bufferedReader.readLine()) != null) {
            for (int i = 0; i < cyrill_words_upper.length; i++) {
                oneLine = oneLine.replaceAll(cyrill_words_upper[i], latin_words_upper[i]);
            }
            for (int i = 0; i < cyrill_words_lower.length; i++) {
                oneLine = oneLine.replaceAll(cyrill_words_lower[i], latin_words_lower[i]);
            }
            for (int i = 0; i < cyrill.length; i++) {
                oneLine = oneLine.replaceAll(cyrill[i], latin[i]);
            }
            list.add(oneLine);

        }
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(exportPath));) {

            for (String s : list) {
                bufferedWriter.write(s + System.getProperty("line.separator"));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Done!!!");
    }
}
