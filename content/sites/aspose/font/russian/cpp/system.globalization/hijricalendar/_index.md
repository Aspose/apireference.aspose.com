---
title: "System::Globalization::HijriCalendar класс"
linktitle: "HijriCalendar"
second_title: "Aspose.Font для C++"
description: "System::Globalization::HijriCalendar класс. Хиджрийский календарь. Объекты этого класса должны создаваться только с помощью функции System::MakeObject(). Никогда не создавайте экземпляр этого типа в стеке или с помощью оператора new, так как это приведёт к ошибкам выполнения и/или сбоям утверждений. Всегда оборачивайте этот класс в указатель System::SmartPtr и используйте этот указатель для передачи его в функции в качестве аргумента в C++."
type: docs
weight: 1200
url: /ru/cpp/system.globalization/hijricalendar/
---
## HijriCalendar class


Хиджрийский календарь. Объекты этого класса должны создаваться только с помощью функции [System::MakeObject()](../../system/makeobject/). Никогда не создавайте экземпляр этого типа в стеке или с помощью оператора new, так как это приведёт к ошибкам выполнения и/или сбоям утверждений. Всегда оборачивайте этот класс в указатель [System::SmartPtr](../../system/smartptr/) и используйте этот указатель для передачи его в функции в качестве аргумента.

```cpp
class HijriCalendar : public System::Globalization::Calendar
```

## Методы

| Метод | Описание |
| --- | --- |
| [Clone](./clone/)() override | Информация RTTI. |
| [get_AlgorithmType](./get_algorithmtype/)() const override | Получает тип алгоритма. |
| [get_Eras](./get_eras/)() const override | Получает список эпох, существующих в календаре. |
| [get_HijriAdjustment](./get_hijriadjustment/)() const | Получает корректировку хиджри. |
| [get_MaxSupportedDateTime](./get_maxsupporteddatetime/)() const override | Максимальная точка во времени, поддерживаемая календарём. |
| [get_MinSupportedDateTime](./get_minsupporteddatetime/)() const override | Минимальная точка во времени, поддерживаемая календарём. |
| [GetDayOfWeek](./getdayofweek/)(DateTime) const override | Получает день недели для указанной точки во времени. |
| [GetLeapMonth](./getleapmonth/)(int, int) const override | Получает високосный месяц для указанного года. |
| virtual [GetLeapMonth](./getleapmonth/)(int) const | Информация RTTI. |
| [HijriCalendar](./hijricalendar/)() | Конструктор. |
| [IsLeapDay](./isleapday/)(int, int, int, int) const override | Проверяет, является ли день високосным. |
| virtual [IsLeapDay](./isleapday/)(int, int, int) const | Проверяет, является ли день високосным. |
| [IsLeapMonth](./isleapmonth/)(int, int, int) const override | Проверяет, является ли месяц високосным. |
| virtual [IsLeapMonth](./isleapmonth/)(int, int) const | Проверяет, является ли месяц високосным. |
| [IsLeapYear](./isleapyear/)(int, int) const override | Проверяет, является ли год високосным. |
| virtual [IsLeapYear](./isleapyear/)(int) const | Проверяет, является ли год високосным. |
| [set_HijriAdjustment](./set_hijriadjustment/)(int) | Устанавливает корректировку хиджри. |
## Поля

| Поле | Описание |
| --- | --- |
| static constexpr [HijriEra](./hijriera/) | Текущая эпоха хиджри. |
## См. также

* Class [Calendar](../calendar/)
* Namespace [System::Globalization](../)
* Library [Aspose.Font for C++](../../)
