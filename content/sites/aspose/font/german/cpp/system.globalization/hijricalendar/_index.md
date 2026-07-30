---
title: "System::Globalization::HijriCalendar Klasse"
linktitle: "HijriCalendar"
second_title: "Aspose.Font für C++"
description: "System::Globalization::HijriCalendar Klasse. Hijri-Kalender. Objekte dieser Klasse sollten nur über die Funktion System::MakeObject() alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse stets in einen System::SmartPtr‑Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen in C++ zu übergeben."
type: docs
weight: 1200
url: /de/cpp/system.globalization/hijricalendar/
---
## HijriCalendar class


Hijri-Kalender. Objekte dieser Klasse sollten nur über die Funktion [System::MakeObject()](../../system/makeobject/) alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse stets in den [System::SmartPtr](../../system/smartptr/) Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben.

```cpp
class HijriCalendar : public System::Globalization::Calendar
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [Clone](./clone/)() override | RTTI-Informationen. |
| [get_AlgorithmType](./get_algorithmtype/)() const override | Liefert den Algorithmustyp. |
| [get_Eras](./get_eras/)() const override | Liefert die Liste der im Kalender vorhandenen Äras. |
| [get_HijriAdjustment](./get_hijriadjustment/)() const | Liefert die Hijri-Anpassung. |
| [get_MaxSupportedDateTime](./get_maxsupporteddatetime/)() const override | Maximaler Zeitpunkt, der vom Kalender unterstützt wird. |
| [get_MinSupportedDateTime](./get_minsupporteddatetime/)() const override | Minimaler Zeitpunkt, der vom Kalender unterstützt wird. |
| [GetDayOfWeek](./getdayofweek/)(DateTime) const override | Liefert den Wochentag für den angegebenen Zeitpunkt. |
| [GetLeapMonth](./getleapmonth/)(int, int) const override | Liefert den Schaltmonat für das angegebene Jahr. |
| virtual [GetLeapMonth](./getleapmonth/)(int) const | RTTI-Informationen. |
| [HijriCalendar](./hijricalendar/)() | Konstruktor. |
| [IsLeapDay](./isleapday/)(int, int, int, int) const override | Prüft, ob der Tag ein Schalttag ist. |
| virtual [IsLeapDay](./isleapday/)(int, int, int) const | Prüft, ob der Tag ein Schalttag ist. |
| [IsLeapMonth](./isleapmonth/)(int, int, int) const override | Prüft, ob der Monat ein Schaltmonat ist. |
| virtual [IsLeapMonth](./isleapmonth/)(int, int) const | Prüft, ob der Monat ein Schaltmonat ist. |
| [IsLeapYear](./isleapyear/)(int, int) const override | Prüft, ob das Jahr ein Schaltjahr ist. |
| virtual [IsLeapYear](./isleapyear/)(int) const | Prüft, ob das Jahr ein Schaltjahr ist. |
| [set_HijriAdjustment](./set_hijriadjustment/)(int) | Setzt die Hijri-Anpassung. |
## Felder

| Feld | Beschreibung |
| --- | --- |
| static constexpr [HijriEra](./hijriera/) | Aktuelle Hijri-Ära. |
## Siehe auch

* Class [Calendar](../calendar/)
* Namespace [System::Globalization](../)
* Library [Aspose.Font for C++](../../)
