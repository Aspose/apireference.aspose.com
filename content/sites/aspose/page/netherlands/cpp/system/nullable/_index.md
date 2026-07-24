---
title: "System::Nullable class"
linktitle: "Nullable"
second_title: "Aspose.Page voor C++"
description: "System::Nullable class. Voorwaartse declaratie in C++."
type: docs
weight: 4600
url: /nl/cpp/system/nullable/
---
## Nullable class


Voorwaartse declaratie.

```cpp
template<typename T>class Nullable
```


| Parameter | Beschrijving |
| --- | --- |
| T | Het onderliggende waardetype dat wordt uitgebreid door de [Nullable](./) class |
## Methoden

| Methode | Beschrijving |
| --- | --- |
| [Equals](./equals/)(const T1\&) const | Bepaalt of de waarde die wordt weergegeven door het huidige object gelijk is aan de waarde die wordt weergegeven door het opgegeven [Nullable](./) object. |
| [get_HasValue](./get_hasvalue/)() const | Bepaalt of het huidige object een waarde vertegenwoordigt. |
| [get_Value](./get_value/)() const | Retourneert een kopie van de waarde die wordt weergegeven door het huidige object. |
| [GetHashCode](./gethashcode/)() const | Retourneert een hashcode voor het huidige object. |
| [GetValueOrDefault](./getvalueordefault/)(T) | Retourneert de waarde die wordt weergegeven door het huidige object of de opgegeven waarde als de waarde die wordt weergegeven door het huidige object null is. |
| [GetValueOrDefault](./getvalueordefault/)() |  |
| [IsNull](./isnull/)() const | Bepaalt of het huidige object een null-waarde vertegenwoordigt. |
| [Nullable](./nullable/)() | Construeert een instantie die een null-waarde vertegenwoordigt. |
| [Nullable](./nullable/)(std::nullptr_t) | Construeert een instantie die null vertegenwoordigt. |
| [Nullable](./nullable/)(const T1\&) | Construeert een instantie van de [Nullable](./) klasse die de opgegeven waarde vertegenwoordigt, geconverteerd (indien nodig) naar de waarde van het onderliggende type T. |
| [Nullable](./nullable/)(const Nullable\<T1\>\&) | Construeert een instantie die een waarde vertegenwoordigt die wordt weergegeven door het opgegeven [Nullable](./) object. Het opgegeven nullable object kan een waarde van een ander type vertegenwoordigen dan het onderliggende type van de geconstrueerde instantie, in welk geval de weergegeven waarde wordt geconverteerd naar een waarde van type T. |
| [NullableBoolHelper](./nullableboolhelper/)(const T1\&, const std::function\<bool()>\&, bool) const | Helperfunctie om te controleren of dit en **other** beide niet null zijn en een lambda aan te roepen indien dat het geval is. Wordt gebruikt in implementatie.s. |
| [operator const T &](./operatorconstt&/)() const | Retourneert een constante referentie naar de waarde die wordt weergegeven door het huidige object. |
| [operator!=](./operator!=/)(std::nullptr_t) const | Bepaalt of de waarde die wordt weergegeven door het huidige object niet null is. |
| [operator!=](./operator!=/)(const T1\&) const | Bepaalt of de waarde die wordt weergegeven door het huidige object niet gelijk is aan de opgegeven waarde. |
| [operator!=](./operator!=/)(const Nullable\<T1\>\&) const | Bepaalt of de waarde die wordt weergegeven door het huidige object niet gelijk is aan de waarde die wordt weergegeven door het opgegeven [Nullable](./) object. |
| [operator&=](./operator&=/)(bool) | Past [operator&=()](./operator&=/) toe op de waarde die wordt weergegeven door het huidige object met de opgegeven waarde als rechterargument. |
| [operator+](./operator+/)(std::nullptr_t) const | Retourneert een standaard geconstrueerde instantie van de Nullable<T>-klasse. |
| [operator+](./operator+/)(const T1\&) const | Somt nullable en niet-nullable waarden op. |
| [operator+](./operator+/)(const Nullable\<T1\>\&) const | Somt nullable waarden op. |
| [operator+=](./operator+=/)(std::nullptr_t) | Reset het huidige object zodat het een null-waarde vertegenwoordigt. |
| [operator+=](./operator+=/)(const T1\&) | Past [operator+=()](./operator+=/) toe op de waarde die wordt weergegeven door het huidige object met de opgegeven waarde als rechterargument. |
| [operator+=](./operator+=/)(const Nullable\<T1\>\&) | Past [operator+=()](./operator+=/) toe op de waarde die wordt weergegeven door het huidige object met de waarde die wordt weergegeven door het opgegeven [Nullable](./) object als rechterargument. |
| [operator-](./operator-/)(T1) const | Trekt nullable en null-gerichte waarden af. |
| [operator-](./operator-/)(const T1\&) const | Trekt nullable en niet-nullable waarden af. |
| [operator-](./operator-/)(const Nullable\<T1\>\&) const | Trekt nullable waarden af. |
| [operator-=](./operator-=/)(T1) | Retourneert een instantie van de [Nullable](./) klasse die een null-waarde vertegenwoordigt. |
| [operator-=](./operator-=/)(const T1\&) | Past [operator-=()](./operator-=/) toe op de waarde die door het huidige object wordt vertegenwoordigd, met de opgegeven waarde als rechterargument. |
| [operator-=](./operator-=/)(const Nullable\<T1\>\&) | Past [operator-=()](./operator-=/) toe op de waarde die door het huidige object wordt vertegenwoordigd, met de waarde die door het opgegeven [Nullable](./) object wordt vertegenwoordigd als rechterargument. |
| [operator<](./operator_/)(std::nullptr_t) const | Geeft altijd false terug. |
| [operator<](./operator_/)(const T1\&) const | Bepaalt of de waarde die door het huidige object wordt vertegenwoordigd kleiner is dan de opgegeven waarde door [operator<()](./operator_/) op deze waarden toe te passen. |
| [operator<](./operator_/)(const Nullable\<T1\>\&) const | Bepaalt of de waarde die door het huidige object wordt vertegenwoordigd kleiner is dan de waarde die door het opgegeven [Nullable](./) object wordt vertegenwoordigd door [operator<()](./operator_/) op deze waarden toe te passen. |
| [operator<=](./operator_=/)(std::nullptr_t) const | Geeft altijd false terug. |
| [operator<=](./operator_=/)(const T1\&) const | Bepaalt of de waarde die door het huidige object wordt vertegenwoordigd kleiner of gelijk is aan de opgegeven waarde door [operator<=()](./operator_=/) op deze waarden toe te passen. |
| [operator<=](./operator_=/)(const Nullable\<T1\>\&) const | Bepaalt of de waarde die door het huidige object wordt vertegenwoordigd kleiner of gelijk is aan de waarde die door het opgegeven [Nullable](./) object wordt vertegenwoordigd door [operator<=()](./operator_=/) op deze waarden toe te passen. |
| [operator=](./operator=/)(std::nullptr_t) | Ken een null toe aan het huidige object. |
| [operator=](./operator=/)(const T1\&) | Vervangt de momenteel door het object vertegenwoordigde waarde door de opgegeven waarde. |
| [operator=](./operator=/)(const Nullable\<T1\>\&) | Vervangt de momenteel door het object vertegenwoordigde waarde door de opgegeven waarde. |
| [operator==](./operator==/)(std::nullptr_t) const | Bepaalt of de waarde die door het huidige object wordt vertegenwoordigd null is. |
| [operator==](./operator==/)(const T1\&) const | Bepaalt of de waarde die door het huidige object wordt vertegenwoordigd gelijk is aan de opgegeven waarde. |
| [operator==](./operator==/)(const Nullable\<T1\>\&) const | Bepaalt of de waarde die wordt weergegeven door het huidige object gelijk is aan de waarde die wordt weergegeven door het opgegeven [Nullable](./) object. |
| [operator>](./operator_/)(std::nullptr_t) const | Geeft altijd false terug. |
| [operator>](./operator_/)(const T1\&) const | Bepaalt of de waarde die door het huidige object wordt vertegenwoordigd groter is dan de opgegeven waarde door [operator>()](./operator_/) op deze waarden toe te passen. |
| [operator>](./operator_/)(const Nullable\<T1\>\&) const | Bepaalt of de waarde die door het huidige object wordt vertegenwoordigd groter is dan de waarde die door het opgegeven [Nullable](./) object wordt vertegenwoordigd door [operator>()](./operator_/) op deze waarden toe te passen. |
| [operator>=](./operator_=/)(std::nullptr_t) const | Geeft altijd false terug. |
| [operator>=](./operator_=/)(const T1\&) const | Bepaalt of de waarde die door het huidige object wordt vertegenwoordigd groter of gelijk is aan de waarde die door het opgegeven object wordt vertegenwoordigd door [operator>=()](./operator_=/) op deze waarden toe te passen. |
| [operator>=](./operator_=/)(const Nullable\<T1\>\&) const | Bepaalt of de waarde die door het huidige object wordt vertegenwoordigd groter of gelijk is aan de waarde die door het opgegeven [Nullable](./) object wordt vertegenwoordigd door [operator>=()](./operator_=/) op deze waarden toe te passen. |
| [operator | =](./operator_=/)(bool) | Past [operator | =()](./operator_=/) toe op de waarde die door het huidige object wordt vertegenwoordigd, met de opgegeven waarde als rechterargument. |
| [reset](./reset/)() | Stelt de momenteel vertegenwoordigde waarde in op null. |
| [ToString](./tostring/)() const | Converteert de waarde die door het huidige object wordt vertegenwoordigd naar string. |
## Typedefs

| Typedef | Beschrijving |
| --- | --- |
| [ValueType](./valuetype/) | Een alias voor een type van de waarde die door deze klasse wordt vertegenwoordigd. |
## Opmerkingen


Stelt een waarde van het opgegeven type voor die null kan worden toegewezen. Dit type moet op de stack worden gealloceerd en aan functies worden doorgegeven per waarde of per referentie. Gebruik nooit de [System::SmartPtr](../smartptr/) klasse om objecten van dit type te beheren.

## Zie ook

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
