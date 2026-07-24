---
title: "System::ComponentModel::IContainer klasse"
linktitle: "IContainer"
second_title: "Aspose.Page voor C++"
description: "System::ComponentModel::IContainer klasse. Dummy‑interface voor code die IContainer gebruikt om te compileren. Objecten van deze klasse mogen alleen worden gealloceerd met de functie System::MakeObject(). Maak nooit een instantie van dit type op de stack of met operator new, omdat dit runtime‑fouten en/of assertiefouten veroorzaakt. Wikkel deze klasse altijd in een System::SmartPtr‑pointer en gebruik deze pointer om deze als argument aan functies door te geven in C++."
type: docs
weight: 900
url: /nl/cpp/system.componentmodel/icontainer/
---
## IContainer class


Dummy‑interface voor code die IContainer gebruikt om te compileren. Objecten van deze klasse mogen alleen worden gealloceerd met de functie [System::MakeObject()](../../system/makeobject/). Maak nooit een instantie van dit type op de stack of met operator new, omdat dit runtime‑fouten en/of assertiefouten veroorzaakt. Wikkel deze klasse altijd in de [System::SmartPtr](../../system/smartptr/)‑pointer en gebruik deze pointer om deze als argument aan functies door te geven.

```cpp
class IContainer : public virtual System::Object
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| virtual [Add](./add/)(System::SharedPtr\<IComponent\>) | RTTI-informatie. |
## Zie ook

* Class [Object](../../system/object/)
* Namespace [System::ComponentModel](../)
* Library [Aspose.Page for C++](../../)
