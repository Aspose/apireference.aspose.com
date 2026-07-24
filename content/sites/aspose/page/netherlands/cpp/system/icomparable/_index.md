---
title: "System::IComparable class"
linktitle: "IComparable"
second_title: "Aspose.Page voor C++"
description: "System::IComparable class. Definieert een methode die twee objecten vergelijkt. Objecten van deze klasse mogen alleen worden toegewezen met de functie System::MakeObject(). Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een System::SmartPtr‑pointer en gebruik deze pointer om het door te geven aan functies als argument in C++."
type: docs
weight: 3300
url: /nl/cpp/system/icomparable/
---
## IComparable class


Definieert een methode die twee objecten vergelijkt. Objecten van deze klasse mogen alleen worden toegewezen met de functie [System::MakeObject()](../makeobject/). Maak nooit een instantie van dit type op de stack of met operator new, omdat dit runtime‑fouten en/of assertiefouten oplevert. Wikkel deze klasse altijd in een [System::SmartPtr](../smartptr/) pointer en gebruik deze pointer om deze als argument aan functies door te geven.

```cpp
template<typename T>class IComparable : public virtual System::Object
```


| Parameter | Beschrijving |
| --- | --- |
| T | Het type van de objecten waarmee het huidige object wordt vergeleken |
## Methoden

| Methode | Beschrijving |
| --- | --- |
| virtual [CompareTo](./compareto/)(T) | Vergelijkt het huidige object met het opgegeven object. |

## Zie ook

* Class [Object](../object/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
