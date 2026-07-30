---
title: "classe System::Globalization::DateTimeFormatInfo"
linktitle: "DateTimeFormatInfo"
second_title: "Aspose.Font per C++"
description: "classe System::Globalization::DateTimeFormatInfo. Insieme di parametri di formattazione di data e ora. Gli oggetti di questa classe devono essere allocati solo usando la funzione System::MakeObject() . Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgere sempre questa classe in un puntatore System::SmartPtr e utilizzare questo puntatore per passarlo alle funzioni come argomento in C++."
type: docs
weight: 600
url: /it/cpp/system.globalization/datetimeformatinfo/
---
## DateTimeFormatInfo class


Insieme di parametri di formattazione di data e ora. Gli oggetti di questa classe devono essere allocati solo usando la funzione [System::MakeObject()](../../system/makeobject/) . Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgere sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e utilizzare questo puntatore per passarlo alle funzioni come argomento.

```cpp
class DateTimeFormatInfo : public virtual System::Object,
                           public System::IFormatProvider,
                           public System::ICloneable
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [Clone](./clone/)() override | Clona le informazioni di formattazione. |
| [DateTimeFormatInfo](./datetimeformatinfo/)() | Costruttore predefinito, crea informazioni di formato invarianti. |
| [get_AbbreviatedDayNames](./get_abbreviateddaynames/)() const | Restituisce i nomi abbreviati dei giorni. |
| [get_AbbreviatedMonthGenitiveNames](./get_abbreviatedmonthgenitivenames/)() const | Restituisce i nomi abbreviati dei mesi in forma genitiva. |
| [get_AbbreviatedMonthNames](./get_abbreviatedmonthnames/)() const | Restituisce i nomi abbreviati dei mesi. |
| [get_AMDesignator](./get_amdesignator/)() const | Restituisce il designatore AM. |
| [get_Calendar](./get_calendar/)() const | Restituisce il calendario associato al formattatore. |
| [get_CalendarWeekRule](./get_calendarweekrule/)() const | Restituisce la regola della settimana del calendario associata al formattatore. |
| static [get_CurrentInfo](./get_currentinfo/)() | Restituisce il formattatore di data e ora del thread corrente. |
| [get_DateSeparator](./get_dateseparator/)() const | Restituisce il separatore di data. |
| [get_DayNames](./get_daynames/)() const | Restituisce i nomi dei giorni. |
| [get_FirstDayOfWeek](./get_firstdayofweek/)() const | Restituisce il primo giorno della settimana. |
| [get_FullDateTimePattern](./get_fulldatetimepattern/)() const | Restituisce il modello completo di data e ora. |
| static [get_InvariantInfo](./get_invariantinfo/)() | Restituisce il formattatore invariabile di data e ora. |
| [get_IsReadOnly](./get_isreadonly/)() const | Verifica se il formattatore è di sola lettura. |
| [get_LongDatePattern](./get_longdatepattern/)() const | Ottiene il modello di data lunga. |
| [get_LongTimePattern](./get_longtimepattern/)() const | Ottiene il modello di ora lunga. |
| [get_MonthDayPattern](./get_monthdaypattern/)() const | Ottiene il modello di giorno del mese. |
| [get_MonthGenitiveNames](./get_monthgenitivenames/)() const | Ottiene i nomi dei mesi nella forma genitiva. |
| [get_MonthNames](./get_monthnames/)() const | Ottiene i nomi dei mesi. |
| [get_NativeCalendarName](./get_nativecalendarname/)() const | Ottiene il nome del calendario nativo, se disponibile. |
| [get_PMDesignator](./get_pmdesignator/)() const | Ottiene il designatore PM. |
| [get_RFC1123Pattern](./get_rfc1123pattern/)() const | Ottiene il modello RFC1123. |
| [get_ShortDatePattern](./get_shortdatepattern/)() const | Ottiene il modello di data breve. |
| [get_ShortestDayNames](./get_shortestdaynames/)() const | Ottiene i nomi dei giorni più brevi possibili. |
| [get_ShortTimePattern](./get_shorttimepattern/)() const | Ottiene il modello di ora breve. |
| [get_SortableDateTimePattern](./get_sortabledatetimepattern/)() const | Ottiene il modello di data e ora ordinabile. |
| [get_TimeSeparator](./get_timeseparator/)() const | Ottiene il separatore dell'ora. |
| [get_UniversalSortableDateTimePattern](./get_universalsortabledatetimepattern/)() const | Ottiene il modello di data e ora ordinabile universale. |
| [get_YearMonthPattern](./get_yearmonthpattern/)() const | Ottiene il modello di anno e mese. |
| [GetAbbreviatedDayName](./getabbreviateddayname/)(DayOfWeek) const | Ottiene il nome abbreviato del giorno della settimana. |
| [GetAbbreviatedEraName](./getabbreviatederaname/)(int) const | Ottiene il nome abbreviato dell'era. |
| [GetAbbreviatedMonthName](./getabbreviatedmonthname/)(int) const | Ottiene il nome abbreviato del mese. |
| [GetAllDateTimePatterns](./getalldatetimepatterns/)() const | Ottiene tutti i modelli in cui i valori di data e ora possono essere formattati. |
| [GetAllDateTimePatterns](./getalldatetimepatterns/)(char16_t) const | Ottiene tutti i modelli in cui i valori di data e ora possono essere formattati usando la stringa di formato specificata. |
| [GetDayName](./getdayname/)(DayOfWeek) const | Ottiene il nome del giorno della settimana. |
| [GetEra](./getera/)(const String\&) const | Ottiene l'era per nome. |
| [GetEraName](./geteraname/)(int) const | Ottiene il nome dell'era. |
| [GetFormat](./getformat/)(const TypeInfo\&) override | Restituisce il formattatore di tipo specifico. |
| static [GetInstance](./getinstance/)(const IFormatProviderPtr\&) | Restituisce il formattatore associato al provider di formattazione. |
| [GetLeapYearMonthName](./getleapyearmonthname/)(int) const | Ottiene il nome del mese di anno bisestile. |
| [GetMonthGenitiveName](./getmonthgenitivename/)(int) const | Ottiene il nome genitivo del mese. |
| [GetMonthName](./getmonthname/)(int) const | Ottiene il nome del mese. |
| [GetShortestDayName](./getshortestdayname/)(DayOfWeek) const | Ottiene il nome più breve per il giorno della settimana specificato. |
| [operator=](./operator=/)(const DateTimeFormatInfo\&) |  |
| static [ReadOnly](./readonly/)(const DateTimeFormatInfoPtr\&) | Restituisce la versione di sola lettura del formattatore. |
| [set_AbbreviatedDayNames](./set_abbreviateddaynames/)(const ArrayPtr\<String\>\&) | Imposta i nomi abbreviati dei giorni. |
| [set_AbbreviatedMonthGenitiveNames](./set_abbreviatedmonthgenitivenames/)(const ArrayPtr\<String\>\&) | Imposta i nomi abbreviati dei mesi in forma genitiva. |
| [set_AbbreviatedMonthNames](./set_abbreviatedmonthnames/)(const ArrayPtr\<String\>\&) | Imposta i nomi abbreviati dei mesi. |
| [set_AMDesignator](./set_amdesignator/)(const String\&) | Imposta il designatore AM. |
| [set_Calendar](./set_calendar/)(const SharedPtr\<Calendar\>\&) | Imposta il calendario associato al formattatore. |
| [set_CalendarWeekRule](./set_calendarweekrule/)(CalendarWeekRule) | Imposta la regola della settimana del calendario associata al formattatore. |
| [set_DateSeparator](./set_dateseparator/)(const String\&) | Imposta il separatore di data. |
| [set_DayNames](./set_daynames/)(const ArrayPtr\<String\>\&) | Imposta i nomi dei giorni. |
| [set_FirstDayOfWeek](./set_firstdayofweek/)(DayOfWeek) | Imposta il primo giorno della settimana. |
| [set_FullDateTimePattern](./set_fulldatetimepattern/)(const String\&) | Imposta il modello completo di data e ora. |
| [set_LongDatePattern](./set_longdatepattern/)(const String\&) | Imposta il modello di data lunga. |
| [set_LongTimePattern](./set_longtimepattern/)(const String\&) | Imposta il modello di ora lunga. |
| [set_MonthDayPattern](./set_monthdaypattern/)(const String\&) | Imposta il modello di giorno del mese. |
| [set_MonthGenitiveNames](./set_monthgenitivenames/)(const ArrayPtr\<String\>\&) | Imposta i nomi dei mesi in forma genitiva. |
| [set_MonthNames](./set_monthnames/)(const ArrayPtr\<String\>\&) | Imposta i nomi dei mesi. |
| [set_PMDesignator](./set_pmdesignator/)(const String\&) | Imposta il designatore PM. |
| [set_ShortDatePattern](./set_shortdatepattern/)(const String\&) | Imposta il modello di data breve. |
| [set_ShortestDayNames](./set_shortestdaynames/)(const ArrayPtr\<String\>\&) | Imposta i nomi più brevi possibili dei giorni. |
| [set_ShortTimePattern](./set_shorttimepattern/)(const String\&) | Imposta il modello di ora breve. |
| [set_TimeSeparator](./set_timeseparator/)(const String\&) | Imposta il separatore di ora. |
| [set_YearMonthPattern](./set_yearmonthpattern/)(const String\&) | Imposta il modello di anno e mese. |
| [SetAllDateTimePatterns](./setalldatetimepatterns/)(const ArrayPtr\<String\>\&, char16_t) | Imposta i modelli per il formato specificato. |
## Vedi anche

* Class [Object](../../system/object/)
* Class [IFormatProvider](../../system/iformatprovider/)
* Class [ICloneable](../../system/icloneable/)
* Namespace [System::Globalization](../)
* Library [Aspose.Font for C++](../../)
