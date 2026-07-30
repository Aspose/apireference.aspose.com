---
title: "System::Globalization::JulianCalendar класс"
linktitle: "JulianCalendar"
second_title: "Aspose.Font для C++"
description: "System::Globalization::JulianCalendar класс. Юлианский календарь. Объекты этого класса должны создаваться только с помощью функции System::MakeObject(). Никогда не создавайте экземпляр этого типа в стеке или с помощью оператора new, так как это приведёт к ошибкам выполнения и/или сбоям утверждений. Всегда оборачивайте этот класс в указатель System::SmartPtr и используйте этот указатель для передачи его в функции в качестве аргумента в C++."
type: docs
weight: 1600
url: /ru/cpp/system.globalization/juliancalendar/
---
## JulianCalendar class


Юлианский календарь. Объекты этого класса должны создаваться только с помощью функции [System::MakeObject()](../../system/makeobject/). Никогда не создавайте экземпляр этого типа в стеке или с помощью оператора new, так как это приведёт к ошибкам выполнения и/или сбоям утверждений. Всегда оборачивайте этот класс в указатель [System::SmartPtr](../../system/smartptr/) и используйте этот указатель для передачи его в функции в качестве аргумента.

```cpp
class JulianCalendar : public System::Globalization::Calendar
```

## Методы

| Метод | Описание |
| --- | --- |
| [Clone](./clone/)() override | Информация RTTI. |
| [get_AlgorithmType](./get_algorithmtype/)() const override | Получает тип алгоритма. |
| [get_Eras](./get_eras/)() const override | Получает список эпох, существующих в календаре. |
| [get_MaxSupportedDateTime](./get_maxsupporteddatetime/)() const override | Максимальная точка во времени, поддерживаемая календарём. |
| [get_MinSupportedDateTime](./get_minsupporteddatetime/)() const override | Минимальная точка во времени, поддерживаемая календарём. |
| [GetDaysInMonth](./getdaysinmonth/)(int, int, int) const override | Получает количество дней в указанном месяце. |
| virtual [GetDaysInMonth](./getdaysinmonth/)(int, int) const | Получает количество дней в указанном месяце. |
| [GetDaysInYear](./getdaysinyear/)(int, int) const override | Получает количество дней в указанном году. |
| virtual [GetDaysInYear](./getdaysinyear/)(int) const | Получает количество дней в указанном году. |
| [GetEra](./getera/)(DateTime) const override | Получает эпоху для указанной точки во времени. |
| [GetLeapMonth](./getleapmonth/)(int, int) const override | Получает високосный месяц для указанного года. |
| virtual [GetLeapMonth](./getleapmonth/)(int) const | Получает високосный месяц для указанного года. |
| [GetMonthsInYear](./getmonthsinyear/)(int, int) const override | Получает количество месяцев в указанном году. |
| virtual [GetMonthsInYear](./getmonthsinyear/)(int) const | Информация RTTI. |
| [IsLeapDay](./isleapday/)(int, int, int, int) const override | Проверяет, является ли день високосным. |
| virtual [IsLeapDay](./isleapday/)(int, int, int) const | Проверяет, является ли день високосным. |
| [IsLeapMonth](./isleapmonth/)(int, int, int) const override | Проверяет, является ли месяц високосным. |
| virtual [IsLeapMonth](./isleapmonth/)(int, int) const | Проверяет, является ли месяц високосным. |
| [IsLeapYear](./isleapyear/)(int, int) const override | Проверяет, является ли год високосным. |
| virtual [IsLeapYear](./isleapyear/)(int) const | Проверяет, является ли год високосным. |
| [JulianCalendar](./juliancalendar/)() | Конструктор. |
## Поля

| Поле | Описание |
| --- | --- |
| static constexpr [JulianEra](./julianera/) | Текущая юлианская эра. |
## См. также

* Class [Calendar](../calendar/)
* Namespace [System::Globalization](../)
* Library [Aspose.Font for C++](../../)
