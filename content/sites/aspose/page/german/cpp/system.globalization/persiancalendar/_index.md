---
title: "System::Globalization::PersianCalendar Klasse"
linktitle: "PersianCalendar"
second_title: "Aspose.Page für C++"
description: "System::Globalization::PersianCalendar Klasse. Persischer Kalender. Objekte dieser Klasse sollten nur mit der Funktion System::MakeObject() alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse immer in einen System::SmartPtr-Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen in C++ zu übergeben."
type: docs
weight: 2000
url: /de/cpp/system.globalization/persiancalendar/
---
## PersianCalendar class


Persischer Kalender. Objekte dieser Klasse sollten nur mit der Funktion [System::MakeObject()](../../system/makeobject/) alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse immer in einen [System::SmartPtr](../../system/smartptr/) Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben.

```cpp
class PersianCalendar : public System::Globalization::Calendar
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [Clone](./clone/)() override | RTTI-Informationen. |
| [get_AlgorithmType](./get_algorithmtype/)() const override | Liefert den Algorithmustyp. |
| [get_Eras](./get_eras/)() const override | Liefert die Liste der im Kalender vorhandenen Äras. |
| [get_MaxSupportedDateTime](./get_maxsupporteddatetime/)() const override | Der maximal unterstützte Zeitpunkt des Kalenders. |
| [get_MinSupportedDateTime](./get_minsupporteddatetime/)() const override | Der minimal unterstützte Zeitpunkt des Kalenders. |
| [GetDayOfWeek](./getdayofweek/)(DateTime) const override | Liefert den Wochentag für den angegebenen Zeitpunkt. |
| [GetDaysInMonth](./getdaysinmonth/)(int, int, int) const override | Liefert die Anzahl der Tage in einem bestimmten Monat. |
| virtual [GetDaysInMonth](./getdaysinmonth/)(int, int) const | RTTI-Informationen. |
| [GetDaysInYear](./getdaysinyear/)(int, int) const override | Liefert die Anzahl der Tage in einem bestimmten Jahr. |
| virtual [GetDaysInYear](./getdaysinyear/)(int) const | Liefert die Anzahl der Tage in einem bestimmten Jahr. |
| [GetLeapMonth](./getleapmonth/)(int, int) const override | Liefert den Schaltmonat für das angegebene Jahr. |
| virtual [GetLeapMonth](./getleapmonth/)(int) const | Liefert den Schaltmonat für das angegebene Jahr. |
| [GetMonthsInYear](./getmonthsinyear/)(int, int) const override | Liefert die Anzahl der Monate im angegebenen Jahr. |
| virtual [GetMonthsInYear](./getmonthsinyear/)(int) const | Liefert die Anzahl der Monate im angegebenen Jahr. |
| [IsLeapDay](./isleapday/)(int, int, int, int) const override | Überprüft, ob der Tag ein Schaltjahr ist. |
| virtual [IsLeapDay](./isleapday/)(int, int, int) const | Überprüft, ob der Tag ein Schaltjahr ist. |
| [IsLeapMonth](./isleapmonth/)(int, int, int) const override | Überprüft, ob der Monat ein Schaltmonat ist. |
| virtual [IsLeapMonth](./isleapmonth/)(int, int) const | Überprüft, ob der Monat ein Schaltmonat ist. |
| [IsLeapYear](./isleapyear/)(int, int) const override | Überprüft, ob das Jahr ein Schaltjahr ist. |
| virtual [IsLeapYear](./isleapyear/)(int) const | Überprüft, ob das Jahr ein Schaltjahr ist. |
| [PersianCalendar](./persiancalendar/)() | Konstruktor. |
## Felder

| Feld | Beschreibung |
| --- | --- |
| static constexpr [PersianEra](./persianera/) | Aktuelle persische Ära. |
## Siehe auch

* Class [Calendar](../calendar/)
* Namespace [System::Globalization](../)
* Library [Aspose.Page for C++](../../)
