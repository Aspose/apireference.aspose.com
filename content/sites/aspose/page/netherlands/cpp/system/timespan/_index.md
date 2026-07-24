---
title: "System::TimeSpan klasse"
linktitle: "TimeSpan"
second_title: "Aspose.Page voor C++"
description: "System::TimeSpan klasse. Stelt een tijdsinterval voor. Dit type moet op de stack worden gealloceerd en aan functies worden doorgegeven per waarde of per referentie. Gebruik nooit de System::SmartPtr klasse om objecten van dit type in C++ te beheren."
type: docs
weight: 6100
url: /nl/cpp/system/timespan/
---
## TimeSpan class


Stelt een tijdsinterval voor. Dit type moet op de stack worden gealloceerd en aan functies worden doorgegeven per waarde of per referentie. Gebruik nooit de [System::SmartPtr](../smartptr/) klasse om objecten van dit type te beheren.

```cpp
class TimeSpan
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [Add](./add/)(TimeSpan) const | Retourneert een nieuw exemplaar van de [TimeSpan](./) klasse die een tijdsinterval voorstelt dat de som is van de tijdsintervallen die worden weergegeven door het huidige en het opgegeven object. |
| static [Compare](./compare/)(TimeSpan, TimeSpan) | Vergelijkt twee [TimeSpan](./) objecten. |
| [CompareTo](./compareto/)(TimeSpan) const | Vergelijkt het huidige en de opgegeven objecten. |
| [CompareTo](./compareto/)(const SharedPtr\<Object\>\&) const | Vergelijkt het huidige en de opgegeven objecten. |
| [Duration](./duration/)() const | Retourneert een nieuw exemplaar van een [TimeSpan](./) object waarvan de waarde de absolute waarde van het huidige object is. |
| [Equals](./equals/)(TimeSpan) const | Bepaalt of het tijdsinterval dat wordt weergegeven door het huidige object gelijk is aan het tijdsinterval dat wordt weergegeven door het opgegeven object. |
| [Equals](./equals/)(const SharedPtr\<Object\>\&) const | Bepaalt of het tijdsinterval dat wordt weergegeven door het huidige object gelijk is aan het tijdsinterval dat wordt weergegeven door het opgegeven object. |
| static [Equals](./equals/)(TimeSpan, TimeSpan) | Retourneert true als de opgegeven objecten hetzelfde tijdsinterval vertegenwoordigen, anders false. |
| static [FromDays](./fromdays/)(double) | Retourneert een nieuw [TimeSpan](./) object dat het opgegeven interval voorstelt. |
| static [FromHours](./fromhours/)(double) | Retourneert een nieuw [TimeSpan](./) object dat het opgegeven interval voorstelt. |
| static [FromMilliseconds](./frommilliseconds/)(double) | Retourneert een nieuw [TimeSpan](./) object dat het opgegeven interval voorstelt. |
| static [FromMinutes](./fromminutes/)(double) | Retourneert een nieuw [TimeSpan](./) object dat het opgegeven interval voorstelt. |
| static [FromSeconds](./fromseconds/)(double) | Retourneert een nieuw [TimeSpan](./) object dat het opgegeven interval voorstelt. |
| static [FromTicks](./fromticks/)(int64_t) | Retourneert een nieuw [TimeSpan](./) object dat het opgegeven interval voorstelt. |
| [get_Days](./get_days/)() const | Retourneert het dagencomponent van het tijdsinterval dat wordt weergegeven door het huidige [TimeSpan](./) object. |
| [get_Hours](./get_hours/)() const | Retourneert het urencomponent van het tijdsinterval dat wordt weergegeven door het huidige [TimeSpan](./) object. |
| [get_Milliseconds](./get_milliseconds/)() const | Retourneert het millisecondencomponent van het tijdsinterval dat wordt weergegeven door het huidige [TimeSpan](./) object. |
| [get_Minutes](./get_minutes/)() const | Retourneert het minutencomponent van het tijdsinterval dat wordt weergegeven door het huidige [TimeSpan](./) object. |
| [get_Seconds](./get_seconds/)() const | Retourneert het secondencomponent van het tijdsinterval dat wordt weergegeven door het huidige [TimeSpan](./) object. |
| [get_Ticks](./get_ticks/)() const | Retourneert het aantal 100-nanosecondenintervallen waaruit het tijdsinterval bestaat dat wordt weergegeven door het huidige [TimeSpan](./) object. |
| [get_TotalDays](./get_totaldays/)() const | Retourneert de waarde van het huidige [TimeSpan](./) object uitgedrukt in gehele en fractionele dagen. |
| [get_TotalHours](./get_totalhours/)() const | Retourneert de waarde van het huidige [TimeSpan](./) object uitgedrukt in gehele en fractionele uren. |
| [get_TotalMilliseconds](./get_totalmilliseconds/)() const | Retourneert de waarde van het huidige [TimeSpan](./) object uitgedrukt in gehele en fractionele milliseconden. |
| [get_TotalMinutes](./get_totalminutes/)() const | Retourneert de waarde van het huidige [TimeSpan](./) object uitgedrukt in gehele en fractionele minuten. |
| [get_TotalSeconds](./get_totalseconds/)() const | Retourneert de waarde van het huidige [TimeSpan](./) object uitgedrukt in gehele en fractionele seconden. |
| [GetHashCode](./gethashcode/)() const | Retourneert een hashcode voor het huidige object. |
| [IsNull](./isnull/)() const |  |
| [Negate](./negate/)() const | Retourneert een nieuw exemplaar van een [TimeSpan](./) object dat de negatieve waarde van het huidige [TimeSpan](./) object voorstelt. |
| [operator!=](./operator!=/)(TimeSpan) const | Bepaalt of het tijdsinterval dat wordt weergegeven door het huidige object niet gelijk is aan het tijdsinterval dat wordt weergegeven door het opgegeven object. |
| [operator!=](./operator!=/)(std::nullptr_t) const |  |
| [operator+](./operator+/)(TimeSpan) const | Retourneert een nieuw exemplaar van de [TimeSpan](./) klasse die een tijdsinterval voorstelt dat de som is van de tijdsintervallen die worden weergegeven door het huidige en het opgegeven object. |
| [operator+](./operator+/)() const | Retourneert zichzelf. |
| [operator+=](./operator+=/)(TimeSpan) | Wijs aan het huidige object het tijdsinterval toe dat de som is van het tijdsinterval dat wordt weergegeven door het huidige en het opgegeven object. |
| [operator-](./operator-/)(TimeSpan) const | Retourneert een nieuwe instantie van de [TimeSpan](./)-klasse die een tijdsinterval vertegenwoordigt dat het resultaat is van het aftrekken van het tijdsinterval dat wordt weergegeven door het opgegeven object van het tijdsinterval dat wordt weergegeven door het huidige object. |
| [operator-](./operator-/)() const | Retourneert een nieuw exemplaar van een [TimeSpan](./) object dat de negatieve waarde van het huidige [TimeSpan](./) object voorstelt. |
| [operator-=](./operator-=/)(TimeSpan) | Wijs aan het huidige object het tijdsinterval toe dat het resultaat is van het aftrekken van het tijdsinterval dat wordt weergegeven door het opgegeven object van het tijdsinterval dat wordt weergegeven door het huidige object. |
| [operator/](./operator//)(double) const |  |
| [operator/](./operator//)(TimeSpan) const |  |
| [operator/=](./operator/=/)(double) |  |
| [operator<](./operator_/)(TimeSpan) const | Bepaalt of het tijdsinterval dat wordt weergegeven door het huidige object korter is dan het tijdsinterval dat wordt weergegeven door het opgegeven object. |
| [operator<](./operator_/)(std::nullptr_t) const |  |
| [operator<=](./operator_=/)(TimeSpan) const | Bepaalt of het tijdsinterval dat wordt weergegeven door het huidige object korter is dan of gelijk is aan het tijdsinterval dat wordt weergegeven door het opgegeven object. |
| [operator<=](./operator_=/)(std::nullptr_t) const |  |
| [operator=](./operator=/)(const TimeSpan\&) | Stelt het tijdsinterval dat wordt weergegeven door het opgegeven [TimeSpan](./)-object in op het huidige [TimeSpan](./)-object. |
| [operator==](./operator==/)(TimeSpan) const | Bepaalt of het tijdsinterval dat wordt weergegeven door het huidige object gelijk is aan het tijdsinterval dat wordt weergegeven door het opgegeven object. |
| [operator==](./operator==/)(std::nullptr_t) const |  |
| [operator>](./operator_/)(TimeSpan) const | Bepaalt of het tijdsinterval dat wordt weergegeven door het huidige object langer is dan het tijdsinterval dat wordt weergegeven door het opgegeven object. |
| [operator>](./operator_/)(std::nullptr_t) const |  |
| [operator>=](./operator_=/)(TimeSpan) const | Bepaalt of het tijdsinterval dat wordt weergegeven door het huidige object langer is dan of gelijk is aan het tijdsinterval dat wordt weergegeven door het opgegeven object. |
| [operator>=](./operator_=/)(std::nullptr_t) const |  |
| static [Parse](./parse/)(const String\&) | Converteert een tekenreeks naar een equivalent [TimeSpan](./)-object. |
| static [Parse](./parse/)(const String\&, const SharedPtr\<IFormatProvider\>\&) | Converteert een tekenreeks naar een equivalent [TimeSpan](./)-object met behulp van de opgegeven opmaakprovider. |
| static [Parse](./parse/)(const String\&, const SharedPtr\<Globalization::CultureInfo\>\&) |  |
| static [Parse](./parse/)(const String\&, const SharedPtr\<Globalization::DateTimeFormatInfo\>\&) |  |
| static [Parse](./parse/)(const String\&, std::nullptr_t) |  |
| static [ParseExact](./parseexact/)(const String\&, const ArrayPtr\<String\>\&, const SharedPtr\<IFormatProvider\>\&, Globalization::TimeSpanStyles) | Converteert een tekenreeks naar een equivalent [TimeSpan](./)-object met behulp van de opgegeven opmaken, opmaakprovider en stijlen. |
| static [ParseExact](./parseexact/)(const String\&, const ArrayPtr\<String\>\&, const SharedPtr\<Globalization::CultureInfo\>\&, Globalization::TimeSpanStyles) |  |
| static [ParseExact](./parseexact/)(const String\&, const ArrayPtr\<String\>\&, const SharedPtr\<Globalization::DateTimeFormatInfo\>\&, Globalization::TimeSpanStyles) |  |
| static [ParseExact](./parseexact/)(const String\&, const ArrayPtr\<String\>\&, std::nullptr_t, Globalization::TimeSpanStyles) |  |
| static [ParseExact](./parseexact/)(const String\&, const String\&, const SharedPtr\<IFormatProvider\>\&, Globalization::TimeSpanStyles) | Converteert een tekenreeks naar een equivalent [TimeSpan](./)-object met behulp van de opgegeven opmaak, opmaakprovider en stijlen. |
| static [ParseExact](./parseexact/)(const String\&, const String\&, const SharedPtr\<Globalization::CultureInfo\>\&, Globalization::TimeSpanStyles) |  |
| static [ParseExact](./parseexact/)(const String\&, const String\&, const SharedPtr\<Globalization::DateTimeFormatInfo\>\&, Globalization::TimeSpanStyles) |  |
| static [ParseExact](./parseexact/)(const String\&, const String\&, std::nullptr_t, Globalization::TimeSpanStyles) |  |
| [Subtract](./subtract/)(TimeSpan) const | Retourneert een nieuwe instantie van de [TimeSpan](./)-klasse die een tijdsinterval vertegenwoordigt dat het resultaat is van het aftrekken van het tijdsinterval dat wordt weergegeven door het opgegeven object van het tijdsinterval dat wordt weergegeven door het huidige object. |
| [TimeSpan](./timespan/)() | Construeert een [TimeSpan](./)-object dat een nul tijdsinterval vertegenwoordigt. |
| explicit [TimeSpan](./timespan/)(int64_t) | Construeert een instantie van de [TimeSpan](./)-klasse die het opgegeven tijdsinterval vertegenwoordigt. |
| [TimeSpan](./timespan/)(int, int, int) | Construeert een instantie van de [TimeSpan](./)-klasse die het tijdsinterval vertegenwoordigt dat gelijk is aan de som van het opgegeven aantal uren, minuten en seconden. |
| [TimeSpan](./timespan/)(int, int, int, int, int) | Construeert een instantie van de [TimeSpan](./)-klasse die het tijdsinterval vertegenwoordigt dat gelijk is aan de som van het opgegeven aantal uren, minuten, seconden en milliseconden. |
| [TimeSpan](./timespan/)(const TimeSpan\&) | Construeert een [TimeSpan](./)-object dat het tijdsinterval vertegenwoordigt dat gelijk is aan het tijdsinterval dat wordt weergegeven door het opgegeven [TimeSpan](./)-object. |
| [ToString](./tostring/)() const | Retourneert de tekenreeksrepresentatie van het tijdsinterval dat wordt weergegeven door het huidige object. |
| [ToString](./tostring/)(const String\&) const | Converteert de waarde van het huidige object naar een equivalente tekenreeksrepresentatie, met behulp van de opgegeven opmaak. |
| [ToString](./tostring/)(const String\&, const SharedPtr\<IFormatProvider\>\&) const | Converteert de waarde van het huidige object naar een equivalente tekenreeksrepresentatie, met behulp van de opgegeven opmaak en opmaakprovider. |
| [ToString](./tostring/)(const String\&, const SharedPtr\<Globalization::CultureInfo\>\&) const |  |
| [ToString](./tostring/)(const String\&, const SharedPtr\<Globalization::DateTimeFormatInfo\>\&) const |  |
| [ToString](./tostring/)(const String\&, std::nullptr_t) const |  |
| static [TryParse](./tryparse/)(const String\&, TimeSpan\&) | Converteert een tekenreeks naar een equivalent [TimeSpan](./)-object en retourneert het resultaat van de conversie. |
| static [TryParse](./tryparse/)(const String\&, const SharedPtr\<IFormatProvider\>\&, TimeSpan\&) | Converteert een tekenreeks naar een equivalent [TimeSpan](./)-object met behulp van de opgegeven opmaakprovider en retourneert het resultaat van de conversie. |
| static [TryParse](./tryparse/)(const String\&, const SharedPtr\<Globalization::CultureInfo\>\&, TimeSpan\&) |  |
| static [TryParse](./tryparse/)(const String\&, const SharedPtr\<Globalization::DateTimeFormatInfo\>\&, TimeSpan\&) |  |
| static [TryParse](./tryparse/)(const String\&, std::nullptr_t, TimeSpan\&) |  |
| static [TryParseExact](./tryparseexact/)(const String\&, const ArrayPtr\<String\>\&, const SharedPtr\<IFormatProvider\>\&, TimeSpan\&) | Converteert een tekenreeks naar een equivalent [TimeSpan](./)-object met behulp van de opgegeven opmaken en opmaakprovider, en retourneert het resultaat van de conversie. |
| static [TryParseExact](./tryparseexact/)(const String\&, const ArrayPtr\<String\>\&, const SharedPtr\<Globalization::CultureInfo\>\&, TimeSpan\&) |  |
| static [TryParseExact](./tryparseexact/)(const String\&, const ArrayPtr\<String\>\&, const SharedPtr\<Globalization::DateTimeFormatInfo\>\&, TimeSpan\&) |  |
| static [TryParseExact](./tryparseexact/)(const String\&, const ArrayPtr\<String\>\&, std::nullptr_t, TimeSpan\&) |  |
| static [TryParseExact](./tryparseexact/)(const String\&, const String\&, const SharedPtr\<IFormatProvider\>\&, Globalization::TimeSpanStyles, TimeSpan\&) | Converteert een tekenreeks naar een equivalent [TimeSpan](./)-object met behulp van de opgegeven opmaak, opmaakprovider en stijlen, en retourneert het resultaat van de conversie. |
| static [TryParseExact](./tryparseexact/)(const String\&, const String\&, const SharedPtr\<Globalization::CultureInfo\>\&, Globalization::TimeSpanStyles, TimeSpan\&) |  |
| static [TryParseExact](./tryparseexact/)(const String\&, const String\&, const SharedPtr\<Globalization::DateTimeFormatInfo\>\&, Globalization::TimeSpanStyles, TimeSpan\&) |  |
| static [TryParseExact](./tryparseexact/)(const String\&, const String\&, std::nullptr_t, Globalization::TimeSpanStyles, TimeSpan\&) |  |
| static [TryParseExact](./tryparseexact/)(const String\&, const ArrayPtr\<String\>\&, const SharedPtr\<IFormatProvider\>\&, Globalization::TimeSpanStyles, TimeSpan\&) | Converteert een string naar een equivalent [TimeSpan](./) object met behulp van de opgegeven formaten, formatprovider en stijlen, en retourneert het resultaat van de conversie. |
| static [TryParseExact](./tryparseexact/)(const String\&, const ArrayPtr\<String\>\&, const SharedPtr\<Globalization::CultureInfo\>\&, Globalization::TimeSpanStyles, TimeSpan\&) |  |
| static [TryParseExact](./tryparseexact/)(const String\&, const ArrayPtr\<String\>\&, const SharedPtr\<Globalization::DateTimeFormatInfo\>\&, Globalization::TimeSpanStyles, TimeSpan\&) |  |
| static [TryParseExact](./tryparseexact/)(const String\&, const ArrayPtr\<String\>\&, std::nullptr_t, Globalization::TimeSpanStyles, TimeSpan\&) |  |
| static [TryParseExact](./tryparseexact/)(const String\&, const String\&, const SharedPtr\<IFormatProvider\>\&, TimeSpan\&) | Converteert een string naar een equivalent [TimeSpan](./) object met behulp van het opgegeven formaat en de formatprovider, en retourneert het resultaat van de conversie. |
| static [TryParseExact](./tryparseexact/)(const String\&, const String\&, const SharedPtr\<Globalization::CultureInfo\>\&, TimeSpan\&) |  |
| static [TryParseExact](./tryparseexact/)(const String\&, const String\&, const SharedPtr\<Globalization::DateTimeFormatInfo\>\&, TimeSpan\&) |  |
| static [TryParseExact](./tryparseexact/)(const String\&, const String\&, std::nullptr_t, TimeSpan\&) |  |
| static [Type](./type/)() | Retourneert een [TypeInfo](../typeinfo/) object dat de [TimeSpan](./) structuur vertegenwoordigt. |
## Velden

| Veld | Beschrijving |
| --- | --- |
| static [MaxValue](./maxvalue/) | Het [TimeSpan](./) object dat het langste mogelijke interval vertegenwoordigt. |
| static [MinValue](./minvalue/) | /// Het [TimeSpan](./) object dat het kortste mogelijke interval vertegenwoordigt. |
| static constexpr [TicksPerDay](./ticksperday/) | Het aantal 100-nanosecondenintervallen in een dag (24-uur interval). |
| static constexpr [TicksPerHour](./ticksperhour/) | Het aantal 100-nanosecondenintervallen in een uur. |
| static constexpr [TicksPerMillisecond](./tickspermillisecond/) | Het aantal 100-nanosecondenintervallen in een milliseconde. |
| static constexpr [TicksPerMinute](./ticksperminute/) | Het aantal 100-nanosecondenintervallen in een minuut. |
| static constexpr [TicksPerSecond](./tickspersecond/) | Het aantal 100-nanosecondenintervallen in een seconde. |
| static [Zero](./zero/) | Het [TimeSpan](./) object dat een nulinterval vertegenwoordigt. |
## Opmerkingen



```cpp
#include "system/datetime.h"
#include "system/timespan.h"
#include <iostream>

