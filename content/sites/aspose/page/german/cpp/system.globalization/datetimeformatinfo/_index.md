---
title: "System::Globalization::DateTimeFormatInfo Klasse"
linktitle: "DateTimeFormatInfo"
second_title: "Aspose.Page für C++"
description: "System::Globalization::DateTimeFormatInfo Klasse. Menge von Datums- und Zeitformatierungsparametern. Objekte dieser Klasse dürfen nur mit der System::MakeObject()‑Funktion alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse stets in einen System::SmartPtr‑Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben in C++."
type: docs
weight: 600
url: /de/cpp/system.globalization/datetimeformatinfo/
---
## DateTimeFormatInfo class


Menge von Datums- und Zeitformatierungsparametern. Objekte dieser Klasse dürfen nur mit der [System::MakeObject()](../../system/makeobject/) Funktion alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse stets in den [System::SmartPtr](../../system/smartptr/) Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben.

```cpp
class DateTimeFormatInfo : public virtual System::Object,
                           public System::IFormatProvider,
                           public System::ICloneable
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [Clone](./clone/)() override | Klonen von Formatinformationen. |
| [DateTimeFormatInfo](./datetimeformatinfo/)() | Standardkonstruktor, erstellt invariant Formatinformationen. |
| [get_AbbreviatedDayNames](./get_abbreviateddaynames/)() const | Ruft die abgekürzten Tagesnamen ab. |
| [get_AbbreviatedMonthGenitiveNames](./get_abbreviatedmonthgenitivenames/)() const | Ruft die abgekürzten Monatsnamen im Genitiv ab. |
| [get_AbbreviatedMonthNames](./get_abbreviatedmonthnames/)() const | Ruft die abgekürzten Monatsnamen ab. |
| [get_AMDesignator](./get_amdesignator/)() const | Ruft das AM‑Bezeichner ab. |
| [get_Calendar](./get_calendar/)() const | Ruft den dem Formatter zugeordneten Kalender ab. |
| [get_CalendarWeekRule](./get_calendarweekrule/)() const | Ruft die dem Formatter zugeordnete Kalenderwochenregel ab. |
| static [get_CurrentInfo](./get_currentinfo/)() | Ruft den Datums- und Zeitformatter des aktuellen Threads ab. |
| [get_DateSeparator](./get_dateseparator/)() const | Ruft das Datums‑Trennzeichen ab. |
| [get_DayNames](./get_daynames/)() const | Liefert Tagesnamen. |
| [get_FirstDayOfWeek](./get_firstdayofweek/)() const | Liefert den ersten Tag der Woche. |
| [get_FullDateTimePattern](./get_fulldatetimepattern/)() const | Liefert das vollständige Datum‑ und Zeitformat. |
| static [get_InvariantInfo](./get_invariantinfo/)() | Liefert den invariant‑Datum‑ und Zeitformatierer. |
| [get_IsReadOnly](./get_isreadonly/)() const | Überprüft, ob der Formatierer schreibgeschützt ist. |
| [get_LongDatePattern](./get_longdatepattern/)() const | Liefert das lange Datumsformat. |
| [get_LongTimePattern](./get_longtimepattern/)() const | Liefert das lange Zeitformat. |
| [get_MonthDayPattern](./get_monthdaypattern/)() const | Liefert das Monat‑Tag‑Format. |
| [get_MonthGenitiveNames](./get_monthgenitivenames/)() const | Liefert die Monatsnamen im Genitiv. |
| [get_MonthNames](./get_monthnames/)() const | Liefert die Monatsnamen. |
| [get_NativeCalendarName](./get_nativecalendarname/)() const | Liefert den nativen Kalendernamen, falls verfügbar. |
| [get_PMDesignator](./get_pmdesignator/)() const | Liefert das PM‑Bezeichner. |
| [get_RFC1123Pattern](./get_rfc1123pattern/)() const | Liefert das RFC1123‑Muster. |
| [get_ShortDatePattern](./get_shortdatepattern/)() const | Liefert das kurze Datumsformat. |
| [get_ShortestDayNames](./get_shortestdaynames/)() const | Liefert die kürzest möglichen Tagesnamen. |
| [get_ShortTimePattern](./get_shorttimepattern/)() const | Liefert das kurze Zeitformat. |
| [get_SortableDateTimePattern](./get_sortabledatetimepattern/)() const | Liefert das sortierbare Datum‑ und Zeitformat. |
| [get_TimeSeparator](./get_timeseparator/)() const | Liefert den Zeittrennzeichen. |
| [get_UniversalSortableDateTimePattern](./get_universalsortabledatetimepattern/)() const | Liefert das universell sortierbare Datum‑ und Zeitformat. |
| [get_YearMonthPattern](./get_yearmonthpattern/)() const | Liefert das Jahr‑ und Monatsformat. |
| [GetAbbreviatedDayName](./getabbreviateddayname/)(DayOfWeek) const | Liefert den abgekürzten Wochentagsnamen. |
| [GetAbbreviatedEraName](./getabbreviatederaname/)(int) const | Liefert den abgekürzten Ära‑Namen. |
| [GetAbbreviatedMonthName](./getabbreviatedmonthname/)(int) const | Liefert den abgekürzten Monatsnamen. |
| [GetAllDateTimePatterns](./getalldatetimepatterns/)() const | Liefert alle Muster, in denen Datums‑ und Zeitwerte formatiert werden können. |
| [GetAllDateTimePatterns](./getalldatetimepatterns/)(char16_t) const | Liefert alle Muster, in denen Datums‑ und Zeitwerte mit einem angegebenen Formatstring formatiert werden können. |
| [GetDayName](./getdayname/)(DayOfWeek) const | Liefert den Namen des Wochentags. |
| [GetEra](./getera/)(const String\&) const | Liefert die Ära nach Namen. |
| [GetEraName](./geteraname/)(int) const | Liefert den Namen der Ära. |
| [GetFormat](./getformat/)(const TypeInfo\&) override | Liefert den Formatierer eines bestimmten Typs. |
| static [GetInstance](./getinstance/)(const IFormatProviderPtr\&) | Liefert den dem Formatprovider zugeordneten Formatierer. |
| [GetLeapYearMonthName](./getleapyearmonthname/)(int) const | Liefert den Namen des Schaltmonats. |
| [GetMonthGenitiveName](./getmonthgenitivename/)(int) const | Liefert den Genitiv-Monatsnamen. |
| [GetMonthName](./getmonthname/)(int) const | Liefert den Monatsnamen. |
| [GetShortestDayName](./getshortestdayname/)(DayOfWeek) const | Liefert den kürzesten Namen für den angegebenen Wochentag. |
| [operator=](./operator=/)(const DateTimeFormatInfo\&) |  |
| static [ReadOnly](./readonly/)(const DateTimeFormatInfoPtr\&) | Liefert die schreibgeschützte Version des Formatierers. |
| [set_AbbreviatedDayNames](./set_abbreviateddaynames/)(const ArrayPtr\<String\>\&) | Setzt die abgekürzten Tagesnamen. |
| [set_AbbreviatedMonthGenitiveNames](./set_abbreviatedmonthgenitivenames/)(const ArrayPtr\<String\>\&) | Setzt die abgekürzten Monatsnamen im Genitiv. |
| [set_AbbreviatedMonthNames](./set_abbreviatedmonthnames/)(const ArrayPtr\<String\>\&) | Setzt die abgekürzten Monatsnamen. |
| [set_AMDesignator](./set_amdesignator/)(const String\&) | Setzt den AM-Bezeichner. |
| [set_Calendar](./set_calendar/)(const SharedPtr\<Calendar\>\&) | Setzt den dem Formatierer zugeordneten Kalender. |
| [set_CalendarWeekRule](./set_calendarweekrule/)(CalendarWeekRule) | Setzt die dem Formatierer zugeordnete Kalenderwochenregel. |
| [set_DateSeparator](./set_dateseparator/)(const String\&) | Setzt das Datums‑Trennzeichen. |
| [set_DayNames](./set_daynames/)(const ArrayPtr\<String\>\&) | Setzt die Tagesnamen. |
| [set_FirstDayOfWeek](./set_firstdayofweek/)(DayOfWeek) | Setzt den ersten Tag der Woche. |
| [set_FullDateTimePattern](./set_fulldatetimepattern/)(const String\&) | Setzt das vollständige Datums- und Zeitformat. |
| [set_LongDatePattern](./set_longdatepattern/)(const String\&) | Setzt das lange Datumsformat. |
| [set_LongTimePattern](./set_longtimepattern/)(const String\&) | Setzt das lange Zeitformat. |
| [set_MonthDayPattern](./set_monthdaypattern/)(const String\&) | Setzt das Monats‑Tag‑Format. |
| [set_MonthGenitiveNames](./set_monthgenitivenames/)(const ArrayPtr\<String\>\&) | Setzt die Monatsnamen im Genitiv. |
| [set_MonthNames](./set_monthnames/)(const ArrayPtr\<String\>\&) | Setzt die Monatsnamen. |
| [set_PMDesignator](./set_pmdesignator/)(const String\&) | Setzt den PM-Bezeichner. |
| [set_ShortDatePattern](./set_shortdatepattern/)(const String\&) | Setzt das kurze Datumsformat. |
| [set_ShortestDayNames](./set_shortestdaynames/)(const ArrayPtr\<String\>\&) | Setzt die kürzest möglichen Tagesnamen. |
| [set_ShortTimePattern](./set_shorttimepattern/)(const String\&) | Legt das Kurzzeitformat fest. |
| [set_TimeSeparator](./set_timeseparator/)(const String\&) | Legt das Zeittrennzeichen fest. |
| [set_YearMonthPattern](./set_yearmonthpattern/)(const String\&) | Legt das Jahr‑ und Monatsformat fest. |
| [SetAllDateTimePatterns](./setalldatetimepatterns/)(const ArrayPtr\<String\>\&, char16_t) | Legt Muster für das angegebene Format fest. |
## Siehe auch

* Class [Object](../../system/object/)
* Class [IFormatProvider](../../system/iformatprovider/)
* Class [ICloneable](../../system/icloneable/)
* Namespace [System::Globalization](../)
* Library [Aspose.Page for C++](../../)
