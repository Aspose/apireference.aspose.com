---
title: "System::Attribute klasse"
linktitle: "Attribute"
second_title: "Aspose.Page voor C++"
description: "System::Attribute klasse. Een basisklasse voor aangepaste attributen. Objecten van deze klasse mogen alleen worden gealloceerd met de functie System::MakeObject(). Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een System::SmartPtr‑pointer en gebruik deze pointer om deze als argument aan functies door te geven in C++."
type: docs
weight: 400
url: /nl/cpp/system/attribute/
---
## Attribute class


Een basisklasse voor aangepaste attributen. Objecten van deze klasse mogen alleen worden gealloceerd met de functie [System::MakeObject()](../makeobject/). Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een [System::SmartPtr](../smartptr/)‑pointer en gebruik deze pointer om deze als argument aan functies door te geven.

```cpp
class Attribute : public System::Object
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| static [GetCustomAttribute](./getcustomattribute/)(const TypeInfo\&, const TypeInfo\&) | Retourneert een aangepast attribuut van een opgegeven type dat is toegepast op het opgegeven type. |
| static [GetCustomAttributes](./getcustomattributes/)(const TypeInfo\&) | Retourneert alle aangepaste attributen die zijn toegepast op het opgegeven type. |
## Zie ook

* Class [Object](../object/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
