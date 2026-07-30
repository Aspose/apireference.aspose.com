---
title: "System::Globalization::JapaneseLunisolarCalendar class"
linktitle: "JapaneseLunisolarCalendar"
second_title: "Aspose.Font для C++"
description: "System::Globalization::JapaneseLunisolarCalendar class. Японский лунно-солнечный календарь. Не реализовано. Объекты этого класса должны выделяться только с помощью функции System::MakeObject() . Никогда не создавайте экземпляр этого типа в стеке или с помощью оператора new, так как это приведёт к ошибкам выполнения и/или сбоям утверждений. Всегда оборачивайте этот класс в указатель System::SmartPtr и используйте этот указатель для передачи его в функции в качестве аргумента в C++."
type: docs
weight: 1500
url: /ru/cpp/system.globalization/japaneselunisolarcalendar/
---
## JapaneseLunisolarCalendar class


Японский лунно-солнечный календарь. Не реализовано. Объекты этого класса должны выделяться только с помощью функции [System::MakeObject()](../../system/makeobject/) . Никогда не создавайте экземпляр этого типа в стеке или с помощью оператора new, так как это приведёт к ошибкам выполнения и/или сбоям утверждений. Всегда оборачивайте этот класс в указатель [System::SmartPtr](../../system/smartptr/) и используйте этот указатель для передачи его в функции в качестве аргумента.

```cpp
class JapaneseLunisolarCalendar : public System::Globalization::EastAsianLunisolarCalendar
```

## Методы

| Метод | Описание |
| --- | --- |
| [Clone](./clone/)() override | Информация RTTI. |
| [get_Eras](./get_eras/)() const override | Получает список эпох, существующих в календаре. |
| [get_MaxSupportedDateTime](./get_maxsupporteddatetime/)() const override | Максимальная точка во времени, поддерживаемая календарём. |
| [get_MinSupportedDateTime](./get_minsupporteddatetime/)() const override | Минимальная точка во времени, поддерживаемая календарём. |
| [GetEra](./getera/)(DateTime) const override | Получает эпоху для указанной точки во времени. |
| [GetLeapMonth](./getleapmonth/)(int, int) const override | Получает високосный месяц для указанного года. |
| virtual [GetLeapMonth](./getleapmonth/)(int) const | Информация RTTI. |
| [GetYear](./getyear/)(DateTime) const override | Получает год для указанного момента времени. |
| [IsLeapDay](./isleapday/)(int, int, int, int) const override | Проверяет, является ли день високосным. |
| virtual [IsLeapDay](./isleapday/)(int, int, int) const | Проверяет, является ли день високосным. |
| [IsLeapYear](./isleapyear/)(int, int) const override | Проверяет, является ли год високосным. |
| virtual [IsLeapYear](./isleapyear/)(int) const | Проверяет, является ли год високосным. |
| [JapaneseLunisolarCalendar](./japaneselunisolarcalendar/)() | Конструктор. |
## Поля

| Поле | Описание |
| --- | --- |
| static constexpr [JapaneseEra](./japaneseera/) | Текущая японская эра. |
## См. также

* Class [EastAsianLunisolarCalendar](../eastasianlunisolarcalendar/)
* Namespace [System::Globalization](../)
* Library [Aspose.Font for C++](../../)
