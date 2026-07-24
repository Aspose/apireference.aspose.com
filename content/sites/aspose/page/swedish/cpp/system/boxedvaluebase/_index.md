---
title: "System::BoxedValueBase‑klass"
linktitle: "BoxedValueBase"
second_title: "Aspose.Page för C++"
description: "System::BoxedValueBase‑klass. En basklass som definierar ett gränssnitt och implementerar några grundläggande metoder i en underklass som representerar ett inlåst värde. Objekt av denna klass bör endast allokeras med System::MakeObject()-funktionen. Skapa aldrig en instans av denna typ på stacken eller med operatorn new, eftersom det kan leda till körfel och/eller påståendefel. Omslut alltid denna klass i en System::SmartPtr‑pekare och använd pekaren för att skicka den till funktioner som argument i C++."
type: docs
weight: 900
url: /sv/cpp/system/boxedvaluebase/
---
## BoxedValueBase class


En basklass som definierar ett gränssnitt och implementerar några grundläggande metoder i en underklass som representerar ett inlåst värde. Objekt av denna klass bör endast allokeras med [System::MakeObject()](../makeobject/)-funktionen. Skapa aldrig en instans av denna typ på stacken eller med operatorn new, eftersom det kan leda till körfel och/eller påståendefel. Omslut alltid denna klass i en [System::SmartPtr](../smartptr/)-pekare och använd pekaren för att skicka den till funktioner som argument.

```cpp
class BoxedValueBase : public System::Object
```

## Metoder

| Metod | Beskrivning |
| --- | --- |
| virtual [GetTypeCode](./gettypecode/)() const | Returnerar värdet som representerar typen av det inneslutna värdet som representeras av det aktuella objektet. |
| virtual [GetUnsignedLongLongValue](./getunsignedlonglongvalue/)() const | Konverterar den inlåsta som representeras av det aktuella objektet till ett 64‑bitars heltalsvärde. |
| virtual [IsBoxedEnum](./isboxedenum/)() | Bestämmer om det aktuella objektet representerar ett inneslutet värde av enum-typ. |
| static [Parse](./parse/)(const TypeInfo\&, const String\&, bool) | Innesluter värdet av en uppräkningskonstant i den angivna uppräkningen med det angivna namnet. En parameter anger om skiftläget ska ignoreras när strängen som specificerar namnet på uppräkningskonstanten tolkas. |
| static [Parse](./parse/)(const TypeInfo\&, const String\&) | Innesluter värdet av en uppräkningskonstant i den angivna uppräkningen med det angivna namnet. |
| [ToString](./tostring/)(const System::String\&) const | Konverterar det inneslutna objektet till en sträng med angiven formatsträng. |
| virtual [ToString](./tostring/)() const | Analog till C#‑metoden [Object.ToString()](../object/tostring/). Möjliggör konvertering av anpassade objekt till sträng. |
## Se även

* Class [Object](../object/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
