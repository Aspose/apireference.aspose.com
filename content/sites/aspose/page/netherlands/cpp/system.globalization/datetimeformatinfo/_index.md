---
title: "System::Globalization::DateTimeFormatInfo class"
linktitle: "DateTimeFormatInfo"
second_title: "Aspose.Page voor C++"
description: "System::Globalization::DateTimeFormatInfo class. Set van datum- en tijdopmaakparameters. Objecten van deze klasse mogen alleen worden gealloceerd met de System::MakeObject() functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit zal leiden tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een System::SmartPtr pointer en gebruik deze pointer om deze als argument aan functies door te geven in C++."
type: docs
weight: 600
url: /nl/cpp/system.globalization/datetimeformatinfo/
---
## DateTimeFormatInfo class


Set van datum- en tijdopmaakparameters. Objecten van deze klasse mogen alleen worden gealloceerd met de [System::MakeObject()](../../system/makeobject/) functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit zal leiden tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in de [System::SmartPtr](../../system/smartptr/) pointer en gebruik deze pointer om deze als argument aan functies door te geven.

```cpp
class DateTimeFormatInfo : public virtual System::Object,
                           public System::IFormatProvider,
                           public System::ICloneable
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [Clone](./clone/)() override | Kopieert opmaakinfo. |
| [DateTimeFormatInfo](./datetimeformatinfo/)() | Standaardconstructor, maakt een invariant opmaakinfo aan. |
| [get_AbbreviatedDayNames](./get_abbreviateddaynames/)() const | Haalt verkorte dagnamen op. |
| [get_AbbreviatedMonthGenitiveNames](./get_abbreviatedmonthgenitivenames/)() const | Haalt verkorte maandnamen op in genitiefvorm. |
| [get_AbbreviatedMonthNames](./get_abbreviatedmonthnames/)() const | Haalt verkorte maandnamen op. |
| [get_AMDesignator](./get_amdesignator/)() const | Haalt AM‑aanduiding op. |
| [get_Calendar](./get_calendar/)() const | Haalt de kalender op die bij de formatter hoort. |
| [get_CalendarWeekRule](./get_calendarweekrule/)() const | Haalt de kalenderweekregel op die bij de formatter hoort. |
| static [get_CurrentInfo](./get_currentinfo/)() | Haalt de datum‑ en tijdformatter van de huidige thread op. |
| [get_DateSeparator](./get_dateseparator/)() const | Haalt datum‑scheidingsteken op. |
| [get_DayNames](./get_daynames/)() const | Haalt de namen van dagen op. |
| [get_FirstDayOfWeek](./get_firstdayofweek/)() const | Haalt de eerste dag van de week op. |
| [get_FullDateTimePattern](./get_fulldatetimepattern/)() const | Haalt het volledige datum- en tijdpatroon op. |
| static [get_InvariantInfo](./get_invariantinfo/)() | Haalt de invariant datum- en tijdformatter op. |
| [get_IsReadOnly](./get_isreadonly/)() const | Controleert of de formatter alleen-lezen is. |
| [get_LongDatePattern](./get_longdatepattern/)() const | Haalt het lange datumpatroon op. |
| [get_LongTimePattern](./get_longtimepattern/)() const | Haalt het lange tijdpatroon op. |
| [get_MonthDayPattern](./get_monthdaypattern/)() const | Haalt het maand-dagpatroon op. |
| [get_MonthGenitiveNames](./get_monthgenitivenames/)() const | Haalt de maandnamen in de genitiefvorm op. |
| [get_MonthNames](./get_monthnames/)() const | Haalt de maandnamen op. |
| [get_NativeCalendarName](./get_nativecalendarname/)() const | Haalt de native kalendernaam op indien beschikbaar. |
| [get_PMDesignator](./get_pmdesignator/)() const | Haalt de PM‑aanduiding op. |
| [get_RFC1123Pattern](./get_rfc1123pattern/)() const | Haalt het RFC1123‑patroon op. |
| [get_ShortDatePattern](./get_shortdatepattern/)() const | Haalt het korte datumpatroon op. |
| [get_ShortestDayNames](./get_shortestdaynames/)() const | Haalt de kortst mogelijke dagnamen op. |
| [get_ShortTimePattern](./get_shorttimepattern/)() const | Haalt het korte tijdpatroon op. |
| [get_SortableDateTimePattern](./get_sortabledatetimepattern/)() const | Haalt het sorteerbare datum- en tijdpatroon op. |
| [get_TimeSeparator](./get_timeseparator/)() const | Haalt de tijdscheidingsteken op. |
| [get_UniversalSortableDateTimePattern](./get_universalsortabledatetimepattern/)() const | Haalt het universeel sorteerbare datum- en tijdpatroon op. |
| [get_YearMonthPattern](./get_yearmonthpattern/)() const | Haalt het jaar‑en‑maandpatroon op. |
| [GetAbbreviatedDayName](./getabbreviateddayname/)(DayOfWeek) const | Haalt de afgekorte weekdagnaam op. |
| [GetAbbreviatedEraName](./getabbreviatederaname/)(int) const | Haalt de afgekorte era‑naam op. |
| [GetAbbreviatedMonthName](./getabbreviatedmonthname/)(int) const | Haalt de afgekorte maandnaam op. |
| [GetAllDateTimePatterns](./getalldatetimepatterns/)() const | Haalt alle patronen op waarin datum‑ en tijdwaarden kunnen worden opgemaakt. |
| [GetAllDateTimePatterns](./getalldatetimepatterns/)(char16_t) const | Haalt alle patronen op waarin datum‑ en tijdwaarden kunnen worden opgemaakt met behulp van een opgegeven opmaakreeks. |
| [GetDayName](./getdayname/)(DayOfWeek) const | Haalt de naam van de weekdag op. |
| [GetEra](./getera/)(const String\&) const | Haalt het tijdperk op op basis van de naam. |
| [GetEraName](./geteraname/)(int) const | Haalt de naam van het tijdperk op. |
| [GetFormat](./getformat/)(const TypeInfo\&) override | Haalt formatter van specifiek type op. |
| static [GetInstance](./getinstance/)(const IFormatProviderPtr\&) | Haalt formatter op die geassocieerd is met formatprovider. |
| [GetLeapYearMonthName](./getleapyearmonthname/)(int) const | Haalt de naam van de schrikkelmaand op. |
| [GetMonthGenitiveName](./getmonthgenitivename/)(int) const | Haalt de genitieve maandnaam op. |
| [GetMonthName](./getmonthname/)(int) const | Haalt de maandnaam op. |
| [GetShortestDayName](./getshortestdayname/)(DayOfWeek) const | Haalt de kortste naam op voor de opgegeven dag van de week. |
| [operator=](./operator=/)(const DateTimeFormatInfo\&) |  |
| static [ReadOnly](./readonly/)(const DateTimeFormatInfoPtr\&) | Haalt de alleen-lezen versie van formatter op. |
| [set_AbbreviatedDayNames](./set_abbreviateddaynames/)(const ArrayPtr\<String\>\&) | Stelt afgekorte dagnamen in. |
| [set_AbbreviatedMonthGenitiveNames](./set_abbreviatedmonthgenitivenames/)(const ArrayPtr\<String\>\&) | Stelt afgekorte maandnamen in genitieve vorm in. |
| [set_AbbreviatedMonthNames](./set_abbreviatedmonthnames/)(const ArrayPtr\<String\>\&) | Stelt afgekorte maandnamen in. |
| [set_AMDesignator](./set_amdesignator/)(const String\&) | Stelt de AM-aanduiding in. |
| [set_Calendar](./set_calendar/)(const SharedPtr\<Calendar\>\&) | Stelt de kalender in die aan de formatter is gekoppeld. |
| [set_CalendarWeekRule](./set_calendarweekrule/)(CalendarWeekRule) | Stelt de kalenderweekregel in die aan de formatter is gekoppeld. |
| [set_DateSeparator](./set_dateseparator/)(const String\&) | Stelt de datumseparator in. |
| [set_DayNames](./set_daynames/)(const ArrayPtr\<String\>\&) | Stelt dagnamen in. |
| [set_FirstDayOfWeek](./set_firstdayofweek/)(DayOfWeek) | Stelt de eerste dag van de week in. |
| [set_FullDateTimePattern](./set_fulldatetimepattern/)(const String\&) | Stelt het volledige datum- en tijdpatroon in. |
| [set_LongDatePattern](./set_longdatepattern/)(const String\&) | Stelt het lange datumpatroon in. |
| [set_LongTimePattern](./set_longtimepattern/)(const String\&) | Stelt het lange tijdpatroon in. |
| [set_MonthDayPattern](./set_monthdaypattern/)(const String\&) | Stelt het maand-dagpatroon in. |
| [set_MonthGenitiveNames](./set_monthgenitivenames/)(const ArrayPtr\<String\>\&) | Stelt maandnamen in genitieve vorm in. |
| [set_MonthNames](./set_monthnames/)(const ArrayPtr\<String\>\&) | Stelt maandnamen in. |
| [set_PMDesignator](./set_pmdesignator/)(const String\&) | Stelt de PM-aanduiding in. |
| [set_ShortDatePattern](./set_shortdatepattern/)(const String\&) | Stelt het korte datumpatroon in. |
| [set_ShortestDayNames](./set_shortestdaynames/)(const ArrayPtr\<String\>\&) | Stelt de kortst mogelijke dagnamen in. |
| [set_ShortTimePattern](./set_shorttimepattern/)(const String\&) | Stelt kort tijdpatroon in. |
| [set_TimeSeparator](./set_timeseparator/)(const String\&) | Stelt tijdscheidingsteken in. |
| [set_YearMonthPattern](./set_yearmonthpattern/)(const String\&) | Stelt jaar- en maandpatroon in. |
| [SetAllDateTimePatterns](./setalldatetimepatterns/)(const ArrayPtr\<String\>\&, char16_t) | Stelt patronen in voor het opgegeven formaat. |
## Zie ook

* Class [Object](../../system/object/)
* Class [IFormatProvider](../../system/iformatprovider/)
* Class [ICloneable](../../system/icloneable/)
* Namespace [System::Globalization](../)
* Library [Aspose.Page for C++](../../)