int main()
{
  const auto date1 = System::DateTime(2021, 01, 01);
  const auto date2 = System::DateTime(2021, 10, 30);

  const auto interval = date2 - date1;

  std::cout << "Number of ticks: " << interval.get_Ticks() << std::endl;
  std::cout << "Number of milliseconds: " << interval.get_Milliseconds() << std::endl;
  std::cout << "Total number of milliseconds: " << interval.get_TotalMilliseconds() << std::endl;
  std::cout << "Number of minutes: " << interval.get_Minutes() << std::endl;
  std::cout << "Total number of minutes: " << interval.get_TotalMinutes() << std::endl;
  std::cout << "Number of hours: " << interval.get_Hours() << std::endl;
  std::cout << "Total number of hours: " << interval.get_Hours() << std::endl;
  std::cout << "Number of days: " << interval.get_Days() << std::endl;
  std::cout << "Total number of days: " << interval.get_TotalDays() << std::endl;

  return 0;
}
/*
This code example produces the following output:
Number of ticks: 260928000000000
Number of milliseconds: 0
Total number of milliseconds: 2.60928e+10
Number of minutes: 0
Total number of minutes: 434880
Number of hours: 0
Total number of hours: 0
Number of days: 302
Total number of days: 302
*/
```

## Zie ook

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
