---
title: "System::Globalization::PersianCalendar klasse"
linktitle: "PersianCalendar"
second_title: "Aspose.Page voor C++"
description: "System::Globalization::PersianCalendar klasse. Perzische kalender. Objecten van deze klasse mogen alleen worden toegewezen met de System::MakeObject() functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit runtime‑fouten en/of assertiefouten veroorzaakt. Wikkel deze klasse altijd in een System::SmartPtr‑pointer en gebruik deze pointer om deze als argument aan functies door te geven in C++."
type: docs
weight: 2000
url: /nl/cpp/system.globalization/persiancalendar/
---
## PersianCalendar class


Perzische kalender. Objecten van deze klasse mogen alleen worden toegewezen met de [System::MakeObject()](../../system/makeobject/) functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit runtime‑fouten en/of assertiefouten veroorzaakt. Wikkel deze klasse altijd in een [System::SmartPtr](../../system/smartptr/) pointer en gebruik deze pointer om deze als argument aan functies door te geven.

```cpp
class PersianCalendar : public System::Globalization::Calendar
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
| virtual [GetDaysInMonth](./getdaysinmonth/)(int, int) const | RTTI-informatie. |
| [GetDaysInYear](./getdaysinyear/)(int, int) const override | Haalt het aantal dagen op in een specifiek jaar. |
| virtual [GetDaysInYear](./getdaysinyear/)(int) const | Haalt het aantal dagen op in een specifiek jaar. |
| [GetLeapMonth](./getleapmonth/)(int, int) const override | Haalt de schrikkelmaand op voor het opgegeven jaar. |
| virtual [GetLeapMonth](./getleapmonth/)(int) const | Haalt de schrikkelmaand op voor het opgegeven jaar. |
| [GetMonthsInYear](./getmonthsinyear/)(int, int) const override | Haalt het aantal maanden op in het opgegeven jaar. |
| virtual [GetMonthsInYear](./getmonthsinyear/)(int) const | Haalt het aantal maanden op in het opgegeven jaar. |
| [IsLeapDay](./isleapday/)(int, int, int, int) const override | Controleert of de dag een schrikkeldag is. |
| virtual [IsLeapDay](./isleapday/)(int, int, int) const | Controleert of de dag een schrikkeldag is. |
| [IsLeapMonth](./isleapmonth/)(int, int, int) const override | Controleert of de maand een schrikkelmaand is. |
| virtual [IsLeapMonth](./isleapmonth/)(int, int) const | Controleert of de maand een schrikkelmaand is. |
| [IsLeapYear](./isleapyear/)(int, int) const override | Controleert of het jaar een schrikkeljaar is. |
| virtual [IsLeapYear](./isleapyear/)(int) const | Controleert of het jaar een schrikkeljaar is. |
| [PersianCalendar](./persiancalendar/)() | Constructor. |
## Velden

| Veld | Beschrijving |
| --- | --- |
| static constexpr [PersianEra](./persianera/) | Huidig Perzisch tijdperk. |
## Zie ook

* Class [Calendar](../calendar/)
* Namespace [System::Globalization](../)
* Library [Aspose.Page for C++](../../)
