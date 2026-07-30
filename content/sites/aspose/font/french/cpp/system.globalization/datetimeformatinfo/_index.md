---
title: "System::Globalization::DateTimeFormatInfo classe"
linktitle: "DateTimeFormatInfo"
second_title: "Aspose.Font pour C++"
description: "System::Globalization::DateTimeFormatInfo classe. Ensemble de paramètres de formatage de date et d'heure. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction System::MakeObject(). Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur System::SmartPtr et utilisez ce pointeur pour le passer aux fonctions en tant qu'argument en C++."
type: docs
weight: 600
url: /fr/cpp/system.globalization/datetimeformatinfo/
---
## DateTimeFormatInfo class


Ensemble de paramètres de formatage de date et d'heure. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction [System::MakeObject()](../../system/makeobject/). Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur [System::SmartPtr](../../system/smartptr/) et utilisez ce pointeur pour le passer aux fonctions en tant qu'argument.

```cpp
class DateTimeFormatInfo : public virtual System::Object,
                           public System::IFormatProvider,
                           public System::ICloneable
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [Clone](./clone/)() override | Clone les informations de format. |
| [DateTimeFormatInfo](./datetimeformatinfo/)() | Constructeur par défaut, crée des informations de format invariantes. |
| [get_AbbreviatedDayNames](./get_abbreviateddaynames/)() const | Obtient les noms de jour abrégés. |
| [get_AbbreviatedMonthGenitiveNames](./get_abbreviatedmonthgenitivenames/)() const | Obtient les noms de mois abrégés au génitif. |
| [get_AbbreviatedMonthNames](./get_abbreviatedmonthnames/)() const | Obtient les noms de mois abrégés. |
| [get_AMDesignator](./get_amdesignator/)() const | Obtient le désignateur AM. |
| [get_Calendar](./get_calendar/)() const | Obtient le calendrier associé au formateur. |
| [get_CalendarWeekRule](./get_calendarweekrule/)() const | Obtient la règle de semaine du calendrier associée au formateur. |
| static [get_CurrentInfo](./get_currentinfo/)() | Obtient le formateur de date et d'heure du thread actuel. |
| [get_DateSeparator](./get_dateseparator/)() const | Obtient le séparateur de date. |
| [get_DayNames](./get_daynames/)() const | Obtient les noms de jour. |
| [get_FirstDayOfWeek](./get_firstdayofweek/)() const | Obtient le premier jour de la semaine. |
| [get_FullDateTimePattern](./get_fulldatetimepattern/)() const | Obtient le modèle complet de date et d'heure. |
| static [get_InvariantInfo](./get_invariantinfo/)() | Obtient le formateur de date et d'heure invariant. |
| [get_IsReadOnly](./get_isreadonly/)() const | Vérifie si le formateur est en lecture seule. |
| [get_LongDatePattern](./get_longdatepattern/)() const | Obtient le modèle de date longue. |
| [get_LongTimePattern](./get_longtimepattern/)() const | Obtient le modèle d'heure longue. |
| [get_MonthDayPattern](./get_monthdaypattern/)() const | Obtient le modèle jour du mois. |
| [get_MonthGenitiveNames](./get_monthgenitivenames/)() const | Obtient les noms des mois au génitif. |
| [get_MonthNames](./get_monthnames/)() const | Obtient les noms des mois. |
| [get_NativeCalendarName](./get_nativecalendarname/)() const | Obtient le nom du calendrier natif si disponible. |
| [get_PMDesignator](./get_pmdesignator/)() const | Obtient le désignateur PM. |
| [get_RFC1123Pattern](./get_rfc1123pattern/)() const | Obtient le modèle RFC1123. |
| [get_ShortDatePattern](./get_shortdatepattern/)() const | Obtient le modèle de date courte. |
| [get_ShortestDayNames](./get_shortestdaynames/)() const | Obtient les noms de jour les plus courts possibles. |
| [get_ShortTimePattern](./get_shorttimepattern/)() const | Obtient le modèle d'heure courte. |
| [get_SortableDateTimePattern](./get_sortabledatetimepattern/)() const | Obtient le modèle de date et d'heure triable. |
| [get_TimeSeparator](./get_timeseparator/)() const | Obtient le séparateur d'heure. |
| [get_UniversalSortableDateTimePattern](./get_universalsortabledatetimepattern/)() const | Obtient le modèle de date et d'heure triable universel. |
| [get_YearMonthPattern](./get_yearmonthpattern/)() const | Obtient le modèle année et mois. |
| [GetAbbreviatedDayName](./getabbreviateddayname/)(DayOfWeek) const | Obtient le nom abrégé du jour de la semaine. |
| [GetAbbreviatedEraName](./getabbreviatederaname/)(int) const | Obtient le nom abrégé de l'ère. |
| [GetAbbreviatedMonthName](./getabbreviatedmonthname/)(int) const | Obtient le nom abrégé du mois. |
| [GetAllDateTimePatterns](./getalldatetimepatterns/)() const | Obtient tous les modèles dans lesquels les valeurs de date et d'heure peuvent être formatées. |
| [GetAllDateTimePatterns](./getalldatetimepatterns/)(char16_t) const | Obtient tous les modèles dans lesquels les valeurs de date et d'heure peuvent être formatées en utilisant la chaîne de format spécifiée. |
| [GetDayName](./getdayname/)(DayOfWeek) const | Obtient le nom du jour de la semaine. |
| [GetEra](./getera/)(const String\&) const | Obtient l'ère par son nom. |
| [GetEraName](./geteraname/)(int) const | Obtient le nom de l'ère. |
| [GetFormat](./getformat/)(const TypeInfo\&) override | Obtient le formateur d'un type spécifique. |
| static [GetInstance](./getinstance/)(const IFormatProviderPtr\&) | Obtient le formateur associé au fournisseur de format. |
| [GetLeapYearMonthName](./getleapyearmonthname/)(int) const | Obtient le nom du mois d'année bissextile. |
| [GetMonthGenitiveName](./getmonthgenitivename/)(int) const | Obtient le nom du mois au génitif. |
| [GetMonthName](./getmonthname/)(int) const | Obtient le nom du mois. |
| [GetShortestDayName](./getshortestdayname/)(DayOfWeek) const | Obtient le nom le plus court pour le jour de la semaine spécifié. |
| [operator=](./operator=/)(const DateTimeFormatInfo\&) |  |
| static [ReadOnly](./readonly/)(const DateTimeFormatInfoPtr\&) | Obtient la version en lecture seule du formateur. |
| [set_AbbreviatedDayNames](./set_abbreviateddaynames/)(const ArrayPtr\<String\>\&) | Définit les noms abrégés des jours. |
| [set_AbbreviatedMonthGenitiveNames](./set_abbreviatedmonthgenitivenames/)(const ArrayPtr\<String\>\&) | Définit les noms abrégés des mois au génitif. |
| [set_AbbreviatedMonthNames](./set_abbreviatedmonthnames/)(const ArrayPtr\<String\>\&) | Définit les noms abrégés des mois. |
| [set_AMDesignator](./set_amdesignator/)(const String\&) | Définit le désignateur AM. |
| [set_Calendar](./set_calendar/)(const SharedPtr\<Calendar\>\&) | Définit le calendrier associé au formateur. |
| [set_CalendarWeekRule](./set_calendarweekrule/)(CalendarWeekRule) | Définit la règle de semaine du calendrier associée au formateur. |
| [set_DateSeparator](./set_dateseparator/)(const String\&) | Définit le séparateur de date. |
| [set_DayNames](./set_daynames/)(const ArrayPtr\<String\>\&) | Définit les noms des jours. |
| [set_FirstDayOfWeek](./set_firstdayofweek/)(DayOfWeek) | Définit le premier jour de la semaine. |
| [set_FullDateTimePattern](./set_fulldatetimepattern/)(const String\&) | Définit le modèle complet de date et d'heure. |
| [set_LongDatePattern](./set_longdatepattern/)(const String\&) | Définit le modèle de date longue. |
| [set_LongTimePattern](./set_longtimepattern/)(const String\&) | Définit le modèle d'heure longue. |
| [set_MonthDayPattern](./set_monthdaypattern/)(const String\&) | Définit le modèle jour du mois. |
| [set_MonthGenitiveNames](./set_monthgenitivenames/)(const ArrayPtr\<String\>\&) | Définit les noms des mois au génitif. |
| [set_MonthNames](./set_monthnames/)(const ArrayPtr\<String\>\&) | Définit les noms des mois. |
| [set_PMDesignator](./set_pmdesignator/)(const String\&) | Définit le désignateur PM. |
| [set_ShortDatePattern](./set_shortdatepattern/)(const String\&) | Définit le modèle de date courte. |
| [set_ShortestDayNames](./set_shortestdaynames/)(const ArrayPtr\<String\>\&) | Définit les noms de jour les plus courts possibles. |
| [set_ShortTimePattern](./set_shorttimepattern/)(const String\&) | Définit le modèle d'heure courte. |
| [set_TimeSeparator](./set_timeseparator/)(const String\&) | Définit le séparateur d'heure. |
| [set_YearMonthPattern](./set_yearmonthpattern/)(const String\&) | Définit le modèle année et mois. |
| [SetAllDateTimePatterns](./setalldatetimepatterns/)(const ArrayPtr\<String\>\&, char16_t) | Définit les modèles pour le format spécifié. |
## Voir aussi

* Class [Object](../../system/object/)
* Class [IFormatProvider](../../system/iformatprovider/)
* Class [ICloneable](../../system/icloneable/)
* Namespace [System::Globalization](../)
* Library [Aspose.Font for C++](../../)
