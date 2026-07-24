---
title: "System::Collections::Generic::BaseKVCollection klasse"
linktitle: "BaseKVCollection"
second_title: "Aspose.Page voor C++"
description: "System::Collections::Generic::BaseKVCollection klasse. Bevat gemeenschappelijke code voor collecties van sleutels of waarden. Objecten van deze klasse mogen alleen worden gealloceerd met de System::MakeObject() functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit zal leiden tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een System::SmartPtr‑pointer en gebruik deze pointer om deze als argument aan functies door te geven in C++."
type: docs
weight: 700
url: /nl/cpp/system.collections.generic/basekvcollection/
---
## BaseKVCollection class


Bevat gemeenschappelijke code voor collecties van sleutels of waarden. Objecten van deze klasse mogen alleen worden gealloceerd met de [System::MakeObject()](../../system/makeobject/) functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit zal leiden tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een [System::SmartPtr](../../system/smartptr/) pointer en gebruik deze pointer om deze als argument aan functies door te geven.

```cpp
template<typename Dict,typename KV>class BaseKVCollection : public System::Collections::Generic::IKVCollection<KV>
```


| Parameter | Beschrijving |
| --- | --- |
| Dict | [Dictionary](../dictionary/) type. |
| KV | Sleutel- of waardetype, afhankelijk van waarvoor de interface wordt gebruikt. |
## Methoden

| Methode | Beschrijving |
| --- | --- |
| [BaseKVCollection](./basekvcollection/)(const typename Dict::Ptr\&) | Maakt collectie aan. |
| [CopyTo](./copyto/)(ArrayPtr\<KV\>, int) override | Kopieert gegevens naar bestaande array‑elementen. |
| [get_Count](./get_count/)() const override | Haalt aantal elementen op. |
| [SetTemplateWeakPtr](./settemplateweakptr/)(uint32_t) override | Staat compilatie toe, maar doet in feite niets omdat deze structuur geen gegevens bezit. |

## Zie ook

* Class [IKVCollection](../ikvcollection/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
