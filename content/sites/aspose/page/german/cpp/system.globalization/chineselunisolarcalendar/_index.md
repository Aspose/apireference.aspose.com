---
title: "System::Globalization::ChineseLunisolarCalendar Klasse"
linktitle: "ChineseLunisolarCalendar"
second_title: "Aspose.Page für C++"
description: "System::Globalization::ChineseLunisolarCalendar Klasse. Chinesischer lunisolarer Kalender. Objekte dieser Klasse sollten nur mit der Funktion System::MakeObject() alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse immer in einen System::SmartPtr-Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen in C++ zu übergeben."
type: docs
weight: 300
url: /de/cpp/system.globalization/chineselunisolarcalendar/
---
## ChineseLunisolarCalendar class


Chinesischer lunisolarer Kalender. Objekte dieser Klasse sollten nur mit der Funktion [System::MakeObject()](../../system/makeobject/) alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse immer in einen [System::SmartPtr](../../system/smartptr/) Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben.

```cpp
class ChineseLunisolarCalendar : public System::Globalization::EastAsianLunisolarCalendar
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [ChineseLunisolarCalendar](./chineselunisolarcalendar/)() | Standardkonstruktor. |
| [Clone](./clone/)() override | RTTI-Informationen. |
| [get_Eras](./get_eras/)() const override | Liefert die Liste der im Kalender vorhandenen Äras. |
| [get_MaxSupportedDateTime](./get_maxsupporteddatetime/)() const override | Der maximal unterstützte Zeitpunkt des Kalenders. |
| [get_MinSupportedDateTime](./get_minsupporteddatetime/)() const override | Der minimal unterstützte Zeitpunkt des Kalenders. |
| [GetDaysInMonth](./getdaysinmonth/)(int, int, int) const override | Liefert die Anzahl der Tage in einem bestimmten Monat. |
| virtual [GetDaysInMonth](./getdaysinmonth/)(int, int) const | Liefert die Anzahl der Tage in einem bestimmten Monat. |
| [GetEra](./getera/)(DateTime) const override | Liefert die Ära für den angegebenen Zeitpunkt. |
| [GetLeapMonth](./getleapmonth/)(int, int) const override | Liefert den Schaltmonat für das angegebene Jahr. |
| virtual [GetLeapMonth](./getleapmonth/)(int) const | Liefert den Schaltmonat für das angegebene Jahr. |
| [GetMonthsInYear](./getmonthsinyear/)(int, int) const override | Liefert die Anzahl der Monate im angegebenen Jahr. |
| virtual [GetMonthsInYear](./getmonthsinyear/)(int) const | RTTI-Informationen. |
| [IsLeapDay](./isleapday/)(int, int, int, int) const override | Überprüft, ob der Tag ein Schaltjahr ist. |
| virtual [IsLeapDay](./isleapday/)(int, int, int) const | Überprüft, ob der Tag ein Schaltjahr ist. |
| [IsLeapMonth](./isleapmonth/)(int, int, int) const override | Überprüft, ob der Monat ein Schaltmonat ist. |
| virtual [IsLeapMonth](./isleapmonth/)(int, int) const | Überprüft, ob der Monat ein Schaltmonat ist. |
| [IsLeapYear](./isleapyear/)(int, int) const override | Überprüft, ob das Jahr ein Schaltjahr ist. |
| virtual [IsLeapYear](./isleapyear/)(int) const | Überprüft, ob das Jahr ein Schaltjahr ist. |
## Felder

| Feld | Beschreibung |
| --- | --- |
| static constexpr [ChineseEra](./chineseera/) | Aktuelle chinesische Ära. |
## Siehe auch

* Class [EastAsianLunisolarCalendar](../eastasianlunisolarcalendar/)
* Namespace [System::Globalization](../)
* Library [Aspose.Page for C++](../../)
