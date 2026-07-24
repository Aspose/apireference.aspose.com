---
title: "System::ComponentModel::TypeDescriptor klass"
linktitle: "TypeDescriptor"
second_title: "Aspose.Page för C++"
description: "System::ComponentModel::TypeDescriptor klass. Dummy‑klass för kod som använder TypeDescriptor för att kunna kompilera efter översättning. Objekt av denna klass bör endast allokeras med System::MakeObject()‑funktionen. Skapa aldrig en instans av denna typ på stacken eller med operatorn new, eftersom det kan leda till körfel och/eller påståendefel. Omslut alltid denna klass i en System::SmartPtr‑pekare och använd pekaren för att skicka den till funktioner som argument i C++."
type: docs
weight: 1500
url: /sv/cpp/system.componentmodel/typedescriptor/
---
## TypeDescriptor class


Dummy-klass för kod som använder TypeDescriptor för att kunna kompileras efter översättning. Objekt av denna klass bör endast allokeras med hjälp av [System::MakeObject()](../../system/makeobject/) funktionen. Skapa aldrig en instans av denna typ på stacken eller med operatorn new, eftersom det kan leda till körfel och/eller påståendefel. Omslut alltid denna klass i en [System::SmartPtr](../../system/smartptr/) pekare och använd denna pekare för att skicka den till funktioner som argument.

```cpp
class TypeDescriptor : public System::Object
```

## Metoder

| Metod | Beskrivning |
| --- | --- |
| static [GetConverter](./getconverter/)(const TypeInfo\&) | RTTI-information. |
## Se även

* Class [Object](../../system/object/)
* Namespace [System::ComponentModel](../)
* Library [Aspose.Page for C++](../../)
