package org.shevtsovla.kotlincourse.lesson15.homework

fun main() {
//Событие: Вечеринка Создайте класс Party, который описывает вечеринку.
//У него должны быть свойства location (String) и attendees (Int).
//Добавьте метод details(), который выводит информацию о месте проведения и количестве гостей.
    var party = Party("Home", 2)
    party.details()

//Аспект реальности: Эмоция Создайте класс Emotion, который представляет эмоцию.
//У него должно быть свойство type (String) и intensity (Int).
//Добавьте метод express(), который выводит описание эмоции в зависимости от её типа и интенсивности.
    var emotion = Emotion("Ах*й", 7)
    emotion.express()

//Природное явление: Луна Создайте объект Moon, который будет представлять Луну.
//Добавьте свойства isVisible (Boolean), чтобы отображать, видна ли Луна в данный момент, и phase (String),
//чтобы отображать текущую фазу Луны (например, "Full Moon", "New Moon").
//Добавьте метод showPhase(), который выводит текущую фазу Луны.
    Moon.showPhase()

    Moon.phase = "New moon"

    Moon.showPhase()

//Мероприятие: Концерт Создайте класс, который будет представлять концерт. У него должны быть свойства “группа”,
//“место проведения”, “стоимость”, “вместимость зала”. Также приватное поле “проданные билеты”.
//Добавьте метод, который выводит информацию о концерте, и метод “купить билет”, который увеличивает количество проданных билетов на один.

    var concert = Concert("TaTu", "Gipsy", 3500, 1500)
    concert.details()
    concert.buyTicket()
    concert.buyTicket()

//Создать систему управления складским пространством с использованием классов "Стеллаж" и "Полка стеллажа".

    var shelf = Shelf(30)

    println(shelf.addItem("book"))
    println(shelf.addItem("hoover"))
    println(shelf.addItem("synchrophasotron"))
    println(shelf.addItem("trophy"))

    println(shelf.containsItem("cup"))

    println(shelf.removeItem("hoover"))
    println(shelf.removeItem("picture"))

    println(shelf.getList())



}