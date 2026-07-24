---
title: "System::Collections::Generic::_ValueList class"
linktitle: "_ValueList"
second_title: "Aspose.Page för C++"
description: "System::Collections::Generic::_ValueList-klass. Implementerar en lista över värden i en dictionary. Objekt av denna klass bör endast allokeras med System::MakeObject()-funktionen. Skapa aldrig en instans av denna typ på stacken eller med operatorn new, eftersom det kan leda till körfel och/eller påståendefel. Omslut alltid denna klass i en System::SmartPtr-pekare och använd pekaren för att skicka den till funktioner som argument i C++."
type: docs
weight: 400
url: /sv/cpp/system.collections.generic/_valuelist/
---
## _ValueList class


Implementerar en lista över värden i en dictionary. Objekt av denna klass bör endast allokeras med [System::MakeObject()](../../system/makeobject/)-funktionen. Skapa aldrig en instans av denna typ på stacken eller med operatorn new, eftersom det kan leda till körfel och/eller påståendefel. Omslut alltid denna klass i en [System::SmartPtr](../../system/smartptr/)-pekare och använd pekaren för att skicka den till funktioner som argument.

```cpp
template<typename Dict>class _ValueList : public System::Collections::Generic::_ValueCollection<Dict>
```


| Parameter | Beskrivning |
| --- | --- |
| Dict | [Dictionary](../dictionary/) typ. |
## Metoder

| Metod | Beskrivning |
| --- | --- |
| [_ValueList](./_valuelist/)(const typename Dict::Ptr\&) | Initierar en samling som refererar till den angivna dictionaryn. |
| virtual [idx_get](./idx_get/)(int) const | Hämtar värde på angiven position. |
## Typedefs

| Typedef | Beskrivning |
| --- | --- |
| [TValue](./tvalue/) | Värdetyp. |

## Se även

* Class [_ValueCollection](../_valuecollection/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
