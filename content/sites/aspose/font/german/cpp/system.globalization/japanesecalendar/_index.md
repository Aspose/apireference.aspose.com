---
title: "System::Globalization::JapaneseCalendar Klasse"
linktitle: "JapaneseCalendar"
second_title: "Aspose.Font für C++"
description: "System::Globalization::JapaneseCalendar Klasse. Japanischer Kalender. Objekte dieser Klasse sollten nur über die System::MakeObject()‑Funktion alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion‑Fehlern führt. Wickeln Sie diese Klasse stets in einen System::SmartPtr‑Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen in C++ zu übergeben."
type: docs
weight: 1400
url: /de/cpp/system.globalization/japanesecalendar/
---
## JapaneseCalendar class


Japanischer Kalender. Objekte dieser Klasse sollten nur über die [System::MakeObject()](../../system/makeobject/)‑Funktion alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion‑Fehlern führt. Wickeln Sie diese Klasse stets in einen [System::SmartPtr](../../system/smartptr/)‑Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben.

```cpp
class JapaneseCalendar : public System::Globalization::Calendar
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [Clone](./clone/)() override | RTTI-Informationen. |
| [get_AlgorithmType](./get_algorithmtype/)() const override | Liefert den Algorithmustyp. |
| [get_Eras](./get_eras/)() const override | Liefert die Liste der im Kalender vorhandenen Äras. |
| [get_MaxSupportedDateTime](./get_maxsupporteddatetime/)() const override | Maximaler Zeitpunkt, der vom Kalender unterstützt wird. |
| [get_MinSupportedDateTime](./get_minsupporteddatetime/)() const override | Minimaler Zeitpunkt, der vom Kalender unterstützt wird. |
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
| [IsLeapDay](./isleapday/)(int, int, int, int) const override | Prüft, ob der Tag ein Schalttag ist. |
| virtual [IsLeapDay](./isleapday/)(int, int, int) const | Prüft, ob der Tag ein Schalttag ist. |
| [IsLeapMonth](./isleapmonth/)(int, int, int) const override | Prüft, ob der Monat ein Schaltmonat ist. |
| virtual [IsLeapMonth](./isleapmonth/)(int, int) const | Prüft, ob der Monat ein Schaltmonat ist. |
| [IsLeapYear](./isleapyear/)(int, int) const override | Prüft, ob das Jahr ein Schaltjahr ist. |
| virtual [IsLeapYear](./isleapyear/)(int) const | Prüft, ob das Jahr ein Schaltjahr ist. |
| [JapaneseCalendar](./japanesecalendar/)() | Konstruktor. |
| [ToDateTime](./todatetime/)(int, int, int, int, int, int, int, int) const override | Konstruiert ein [DateTime](../../system/datetime/)‑Objekt aus Komponenten. |
| virtual [ToDateTime](./todatetime/)(int, int, int, int, int, int, int) const | Konstruiert ein [DateTime](../../system/datetime/)‑Objekt aus Komponenten. |
## Siehe auch

* Class [Calendar](../calendar/)
* Namespace [System::Globalization](../)
* Library [Aspose.Font for C++](../../)
