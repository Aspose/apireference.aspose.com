---
title: "System::Globalization::ThaiBuddhistCalendar class"
linktitle: "ThaiBuddhistCalendar"
second_title: "Aspose.Page für C++"
description: "System::Globalization::ThaiBuddhistCalendar class. Thailändischer buddhistischer Kalender. Objekte dieser Klasse sollten nur mit der System::MakeObject()‑Funktion alloziert werden. Erstelle niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Umschließe diese Klasse immer mit einem System::SmartPtr‑Zeiger und verwende diesen Zeiger, um ihn als Argument an Funktionen in C++ zu übergeben."
type: docs
weight: 2900
url: /de/cpp/system.globalization/thaibuddhistcalendar/
---
## ThaiBuddhistCalendar class


Thailändischer buddhistischer Kalender. Objekte dieser Klasse sollten nur mit der [System::MakeObject()](../../system/makeobject/)‑Funktion alloziert werden. Erstelle niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion‑Fehlern führt. Umschließe diese Klasse immer mit dem [System::SmartPtr](../../system/smartptr/)‑Zeiger und verwende diesen Zeiger, um ihn als Argument an Funktionen zu übergeben.

```cpp
class ThaiBuddhistCalendar : public System::Globalization::Calendar
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [Clone](./clone/)() override | RTTI-Informationen. |
| [get_AlgorithmType](./get_algorithmtype/)() const override | Liefert den Algorithmustyp. |
| [get_Eras](./get_eras/)() const override | Liefert die Liste der im Kalender vorhandenen Äras. |
| [get_MaxSupportedDateTime](./get_maxsupporteddatetime/)() const override | Der maximal unterstützte Zeitpunkt des Kalenders. |
| [get_MinSupportedDateTime](./get_minsupporteddatetime/)() const override | Der minimal unterstützte Zeitpunkt des Kalenders. |
| [GetDayOfMonth](./getdayofmonth/)(DateTime) const override | Liefert den Tag des Monats für den angegebenen Zeitpunkt. |
| [GetDayOfWeek](./getdayofweek/)(DateTime) const override | Liefert den Wochentag für den angegebenen Zeitpunkt. |
| [GetDayOfYear](./getdayofyear/)(DateTime) const override | Liefert den Tag des Jahres für den angegebenen Zeitpunkt. |
| [GetDaysInMonth](./getdaysinmonth/)(int, int, int) const override | Liefert die Anzahl der Tage in einem bestimmten Monat. |
| virtual [GetDaysInMonth](./getdaysinmonth/)(int, int) const | Liefert die Anzahl der Tage in einem bestimmten Monat. |
| [GetDaysInYear](./getdaysinyear/)(int, int) const override | Liefert die Anzahl der Tage in einem bestimmten Jahr. |
| virtual [GetDaysInYear](./getdaysinyear/)(int) const | Liefert die Anzahl der Tage in einem bestimmten Jahr. |
| [GetEra](./getera/)(DateTime) const override | Liefert die Ära für den angegebenen Zeitpunkt. |
| [GetLeapMonth](./getleapmonth/)(int, int) const override | Liefert den Schaltmonat für das angegebene Jahr. |
| virtual [GetLeapMonth](./getleapmonth/)(int) const | Liefert den Schaltmonat für das angegebene Jahr. |
| [GetMonth](./getmonth/)(DateTime) const override | Liefert den Monat für den angegebenen Zeitpunkt. |
| [GetMonthsInYear](./getmonthsinyear/)(int, int) const override | Liefert die Anzahl der Monate im angegebenen Jahr. |
| virtual [GetMonthsInYear](./getmonthsinyear/)(int) const | RTTI-Informationen. |
| [GetYear](./getyear/)(DateTime) const override | Ermittelt das Jahr für den angegebenen Zeitpunkt. |
| [IsLeapDay](./isleapday/)(int, int, int, int) const override | Überprüft, ob der Tag ein Schaltjahr ist. |
| virtual [IsLeapDay](./isleapday/)(int, int, int) const | Überprüft, ob der Tag ein Schaltjahr ist. |
| [IsLeapMonth](./isleapmonth/)(int, int, int) const override | Überprüft, ob der Monat ein Schaltmonat ist. |
| virtual [IsLeapMonth](./isleapmonth/)(int, int) const | Überprüft, ob der Monat ein Schaltmonat ist. |
| [IsLeapYear](./isleapyear/)(int, int) const override | Überprüft, ob das Jahr ein Schaltjahr ist. |
| virtual [IsLeapYear](./isleapyear/)(int) const | Überprüft, ob das Jahr ein Schaltjahr ist. |
| [ThaiBuddhistCalendar](./thaibuddhistcalendar/)() | Konstruktor. |
| [ToDateTime](./todatetime/)(int, int, int, int, int, int, int, int) const override | Erstellt ein [DateTime](../../system/datetime/)-Objekt aus Komponenten. |
| virtual [ToDateTime](./todatetime/)(int, int, int, int, int, int, int) const | Erstellt ein [DateTime](../../system/datetime/)-Objekt aus Komponenten. |
## Felder

| Feld | Beschreibung |
| --- | --- |
| static constexpr [ThaiBuddhistEra](./thaibuddhistera/) | Aktuelle thailändische buddhistische Ära. |
## Siehe auch

* Class [Calendar](../calendar/)
* Namespace [System::Globalization](../)
* Library [Aspose.Page for C++](../../)
