---
title: "System::IDisposable-klass"
linktitle: "IDisposable"
second_title: "Aspose.Page för C++"
description: "System::IDisposable-klass. Definierar en metod som frigör resurser som ägs av det aktuella objektet. Objekt av denna klass bör endast allokeras med System::MakeObject()-funktionen. Skapa aldrig en instans av denna typ på stacken eller med operator new, eftersom det kan leda till körfel och/eller påståendefel. Omslut alltid denna klass i en System::SmartPtr-pekare och använd pekaren för att skicka den till funktioner som argument i C++."
type: docs
weight: 3600
url: /sv/cpp/system/idisposable/
---
## IDisposable class


Definierar en metod som frigör resurser som ägs av det aktuella objektet. Objekt av denna klass bör endast allokeras med [System::MakeObject()](../makeobject/)-funktionen. Skapa aldrig en instans av denna typ på stacken eller med operator new, eftersom det kan leda till körfel och/eller påståendefel. Omslut alltid denna klass i en [System::SmartPtr](../smartptr/)-pekare och använd pekaren för att skicka den till funktioner som argument.

```cpp
class IDisposable : public virtual System::Object
```

## Metoder

| Metod | Beskrivning |
| --- | --- |
| virtual [Dispose](./dispose/)() | Gör ingenting. |
## Se även

* Class [Object](../object/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
