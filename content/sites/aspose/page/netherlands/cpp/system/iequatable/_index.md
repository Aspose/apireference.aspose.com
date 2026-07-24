---
title: "System::IEquatable klasse"
linktitle: "IEquatable"
second_title: "Aspose.Page voor C++"
description: "System::IEquatable klasse. Definieert een methode die de gelijkheid van twee objecten bepaalt. Objecten van deze klasse mogen alleen worden gealloceerd met de functie System::MakeObject(). Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een System::SmartPtr‑pointer en gebruik deze pointer om deze als argument aan functies door te geven in C++."
type: docs
weight: 3700
url: /nl/cpp/system/iequatable/
---
## IEquatable class


Definieert een methode die de gelijkheid van twee objecten bepaalt. Objecten van deze klasse mogen alleen worden gealloceerd met de [System::MakeObject()](../makeobject/)‑functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een [System::SmartPtr](../smartptr/)‑pointer en gebruik deze pointer om deze als argument aan functies door te geven.

```cpp
template<typename T>class IEquatable : public virtual System::Object
```


| Parameter | Beschrijving |
| --- | --- |
| T | Het type van de vergeleken objecten |
## Methoden

| Methode | Beschrijving |
| --- | --- |
| virtual [Equals](./equals/)(T) | Bepaalt of de huidige en opgegeven objecten gelijk zijn. |

## Zie ook

* Class [Object](../object/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
