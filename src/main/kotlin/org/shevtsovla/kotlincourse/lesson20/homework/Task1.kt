package org.shevtsovla.kotlincourse.lesson20.homework

abstract class Refrigerator : TemperatureRegulatable,
    Openable, Programmable, LightEmitting, Powerable {}

abstract class WasherMachine : WaterConnection,
    Openable, Programmable, Powerable, AutomaticShutdown, Timable,
    Cleanable, Drainable {}

abstract class SmartLamp : LightEmitting, Programmable, Powerable,
    BatteryOperated, Rechargeable, Timable {}

abstract class DigitalClock : BatteryOperated, LightEmitting,
    Programmable, Powerable, Rechargeable, Timable {}

abstract class RobotVacuumCleaner : AutomaticShutdown, Movable,
    Cleanable, Programmable, Powerable, Rechargeable, Openable {}

abstract class MechanicalClock : Mechanical, Timable {}

abstract class Flashlight : LightEmitting, Powerable, BatteryOperated {}

abstract class CoffeeMachine : WaterContainer,
    Openable, Programmable, Powerable, AutomaticShutdown, Cleanable {}

abstract class SmartSpeaker : SoundEmitting, Programmable, Powerable,
    Timable {}