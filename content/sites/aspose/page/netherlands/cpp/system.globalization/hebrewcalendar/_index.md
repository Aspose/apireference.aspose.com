---
title: "System::Globalization::HebrewCalendar class"
linktitle: "HebrewCalendar"
second_title: "Aspose.Page voor C++"
description: "System::Globalization::HebrewCalendar class. Hebreeuws kalender. Objecten van deze klasse mogen alleen worden toegewezen met de System::MakeObject() functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit zal leiden tot runtime-fouten en/of assertiefouten. Wikkel deze klasse altijd in een System::SmartPtr pointer en gebruik deze pointer om deze door te geven aan functies als argument in C++."
type: docs
weight: 1100
url: /nl/cpp/system.globalization/hebrewcalendar/
---
## HebrewCalendar class


Hebreeuws kalender. Objecten van deze klasse mogen alleen worden toegewezen met de [System::MakeObject()](../../system/makeobject/) functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit zal leiden tot runtime-fouten en/of assertiefouten. Wikkel deze klasse altijd in de [System::SmartPtr](../../system/smartptr/) pointer en gebruik deze pointer om deze door te geven aan functies als argument.

```cpp
class HebrewCalendar : public System::Globalization::Calendar
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [Clone](./clone/)() override | RTTI-informatie. |
| [get_AlgorithmType](./get_algorithmtype/)() const override | Haalt het algoritmetype op. |
| [get_Eras](./get_eras/)() const override | Haalt de lijst met tijdperken op die in de kalender bestaan. |
| [get_MaxSupportedDateTime](./get_maxsupporteddatetime/)() const override | Maximaal tijdstip dat door de kalender wordt ondersteund. |
| [get_MinSupportedDateTime](./get_minsupporteddatetime/)() const override | Minimaal tijdstip dat door de kalender wordt ondersteund. |
| [GetDayOfWeek](./getdayofweek/)(DateTime) const override | Haalt de dag van de week op voor het opgegeven tijdstip. |
| [GetDaysInMonth](./getdaysinmonth/)(int, int, int) const override | Haalt het aantal dagen op in een specifieke maand. |
| [GetEra](./getera/)(DateTime) const override | Haalt het tijdperk op voor het opgegeven tijdstip. |
| [GetLeapMonth](./getleapmonth/)(int, int) const override | Haalt de schrikkelmaand op voor het opgegeven jaar. |
| virtual [GetLeapMonth](./getleapmonth/)(int) const | RTTI-informatie. |
| [GetMonth](./getmonth/)(DateTime) const override | Haalt de maand op voor het opgegeven tijdstip. |
| [GetMonthsInYear](./getmonthsinyear/)(int, int) const override | Haalt het aantal maanden op in het opgegeven jaar. |
| virtual [GetMonthsInYear](./getmonthsinyear/)(int) const | Haalt het aantal maanden op in het opgegeven jaar. |
| [HebrewCalendar](./hebrewcalendar/)() | Constructor. |
| [IsLeapDay](./isleapday/)(int, int, int, int) const override | Controleert of de dag een schrikkeldag is. |
| virtual [IsLeapDay](./isleapday/)(int, int, int) const | Controleert of de dag een schrikkeldag is. |
| [IsLeapMonth](./isleapmonth/)(int, int, int) const override | Controleert of de maand een schrikkelmaand is. |
| virtual [IsLeapMonth](./isleapmonth/)(int, int) const | Controleert of de maand een schrikkelmaand is. |
| [IsLeapYear](./isleapyear/)(int, int) const override | Controleert of het jaar een schrikkeljaar is. |
| virtual [IsLeapYear](./isleapyear/)(int) const | Controleert of het jaar een schrikkeljaar is. |
| [set_TwoDigitYearMax](./set_twodigityearmax/)(int) override | Stelt het laatste jaar in dat kan worden weergegeven met twee cijfers. |
| [ToDateTime](./todatetime/)(int, int, int, int, int, int, int, int) const override | Construeert [DateTime](../../system/datetime/) object uit componenten. |
| virtual [ToDateTime](./todatetime/)(int, int, int, int, int, int, int) const | Construeert [DateTime](../../system/datetime/) object uit componenten. |
## Velden

| Veld | Beschrijving |
| --- | --- |
| static constexpr [HebrewEra](./hebrewera/) | Huidige Hebreeuwse era. |
## Zie ook

* Class [Calendar](../calendar/)
* Namespace [System::Globalization](../)
* Library [Aspose.Page for C++](../../)
