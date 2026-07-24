---
title: "System::BoxedValue-klass"
linktitle: "BoxedValue"
second_title: "Aspose.Page för C++"
description: "Representerar ett inneslutet värde. Objekt av denna klass bör endast allokeras med hjälp av System::MakeObject()‑funktionen. Skapa aldrig en instans av denna typ på stacken eller med operatorn new, eftersom det kommer att leda till körfel och/eller påståendefel. Omslut alltid denna klass i en System::SmartPtr‑pekare och använd denna pekare för att skicka den till funktioner som argument i C++."
type: docs
weight: 800
url: /sv/cpp/system/boxedvalue/
---
## BoxedValue class


Representerar ett inneslutet värde. Objekt av denna klass bör endast allokeras med hjälp av [System::MakeObject()](../makeobject/)‑funktionen. Skapa aldrig en instans av denna typ på stacken eller med operatorn new, eftersom det kommer att leda till körfel och/eller påståendefel. Omslut alltid denna klass i en [System::SmartPtr](../smartptr/)‑pekare och använd denna pekare för att skicka den till funktioner som argument.

```cpp
template<class T>class BoxedValue : public System::BoxedValueBase
```


| Parameter | Beskrivning |
| --- | --- |
| T | Typ av det inneslutna värdet som representeras av klassen |
## Metoder

| Metod | Beskrivning |
| --- | --- |
| [BoxedValue](./boxedvalue/)(const T\&) | Skapar ett objekt som representerar det angivna värdet inneslutet. |
| [Equals](./equals/)(ptr) override | Bestämmer likheten mellan de inneslutna värdena som representeras av det aktuella och det angivna objektet. |
| [GetHashCode](./gethashcode/)() const override | Returnerar en hashkod för det aktuella objektet. |
| [GetType](./gettype/)() const override | Hämtar den faktiska typen av objektet. |
| [GetTypeCode](./gettypecode/)() const override | Returnerar värdet som representerar typen av det inneslutna värdet som representeras av det aktuella objektet. |
| [GetUnsignedLongLongValue](./getunsignedlonglongvalue/)() const override | Returnerar numeriskt värde av det inneslutna objektet om det kan kastas, annars noll. |
| [is](./is/)() const | Bestämmer om typen av det inneslutna värdet som representeras av det aktuella objektet är **V**. |
| [IsBoxedEnum](./isboxedenum/)() override | Bestämmer om det aktuella objektet representerar ett inneslutet värde av enum-typ. |
| static [Parse](../boxedvaluebase/parse/)(const TypeInfo\&, const String\&, bool) | Innesluter värdet av en uppräkningskonstant i den angivna uppräkningen med det angivna namnet. En parameter anger om skiftläget ska ignoreras när strängen som specificerar namnet på uppräkningskonstanten tolkas. |
| static [Parse](../boxedvaluebase/parse/)(const TypeInfo\&, const String\&) | Innesluter värdet av en uppräkningskonstant i den angivna uppräkningen med det angivna namnet. |
| [ToString](./tostring/)() const override | Konverterar det inneslutna värdet som representeras av det aktuella objektet till en sträng. |
| [ToString](../boxedvaluebase/tostring/)(const System::String\&) const | Konverterar det inneslutna objektet till en sträng med angiven formatsträng. |
| [unbox](./unbox/)() const | Avpaketerar värdet som representeras av det aktuella objektet. |

## Se även

* Class [BoxedValueBase](../boxedvaluebase/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
