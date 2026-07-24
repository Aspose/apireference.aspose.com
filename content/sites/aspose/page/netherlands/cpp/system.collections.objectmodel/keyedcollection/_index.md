---
title: "System::Collections::ObjectModel::KeyedCollection klasse"
linktitle: "KeyedCollection"
second_title: "Aspose.Page voor C++"
description: "System::Collections::ObjectModel::KeyedCollection klasse. Abstracte collectie van elementen met ingebedde sleutels. Objecten van deze klasse mogen alleen worden toegewezen met de functie System::MakeObject(). Maak nooit een instantie van dit type op de stack of met operator new, omdat dit runtime‑fouten en/of assertiefouten oplevert. Wikkel deze klasse altijd in een System::SmartPtr pointer en gebruik deze pointer om deze als argument aan functies door te geven in C++."
type: docs
weight: 200
url: /nl/cpp/system.collections.objectmodel/keyedcollection/
---
## KeyedCollection class


Abstracte collectie van elementen met ingebedde sleutels. Objecten van deze klasse mogen alleen worden toegewezen met de functie [System::MakeObject()](../../system/makeobject/) . Maak nooit een instantie van dit type op de stack of met operator new, omdat dit runtime‑fouten en/of assertiefouten oplevert. Wikkel deze klasse altijd in een [System::SmartPtr](../../system/smartptr/) pointer en gebruik deze pointer om deze als argument aan functies door te geven.

```cpp
template<typename TKey,typename TItem>class KeyedCollection : public System::Collections::ObjectModel::Collection<TItem>
```


| Parameter | Beschrijving |
| --- | --- |
| TKey | Sleuteltype. |
| TItem | waarde type. |
## Methoden

| Methode | Beschrijving |
| --- | --- |
| [Add](./add/)(const TItem\&) override | Voeg item toe aan het einde van de container. |
| [Contains](./contains/)(TKey) | Controleert of de sleutel aanwezig is in de container. |
| [get_Comparer](./get_comparer/)() | Haalt vergelijker op. |
| [idx_get](./idx_get/)(TKey) | Haalt item op op een specifieke index. |
| [Remove](./remove/)(TKey) | Verwijdert sleutel uit de container. |
| [SetTemplateWeakPtr](./settemplateweakptr/)(uint32_t) override | Zorgt ervoor dat een specifiek sjabloonargument wordt behandeld als zwakke pointer in plaats van gedeelde pointer (indien van toepassing). |
## Velden

| Veld | Beschrijving |
| --- | --- |
| static [defaultThreshold](./defaultthreshold/) | Drempelwaarde voor het aanmaken van een lookup‑woordenboek, standaard. |

## Zie ook

* Class [Collection](../collection/)
* Namespace [System::Collections::ObjectModel](../)
* Library [Aspose.Page for C++](../../)
