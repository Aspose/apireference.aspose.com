---
title: "Klassen System::ICloneable"
linktitle: "ICloneable"
second_title: "Aspose.Page för C++"
description: "Klassen System::ICloneable. Definierar en metod som möjliggör objektkloning – att skapa en kopia av ett objekt. Objekt av denna klass bör endast allokeras med funktionen System::MakeObject(). Skapa aldrig en instans av denna typ på stacken eller med operatorn new, eftersom det kan leda till körfel och/eller påståendefel. Omslut alltid denna klass i en System::SmartPtr‑pekare och använd denna pekare för att skicka den till funktioner som argument i C++."
type: docs
weight: 3200
url: /sv/cpp/system/icloneable/
---
## ICloneable class


Definierar en metod som möjliggör objektkloning – att skapa en kopia av ett objekt. Objekt av denna klass bör endast allokeras med funktionen [System::MakeObject()](../makeobject/). Skapa aldrig en instans av denna typ på stacken eller med operatorn new, eftersom det kan leda till körfel och/eller påståendefel. Omslut alltid denna klass i en [System::SmartPtr](../smartptr/)-pekare och använd denna pekare för att skicka den till funktioner som argument.

```cpp
class ICloneable : public virtual System::Object
```

## Metoder

| Metod | Beskrivning |
| --- | --- |
| virtual [Clone](./clone/)() | RTTI-information. |
## Se även

* Class [Object](../object/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
