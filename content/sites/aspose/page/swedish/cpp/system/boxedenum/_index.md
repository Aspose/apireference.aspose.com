---
title: "System::BoxedEnum class"
linktitle: "BoxedEnum"
second_title: "Aspose.Page för C++"
description: "System::BoxedEnum class. Representerar ett inbäddat uppräkningsvärde. Objekt av denna klass bör endast allokeras med funktionen System::MakeObject(). Skapa aldrig en instans av denna typ på stacken eller med operatorn new, eftersom det kommer att leda till körfel och/eller påståendefel. Omslut alltid denna klass i en System::SmartPtr-pekare och använd denna pekare för att skicka den till funktioner som argument i C++."
type: docs
weight: 700
url: /sv/cpp/system/boxedenum/
---
## BoxedEnum class


Representerar ett inbäddat uppräkningsvärde. Objekt av denna klass bör endast allokeras med funktionen [System::MakeObject()](../makeobject/). Skapa aldrig en instans av denna typ på stacken eller med operatorn new, eftersom det kommer att leda till körfel och/eller påståendefel. Omslut alltid denna klass i en [System::SmartPtr](../smartptr/)-pekare och använd denna pekare för att skicka den till funktioner som argument.

```cpp
template<typename E,typename UT>class BoxedEnum : public System::BoxedValue<typename std::underlying_type<E>::type>
```


| Parameter | Beskrivning |
| --- | --- |
| E | Typ av uppräkningsvärde |
| UT | Den underliggande typen för uppräkning **E** |
## Metoder

| Metod | Beskrivning |
| --- | --- |
| [BoxedEnum](./boxedenum/)(E) | Skapar en instans som representerar det angivna uppräkningsvärdet. |
| [GetUnsignedLongLongValue](./getunsignedlonglongvalue/)() const override | Konverterar värdet av den inneslutna uppräkningskonstanten till ett 64-bitars heltalsvärde. |
| [IsBoxedEnum](./isboxedenum/)() override | Avgör om det aktuella objektet representerar ett inneslutet värde av enum-typ. |
| [ToString](./tostring/)() const override | Konverterar det inneslutna värdet som representeras av det aktuella objektet till en sträng. |

## Se även

* Class [BoxedValue](../boxedvalue/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
