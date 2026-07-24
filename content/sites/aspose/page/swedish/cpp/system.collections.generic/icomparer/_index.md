---
title: "System::Collections::Generic::IComparer klass"
linktitle: "IComparer"
second_title: "Aspose.Page för C++"
description: "System::Collections::Generic::IComparer klass. Gränssnitt som jämför två objekt i större‑lika‑mindre mening. Objekt av denna klass bör endast allokeras med System::MakeObject() funktion. Skapa aldrig en instans av denna typ på stacken eller med operator new, eftersom det kan leda till körfel och/eller påståendefel. Omslut alltid denna klass i en System::SmartPtr pekare och använd denna pekare för att skicka den till funktioner som argument i C++."
type: docs
weight: 2000
url: /sv/cpp/system.collections.generic/icomparer/
---
## IComparer class


Gränssnitt som jämför två objekt i större‑lika‑mindre mening. Objekt av denna klass bör endast allokeras med [System::MakeObject()](../../system/makeobject/) funktion. Skapa aldrig en instans av denna typ på stacken eller med operator new, eftersom det kan leda till körfel och/eller påståendefel. Omslut alltid denna klass i en [System::SmartPtr](../../system/smartptr/) pekare och använd denna pekare för att skicka den till funktioner som argument.

```cpp
template<typename T>class IComparer : public virtual System::Object
```

## Metoder

| Metod | Beskrivning |
| --- | --- |
| virtual [Compare](./compare/)(args_type, args_type) const | [Comparison](../../system/comparison/) funktion. |
## Typedefs

| Typedef | Beskrivning |
| --- | --- |
| [args_type](./args_type/) | RTTI-information. |

## Se även

* Class [Object](../../system/object/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
