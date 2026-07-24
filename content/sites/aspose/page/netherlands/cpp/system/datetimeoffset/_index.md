---
title: "System::DateTimeOffset klasse"
linktitle: "DateTimeOffset"
second_title: "Aspose.Page voor C++"
description: "System::DateTimeOffset class. Bevat de datum en tijd van de dag ten opzichte van Coordinated Universal Time. Objecten van deze klasse mogen alleen worden gealloceerd met de functie System::MakeObject() function. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit runtime‑fouten en/of assertiefouten oplevert. Wikkel deze klasse altijd in een System::SmartPtr pointer en gebruik deze pointer om deze door te geven aan functies als argument in C++."
type: docs
weight: 1700
url: /nl/cpp/system/datetimeoffset/
---
## DateTimeOffset class


Bevat de datum en tijd van de dag ten opzichte van Coordinated Universal Time. Objecten van deze klasse mogen alleen worden gealloceerd met de functie [System::MakeObject()](../makeobject/). Maak nooit een instantie van dit type op de stack of met operator new, omdat dit runtime‑fouten en/of assertiefouten oplevert. Wikkel deze klasse altijd in een [System::SmartPtr](../smartptr/) pointer en gebruik deze pointer om deze door te geven aan functies als argument.

```cpp
class DateTimeOffset
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [Add](./add/)(TimeSpan) const | Voegt een opgegeven tijdsinterval toe aan het [DateTimeOffset](./) object. |
| [AddDays](./adddays/)(double) const | Voegt een opgegeven aantal dagen toe aan het [DateTimeOffset](./) object. |
| [AddHours](./addhours/)(double) const | Voegt een opgegeven aantal uren toe aan het [DateTimeOffset](./) object. |
| [AddMilliseconds](./addmilliseconds/)(double) const | Voegt een opgegeven aantal milliseconden toe aan het [DateTimeOffset](./) object. |
| [AddMinutes](./addminutes/)(double) const | Voegt een opgegeven aantal minuten toe aan het [DateTimeOffset](./) object. |
| [AddMonths](./addmonths/)(int) const | Voegt een opgegeven aantal maanden toe aan het [DateTimeOffset](./) object. |
| [AddSeconds](./addseconds/)(double) const | Voegt een opgegeven aantal seconden toe aan het [DateTimeOffset](./) object. |
| [AddTicks](./addticks/)(int64_t) const | Voegt een opgegeven aantal ticks toe aan het [DateTimeOffset](./) object. |
| [AddYears](./addyears/)(int) const | Voegt een opgegeven aantal jaren toe aan het [DateTimeOffset](./) object. |
| static [Compare](./compare/)(const DateTimeOffset\&, const DateTimeOffset\&) | Vergelijkt twee [DateTimeOffset](./) objecten. |
| [CompareTo](./compareto/)(const DateTimeOffset\&) const | Vergelijkt twee [DateTimeOffset](./) objecten. |
| [CompareTo](./compareto/)(const SharedPtr\<Object\>\&) const | Vergelijkt twee [DateTimeOffset](./) objecten. |
| [DateTimeOffset](./datetimeoffset/)() | Standaardconstructor. |
| [DateTimeOffset](./datetimeoffset/)(DateTime) | Constructor. |
| [DateTimeOffset](./datetimeoffset/)(int64_t, TimeSpan) | Constructor. |
| [DateTimeOffset](./datetimeoffset/)(DateTime, TimeSpan) | Constructor. |
| [DateTimeOffset](./datetimeoffset/)(int, int, int, int, int, int, TimeSpan) | Constructor. |
| [DateTimeOffset](./datetimeoffset/)(int, int, int, int, int, int, int, TimeSpan) | Constructor. |
| [DateTimeOffset](./datetimeoffset/)(int, int, int, int, int, int, int, const SharedPtr\<Globalization::Calendar\>\&, TimeSpan) | Constructor. |
| static [Equals](./equals/)(const DateTimeOffset\&, const DateTimeOffset\&) | Controleert of twee [DateTimeOffset](./) objecten hetzelfde tijdstip vertegenwoordigen. |
| [Equals](./equals/)(const DateTimeOffset\&) const | Controleert of twee [DateTimeOffset](./) objecten hetzelfde tijdstip vertegenwoordigen. |
| [Equals](./equals/)(const SharedPtr\<Object\>\&) const | Controleert of twee [DateTimeOffset](./) objecten hetzelfde tijdstip vertegenwoordigen. |
| [EqualsExact](./equalsexact/)(const DateTimeOffset\&) const | Controleert of twee [DateTimeOffset](./) objecten hetzelfde tijdstip vertegenwoordigen en dezelfde offset hebben. |
| [EqualsExact](./equalsexact/)(const SharedPtr\<Object\>\&) const | Controleert of twee [DateTimeOffset](./) objecten hetzelfde tijdstip vertegenwoordigen en dezelfde offset hebben. |
| static [FromFileTime](./fromfiletime/)(int64_t) | [Convert](../convert/)[Windows](../../system.windows/) bestandstijd naar datum en tijd met lokale tijdsoffset. |
| static [FromUnixTimeMilliseconds](./fromunixtimemilliseconds/)(int64_t) | [Convert](../convert/) Unix-tijd naar [DateTimeOffset](./) object. |
| static [FromUnixTimeSeconds](./fromunixtimeseconds/)(int64_t) | [Convert](../convert/) Unix-tijd naar [DateTimeOffset](./) object. |
| [get_Date](./get_date/)() const | Haalt de datumcomponent op van het huidige object. |
| [get_DateTime](./get_datetime/)() const | Haalt de [DateTime](../datetime/) waarde op. |
| [get_Day](./get_day/)() const | Haalt de dag van de maand op van het huidige object. |
| [get_DayOfWeek](./get_dayofweek/)() const | Haalt de dag van de week op van het huidige object. |
| [get_DayOfYear](./get_dayofyear/)() const | Haalt de dag van het jaar op van het huidige object. |
| [get_Hour](./get_hour/)() const | Haalt het uurcomponent op van het huidige object. |
| [get_LocalDateTime](./get_localdatetime/)() const | Haalt de [DateTime](../datetime/) waarde op die de lokale datum en tijd vertegenwoordigt. |
| [get_Millisecond](./get_millisecond/)() const | Haalt het millisecondecomponent op van het huidige object. |
| [get_Minute](./get_minute/)() const | Haalt het minuutcomponent op van het huidige object. |
| [get_Month](./get_month/)() const | Haalt het maandcomponent op van het huidige object. |
| static [get_Now](./get_now/)() | Haalt de [DateTimeOffset](./) op waarvan datum en tijd zijn ingesteld op de huidige lokale tijd en waarvan de offset is ingesteld op de offset van de lokale tijd. |
| [get_Offset](./get_offset/)() const | Haalt offset op van UTC. |
| [get_Second](./get_second/)() const | Haalt de secondecomponent op van het huidige object. |
| [get_Ticks](./get_ticks/)() const | Haalt het aantal ticks op van het huidige object. |
| [get_TimeOfDay](./get_timeofday/)() const | Haalt de tijd van de dag op van het huidige object. |
| [get_UtcDateTime](./get_utcdatetime/)() const | Haalt de [DateTime](../datetime/) waarde op die de UTC-datum en -tijd vertegenwoordigt. |
| static [get_UtcNow](./get_utcnow/)() | Haalt de [DateTimeOffset](./) op waarvan de datum en tijd zijn ingesteld op de huidige UTC-tijd en waarvan de offset [TimeSpan::Zero](../timespan/zero/) is. |
| [get_UtcTicks](./get_utcticks/)() const | Haalt het aantal ticks op van het huidige object in UTC-tijd. |
| [get_Year](./get_year/)() const | Haalt het jaarcomponent op van het huidige object. |
| [GetHashCode](./gethashcode/)() const | Haalt de hashcode op voor het huidige [DateTimeOffset](./) object. |
| [IsNull](./isnull/)() const |  |
| [operator!=](./operator!=/)(const DateTimeOffset\&) const | Bepaalt of het huidige object en het opgegeven [DateTimeOffset](./) object verschillende datum- en tijdwaarden vertegenwoordigen. |
| [operator!=](./operator!=/)(std::nullptr_t) const |  |
| [operator+](./operator+/)(TimeSpan) const | Retourneert een nieuw exemplaar van de [DateTimeOffset](./) klasse die de datum- en tijdwaarde vertegenwoordigt die de som is van de waarde die wordt vertegenwoordigd door het huidige object en de opgegeven tijdsduur. |
| [operator-](./operator-/)(TimeSpan) const | Retourneert een nieuw exemplaar van de [DateTimeOffset](./) klasse die de datum- en tijdwaarde vertegenwoordigt die het resultaat is van het aftrekken van de opgegeven tijdsduur van de waarde die wordt vertegenwoordigd door het huidige object. |
| [operator-](./operator-/)(const DateTimeOffset\&) const | Retourneert een exemplaar van de [TimeSpan](../timespan/) klasse die het tijdsinterval vertegenwoordigt tussen de datum- en tijdwaarden die worden vertegenwoordigd door het huidige en het opgegeven object. |
| [operator<](./operator_/)(const DateTimeOffset\&) const | Bepaalt of het huidige object de datum- en tijdwaarde vertegenwoordigt die eerder is dan de waarde die wordt vertegenwoordigd door het opgegeven [DateTimeOffset](./) object. |
| [operator<](./operator_/)(std::nullptr_t) const |  |
| [operator<=](./operator_=/)(const DateTimeOffset\&) const | Bepaalt of het huidige object de datum- en tijdwaarde vertegenwoordigt die eerder is dan of gelijk is aan de waarde die wordt vertegenwoordigd door het opgegeven [DateTimeOffset](./) object. |
| [operator<=](./operator_=/)(std::nullptr_t) const |  |
| [operator==](./operator==/)(const DateTimeOffset\&) const | Bepaalt of het huidige object en het opgegeven [DateTimeOffset](./) object dezelfde datum- en tijdwaarde vertegenwoordigen. |
| [operator==](./operator==/)(std::nullptr_t) const |  |
| [operator>](./operator_/)(const DateTimeOffset\&) const | Bepaalt of het huidige object de datum- en tijdwaarde vertegenwoordigt die later is dan de waarde die wordt vertegenwoordigd door het opgegeven [DateTimeOffset](./) object. |
| [operator>](./operator_/)(std::nullptr_t) const |  |
| [operator>=](./operator_=/)(const DateTimeOffset\&) const | Bepaalt of het huidige object de datum- en tijdwaarde vertegenwoordigt die later is dan of gelijk is aan de waarde die wordt vertegenwoordigd door het opgegeven [DateTimeOffset](./) object. |
| [operator>=](./operator_=/)(std::nullptr_t) const |  |
| static [Parse](./parse/)(const String\&) | Converteert de opgegeven string naar een equivalent van [DateTimeOffset](./). |
| static [Parse](./parse/)(const String\&, const SharedPtr\<IFormatProvider\>\&, Globalization::DateTimeStyles) | Converteert de opgegeven string naar een [DateTimeOffset](./) object met behulp van de opgegeven opmaakprovider en opmaakstijl. |
| static [ParseExact](./parseexact/)(const String\&, const String\&, const SharedPtr\<IFormatProvider\>\&, Globalization::DateTimeStyles) | Converteert de opgegeven string naar een [DateTimeOffset](./) object met behulp van het opgegeven formaat, de opmaakprovider en de opmaakstijl. |
| static [ParseExact](./parseexact/)(const String\&, const ArrayPtr\<String\>\&, const SharedPtr\<IFormatProvider\>\&, Globalization::DateTimeStyles) | Converteert de opgegeven string naar een [DateTimeOffset](./) object met behulp van de opgegeven formaten, de opmaakprovider en de opmaakstijl. |
| [Subtract](./subtract/)(TimeSpan) const | Trek een opgegeven tijdsinterval af van het huidige object. |
| [Subtract](./subtract/)(const DateTimeOffset\&) const | Trek een opgegeven [DateTimeOffset](./) waarde af van het huidige object. |
| [ToFileTime](./tofiletime/)() const | Converteert het huidige object naar de [Windows](../../system.windows/) bestandstijd. |
| [ToLocalTime](./tolocaltime/)() const | Converteert het huidige object naar een object dat de lokale tijd vertegenwoordigt,. |
| [ToOffset](./tooffset/)(TimeSpan) const | Vervangt de offset van het huidige object door de opgegeven offset. |
| [ToString](./tostring/)(const String\&, const SharedPtr\<IFormatProvider\>\&) const | Converteert het huidige object naar een string met behulp van het opgegeven formaat en formatprovider. |
| [ToString](./tostring/)(const SharedPtr\<IFormatProvider\>\&) const | Converteert het huidige object naar een string met behulp van de opgegeven formatprovider. |
| [ToString](./tostring/)(const String\&) const | Converteert het huidige object naar een string met behulp van het opgegeven formaat. |
| [ToString](./tostring/)() const | Converteert het huidige object naar een string. |
| [ToUniversalTime](./touniversaltime/)() const | Converteert het huidige object naar een object dat de UTC-tijd vertegenwoordigt,. |
| [ToUnixTimeMilliseconds](./tounixtimemilliseconds/)() const | Haalt het aantal milliseconden op dat is verstreken sinds het begin van de Unix-epoch. |
| [ToUnixTimeSeconds](./tounixtimeseconds/)() const | Haalt het aantal seconden op dat is verstreken sinds het begin van de Unix-epoch. |
| static [TryParse](./tryparse/)(const String\&, DateTimeOffset\&) | Probeert de opgegeven string te converteren naar een [DateTimeOffset](./) object. |
| static [TryParse](./tryparse/)(const String\&, const SharedPtr\<IFormatProvider\>\&, Globalization::DateTimeStyles, DateTimeOffset\&) | Probeert de opgegeven string te converteren naar een [DateTimeOffset](./) object met behulp van de opgegeven formatprovider en opmaakstijl. |
| static [TryParseExact](./tryparseexact/)(const String\&, const ArrayPtr\<String\>\&, const SharedPtr\<IFormatProvider\>\&, Globalization::DateTimeStyles, DateTimeOffset\&) | Probeert de opgegeven string te converteren naar een [DateTimeOffset](./) object met behulp van de opgegeven formaten, formatprovider en opmaakstijl. |
| static [TryParseExact](./tryparseexact/)(const String\&, const String\&, const SharedPtr\<IFormatProvider\>\&, Globalization::DateTimeStyles, DateTimeOffset\&) | Probeert de opgegeven string te converteren naar een [DateTimeOffset](./) object met behulp van het opgegeven formaat, formatprovider en opmaakstijl. |
| static [Type](./type/)() | Retourneert een [TypeInfo](../typeinfo/) object dat de [TimeSpan](../timespan/) structuur vertegenwoordigt. |
## Velden

| Veld | Beschrijving |
| --- | --- |
| static constexpr [MaxOffset](./maxoffset/) | Haalt de maximale offset op in ticks. |
| static [MaxValue](./maxvalue/) | Haalt de grootste [DateTimeOffset](./) waarde op. |
| static constexpr [MinOffset](./minoffset/) | Haalt de minimale offset op in ticks. |
| static [MinValue](./minvalue/) | Haalt de vroegste [DateTimeOffset](./) waarde op. |
| static [UnixEpoch](./unixepoch/) | Haalt het begin van de Unix-epoch op. |
## Zie ook

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
