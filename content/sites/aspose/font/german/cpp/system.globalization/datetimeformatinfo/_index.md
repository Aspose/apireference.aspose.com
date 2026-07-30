---
title: "System::Globalization::DateTimeFormatInfo Klasse"
linktitle: "DateTimeFormatInfo"
second_title: "Aspose.Font für C++"
description: "System::Globalization::DateTimeFormatInfo Klasse. Menge von Datums- und Zeitformatierungsparametern. Objekte dieser Klasse dürfen nur über die Funktion System::MakeObject() zugewiesen werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse immer in einen System::SmartPtr-Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben in C++."
type: docs
weight: 600
url: /de/cpp/system.globalization/datetimeformatinfo/
---
## DateTimeFormatInfo class


Menge von Datums- und Zeitformatierungsparametern. Objekte dieser Klasse dürfen nur über die Funktion [System::MakeObject()](../../system/makeobject/) zugewiesen werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse immer in einen [System::SmartPtr](../../system/smartptr/) Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben.

```cpp
class DateTimeFormatInfo : public virtual System::Object,
                           public System::IFormatProvider,
                           public System::ICloneable
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [Clone](./clone/)() override | Kopiert Formatinformationen. |
| [DateTimeFormatInfo](./datetimeformatinfo/)() | Standardkonstruktor, erstellt unveränderliche Formatinformationen. |
| [get_AbbreviatedDayNames](./get_abbreviateddaynames/)() const | Liefert abgekürzte Tagesnamen. |
| [get_AbbreviatedMonthGenitiveNames](./get_abbreviatedmonthgenitivenames/)() const | Liefert abgekürzte Monatsnamen im Genitiv. |
| [get_AbbreviatedMonthNames](./get_abbreviatedmonthnames/)() const | Liefert abgekürzte Monatsnamen. |
| [get_AMDesignator](./get_amdesignator/)() const | Liefert AM-Bezeichner. |
| [get_Calendar](./get_calendar/)() const | Liefert dem Formatierer zugeordneten Kalender. |
| [get_CalendarWeekRule](./get_calendarweekrule/)() const | Liefert dem Formatierer zugeordnete Kalenderwochenregel. |
| static [get_CurrentInfo](./get_currentinfo/)() | Liefert den Datums- und Zeitformatierer des aktuellen Threads. |
| [get_DateSeparator](./get_dateseparator/)() const | Liefert Datums-Trennzeichen. |
| [get_DayNames](./get_daynames/)() const | Liefert Tagesnamen. |
| [get_FirstDayOfWeek](./get_firstdayofweek/)() const | Liefert den ersten Wochentag. |
| [get_FullDateTimePattern](./get_fulldatetimepattern/)() const | Liefert vollständiges Datum- und Zeitmuster. |
| static [get_InvariantInfo](./get_invariantinfo/)() | Liefert unveränderlichen Datums- und Zeitformatierer. |
| [get_IsReadOnly](./get_isreadonly/)() const | Prüft, ob der Formatierer schreibgeschützt ist. |
| [get_LongDatePattern](./get_longdatepattern/)() const | Liefert das lange Datumsformat. |
| [get_LongTimePattern](./get_longtimepattern/)() const | Liefert das lange Zeitformat. |
| [get_MonthDayPattern](./get_monthdaypattern/)() const | Liefert das Monat‑Tag‑Format. |
| [get_MonthGenitiveNames](./get_monthgenitivenames/)() const | Liefert die Monatsnamen im Genitiv. |
| [get_MonthNames](./get_monthnames/)() const | Liefert die Monatsnamen. |
| [get_NativeCalendarName](./get_nativecalendarname/)() const | Liefert den nativen Kalendernamen, falls verfügbar. |
| [get_PMDesignator](./get_pmdesignator/)() const | Liefert das PM‑Kennzeichen. |
| [get_RFC1123Pattern](./get_rfc1123pattern/)() const | Liefert das RFC1123‑Format. |
| [get_ShortDatePattern](./get_shortdatepattern/)() const | Liefert das kurze Datumsformat. |
| [get_ShortestDayNames](./get_shortestdaynames/)() const | Liefert die kürzesten Tagesnamen, die möglich sind. |
| [get_ShortTimePattern](./get_shorttimepattern/)() const | Liefert das kurze Zeitformat. |
| [get_SortableDateTimePattern](./get_sortabledatetimepattern/)() const | Liefert das sortierbare Datum‑ und Zeitformat. |
| [get_TimeSeparator](./get_timeseparator/)() const | Liefert das Zeittrennzeichen. |
| [get_UniversalSortableDateTimePattern](./get_universalsortabledatetimepattern/)() const | Liefert das universell sortierbare Datum‑ und Zeitformat. |
| [get_YearMonthPattern](./get_yearmonthpattern/)() const | Liefert das Jahres‑ und Monatsformat. |
| [GetAbbreviatedDayName](./getabbreviateddayname/)(DayOfWeek) const | Liefert den abgekürzten Wochentagsnamen. |
| [GetAbbreviatedEraName](./getabbreviatederaname/)(int) const | Liefert den abgekürzten Ära‑Namen. |
| [GetAbbreviatedMonthName](./getabbreviatedmonthname/)(int) const | Liefert den abgekürzten Monatsnamen. |
| [GetAllDateTimePatterns](./getalldatetimepatterns/)() const | Liefert alle Formate, in denen Datums‑ und Zeitwerte formatiert werden können. |
| [GetAllDateTimePatterns](./getalldatetimepatterns/)(char16_t) const | Liefert alle Formate, in denen Datums‑ und Zeitwerte mit einem angegebenen Formatstring formatiert werden können. |
| [GetDayName](./getdayname/)(DayOfWeek) const | Liefert den Wochentagsnamen. |
| [GetEra](./getera/)(const String\&) const | Liefert die Ära nach Namen. |
| [GetEraName](./geteraname/)(int) const | Liefert den Ära‑Namen. |
| [GetFormat](./getformat/)(const TypeInfo\&) override | Gibt den Formatter des angegebenen Typs zurück. |
| static [GetInstance](./getinstance/)(const IFormatProviderPtr\&) | Gibt den mit dem Formatprovider verknüpften Formatter zurück. |
| [GetLeapYearMonthName](./getleapyearmonthname/)(int) const | Liefert den Schaltmonat‑Namen. |
| [GetMonthGenitiveName](./getmonthgenitivename/)(int) const | Liefert den Genitiv‑Monatsnamen. |
| [GetMonthName](./getmonthname/)(int) const | Ermittelt Monatsnamen. |
| [GetShortestDayName](./getshortestdayname/)(DayOfWeek) const | Ermittelt den kürzesten Namen für den angegebenen Wochentag. |
| [operator=](./operator=/)(const DateTimeFormatInfo\&) |  |
| static [ReadOnly](./readonly/)(const DateTimeFormatInfoPtr\&) | Gibt die schreibgeschützte Version des Formatters zurück. |
| [set_AbbreviatedDayNames](./set_abbreviateddaynames/)(const ArrayPtr\<String\>\&) | Legt abgekürzte Tagesnamen fest. |
| [set_AbbreviatedMonthGenitiveNames](./set_abbreviatedmonthgenitivenames/)(const ArrayPtr\<String\>\&) | Legt abgekürzte Monatsnamen im Genitiv fest. |
| [set_AbbreviatedMonthNames](./set_abbreviatedmonthnames/)(const ArrayPtr\<String\>\&) | Legt abgekürzte Monatsnamen fest. |
| [set_AMDesignator](./set_amdesignator/)(const String\&) | Legt AM-Bezeichner fest. |
| [set_Calendar](./set_calendar/)(const SharedPtr\<Calendar\>\&) | Legt den mit dem Formatter verknüpften Kalender fest. |
| [set_CalendarWeekRule](./set_calendarweekrule/)(CalendarWeekRule) | Legt die Kalenderwochenregel fest, die dem Formatter zugeordnet ist. |
| [set_DateSeparator](./set_dateseparator/)(const String\&) | Legt Datumstrennzeichen fest. |
| [set_DayNames](./set_daynames/)(const ArrayPtr\<String\>\&) | Legt Tagesnamen fest. |
| [set_FirstDayOfWeek](./set_firstdayofweek/)(DayOfWeek) | Legt den ersten Wochentag fest. |
| [set_FullDateTimePattern](./set_fulldatetimepattern/)(const String\&) | Legt das vollständige Datums- und Zeitformat fest. |
| [set_LongDatePattern](./set_longdatepattern/)(const String\&) | Legt das lange Datumsformat fest. |
| [set_LongTimePattern](./set_longtimepattern/)(const String\&) | Legt das lange Zeitformat fest. |
| [set_MonthDayPattern](./set_monthdaypattern/)(const String\&) | Legt das Monat‑Tag‑Muster fest. |
| [set_MonthGenitiveNames](./set_monthgenitivenames/)(const ArrayPtr\<String\>\&) | Legt Monatsnamen im Genitiv fest. |
| [set_MonthNames](./set_monthnames/)(const ArrayPtr\<String\>\&) | Legt Monatsnamen fest. |
| [set_PMDesignator](./set_pmdesignator/)(const String\&) | Legt PM-Bezeichner fest. |
| [set_ShortDatePattern](./set_shortdatepattern/)(const String\&) | Legt das kurze Datumsformat fest. |
| [set_ShortestDayNames](./set_shortestdaynames/)(const ArrayPtr\<String\>\&) | Legt die kürzest möglichen Tagesnamen fest. |
| [set_ShortTimePattern](./set_shorttimepattern/)(const String\&) | Legt das kurze Zeitformat fest. |
| [set_TimeSeparator](./set_timeseparator/)(const String\&) | Legt Zeittrennzeichen fest. |
| [set_YearMonthPattern](./set_yearmonthpattern/)(const String\&) | Legt das Jahr‑Monat‑Muster fest. |
| [SetAllDateTimePatterns](./setalldatetimepatterns/)(const ArrayPtr\<String\>\&, char16_t) | Legt Muster für das angegebene Format fest. |
## Siehe auch

* Class [Object](../../system/object/)
* Class [IFormatProvider](../../system/iformatprovider/)
* Class [ICloneable](../../system/icloneable/)
* Namespace [System::Globalization](../)
* Library [Aspose.Font for C++](../../)
