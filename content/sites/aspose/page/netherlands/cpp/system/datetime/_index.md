---
title: "System::DateTime klasse"
linktitle: "DateTime"
second_title: "Aspose.Page voor C++"
description: "System::DateTime klasse. Vertegenwoordigt een specifieke datum‑ en tijdwaarde op de tijdcontinuüm. Dit type moet op de stack worden gealloceerd en aan functies worden doorgegeven per waarde of per referentie. Gebruik nooit de System::SmartPtr‑klasse om objecten van dit type te beheren in C++."
type: docs
weight: 1600
url: /nl/cpp/system/datetime/
---
## DateTime class


Vertegenwoordigt een specifieke datum‑ en tijdwaarde op de tijdcontinuüm. Dit type moet op de stack worden gealloceerd en aan functies worden doorgegeven per waarde of per referentie. Gebruik nooit de [System::SmartPtr](../smartptr/)‑klasse om objecten van dit type te beheren.

```cpp
class DateTime
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [Add](./add/)(TimeSpan) const | Retourneert een nieuw exemplaar van de [DateTime](./)‑klasse die een datum‑ en tijdwaarde vertegenwoordigt die ontstaat door de opgegeven tijdsduur op te tellen bij de datum‑ en tijdwaarde die door het huidige object wordt vertegenwoordigd. |
| [AddDays](./adddays/)(double) const | Retourneert een nieuw exemplaar van de [DateTime](./)‑klasse die de datum‑ en tijdwaarde weergeeft die de som is van de waarde die door het huidige object wordt vertegenwoordigd en het opgegeven aantal dagen. |
| [AddHours](./addhours/)(double) const | Retourneert een nieuw exemplaar van de [DateTime](./)‑klasse die de datum‑ en tijdwaarde weergeeft die de som is van de waarde die door het huidige object wordt vertegenwoordigd en het opgegeven aantal uren. |
| [AddMilliseconds](./addmilliseconds/)(double) const | Retourneert een nieuw exemplaar van de [DateTime](./)‑klasse die de datum‑ en tijdwaarde weergeeft die de som is van de waarde die door het huidige object wordt vertegenwoordigd en het opgegeven aantal milliseconden. |
| [AddMinutes](./addminutes/)(double) const | Retourneert een nieuw exemplaar van de [DateTime](./)‑klasse die de datum‑ en tijdwaarde weergeeft die de som is van de waarde die door het huidige object wordt vertegenwoordigd en het opgegeven aantal minuten. |
| [AddMonths](./addmonths/)(int) const | Retourneert een nieuw exemplaar van de [DateTime](./)‑klasse die de datum‑ en tijdwaarde weergeeft die de som is van de waarde die door het huidige object wordt vertegenwoordigd en het opgegeven aantal maanden. |
| [AddSeconds](./addseconds/)(double) const | Retourneert een nieuw exemplaar van de [DateTime](./) klasse die de datum‑tijdwaarde vertegenwoordigt die de som is van de waarde die door het huidige object wordt weergegeven en het opgegeven aantal seconden. |
| [AddTicks](./addticks/)(int64_t) const | Retourneert een nieuw exemplaar van de [DateTime](./) klasse die de datum‑tijdwaarde vertegenwoordigt die de som is van de waarde die door het huidige object wordt weergegeven en het opgegeven aantal 100‑nanosecondenintervallen. |
| [AddYears](./addyears/)(int) const | Retourneert een nieuw exemplaar van de [DateTime](./) klasse die de datum‑tijdwaarde vertegenwoordigt die gelijk is aan die van het huidige object, waarbij het jaarcomponent is verhoogd met het opgegeven aantal. |
| static [Compare](./compare/)(DateTime, DateTime) | Vergelijkt twee waarden die worden weergegeven door de opgegeven exemplaren van de [DateTime](./) klasse en retourneert de waarde die de relatieve positie van de waarden op de tijdlijn aangeeft. |
| [CompareTo](./compareto/)(DateTime) const | Vergelijkt twee datum‑tijdwaarden die worden weergegeven door het huidige object en het opgegeven exemplaar van de [DateTime](./) klasse en retourneert de waarde die de relatieve positie van de waarden op de tijdlijn aangeeft. |
| [DateTime](./datetime/)() | Construeert een exemplaar dat de kleinst mogelijke datum‑tijdwaarde vertegenwoordigt, gelijk aan MinValue. |
| [DateTime](./datetime/)(int, int, int) | Construeert een exemplaar dat een datum‑tijdwaarde vertegenwoordigt die is opgegeven als een specifiek jaar, maand en dag. |
| [DateTime](./datetime/)(int, int, int, const SharedPtr\<Globalization::Calendar\>\&) | Construeert een exemplaar dat een datum‑tijdwaarde vertegenwoordigt die is opgegeven als een specifiek jaar, maand en dag in de opgegeven kalender. |
| [DateTime](./datetime/)(int, int, int, int, int, int) | Construeert een exemplaar dat een datum‑tijdwaarde vertegenwoordigt die is opgegeven als een specifiek jaar, maand, dag, uur, minuut en seconde. |
| [DateTime](./datetime/)(int, int, int, int, int, int, DateTimeKind) | Construeert een exemplaar dat een datum‑tijdwaarde vertegenwoordigt die is opgegeven als een specifiek jaar, maand, dag, uur, minuut en seconde. |
| [DateTime](./datetime/)(int, int, int, int, int, int, const SharedPtr\<Globalization::Calendar\>\&) | Construeert een exemplaar dat een datum‑tijdwaarde vertegenwoordigt die is opgegeven als een specifiek jaar, maand, dag, uur, minuut en seconde in de opgegeven kalender. |
| [DateTime](./datetime/)(int, int, int, int, int, int, int, DateTimeKind) | Construeert een exemplaar dat een datum‑tijdwaarde vertegenwoordigt die is opgegeven als een specifiek jaar, maand, dag, uur, minuut, seconde en milliseconde. |
| [DateTime](./datetime/)(int, int, int, int, int, int, int, const SharedPtr\<Globalization::Calendar\>\&, DateTimeKind) | Construeert een exemplaar dat een datum‑tijdwaarde vertegenwoordigt die is opgegeven als een specifiek jaar, maand, dag, uur, minuut, seconde en milliseconde in de opgegeven kalender. |
| [DateTime](./datetime/)(int64_t, DateTimeKind) | Construeer een exemplaar dat een datum‑tijdwaarde vertegenwoordigt die is opgegeven als een aantal ticks. |
| [DateTime](./datetime/)(int64_t, DateTimeKind, bool) | Construeer een exemplaar dat een datum‑tijdwaarde vertegenwoordigt die is opgegeven als een aantal ticks. VOOR INTERN GEBRUIK. |
| [DateTime](./datetime/)(const DateTime\&) | Kopieert een exemplaar. |
| static [DaysInMonth](./daysinmonth/)(int, int) | Retourneert het aantal dagen in de opgegeven maand van het opgegeven jaar. |
| static [Equals](./equals/)(DateTime, DateTime) | Bepaalt of de opgegeven exemplaren van de [DateTime](./) klasse dezelfde datum‑tijdwaarde vertegenwoordigen. |
| [Equals](./equals/)(DateTime) const | Bepaalt of het opgegeven exemplaar van de [DateTime](./) klasse dezelfde datum‑tijdwaarde heeft als het huidige object. |
| static [FromBinary](./frombinary/)(int64_t) | Deserialiseert de datum‑tijdwaarde van de opgegeven unsigned 64‑bit integer en stelt het nieuwe exemplaar van de [DateTime](./) klasse in op die waarde. |
| static [FromFileTime](./fromfiletime/)(int64_t) | Converteert de opgegeven File‑tijd naar een exemplaar van de [DateTime](./) klasse dat dezelfde datum‑tijdwaarde vertegenwoordigt als lokale tijd. |
| static [FromFileTimeUtc](./fromfiletimeutc/)(int64_t) | Converteert de opgegeven File‑tijd naar een exemplaar van de [DateTime](./) klasse dat dezelfde datum‑tijdwaarde vertegenwoordigt als UTC‑tijd. |
| static [FromOADate](./fromoadate/)(double) | Retourneert een exemplaar van de [DateTime](./) klasse die de datum‑tijdwaarde vertegenwoordigt die gelijk is aan de opgegeven OLE Automation‑datum. |
| static [FromUnixTime](./fromunixtime/)(time_t) | Converteert de opgegeven Unix‑tijdwaarde naar een exemplaar van de [DateTime](./) klasse. VOOR INTERN GEBRUIK. |
| [get_Date](./get_date/)() const | Retourneert een nieuw exemplaar van de [DateTime](./) klasse dat het datumgedeelte van de datum‑tijd die door het huidige object wordt weergegeven vertegenwoordigt, waarbij elk onderdeel van het tijdgedeelte op 0 is gezet. |
| [get_Day](./get_day/)() const | Retourneert het rangnummer van de dag in de maand die door het huidige object wordt weergegeven. |
| [get_DayOfWeek](./get_dayofweek/)() const | Retourneert een waarde die een dag van de week vertegenwoordigt die wordt weergegeven door het huidige object. |
| [get_DayOfYear](./get_dayofyear/)() const | Retourneert het ordinale nummer van de dag in het jaar dat wordt weergegeven door het huidige object. |
| [get_Hour](./get_hour/)() const | Retourneert het uurcomponent van de datum- en tijdwaarde die wordt weergegeven door het huidige object. |
| [get_Kind](./get_kind/)() const | Retourneert de waarde die aangeeft of de datum en tijd die door het huidige object worden weergegeven een lokale of UTC-datum en -tijd is, of geen van beide. |
| [get_Millisecond](./get_millisecond/)() const | Retourneert het millisecondecomponent van de datum- en tijdwaarde die wordt weergegeven door het huidige object. |
| [get_Minute](./get_minute/)() const | Retourneert het minuutcomponent van de datum- en tijdwaarde die wordt weergegeven door het huidige object. |
| [get_Month](./get_month/)() const | Retourneert het ordinale nummer van de maand in het jaar dat wordt weergegeven door het huidige object. |
| static [get_Now](./get_now/)() | Retourneert een instantie van de [DateTime](./)-klasse die de huidige tijd als lokale tijd weergeeft. |
| [get_Second](./get_second/)() const | Retourneert het secondecomponent van de datum- en tijdwaarde die wordt weergegeven door het huidige object. |
| [get_Ticks](./get_ticks/)() const | Retourneert een aantal van 100-nanoseconde-intervallen dat is verstreken sinds 0:00:00 UTC, 1 januari 0001, in de gregoriaanse kalender tot de datum en tijd die door het huidige object worden weergegeven. |
| [get_TimeOfDay](./get_timeofday/)() const | Retourneert de waarde die het tijdsinterval weergeeft vanaf het begin van de dag die door het huidige object wordt weergegeven tot de datum- en tijdwaarde die door het huidige object wordt weergegeven. |
| static [get_Today](./get_today/)() | Retourneert een instantie van de [DateTime](./)-klasse die de huidige datum weergeeft waarbij elk tijdcomponent van de waarde die door het object wordt weergegeven op 0 is gezet. |
| static [get_UtcNow](./get_utcnow/)() | Retourneert een instantie van de [DateTime](./)-klasse die de huidige tijd als UTC weergeeft. |
| [get_Year](./get_year/)() const | Retourneert het jaar dat wordt weergegeven door het huidige object. |
| [GetDateComponents](./getdatecomponents/)(int\&, int\&, int\&) const | Haalt datumonderdelen op. VOOR INTERN GEBRUIK. |
| [GetDateTimeFormats](./getdatetimeformats/)() const | Retourneert een array van strings waarbij elk element de stringrepresentatie van het huidige object is, geformatteerd met een van de standaard datum- en tijdformaat‑specificaties. |
| [GetDateTimeFormats](./getdatetimeformats/)(char_t) const | Retourneert een array van strings waarbij elk element de stringrepresentatie van het huidige object is, geformatteerd met de opgegeven standaard datum- en tijdformaat‑specificatie. |
| [GetDateTimeFormats](./getdatetimeformats/)(const SharedPtr\<IFormatProvider\>\&) const | Retourneert een array van strings waarbij elk element de stringrepresentatie van het huidige object is, geformatteerd met een van de standaard datum- en tijdformaat‑specificaties en de opgegeven formatprovider. |
| [GetDateTimeFormats](./getdatetimeformats/)(char_t, const SharedPtr\<IFormatProvider\>\&) const | Retourneert een array van strings waarbij elk element de stringrepresentatie van het huidige object is, geformatteerd met de opgegeven standaard datum- en tijdformaat‑specificatie en formatprovider. |
| [GetHashCode](./gethashcode/)() const | Retourneert een hashcode voor het huidige object. |
| [IsDaylightSavingTime](./isdaylightsavingtime/)() const | Bepaalt of de datum- en tijdwaarde die door het huidige object wordt weergegeven binnen het bereik van zomertijd valt voor de huidige tijdzone. |
| static [IsLeapYear](./isleapyear/)(int) | Bepaalt of het opgegeven jaar een schrikkeljaar is. |
| [IsNull](./isnull/)() const |  |
| [operator!=](./operator!=/)(DateTime) const | Bepaalt of het huidige object en het opgegeven [DateTime](./)-object verschillende datum- en tijdwaarden vertegenwoordigen. |
| [operator!=](./operator!=/)(std::nullptr_t) const |  |
| [operator+](./operator+/)(TimeSpan) const | Retourneert een nieuwe instantie van de [DateTime](./)-klasse die de datum- en tijdwaarde weergeeft die de som is van de waarde die door het huidige object wordt weergegeven en de opgegeven tijdsduur. |
| [operator+=](./operator+=/)(TimeSpan) | Stelt het huidige object in op de datum- en tijdwaarde die de som is van de waarde die door het huidige object wordt weergegeven en de opgegeven tijdsduur. |
| [operator-](./operator-/)(TimeSpan) const | Retourneert een nieuwe instantie van de [DateTime](./)-klasse die de datum- en tijdwaarde weergeeft die het resultaat is van het aftrekken van de opgegeven tijdsduur van de waarde die door het huidige object wordt weergegeven. |
| [operator-](./operator-/)(DateTime) const | Retourneert een exemplaar van de [TimeSpan](../timespan/) klasse die het tijdsinterval vertegenwoordigt tussen de datum- en tijdwaarden die worden vertegenwoordigd door het huidige en het opgegeven object. |
| [operator-=](./operator-=/)(TimeSpan) | Stelt het huidige object in op de datum- en tijdwaarde die het resultaat is van het aftrekken van de opgegeven tijdsduur van de datum- en tijdwaarde die door het huidige object wordt weergegeven. |
| [operator<](./operator_/)(DateTime) const | Bepaalt of het huidige object de datum- en tijdwaarde vertegenwoordigt die eerder is dan de waarde die door het opgegeven [DateTime](./) object wordt weergegeven. |
| [operator<](./operator_/)(std::nullptr_t) const |  |
| [operator<=](./operator_=/)(DateTime) const | Bepaalt of het huidige object de datum- en tijdwaarde vertegenwoordigt die eerder is dan of gelijk is aan de waarde die door het opgegeven [DateTime](./) object wordt weergegeven. |
| [operator<=](./operator_=/)(std::nullptr_t) const |  |
| [operator=](./operator=/)(const DateTime\&) | Wijs de waarde toe die door de opgegeven [DateTime](./) instantie wordt weergegeven aan het huidige object. |
| [operator==](./operator==/)(DateTime) const | Bepaalt of het huidige object en het opgegeven [DateTime](./) object dezelfde datum- en tijdwaarde vertegenwoordigen. |
| [operator==](./operator==/)(std::nullptr_t) const |  |
| [operator>](./operator_/)(DateTime) const | Bepaalt of het huidige object de datum- en tijdwaarde vertegenwoordigt die later is dan de waarde die door het opgegeven [DateTime](./) object wordt weergegeven. |
| [operator>](./operator_/)(std::nullptr_t) const |  |
| [operator>=](./operator_=/)(DateTime) const | Bepaalt of het huidige object de datum- en tijdwaarde vertegenwoordigt die later is dan of gelijk is aan de waarde die door het opgegeven [DateTime](./) object wordt weergegeven. |
| [operator>=](./operator_=/)(std::nullptr_t) const |  |
| static [Parse](./parse/)(const String\&) | Converteert de opgegeven tekenreeksrepresentatie van een datum- en tijdwaarde naar het equivalente [DateTime](./) object. |
| static [Parse](./parse/)(const String\&, const SharedPtr\<IFormatProvider\>\&, Globalization::DateTimeStyles) | Converteert de opgegeven tekenreeksrepresentatie van een datum- en tijdwaarde naar het equivalente [DateTime](./) object met behulp van cultuurspecifieke opmaakinformatie. |
| static [Parse](./parse/)(const String\&, const SharedPtr\<Globalization::CultureInfo\>\&, Globalization::DateTimeStyles) |  |
| static [Parse](./parse/)(const String\&, const SharedPtr\<Globalization::DateTimeFormatInfo\>\&, Globalization::DateTimeStyles) |  |
| static [Parse](./parse/)(const String\&, std::nullptr_t, Globalization::DateTimeStyles) |  |
| static [ParseExact](./parseexact/)(const String\&, const String\&, const SharedPtr\<IFormatProvider\>\&, Globalization::DateTimeStyles) | Converteert de opgegeven tekenreeksrepresentatie van een datum- en tijdwaarde naar het equivalente [DateTime](./) object met behulp van het opgegeven formaat en cultuurspecifieke opmaakinformatie. Het formaat van de tekenreeksrepresentatie moet exact overeenkomen met het opgegeven formaat. Werpt een uitzondering als de conversie mislukt. |
| static [ParseExact](./parseexact/)(const String\&, const String\&, const SharedPtr\<Globalization::CultureInfo\>\&, Globalization::DateTimeStyles) |  |
| static [ParseExact](./parseexact/)(const String\&, const String\&, const SharedPtr\<Globalization::DateTimeFormatInfo\>\&, Globalization::DateTimeStyles) |  |
| static [ParseExact](./parseexact/)(const String\&, const String\&, std::nullptr_t, Globalization::DateTimeStyles) |  |
| static [ParseExact](./parseexact/)(const String\&, const ArrayPtr\<String\>\&, const SharedPtr\<IFormatProvider\>\&, Globalization::DateTimeStyles) | Converteert de opgegeven tekenreeksrepresentatie van een datum- en tijdwaarde naar het equivalente [DateTime](./) object met behulp van de opgegeven formaten, cultuurspecifieke opmaakinformatie en stijl. Het formaat van de tekenreeksrepresentatie moet exact overeenkomen met een of meer van de opgegeven formaten. Werpt een uitzondering als de conversie mislukt. |
| static [ParseExact](./parseexact/)(const String\&, const ArrayPtr\<String\>\&, const SharedPtr\<Globalization::CultureInfo\>\&, Globalization::DateTimeStyles) |  |
| static [ParseExact](./parseexact/)(const String\&, const ArrayPtr\<String\>\&, const SharedPtr\<Globalization::DateTimeFormatInfo\>\&, Globalization::DateTimeStyles) |  |
| static [ParseExact](./parseexact/)(const String\&, const ArrayPtr\<String\>\&, std::nullptr_t, Globalization::DateTimeStyles) |  |
| static [SpecifyKind](./specifykind/)(DateTime, DateTimeKind) | Construeert een nieuw [DateTime](./) object dat hetzelfde aantal ticks vertegenwoordigt als het opgegeven [DateTime](./) object en lokale tijd, UTC-tijd of geen van beide weergeeft zoals gespecificeerd door het argument **kind**. |
| [Subtract](./subtract/)(TimeSpan) const | Retourneert een nieuwe instantie van de [DateTime](./)-klasse die de datum- en tijdwaarde weergeeft die het resultaat is van het aftrekken van de opgegeven tijdsduur van de waarde die door het huidige object wordt weergegeven. |
| [Subtract](./subtract/)(DateTime) const | Retourneert een instantie van de [TimeSpan](../timespan/) klasse die het tijdsinterval vertegenwoordigt tussen de datum- en tijdwaarden die door het huidige en het opgegeven object worden weergegeven. |
| [ToBinary](./tobinary/)() const | Serialiseert het huidige object. |
| [ToFileTime](./tofiletime/)() const | Retourneert een waarde die de datum- en tijdwaarde die door het huidige object wordt weergegeven als bestandstijd vertegenwoordigt. |
| [ToFileTimeUtc](./tofiletimeutc/)() const | Converteert de datum- en tijdwaarde die door het huidige object wordt weergegeven naar UTC-bestandstijd. |
| [ToLocalTime](./tolocaltime/)() const | Retourneert een nieuwe instantie van de [DateTime](./) klasse die de datum- en tijdwaarde die door het huidige object wordt weergegeven als lokale tijd vertegenwoordigt. |
| [ToLongDateString](./tolongdatestring/)() const | Retourneert een tekenreeks die de lange datumtekenreeksrepresentatie van het huidige object bevat. |
| [ToLongTimeString](./tolongtimestring/)() const | Retourneert een tekenreeks die de lange tijdtekenreeksrepresentatie van het huidige object bevat. |
| [ToOADate](./tooadate/)() const | Retourneert de datum- en tijdwaarde die door het huidige object wordt weergegeven als OLE Automation Date. |
| [ToShortDateString](./toshortdatestring/)() const | Retourneert een tekenreeks die de korte datumtekenreeksrepresentatie van het huidige object bevat. |
| [ToShortTimeString](./toshorttimestring/)() const | Retourneert een tekenreeks die de korte tijdtekenreeksrepresentatie van het huidige object bevat. |
| [ToString](./tostring/)() const | Retourneert de tekenreeksrepresentatie van de datum- en tijdwaarde die door het huidige object wordt weergegeven met behulp van de opmaakconventies die door de huidige cultuur zijn gedefinieerd. |
| [ToString](./tostring/)(const String\&) const | Retourneert een tekenreeksrepresentatie van de datum- en tijdwaarde die door het huidige object wordt weergegeven met behulp van het opgegeven formaat en de opmaakconventies die door de huidige cultuur zijn gedefinieerd. |
| [ToString](./tostring/)(const SharedPtr\<IFormatProvider\>\&) const | Retourneert een tekenreeksrepresentatie van de datum- en tijdwaarde die door het huidige object wordt weergegeven met behulp van de opgegeven opmaakinformatie. |
| [ToString](./tostring/)(const SharedPtr\<Globalization::CultureInfo\>\&) const |  |
| [ToString](./tostring/)(const SharedPtr\<Globalization::DateTimeFormatInfo\>\&) const |  |
| [ToString](./tostring/)(std::nullptr_t) const |  |
| [ToString](./tostring/)(const String\&, const SharedPtr\<IFormatProvider\>\&) const | Retourneert een tekenreeksrepresentatie van de datum- en tijdwaarde die door het huidige object wordt weergegeven met behulp van de opgegeven opmaakinformatie. |
| [ToString](./tostring/)(const String\&, const SharedPtr\<Globalization::CultureInfo\>\&) const |  |
| [ToString](./tostring/)(const String\&, const SharedPtr\<Globalization::DateTimeFormatInfo\>\&) const |  |
| [ToString](./tostring/)(const String\&, std::nullptr_t) const |  |
| [ToUniversalTime](./touniversaltime/)() const | Retourneert een nieuw exemplaar van de [DateTime](./) klasse die de datum‑ en tijdwaarde vertegenwoordigt die door het huidige object wordt weergegeven als UTC. |
| [ToUnixTime](./tounixtime/)() const | Retourneert een waarde die de datum‑ en tijdwaarde vertegenwoordigt die door het huidige object wordt weergegeven als Unix-tijd. VOOR INTERN GEBRUIK. |
| static [TryParse](./tryparse/)(const String\&, DateTime\&) | Converteert de opgegeven tekenreeksrepresentatie van een datum- en tijdwaarde naar het equivalente [DateTime](./) object. |
| static [TryParse](./tryparse/)(const String\&, const SharedPtr\<IFormatProvider\>\&, Globalization::DateTimeStyles, DateTime\&) | Converteert de opgegeven tekenreeksrepresentatie van een datum‑ en tijdwaarde naar het equivalente [DateTime](./) object met behulp van de opgegeven cultuurspecifieke opmaakinformatie en stijl. |
| static [TryParse](./tryparse/)(const String\&, const SharedPtr\<Globalization::CultureInfo\>\&, Globalization::DateTimeStyles, DateTime\&) |  |
| static [TryParse](./tryparse/)(const String\&, const SharedPtr\<Globalization::DateTimeFormatInfo\>\&, Globalization::DateTimeStyles, DateTime\&) |  |
| static [TryParse](./tryparse/)(const String\&, std::nullptr_t, Globalization::DateTimeStyles, DateTime\&) |  |
| static [TryParseExact](./tryparseexact/)(const String\&, const String\&, const SharedPtr\<IFormatProvider\>\&, Globalization::DateTimeStyles, DateTime\&) | Converteert de opgegeven tekenreeksrepresentatie van een datum‑ en tijdwaarde naar het equivalente [DateTime](./) object met behulp van het opgegeven formaat, cultuurspecifieke opmaakinformatie en stijl. Het formaat van de tekenreeksrepresentatie moet exact overeenkomen met het opgegeven formaat. |
| static [TryParseExact](./tryparseexact/)(const String\&, const String\&, const SharedPtr\<Globalization::CultureInfo\>\&, Globalization::DateTimeStyles, DateTime\&) |  |
| static [TryParseExact](./tryparseexact/)(const String\&, const String\&, const SharedPtr\<Globalization::DateTimeFormatInfo\>\&, Globalization::DateTimeStyles, DateTime\&) |  |
| static [TryParseExact](./tryparseexact/)(const String\&, const String\&, std::nullptr_t, Globalization::DateTimeStyles, DateTime\&) |  |
| static [TryParseExact](./tryparseexact/)(const String\&, const ArrayPtr\<String\>\&, const SharedPtr\<IFormatProvider\>\&, Globalization::DateTimeStyles, DateTime\&) | Converteert de opgegeven tekenreeksrepresentatie van een datum‑ en tijdwaarde naar het equivalente [DateTime](./) object met behulp van de opgegeven formaten, cultuurspecifieke opmaakinformatie en stijl. Het formaat van de tekenreeksrepresentatie moet exact overeenkomen met een of meer van de opgegeven formaten. |
| static [TryParseExact](./tryparseexact/)(const String\&, const ArrayPtr\<String\>\&, const SharedPtr\<Globalization::CultureInfo\>\&, Globalization::DateTimeStyles, DateTime\&) |  |
| static [TryParseExact](./tryparseexact/)(const String\&, const ArrayPtr\<String\>\&, const SharedPtr\<Globalization::DateTimeFormatInfo\>\&, Globalization::DateTimeStyles, DateTime\&) |  |
| static [TryParseExact](./tryparseexact/)(const String\&, const ArrayPtr\<String\>\&, std::nullptr_t, Globalization::DateTimeStyles, DateTime\&) |  |
| static [Type](./type/)() | Retourneert een [TypeInfo](../typeinfo/) object dat informatie over deze klasse bevat. |
## Velden

| Veld | Beschrijving |
| --- | --- |
| static constexpr [MaxTicks](./maxticks/) | Het aantal van 100-nanoseconden in het tijdsinterval tussen de minimaal mogelijke en maximaal mogelijke [DateTime](./) waarde. |
| static [MaxValue](./maxvalue/) | Een exemplaar van de [DateTime](./) klasse die de maximaal mogelijke datum‑ en tijdwaarde vertegenwoordigt. |
| static constexpr [MinTicks](./minticks/) | Het minimale aantal ticks dat een exemplaar van de [DateTime](./) klasse kan vertegenwoordigen. |
| static [MinValue](./minvalue/) | Een exemplaar van de [DateTime](./) klasse die de minimaal mogelijke datum‑ en tijdwaarde vertegenwoordigt. |
| static constexpr [TicksPerDay](./ticksperday/) | Het aantal ticks in een dag. |
| static constexpr [TicksPerHour](./ticksperhour/) | Het aantal ticks in een uur. |
| static constexpr [TicksPerMicrosecond](./tickspermicrosecond/) | Het aantal ticks in een microseconde. |
| static constexpr [TicksPerMillisecond](./tickspermillisecond/) | Het aantal ticks in een milliseconde. |
| static constexpr [TicksPerMinute](./ticksperminute/) | Het aantal ticks in een minuut. |
| static constexpr [TicksPerSecond](./tickspersecond/) | Het aantal ticks in een seconde. |
| static [UnixEpoch](./unixepoch/) | Een exemplaar van de [DateTime](./) klasse die het begin van de Unix‑epoch (1970‑01‑01 00:00:00) vertegenwoordigt. |
## Opmerkingen



```cpp
#include "system/console.h"
#include "system/date_time.h"

int main()
{
  using namespace System;

  // Maak een exemplaar van de 'DateTime' klasse.
  DateTime dateTime{1990, 10, 30};

  // Print het exemplaar in meerdere formaten.
  Console::WriteLine(dateTime.ToShortDateString());
  Console::WriteLine(dateTime.ToShortTimeString());
  Console::WriteLine(dateTime.ToString());

  return 0;
}
/*
This code example produces the following output:
30.10.1990
0:00
30.10.1990 0:00:00
*/
```

## Zie ook

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
