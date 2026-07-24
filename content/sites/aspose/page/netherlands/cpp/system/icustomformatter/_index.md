---
title: "System::ICustomFormatter class"
linktitle: "ICustomFormatter"
second_title: "Aspose.Page voor C++"
description: "System::ICustomFormatter class. Definieert een methode die aangepaste opmaak uitvoert van een tekenreeksrepresentatie van een waarde die wordt weergegeven door het opgegeven object. Objecten van deze klasse mogen alleen worden gealloceerd met de System::MakeObject() functie. Maak nooit een instantie van dit type op de stack of met de operator new, omdat dit runtime‑fouten en/of assertiefouten veroorzaakt. Wikkel deze klasse altijd in een System::SmartPtr‑pointer en gebruik deze pointer om deze als argument aan functies door te geven in C++."
type: docs
weight: 3500
url: /nl/cpp/system/icustomformatter/
---
## ICustomFormatter class


Definieert een methode die aangepaste opmaak uitvoert van een tekenreeksrepresentatie van een waarde die wordt weergegeven door het opgegeven object. Objecten van deze klasse mogen alleen worden gealloceerd met de [System::MakeObject()](../makeobject/) functie. Maak nooit een instantie van dit type op de stack of met de operator new, omdat dit runtime‑fouten en/of assertiefouten veroorzaakt. Wikkel deze klasse altijd in een [System::SmartPtr](../smartptr/) pointer en gebruik deze pointer om deze als argument aan functies door te geven.

```cpp
class ICustomFormatter : public virtual System::Object
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| virtual [Format](./format/)(System::String, System::SharedPtr\<System::Object\>, System::SharedPtr\<System::IFormatProvider\>) | Retourneert een tekenreeksrepresentatie van een waarde die wordt weergegeven door het huidige object met behulp van het opgegeven formaat. |
## Zie ook

* Class [Object](../object/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
