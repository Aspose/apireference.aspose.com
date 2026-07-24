---
title: "System::Globalization::Calendar Klasse"
linktitle: "Kalender"
second_title: "Aspose.Page für C++"
description: "System::Globalization::Calendar Klasse. Kalender, der definiert, wie die Daten verarbeitet, berechnet, formatiert usw. Setzoperationen sind nur bei nicht schreibgeschützten Objekten aktiviert. Objekte dieser Klasse sollten nur mit der Funktion System::MakeObject() alloziert werden. Erstellen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertionsfehlern führt. Wickeln Sie diese Klasse immer in einen System::SmartPtr‑Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen in C++ zu übergeben."
type: docs
weight: 100
url: /de/cpp/system.globalization/calendar/
---
## Calendar class


[Calendar](./) which defines how the dates are handled, calculated, formatted, etc. Setter operations are only enabled on non-read-only objects. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class Calendar : public System::ICloneable
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| virtual [AddDays](./adddays/)(DateTime, int) const | Fügt dem Zeitpunkt Tage hinzu. |
| virtual [AddHours](./addhours/)(DateTime, int) const | Fügt dem Zeitpunkt Stunden hinzu. |
| virtual [AddMilliseconds](./addmilliseconds/)(DateTime, double) const | Fügt dem Zeitpunkt Millisekunden hinzu. |
| virtual [AddMinutes](./addminutes/)(DateTime, int) const | Fügt dem Zeitpunkt Minuten hinzu. |
| virtual [AddMonths](./addmonths/)(DateTime, int) const | Fügt dem Zeitpunkt Monate hinzu. |
| virtual [AddSeconds](./addseconds/)(DateTime, int) const | Fügt dem Zeitpunkt Sekunden hinzu. |
| virtual [AddWeeks](./addweeks/)(DateTime, int) const | Fügt dem Zeitpunkt Wochen hinzu. |
| virtual [AddYears](./addyears/)(DateTime, int) const | Fügt dem Zeitpunkt Jahre hinzu. |
| [Calendar](./calendar/)(const Calendar\&) | RTTI-Informationen. |
| virtual [get_AlgorithmType](./get_algorithmtype/)() const | Liefert den Algorithmustyp. |
| [get_CurrentEra](./get_currentera/)() const | Ermittelt den Index der aktuellen Ära. |
| [get_CurrentEraValue](./get_currenteravalue/)() const | Ermittelt den Wert der aktuellen Ära. |
| virtual [get_Eras](./get_eras/)() const | Liefert die Liste der im Kalender vorhandenen Äras. |
| virtual [get_ID](./get_id/)() const | Ermittelt den Kalender-Identifikator. |
| [get_IsReadOnly](./get_isreadonly/)() const | Überprüft, ob der Kalender schreibgeschützt ist. |
| virtual [get_MaxSupportedDateTime](./get_maxsupporteddatetime/)() const | Der maximal unterstützte Zeitpunkt des Kalenders. |
| virtual [get_MinSupportedDateTime](./get_minsupporteddatetime/)() const | Der minimal unterstützte Zeitpunkt des Kalenders. |
| virtual [get_TwoDigitYearMax](./get_twodigityearmax/)() const | Ermittelt das letzte Jahr, das mit einer 2‑stelligen Angabe dargestellt werden kann. |
| virtual [GetDayOfMonth](./getdayofmonth/)(DateTime) const | Liefert den Tag des Monats für den angegebenen Zeitpunkt. |
| virtual [GetDayOfWeek](./getdayofweek/)(DateTime) const | Liefert den Wochentag für den angegebenen Zeitpunkt. |
| virtual [GetDayOfYear](./getdayofyear/)(DateTime) const | Liefert den Tag des Jahres für den angegebenen Zeitpunkt. |
| virtual [GetDaysInMonth](./getdaysinmonth/)(int, int) const | Liefert die Anzahl der Tage in einem bestimmten Monat. |
| virtual [GetDaysInMonth](./getdaysinmonth/)(int, int, int) const | Liefert die Anzahl der Tage in einem bestimmten Monat. |
| virtual [GetDaysInYear](./getdaysinyear/)(int) const | Liefert die Anzahl der Tage in einem bestimmten Jahr. |
| virtual [GetDaysInYear](./getdaysinyear/)(int, int) const | Liefert die Anzahl der Tage in einem bestimmten Jahr. |
| virtual [GetEra](./getera/)(DateTime) const | Liefert die Ära für den angegebenen Zeitpunkt. |
| virtual [GetHour](./gethour/)(DateTime) const | Ermittelt die Stunden für den angegebenen Zeitpunkt. |
| virtual [GetLeapMonth](./getleapmonth/)(int) const | Liefert den Schaltmonat für das angegebene Jahr. |
| virtual [GetLeapMonth](./getleapmonth/)(int, int) const | Liefert den Schaltmonat für das angegebene Jahr. |
| virtual [GetMilliseconds](./getmilliseconds/)(DateTime) const | Ermittelt die Millisekunden für den angegebenen Zeitpunkt. |
| virtual [GetMinute](./getminute/)(DateTime) const | Ermittelt die Minuten für den angegebenen Zeitpunkt. |
| virtual [GetMonth](./getmonth/)(DateTime) const | Liefert den Monat für den angegebenen Zeitpunkt. |
| virtual [GetMonthsInYear](./getmonthsinyear/)(int) const | Liefert die Anzahl der Monate im angegebenen Jahr. |
| virtual [GetMonthsInYear](./getmonthsinyear/)(int, int) const | Liefert die Anzahl der Monate im angegebenen Jahr. |
| virtual [GetSecond](./getsecond/)(DateTime) const | Ermittelt die Sekunden für den angegebenen Zeitpunkt. |
| virtual [GetWeekOfYear](./getweekofyear/)(DateTime, CalendarWeekRule, DayOfWeek) const | Ermittelt die Kalenderwoche des Jahres für den angegebenen Zeitpunkt. |
| virtual [GetYear](./getyear/)(DateTime) const | Ermittelt das Jahr für den angegebenen Zeitpunkt. |
| virtual [IsLeapDay](./isleapday/)(int, int, int) const | Überprüft, ob der Tag ein Schaltjahr ist. |
| virtual [IsLeapDay](./isleapday/)(int, int, int, int) const | Überprüft, ob der Tag ein Schaltjahr ist. |
| virtual [IsLeapMonth](./isleapmonth/)(int, int) const | Überprüft, ob der Monat ein Schaltmonat ist. |
| virtual [IsLeapMonth](./isleapmonth/)(int, int, int) const | Überprüft, ob der Monat ein Schaltmonat ist. |
| virtual [IsLeapYear](./isleapyear/)(int) const | Überprüft, ob das Jahr ein Schaltjahr ist. |
| virtual [IsLeapYear](./isleapyear/)(int, int) const | Überprüft, ob das Jahr ein Schaltjahr ist. |
| [IsValidDay](./isvalidday/)(int, int, int, int) const | Überprüft Jahr-, Monat-, Tag- und Ära-Werte. |
| [operator=](./operator=/)(const Calendar\&) |  |
| static [ReadOnly](./readonly/)(const CalendarPtr\&) | Ermittelt die schreibgeschützte Version des Kalenders. |
| virtual [set_TwoDigitYearMax](./set_twodigityearmax/)(int) | Setzt das letzte Jahr, das mit einer 2‑stelligen Angabe dargestellt werden kann. |
| virtual [ToDateTime](./todatetime/)(int, int, int, int, int, int, int) const | Erstellt ein [DateTime](../../system/datetime/)-Objekt aus Komponenten. |
| virtual [ToDateTime](./todatetime/)(int, int, int, int, int, int, int, int) const | Erstellt ein [DateTime](../../system/datetime/)-Objekt aus Komponenten. |
| virtual [ToFourDigitYear](./tofourdigityear/)(int) const | Konvertiert das Jahr in ein 4‑stelliges Jahr unter Verwendung der TwoDigitYearMax‑Eigenschaft. |
## Siehe auch

* Class [ICloneable](../../system/icloneable/)
* Namespace [System::Globalization](../)
* Library [Aspose.Page for C++](../../)
