---
title: "System::Collections::Generic::LinkedListNode-klass"
linktitle: "LinkedListNode"
second_title: "Aspose.Page för C++"
description: "System::Collections::Generic::LinkedListNode-klass. Nod i en länkad lista. Implementerar ett omslag över en iterator för std::list som är inbäddad i den länkade listan. Objekt av denna klass bör endast allokeras med System::MakeObject()-funktionen. Skapa aldrig en instans av denna typ på stacken eller med operatorn new, eftersom det kan leda till körfel och/eller påståendefel. Omslut alltid denna klass i en System::SmartPtr-pekare och använd denna pekare för att skicka den till funktioner som argument i C++."
type: docs
weight: 3200
url: /sv/cpp/system.collections.generic/linkedlistnode/
---
## LinkedListNode class


Nod i en länkad lista. Implementerar ett omslag över en iterator för std::list som är inbäddad i den länkade listan. Objekt av denna klass bör endast allokeras med [System::MakeObject()](../../system/makeobject/) funktion. Skapa aldrig en instans av denna typ på stacken eller med operatorn new, eftersom det kan leda till körfel och/eller påståendefel. Omslut alltid denna klass i en [System::SmartPtr](../../system/smartptr/) pekare och använd denna pekare för att skicka den till funktioner som argument.

```cpp
template<typename T>class LinkedListNode : public System::Object
```


| Parameter | Beskrivning |
| --- | --- |
| T | Lagrad värdetyp. |
## Metoder

| Metod | Beskrivning |
| --- | --- |
| [get_List](./get_list/)() const | Hämtar den innehållande listan. |
| [get_Next](./get_next/)() const | Hämtar nästa nod. |
| [get_Previous](./get_previous/)() const | Hämtar föregående nod. |
| [get_Value](./get_value/)() const | Hämtar lagrat värde. |
| [LinkedListNode](./linkedlistnode/)(const T\&) | Konstruktor. |
| [set_Value](./set_value/)(const T\&) | Sätter lagrat värde. |

## Se även

* Class [Object](../../system/object/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
