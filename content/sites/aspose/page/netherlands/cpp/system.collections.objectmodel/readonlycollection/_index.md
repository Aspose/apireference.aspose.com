---
title: "System::Collections::ObjectModel::ReadOnlyCollection class"
linktitle: "ReadOnlyCollection"
second_title: "Aspose.Page voor C++"
description: "System::Collections::ObjectModel::ReadOnlyCollection‑klasse. Verpakt een specifieke container om er in alleen‑lezen‑modus toegang toe te krijgen. Objecten van deze klasse mogen alleen worden gealloceerd met de functie System::MakeObject(). Maak nooit een instantie van dit type op de stack of met operator new, omdat dit runtime‑fouten en/of assertiefouten oplevert. Verpak deze klasse altijd in een System::SmartPtr‑pointer en gebruik deze pointer om deze als argument aan functies door te geven in C++."
type: docs
weight: 300
url: /nl/cpp/system.collections.objectmodel/readonlycollection/
---
## ReadOnlyCollection class


Verpakt een specifieke container om er in alleen‑lezen‑modus toegang toe te krijgen. Objecten van deze klasse mogen alleen worden gealloceerd met de functie [System::MakeObject()](../../system/makeobject/). Maak nooit een instantie van dit type op de stack of met operator new, omdat dit runtime‑fouten en/of assertiefouten oplevert. Verpak deze klasse altijd in een [System::SmartPtr](../../system/smartptr/)‑pointer en gebruik deze pointer om deze als argument aan functies door te geven.

```cpp
template<typename T>class ReadOnlyCollection : public virtual System::Object,
                                               public System::Collections::Generic::IList<T>
```


| Parameter | Beschrijving |
| --- | --- |
| T | Elementtype. |
## Methoden

| Methode | Beschrijving |
| --- | --- |
| [Contains](./contains/)(const T\&) const override | Controleert of de container een specifiek item bevat. |
| [CopyTo](./copyto/)(System::ArrayPtr\<T\>, int) override | Kopieert container‑elementen naar bestaande array‑elementen. |
| [get_Count](./get_count/)() const override | Haalt het aantal container‑elementen op. |
| [get_IsReadOnly](./get_isreadonly/)() const override | Controleert of de collectie alleen‑lezen is. |
| [GetEnumerator](./getenumerator/)() override | Haalt de enumerator van de collectie op. |
| [idx_get](./idx_get/)(int) const override | Haalt een item op op een specifieke positie. |
| [IndexOf](./indexof/)(const T\&) const override | Zoekt naar een specifiek item in de collectie. |
| [ReadOnlyCollection](./readonlycollection/)(const SharedPtr\<Generic::IList\<T\>\>\&) | Verpakt een alleen‑lezen‑collectie rond een specifieke collectie. |
| [SetTemplateWeakPtr](./settemplateweakptr/)(uint32_t) override | Doet niets omdat een alleen‑lezen‑collectie alleen data verpakt en niets opslaat. |
| [virtualizeBeginConstIterator](./virtualizebeginconstiterator/)() const override | Haalt de implementatie van begin const iterator voor de huidige container op. |
| [virtualizeBeginIterator](./virtualizebeginiterator/)() override | Haalt de implementatie van begin iterator voor de huidige container op. |
| [virtualizeEndConstIterator](./virtualizeendconstiterator/)() const override | Haalt de implementatie van end const iterator voor de huidige container op. |
| [virtualizeEndIterator](./virtualizeenditerator/)() override | Haalt de implementatie van end iterator voor de huidige container op. |
## Typedefs

| Typedef | Beschrijving |
| --- | --- |
| [BaseType](./basetype/) | Geïmplementeerde interface. |
| [IEnumeratorPtr](./ienumeratorptr/) | Container van dezelfde elementen. |
| [ValueType](./valuetype/) | Waarde‑type. |

## Zie ook

* Class [Object](../../system/object/)
* Class [IList](../../system.collections.generic/ilist/)
* Namespace [System::Collections::ObjectModel](../)
* Library [Aspose.Page for C++](../../)
