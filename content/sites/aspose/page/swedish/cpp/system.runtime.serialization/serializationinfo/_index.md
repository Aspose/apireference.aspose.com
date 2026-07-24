---
title: "System::Runtime::Serialization::SerializationInfo klass"
linktitle: "SerializationInfo"
second_title: "Aspose.Page för C++"
description: "System::Runtime::Serialization::SerializationInfo klass. Innehåller en uppsättning namngivna fält som representerar ett serialiserat objekt. Ej implementerad. Objekt av denna klass bör endast allokeras med System::MakeObject()-funktionen. Skapa aldrig en instans av denna typ på stacken eller med operatorn new, eftersom det kan leda till körfel och/eller påståendefel. Omslut alltid denna klass i en System::SmartPtr‑pekare och använd pekaren för att skicka den till funktioner som argument i C++."
type: docs
weight: 400
url: /sv/cpp/system.runtime.serialization/serializationinfo/
---
## SerializationInfo class


Innehåller en uppsättning namngivna fält som representerar ett serialiserat objekt. Ej implementerad. Objekt av denna klass bör endast allokeras med hjälp av funktionen [System::MakeObject()](../../system/makeobject/). Skapa aldrig en instans av denna typ på stacken eller med operatorn new, eftersom det kommer att leda till körfel och/eller påståendefel. Omslut alltid denna klass i en [System::SmartPtr](../../system/smartptr/) pekare och använd denna pekare för att skicka den till funktioner som argument.

```cpp
class SerializationInfo : public System::Object
```

## Metoder

| Metod | Beskrivning |
| --- | --- |
| [AddValue](./addvalue/)(const System::String\&, float) | Sätter flyttalsvärde. Ej implementerad. |
| [AddValue](./addvalue/)(const System::String\&, short) | Sätter kortvärde. Ej implementerad. |
| [AddValue](./addvalue/)(const System::String\&, bool) | Sätter booleskt värde. Ej implementerad. |
| [AddValue](./addvalue/)(const System::String\&, const System::SharedPtr\<System::Object\>\&) | Sätter objektvärde. Ej implementerad. |
| [AddValue](./addvalue/)(const System::String\&, const System::SharedPtr\<System::Object\>\&, const System::TypeInfo\&) | Sätter objektvärde med specificerad typ. Ej implementerad. |
| [GetValue](./getvalue/)(const System::String\&, const System::TypeInfo\&) | Hämtar ett värde från lagret [SerializationInfo](./). Ej implementerad. |
| [SerializationInfo](./serializationinfo/)(const System::TypeInfo\&, const System::SharedPtr\<IFormatterConverter\>\&) | RTTI-information. |
## Se även

* Class [Object](../../system/object/)
* Namespace [System::Runtime::Serialization](../)
* Library [Aspose.Page for C++](../../)
