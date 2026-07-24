---
title: "System::Globalization::Calendar klasse"
linktitle: "Kalender"
second_title: "Aspose.Page voor C++"
description: "System::Globalization::Calendar klasse. Kalender die definieert hoe de datums worden verwerkt, berekend, opgemaakt, enz. Setter-bewerkingen zijn alleen ingeschakeld voor objecten die niet alleen-lezen zijn. Objecten van deze klasse mogen alleen worden toegewezen met de System::MakeObject() functie. Maak nooit een instantie van dit type op de stack of met de operator new, omdat dit leidt tot runtime-fouten en/of assertiefouten. Wrap deze klasse altijd in een System::SmartPtr pointer en gebruik deze pointer om deze door te geven aan functies als argument in C++."
type: docs
weight: 100
url: /nl/cpp/system.globalization/calendar/
---
## Calendar class


[Calendar](./) which defines how the dates are handled, calculated, formatted, etc. Setter operations are only enabled on non-read-only objects. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class Calendar : public System::ICloneable
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| virtual [AddDays](./adddays/)(DateTime, int) const | Voegt dagen toe aan tijdstip. |
| virtual [AddHours](./addhours/)(DateTime, int) const | Voegt uren toe aan tijdstip. |
| virtual [AddMilliseconds](./addmilliseconds/)(DateTime, double) const | Voegt milliseconden toe aan tijdstip. |
| virtual [AddMinutes](./addminutes/)(DateTime, int) const | Voegt minuten toe aan tijdstip. |
| virtual [AddMonths](./addmonths/)(DateTime, int) const | Voegt maanden toe aan tijdstip. |
| virtual [AddSeconds](./addseconds/)(DateTime, int) const | Voegt seconden toe aan tijdstip. |
| virtual [AddWeeks](./addweeks/)(DateTime, int) const | Voegt weken toe aan tijdstip. |
| virtual [AddYears](./addyears/)(DateTime, int) const | Voegt jaren toe aan tijdstip. |
| [Calendar](./calendar/)(const Calendar\&) | RTTI-informatie. |
| virtual [get_AlgorithmType](./get_algorithmtype/)() const | Haalt het algoritmetype op. |
| [get_CurrentEra](./get_currentera/)() const | Haalt index op van huidige tijdperk. |
| [get_CurrentEraValue](./get_currenteravalue/)() const | Haalt waarde op van huidige tijdperk. |
| virtual [get_Eras](./get_eras/)() const | Haalt de lijst met tijdperken op die in de kalender bestaan. |
| virtual [get_ID](./get_id/)() const | Haalt kalenderidentificatie op. |
| [get_IsReadOnly](./get_isreadonly/)() const | Controleert of de kalender alleen-lezen is. |
| virtual [get_MaxSupportedDateTime](./get_maxsupporteddatetime/)() const | Maximaal tijdstip dat door de kalender wordt ondersteund. |
| virtual [get_MinSupportedDateTime](./get_minsupporteddatetime/)() const | Minimaal tijdstip dat door de kalender wordt ondersteund. |
| virtual [get_TwoDigitYearMax](./get_twodigityearmax/)() const | Haalt het laatste jaar op dat kan worden weergegeven met twee cijfers. |
| virtual [GetDayOfMonth](./getdayofmonth/)(DateTime) const | Haalt de dag van de maand op voor het opgegeven tijdstip. |
| virtual [GetDayOfWeek](./getdayofweek/)(DateTime) const | Haalt de dag van de week op voor het opgegeven tijdstip. |
| virtual [GetDayOfYear](./getdayofyear/)(DateTime) const | Haalt de dag van het jaar op voor het opgegeven tijdstip. |
| virtual [GetDaysInMonth](./getdaysinmonth/)(int, int) const | Haalt het aantal dagen op in een specifieke maand. |
| virtual [GetDaysInMonth](./getdaysinmonth/)(int, int, int) const | Haalt het aantal dagen op in een specifieke maand. |
| virtual [GetDaysInYear](./getdaysinyear/)(int) const | Haalt het aantal dagen op in een specifiek jaar. |
| virtual [GetDaysInYear](./getdaysinyear/)(int, int) const | Haalt het aantal dagen op in een specifiek jaar. |
| virtual [GetEra](./getera/)(DateTime) const | Haalt het tijdperk op voor het opgegeven tijdstip. |
| virtual [GetHour](./gethour/)(DateTime) const | Haalt uren op voor het opgegeven tijdstip. |
| virtual [GetLeapMonth](./getleapmonth/)(int) const | Haalt de schrikkelmaand op voor het opgegeven jaar. |
| virtual [GetLeapMonth](./getleapmonth/)(int, int) const | Haalt de schrikkelmaand op voor het opgegeven jaar. |
| virtual [GetMilliseconds](./getmilliseconds/)(DateTime) const | Haalt milliseconden op voor het opgegeven tijdstip. |
| virtual [GetMinute](./getminute/)(DateTime) const | Haalt minuten op voor het opgegeven tijdstip. |
| virtual [GetMonth](./getmonth/)(DateTime) const | Haalt de maand op voor het opgegeven tijdstip. |
| virtual [GetMonthsInYear](./getmonthsinyear/)(int) const | Haalt het aantal maanden op in het opgegeven jaar. |
| virtual [GetMonthsInYear](./getmonthsinyear/)(int, int) const | Haalt het aantal maanden op in het opgegeven jaar. |
| virtual [GetSecond](./getsecond/)(DateTime) const | Haalt seconden op voor het opgegeven tijdstip. |
| virtual [GetWeekOfYear](./getweekofyear/)(DateTime, CalendarWeekRule, DayOfWeek) const | Haalt week van het jaar op voor het opgegeven tijdstip. |
| virtual [GetYear](./getyear/)(DateTime) const | Haalt het jaar op voor het opgegeven tijdstip. |
| virtual [IsLeapDay](./isleapday/)(int, int, int) const | Controleert of de dag een schrikkeldag is. |
| virtual [IsLeapDay](./isleapday/)(int, int, int, int) const | Controleert of de dag een schrikkeldag is. |
| virtual [IsLeapMonth](./isleapmonth/)(int, int) const | Controleert of de maand een schrikkelmaand is. |
| virtual [IsLeapMonth](./isleapmonth/)(int, int, int) const | Controleert of de maand een schrikkelmaand is. |
| virtual [IsLeapYear](./isleapyear/)(int) const | Controleert of het jaar een schrikkeljaar is. |
| virtual [IsLeapYear](./isleapyear/)(int, int) const | Controleert of het jaar een schrikkeljaar is. |
| [IsValidDay](./isvalidday/)(int, int, int, int) const | Controleert jaar-, maand-, dag- en tijdperkwaarden. |
| [operator=](./operator=/)(const Calendar\&) |  |
| static [ReadOnly](./readonly/)(const CalendarPtr\&) | Haalt alleen-lezen versie van kalender op. |
| virtual [set_TwoDigitYearMax](./set_twodigityearmax/)(int) | Stelt het laatste jaar in dat kan worden weergegeven met twee cijfers. |
| virtual [ToDateTime](./todatetime/)(int, int, int, int, int, int, int) const | Construeert [DateTime](../../system/datetime/) object uit componenten. |
| virtual [ToDateTime](./todatetime/)(int, int, int, int, int, int, int, int) const | Construeert [DateTime](../../system/datetime/) object uit componenten. |
| virtual [ToFourDigitYear](./tofourdigityear/)(int) const | Converteert het jaar naar een 4-cijferig jaar met behulp van de TwoDigitYearMax-eigenschap. |
## Zie ook

* Class [ICloneable](../../system/icloneable/)
* Namespace [System::Globalization](../)
* Library [Aspose.Page for C++](../../)
