---
title: "System::Collections::Generic::LinkedListNode klasse"
linktitle: "LinkedListNode"
second_title: "Aspose.Page voor C++"
description: "System::Collections::Generic::LinkedListNode klasse. Knoop van een gekoppelde lijst. Implementeert een wrapper rond een iterator van std::list die in een gekoppelde lijst is gewikkeld. Objecten van deze klasse mogen alleen worden gealloceerd met de System::MakeObject() functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een System::SmartPtr pointer en gebruik deze pointer om deze als argument aan functies door te geven in C++."
type: docs
weight: 3200
url: /nl/cpp/system.collections.generic/linkedlistnode/
---
## LinkedListNode class


Knoop van een gekoppelde lijst. Implementeert een wrapper rond een iterator van std::list die in een gekoppelde lijst is gewikkeld. Objecten van deze klasse mogen alleen worden gealloceerd met de [System::MakeObject()](../../system/makeobject/) functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een [System::SmartPtr](../../system/smartptr/) pointer en gebruik deze pointer om deze als argument aan functies door te geven.

```cpp
template<typename T>class LinkedListNode : public System::Object
```


| Parameter | Beschrijving |
| --- | --- |
| T | Opgeslagen waardetype. |
## Methoden

| Methode | Beschrijving |
| --- | --- |
| [get_List](./get_list/)() const | Haalt de bevatende lijst op. |
| [get_Next](./get_next/)() const | Haalt het volgende knooppunt op. |
| [get_Previous](./get_previous/)() const | Haalt het vorige knooppunt op. |
| [get_Value](./get_value/)() const | Haalt de opgeslagen waarde op. |
| [LinkedListNode](./linkedlistnode/)(const T\&) | Constructor. |
| [set_Value](./set_value/)(const T\&) | Stelt de opgeslagen waarde in. |

## Zie ook

* Class [Object](../../system/object/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
