---
title: "System::ComponentModel::TypeDescriptor klasse"
linktitle: "TypeDescriptor"
second_title: "Aspose.Page voor C++"
description: "System::ComponentModel::TypeDescriptor klasse. Dummy‑klasse voor code die TypeDescriptor gebruikt, zodat deze na vertaling kan compileren. Objecten van deze klasse mogen alleen worden gealloceerd met de System::MakeObject()‑functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een System::SmartPtr‑pointer en gebruik deze pointer om deze als argument aan functies door te geven in C++."
type: docs
weight: 1500
url: /nl/cpp/system.componentmodel/typedescriptor/
---
## TypeDescriptor class


Dummy‑klasse voor code die TypeDescriptor gebruikt, zodat deze na vertaling kan compileren. Objecten van deze klasse mogen alleen worden gealloceerd met de [System::MakeObject()](../../system/makeobject/)‑functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in de [System::SmartPtr](../../system/smartptr/)‑pointer en gebruik deze pointer om deze als argument aan functies door te geven.

```cpp
class TypeDescriptor : public System::Object
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| static [GetConverter](./getconverter/)(const TypeInfo\&) | RTTI-informatie. |
## Zie ook

* Class [Object](../../system/object/)
* Namespace [System::ComponentModel](../)
* Library [Aspose.Page for C++](../../)
