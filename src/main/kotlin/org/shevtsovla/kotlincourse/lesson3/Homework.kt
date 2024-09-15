package org.shevtsovla.kotlincourse.lesson3

const val NAME: String = "Hackathon" //Название мероприятия
var date: String = "31/10/2024" //Дата проведения
var place: String = "Abandoned house in Chertanovo" //Место проведения
private val budget: String = "2 beer cans" //Подробный бюджет мероприятия, включая расходы на оборудование, кейтеринг и другие операционные расходы.
var member: Int = 0
    get() = field
    private set(value) {} //Количество участников
var duration: Long = 8*60*60 //Длительность хакатона
private lateinit var contactInformation: String //Контактная информация и условия соглашений с поставщиками пищи, оборудования и других услуг.
var status: String = "Prepare" //Текущее состояние хакатона (статус)
val sponsors: String = "Bruce Wane, Anthony Stark, Alexander Luthor"//Список спонсоров
//Бюджет мероприятия
var internetAccessLevel: Int = 4 //Текущий уровень доступа к интернету
private var transferInformation: String = "By eagles" //Информация о транспортировке оборудования, распределении ресурсов и координации между различными командами поддержки.
var numberOfCommands: Int = 0 //Количество команд
val tasks: String = "Tasks" //Перечень задач
val avcuationPlan: String = "Picture" //План эвакуации
var listOfAvailableEquipment: String = "70" //Список доступного оборудования
var listOfFreeEquipment: String = "70" //Список свободного оборудования
lateinit var schedule: String//График питания участников (зависит от поставщика питания, определяемого за неделю до начала)
val planInCaseOfFailures: String = "Plan Big Ben" //План мероприятий на случай сбоев
var listOfExperts: String = ""//Список экспертов и жюри
val feedbackMethods: String by lazy {""}//Методы и процедуры для сбора отзывов от участников и гостей, включая анонимные опросы и интервью.
val privacyPolicy: String = ""//Политика конфиденциальности
private val feedback: String by lazy { "" }//Приватные отзывы (фидбэк) участников и зрителей для анализа проблем.
var temperature: Int = 24//Текущая температура в помещении
var monitoringNetwork: String = ""//Мониторинг и анализ производительности сетевого оборудования и интернет-соединения.
var lightLevel: Int = 700//Уровень освещения
private var log: String = ""//Лог событий мероприятия
//Доступность медицинской помощи
private val safetyOrganisation: String = ""//Планы и процедуры для обеспечения безопасности мероприятия, включая планы эвакуации и протоколы чрезвычайных ситуаций.
val regNumber: Int = 376//Регистрационный номер мероприятия
val volMax: Int = 55//Максимально допустимый уровень шума в помещении хакатона.
//Индикатор превышения уровня шума в помещениях
//Формат мероприятия (зависит от геополитической обстановки)
//Количество свободных мест для отдыха (например, кресел или диванов), сеттер валидирует, чтобы количество не было меньше нуля.
//План взаимодействия с прессой
//Детальная информация о проектах каждой команды, сбор данных включает в себя компиляцию кода и сбор статистики прогона автоматизированных проверок.
//Статус получения всех необходимых разрешений
//Указывает, открыт ли доступ к эксклюзивным ресурсам (например, специальному оборудованию)
//Список партнеров мероприятия
//Отчет, включающий фотографии, видео и отзывы, генерируется и становится доступен после завершения мероприятия.
//План распределения призов
//Контактная информация экстренных служб, медицинского персонала и других важных служб, недоступная участникам.
//Особые условия для участников с ограниченными возможностями
val mood: String by lazy { "" }//Общее настроение участников (определяется опросами)
lateinit var plan: String//Подробный план хакатона, включающий время и содержание каждого сегмента, инициализируется непосредственно перед началом мероприятия.
lateinit var specialGuest: String //Имя знаменитого специального гостя, которое будет объявлено за день до мероприятия.
//Максимальное количество людей, которое может вместить место проведения.
//Стандартное количество часов, отведенное каждой команде для работы над проектом.
//Текущая температура в помещении
