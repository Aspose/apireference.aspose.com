---
title: "System::Decimal klasse"
linktitle: "Decimaal"
second_title: "Aspose.Page voor C++"
description: "System::Decimal klasse. Vertegenwoordigt een decimaal getal. Dit type moet op de stack worden gealloceerd en doorgegeven aan functies per waarde of per referentie. Gebruik nooit de System::SmartPtr klasse om objecten van dit type te beheren in C++."
type: docs
weight: 1900
url: /nl/cpp/system/decimal/
---
## Decimal class


Vertegenwoordigt een decimaal getal. Dit type moet op de stack worden gealloceerd en doorgegeven aan functies per waarde of per referentie. Gebruik nooit de [System::SmartPtr](../smartptr/) klasse om objecten van dit type te beheren.

```cpp
class Decimal
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| static [Add](./add/)(const Decimal\&, const Decimal\&) | Voegt twee opgegeven [Decimal](./) waarden toe. |
| static [Ceiling](./ceiling/)(const Decimal\&) | Retourneert de kleinste gehele waarde die groter dan of gelijk is aan de opgegeven waarde. |
| static [Compare](./compare/)(const Decimal\&, const Decimal\&) | Bepaalt of de waarde die wordt weergegeven door het eerste [Decimal](./) object kleiner is dan, gelijk is aan of groter is dan de waarde die wordt weergegeven door het tweede [Decimal](./) object. |
| [CompareTo](./compareto/)(const Decimal\&) const | Bepaalt of de waarde die wordt weergegeven door het huidige object kleiner is dan, gelijk is aan of groter is dan de waarde die wordt weergegeven door het opgegeven object. |
| [Decimal](./decimal/)() | Construeert een instantie die 0 vertegenwoordigt. |
| [Decimal](./decimal/)(std::int8_t) | Construeert een instantie die de opgegeven waarde vertegenwoordigt. |
| [Decimal](./decimal/)(std::int16_t) | Construeert een instantie die de opgegeven waarde vertegenwoordigt. |
| [Decimal](./decimal/)(std::int32_t) | Construeert een instantie die de opgegeven waarde vertegenwoordigt. |
| [Decimal](./decimal/)(std::int64_t) | Construeert een instantie die de opgegeven waarde vertegenwoordigt. |
| [Decimal](./decimal/)(std::uint8_t) | Construeert een instantie die de opgegeven waarde vertegenwoordigt. |
| [Decimal](./decimal/)(std::uint16_t) | Construeert een instantie die de opgegeven waarde vertegenwoordigt. |
| [Decimal](./decimal/)(std::uint32_t) | Construeert een instantie die de opgegeven waarde vertegenwoordigt. |
| [Decimal](./decimal/)(std::uint64_t) | Construeert een instantie die de opgegeven waarde vertegenwoordigt. |
| [Decimal](./decimal/)(float) | Construeert een instantie die de opgegeven waarde vertegenwoordigt. |
| [Decimal](./decimal/)(double) | Construeert een instantie die de opgegeven waarde vertegenwoordigt. |
| explicit [Decimal](./decimal/)(const std::string\&) | Construeert een instantie die een waarde vertegenwoordigt waarvan de tekenreeksrepresentatie is opgegeven als een instantie van de std::string‑klasse. |
| [Decimal](./decimal/)(int32_t, int32_t, int32_t, bool, uint8_t) | Construeert een [Decimal](./) object uit de opgegeven componenten. |
| [Decimal](./decimal/)(const Decimal\&) | Construeert een instantie van de [Decimal](./) klasse die hetzelfde getal vertegenwoordigt als het opgegeven [Decimal](./) object. |
| [Decimal](./decimal/)(const ArrayPtr\<int32_t\>\&) | Construeert een instantie van de [Decimal](./) klasse uit een gehele getallenreeks die een binaire representatie bevat. |
| [Decimal](./decimal/)(std::nullptr_t) | Gooit altijd ArgumentNullException. |
| [Decimal](./decimal/)(const number_type\&) | Construeert een instantie van de [Decimal](./) klasse die de opgegeven waarde vertegenwoordigt. |
| static [Divide](./divide/)(const Decimal\&, const Decimal\&) | Deelt twee opgegeven [Decimal](./) waarden. |
| [Equals](./equals/)(const Decimal\&) const | Bepaalt of de waarden die worden weergegeven door het huidige object en het opgegeven object gelijk zijn. |
| [Equals](./equals/)(const SharedPtr\<Object\>\&) const | Bepaalt of de waarden die worden weergegeven door het huidige object en het opgegeven object gelijk zijn. |
| static [Equals](./equals/)(const Decimal\&, const Decimal\&) | Bepaalt of de waarden die worden weergegeven door de opgegeven objecten gelijk zijn. |
| static [Floor](./floor/)(const Decimal\&) | Retourneert de grootste gehele waarde die kleiner dan of gelijk is aan de opgegeven waarde. |
| static [FromOACurrency](./fromoacurrency/)(int64_t) | [Convert](../convert/) de opgegeven OLE-valutawaarde naar de equivalente [Decimal](./) waarde. NIET GEREALISEERD. |
| static [GetBits](./getbits/)(const Decimal\&) | Converteert het opgegeven [Decimal](./) object naar de binaire representatie van de waarde die het vertegenwoordigt. |
| static [GetBytes](./getbytes/)(const Decimal\&, const System::ArrayPtr\<uint8_t\>\&) | [Convert](../convert/) de opgegeven [Decimal](./) waarde naar een byte‑array. |
| [GetHashCode](./gethashcode/)() const | Retourneert een hashcode voor het huidige object. |
| [GetTypeCode](./gettypecode/)() const | Haalt de objecttypecode op. |
| static [Multiply](./multiply/)(const Decimal\&, const Decimal\&) | Vermenigvuldigt twee opgegeven [Decimal](./) waarden. |
| static [Negate](./negate/)(const Decimal\&) | Retourneert een nieuwe instantie van de [Decimal](./) klasse die een waarde vertegenwoordigt die voortkomt uit de negatie van de waarde die wordt weergegeven door het opgegeven object. |
| explicit [operator bool](./operatorbool/)() const | Converteert de waarde die wordt weergegeven door het huidige object naar een booleaanse waarde. |
| explicit [operator double](./operatordouble/)() const | Converteert de waarde die wordt weergegeven door het huidige object naar een double‑precisie floating‑point‑waarde. |
| explicit [operator float](./operatorfloat/)() const | Converteert de waarde die wordt weergegeven door het huidige object naar een single‑precisie floating‑point‑waarde. |
| [operator!=](./operator!=/)(const Decimal\&) const | Bepaalt of de waarden die worden weergegeven door het huidige object en het opgegeven object niet gelijk zijn. |
| [operator!=](./operator!=/)(std::nullptr_t) const | Bepaalt of de waarde die wordt weergegeven door het huidige object verschilt van 0. |
| [operator%](./operator%/)(const Decimal\&) const | Retourneert een nieuw exemplaar van de [Decimal](./)-klasse dat een waarde vertegenwoordigt die het resultaat is van een modulo‑bewerking met de waarden die worden vertegenwoordigd door het huidige en het opgegeven object. |
| [operator%=](./operator%=/)(const Decimal\&) | Wijs aan het huidige object een nieuwe waarde toe die het resultaat is van een modulo‑bewerking met de waarden die worden vertegenwoordigd door het huidige en het opgegeven object. |
| [operator*](./operator_/)(const Decimal\&) const | Retourneert een nieuw exemplaar van de [Decimal](./)-klasse dat een waarde vertegenwoordigt die het resultaat is van vermenigvuldiging van de waarden die worden vertegenwoordigd door het huidige en het opgegeven object. |
| [operator*=](./operator_=/)(const Decimal\&) | Wijs aan het huidige object een nieuwe waarde toe die het resultaat is van vermenigvuldiging van de waarden die worden vertegenwoordigd door het huidige en het opgegeven object. |
| [operator+](./operator+/)(const Decimal\&) const | Retourneert een nieuw exemplaar van de [Decimal](./)-klasse dat een waarde vertegenwoordigt die de som is van de waarden die worden vertegenwoordigd door het huidige en het opgegeven object. |
| [operator++](./operator++/)() | Verhoogt de waarde die wordt vertegenwoordigd door het huidige object. |
| [operator+=](./operator+=/)(const Decimal\&) | Wijs aan het huidige object een nieuwe waarde toe die de som is van de waarden die worden vertegenwoordigd door het huidige en het opgegeven object. |
| [operator-](./operator-/)(const Decimal\&) const | Retourneert een nieuw exemplaar van de [Decimal](./)-klasse dat een waarde vertegenwoordigt die het resultaat is van het aftrekken van de waarde die wordt vertegenwoordigd door het opgegeven object van de waarde die wordt vertegenwoordigd door het huidige object. |
| [operator-](./operator-/)() const | Retourneert een nieuw exemplaar van de [Decimal](./)-klasse dat een waarde vertegenwoordigt die voortkomt uit de negatie van de waarde die wordt vertegenwoordigd door het huidige object. |
| [operator--](./operator--/)() | Verlaagt de waarde die wordt vertegenwoordigd door het huidige object. |
| [operator-=](./operator-=/)(const Decimal\&) | Wijs aan het huidige object een nieuwe waarde toe die het resultaat is van het aftrekken van de waarde die wordt vertegenwoordigd door het opgegeven object van de waarde die wordt vertegenwoordigd door het huidige object. |
| [operator/](./operator//)(const Decimal\&) const | Retourneert een nieuw exemplaar van de [Decimal](./)-klasse dat een waarde vertegenwoordigt die het resultaat is van de deling van de waarde die wordt vertegenwoordigd door het huidige object door de waarde die wordt vertegenwoordigd door het opgegeven object. |
| [operator/=](./operator/=/)(const Decimal\&) | Wijs aan het huidige object een nieuwe waarde toe die het resultaat is van de deling van de waarde die wordt vertegenwoordigd door het huidige object door de waarde die wordt vertegenwoordigd door het opgegeven object. |
| [operator<](./operator_/)(const Decimal\&) const | Bepaalt of de waarde die wordt vertegenwoordigd door het huidige object kleiner is dan de waarde die wordt vertegenwoordigd door het opgegeven object. |
| [operator<=](./operator_=/)(const Decimal\&) const | Bepaalt of de waarde die wordt vertegenwoordigd door het huidige object kleiner dan of gelijk aan de waarde die wordt vertegenwoordigd door het opgegeven object is. |
| [operator=](./operator=/)(const Decimal\&) | Wijs de waarde die wordt vertegenwoordigd door het opgegeven object toe aan het huidige object. |
| [operator==](./operator==/)(const Decimal\&) const | Bepaalt of de waarden die worden weergegeven door het huidige object en het opgegeven object gelijk zijn. |
| [operator==](./operator==/)(std::nullptr_t) const | Bepaalt of de waarde die wordt vertegenwoordigd door het huidige object 0 is. |
| [operator>](./operator_/)(const Decimal\&) const | Bepaalt of de waarde die wordt vertegenwoordigd door het huidige object groter is dan de waarde die wordt vertegenwoordigd door het opgegeven object. |
| [operator>=](./operator_=/)(const Decimal\&) const | Bepaalt of de waarde die wordt vertegenwoordigd door het huidige object groter dan of gelijk aan de waarde die wordt vertegenwoordigd door het opgegeven object is. |
| static [Parse](./parse/)(const String\&) | Converteert de tekenreeksrepresentatie van een decimaal getal naar een gelijkwaardig exemplaar van de [Decimal](./)-klasse. |
| static [Parse](./parse/)(const String\&, Globalization::NumberStyles) | Converteert de tekenreeksrepresentatie van een decimaal getal naar een gelijkwaardig exemplaar van de [Decimal](./)-klasse met behulp van de opgegeven stijl. |
| static [Parse](./parse/)(const String\&, const SharedPtr\<IFormatProvider\>\&) | Converteert de tekenreeksrepresentatie van een decimaal getal naar een gelijkwaardig exemplaar van de [Decimal](./)-klasse met behulp van de opgegeven opmaakprovider. |
| static [Parse](./parse/)(const String\&, Globalization::NumberStyles, const SharedPtr\<IFormatProvider\>\&) | Converteert de tekenreeksrepresentatie van een decimaal getal naar een gelijkwaardig exemplaar van de [Decimal](./)-klasse met behulp van de opgegeven stijl en opmaakprovider. |
| static [Remainder](./remainder/)(const Decimal\&, const Decimal\&) | Berekent de rest na het delen van twee [Decimal](./)-waarden. |
| static [Round](./round/)(const Decimal\&, MidpointRounding) | Rondt de opgegeven waarde af op het dichtstbijzijnde gehele getal. Een parameter bepaalt het gedrag van de functie als de opgegeven waarde even dicht bij twee dichtstbijzijnde getallen ligt. |
| static [Round](./round/)(const Decimal\&, int, MidpointRounding) | Rondt de opgegeven waarde af naar de dichtstbijzijnde waarde met het opgegeven aantal fractionele cijfers. Een parameter bepaalt het gedrag van de functie als de opgegeven waarde even dicht bij twee dichtstbijzijnde getallen ligt. |
| static [Subtract](./subtract/)(const Decimal\&, const Decimal\&) | Trek één opgegeven [Decimal](./) waarde af van een andere. |
| static [ToByte](./tobyte/)(Decimal) | Converteert de [Decimal](./) waarde naar een ongetekend 8‑bit geheel getal. |
| static [ToDouble](./todouble/)(Decimal) | Converteert de [Decimal](./) waarde naar een double‑precisie floating‑point getal. |
| static [ToInt16](./toint16/)(Decimal) | Converteert de [Decimal](./) waarde naar een signed 16‑bit geheel getal. |
| static [ToInt32](./toint32/)(Decimal) | Converteert de [Decimal](./) waarde naar een signed 32‑bit geheel getal. |
| static [ToInt64](./toint64/)(Decimal) | Converteert de [Decimal](./) waarde naar een signed 64‑bit geheel getal. |
| static [ToOACurrency](./tooacurrency/)(const Decimal\&) | [Convert](../convert/) de opgegeven [Decimal](./) waarde naar de equivalente OLE-valutawaarde. NIET GEREALISEERD. |
| static [ToSByte](./tosbyte/)(Decimal) | Converteert de [Decimal](./) waarde naar een signed 8‑bit geheel getal. |
| static [ToSingle](./tosingle/)(Decimal) | Converteert de [Decimal](./) waarde naar een single‑precisie floating‑point getal. |
| [ToStdString](./tostdstring/)() const | Retourneert een instantie van std::string die de tekenreeksrepresentatie van de door het object gerepresenteerde waarde bevat. |
| [ToString](./tostring/)() const | Retourneert de tekenreeksrepresentatie van de door het object gerepresenteerde waarde. |
| [ToString](./tostring/)(const SharedPtr\<IFormatProvider\>\&) const | Converteert het huidige object naar een tekenreeks met behulp van cultuurspecifieke opmaakinformatie. |
| [ToString](./tostring/)(const SharedPtr\<Globalization::CultureInfo\>\&) const |  |
| [ToString](./tostring/)(const SharedPtr\<Globalization::NumberFormatInfo\>\&) const |  |
| [ToString](./tostring/)(const Decimal\&, std::nullptr_t) const |  |
| [ToString](./tostring/)(const String\&, const SharedPtr\<IFormatProvider\>\&) const | Converteert het huidige object naar zijn tekenreeksrepresentatie met behulp van het opgegeven tekenreeksformaat en de cultuurspecifieke opmaakinformatie die wordt geleverd door het opgegeven [IFormatProvider](../iformatprovider/) object. |
| [ToString](./tostring/)(const String\&, const SharedPtr\<Globalization::CultureInfo\>\&) const |  |
| [ToString](./tostring/)(const String\&, const SharedPtr\<Globalization::NumberFormatInfo\>\&) const |  |
| [ToString](./tostring/)(const String\&, std::nullptr_t) const |  |
| [ToStringInternal](./tostringinternal/)() const | Retourneert de tekenreeksrepresentatie van de door het object gerepresenteerde waarde. Voor intern gebruik. |
| static [ToUInt16](./touint16/)(Decimal) | Converteert de [Decimal](./) waarde naar een ongetekend 16‑bit geheel getal. |
| static [ToUInt32](./touint32/)(Decimal) | Converteert de [Decimal](./) waarde naar een ongetekend 32‑bit geheel getal. |
| static [ToUInt64](./touint64/)(Decimal) | Converteert de [Decimal](./) waarde naar een ongetekend 64‑bit geheel getal. |
| static [Truncate](./truncate/)(const Decimal\&) | Retourneert het [Decimal](./) object dat een waarde vertegenwoordigt waarvan het gehele deel gelijk is aan dat van de waarde die wordt gerepresenteerd door het opgegeven [Decimal](./) object, waarbij alle fractionele cijfers zijn verwijderd. |
| static [TryParse](./tryparse/)(const String\&, Decimal\&) | Converteert de opgegeven tekenreeks die de tekenreeksrepresentatie van een getal bevat naar de equivalente [Decimal](./) waarde. |
| static [TryParse](./tryparse/)(const String\&, Globalization::NumberStyles, const SharedPtr\<IFormatProvider\>\&, Decimal\&) | Converteert de opgegeven tekenreeks die de tekenreeksrepresentatie van een getal bevat naar de equivalente [Decimal](./) waarde met behulp van de verstrekte opmaakinformatie en getalstijl. |
| static [Type](./type/)() | Retourneert een referentie naar het [TypeInfo](../typeinfo/) object dat de type‑informatie van de [Decimal](./) klasse vertegenwoordigt. |
| [~Decimal](./~decimal/)() | Destructor. |
## Velden

| Veld | Beschrijving |
| --- | --- |
| static [MaxValue](./maxvalue/) | Stelt het grootste getal voor dat kan worden weergegeven door de [Decimal](./) klasse. |
| static [MinusOne](./minusone/) | Stelt het getal -1 voor. |
| static [MinValue](./minvalue/) | Stelt het kleinste getal voor dat kan worden weergegeven door de [Decimal](./) klasse. |
| static [One](./one/) | Vertegenwoordigt nummer 1. |
| static [Zero](./zero/) | Vertegenwoordigt nummer 0. |
## Typedefs

| Typedef | Beschrijving |
| --- | --- |
| [number_type](./number_type/) | Een alias voor Detail::decimal_number_type. |
## Opmerkingen



```cpp
#include "system/console.h"
#include "system/decimal.h"

int main()
{
  using namespace System;

  Console::WriteLine(Decimal::MinValue);
  Console::WriteLine(Decimal::MaxValue);

  auto dividend = Decimal::One;
  auto divisor = 6;
  Console::WriteLine(dividend/divisor);

  return 0;
}
/*
This code example produces the following output:
-79228162514264337593543950335
79228162514264337593543950335
0,1666666666666666666666666667
*/
```

## Zie ook

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
