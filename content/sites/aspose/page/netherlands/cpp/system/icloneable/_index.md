---
title: "System::ICloneable klasse"
linktitle: "ICloneable"
second_title: "Aspose.Page voor C++"
description: "System::ICloneable klasse. Definieert een methode die objectklonen mogelijk maakt - het maken van een kopie van een object. Objecten van deze klasse mogen alleen worden gealloceerd met de System::MakeObject() functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een System::SmartPtr‑pointer en gebruik deze pointer om deze als argument aan functies door te geven in C++."
type: docs
weight: 3200
url: /nl/cpp/system/icloneable/
---
## ICloneable class


Definieert een methode die objectklonen mogelijk maakt - het maken van een kopie van een object. Objecten van deze klasse mogen alleen worden gealloceerd met de [System::MakeObject()](../makeobject/) functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een [System::SmartPtr](../smartptr/) pointer en gebruik deze pointer om deze als argument aan functies door te geven.

```cpp
class ICloneable : public virtual System::Object
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| virtual [Clone](./clone/)() | RTTI-informatie. |
## Zie ook

* Class [Object](../object/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
