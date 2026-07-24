---
title: "System::IFormatProvider-klass"
linktitle: "IFormatProvider"
second_title: "Aspose.Page för C++"
description: "System::IFormatProvider-klass. Definierar en metod som tillhandahåller formateringsinformation. Objekt av denna klass bör endast allokeras med System::MakeObject()-funktionen. Skapa aldrig en instans av denna typ på stacken eller med operatorn new, eftersom det kan leda till körfel och/eller påståendefel. Omslut alltid denna klass i en System::SmartPtr-pekare och använd pekaren för att skicka den till funktioner som argument i C++."
type: docs
weight: 3800
url: /sv/cpp/system/iformatprovider/
---
## IFormatProvider class


Definierar en metod som tillhandahåller formateringsinformation. Objekt av denna klass bör endast allokeras med [System::MakeObject()](../makeobject/)-funktionen. Skapa aldrig en instans av denna typ på stacken eller med operatorn new, eftersom det kan leda till körfel och/eller påståendefel. Omslut alltid denna klass i en [System::SmartPtr](../smartptr/)-pekare och använd pekaren för att skicka den till funktioner som argument.

```cpp
class IFormatProvider : public virtual System::Object
```

## Metoder

| Metod | Beskrivning |
| --- | --- |
| virtual [GetFormat](./getformat/)(const TypeInfo\&) | Returnerar ett objekt som tillhandahåller formateringstjänster för den angivna typen. |
## Se även

* Class [Object](../object/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
