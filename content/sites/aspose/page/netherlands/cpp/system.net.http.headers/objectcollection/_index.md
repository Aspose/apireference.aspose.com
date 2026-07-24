---
title: "System::Net::Http::Headers::ObjectCollection klasse"
linktitle: "ObjectCollection"
second_title: "Aspose.Page voor C++"
description: "System::Net::Http::Headers::ObjectCollection klasse. Stelt de verzameling van de objecten in C++ voor."
type: docs
weight: 1600
url: /nl/cpp/system.net.http.headers/objectcollection/
---
## ObjectCollection class


Stelt de verzameling van de objecten voor.

```cpp
template<typename T>class ObjectCollection : public System::Collections::ObjectModel::Collection<T>
```


| Parameter | Beschrijving |
| --- | --- |
| T | Het objecttype. Objecten van deze klasse mogen alleen worden toegewezen met behulp van de [System::MakeObject()](../../system/makeobject/) functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime-fouten en/of assertiefouten. Wikkel deze klasse altijd in een [System::SmartPtr](../../system/smartptr/) pointer en gebruik deze pointer om deze als argument aan functies door te geven. |
## Methoden

| Methode | Beschrijving |
| --- | --- |
| [ObjectCollection](./objectcollection/)() | RTTI-informatie. |
| [ObjectCollection](./objectcollection/)(Action\<T\>) | Construeert een nieuw exemplaar. |
| [SetTemplateWeakPtr](./settemplateweakptr/)(uint32_t) override | Stel het n'th sjabloonargument in op een zwakke pointer (in plaats van gedeeld). Hiermee kun je pointers in containers overschakelen naar zwakke modus. |

## Zie ook

* Class [Collection](../../system.collections.objectmodel/collection/)
* Namespace [System::Net::Http::Headers](../)
* Library [Aspose.Page for C++](../../)
