---
title: "System::Collections::Generic::SortedDictionary::Enumerator klass"
linktitle: "Enumerator"
second_title: "Aspose.Page för C++"
description: "System::Collections::Generic::SortedDictionary::Enumerator klass. Enumerator‑typ för att iterera genom dictionary. Objekt av denna klass bör endast allokeras med System::MakeObject()‑funktionen. Skapa aldrig en instans av denna typ på stacken eller med operator new, eftersom det kommer att leda till körfel och/eller påståendefel. Wrappa alltid denna klass i en System::SmartPtr‑pekare och använd denna pekare för att skicka den till funktioner som argument i C++."
type: docs
weight: 2100
url: /sv/cpp/system.collections.generic/sorteddictionary/enumerator/
---
## Enumerator class


[Enumerator](./) type to iterate through dictionary. Objects of this class should only be allocated using [System::MakeObject()](../../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class Enumerator : public System::Collections::Generic::SimpleEnumerator<map_t, KVPair>
```

## Metoder

| Metod | Beskrivning |
| --- | --- |
| [Enumerator](./enumerator/)(const Ptr\&) | Skapar enumerator över specifikt dictionary. |
## Typedefs

| Typedef | Beskrivning |
| --- | --- |
| [EnumeratorType](./enumeratortype/) | [Enumerator](./) typalias. |
## Se även

* Class [SimpleEnumerator](../../simpleenumerator/)
* Class [SortedDictionary](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Page for C++](../../../)
