---
title: "System::ICustomFormatter‑klass"
linktitle: "ICustomFormatter"
second_title: "Aspose.Page för C++"
description: "System::ICustomFormatter‑klass. Definierar en metod som utför anpassad formatering av en strängrepresentation av ett värde som representeras av det angivna objektet. Objekt av denna klass bör endast allokeras med System::MakeObject()‑funktionen. Skapa aldrig en instans av denna typ på stacken eller med operatorn new, eftersom det kan leda till körfel och/eller påståendefel. Omslut alltid denna klass i en System::SmartPtr‑pekare och använd pekaren för att skicka den till funktioner som argument i C++."
type: docs
weight: 3500
url: /sv/cpp/system/icustomformatter/
---
## ICustomFormatter class


Definierar en metod som utför anpassad formatering av en strängrepresentation av ett värde som representeras av det angivna objektet. Objekt av denna klass bör endast allokeras med hjälp av [System::MakeObject()](../makeobject/)‑funktionen. Skapa aldrig en instans av denna typ på stacken eller med operatorn new, eftersom det kan leda till körfel och/eller påståendefel. Omslut alltid denna klass i en [System::SmartPtr](../smartptr/)‑pekare och använd pekaren för att skicka den till funktioner som argument.

```cpp
class ICustomFormatter : public virtual System::Object
```

## Metoder

| Metod | Beskrivning |
| --- | --- |
| virtual [Format](./format/)(System::String, System::SharedPtr\<System::Object\>, System::SharedPtr\<System::IFormatProvider\>) | Returnerar en strängrepresentation av ett värde som representeras av det aktuella objektet med det angivna formatet. |
## Se även

* Class [Object](../object/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
