---
title: "System::Net::PathList klasse"
linktitle: "PathList"
second_title: "Aspose.Page voor C++"
description: "System::Net::PathList klasse. Vertegenwoordigt de lijst van de CookieCollection klasse‑instanties. Objecten van deze klasse mogen alleen worden gealloceerd met de System::MakeObject()‑functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit runtime‑fouten en/of assertiefouten veroorzaakt. Wikkel deze klasse altijd in een System::SmartPtr‑pointer en gebruik deze pointer om deze als argument aan functies door te geven in C++."
type: docs
weight: 3000
url: /nl/cpp/system.net/pathlist/
---
## PathList class


Vertegenwoordigt de lijst van de [CookieCollection](../cookiecollection/) klasse‑instanties. Objecten van deze klasse mogen alleen worden gealloceerd met de [System::MakeObject()](../../system/makeobject/)‑functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit runtime‑fouten en/of assertiefouten veroorzaakt. Wikkel deze klasse altijd in een [System::SmartPtr](../../system/smartptr/)‑pointer en gebruik deze pointer om deze als argument aan functies door te geven.

```cpp
class PathList : public System::Object
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| static [Create](./create/)() | Maakt een nieuw exemplaar aan. |
| [get_Count](./get_count/)() const | Retourneert het aantal items. |
| [get_SyncRoot](./get_syncroot/)() const | Retourneert het object waarmee de collectie wordt gesynchroniseerd. |
| [GetCookiesCount](./getcookiescount/)() | Retourneert het aantal cookies van alle collectie‑items. |
| [GetEnumerator](./getenumerator/)() | Retourneert de enumerator voor de huidige collectie. |
| [idx_get](./idx_get/)(String) | Haalt de cookie‑collectie op via het opgegeven pad. |
| [idx_set](./idx_set/)(String, System::SharedPtr\<CookieCollection\>) | Stelt de cookie‑collectie in via het opgegeven pad. |
## Zie ook

* Class [Object](../../system/object/)
* Namespace [System::Net](../)
* Library [Aspose.Page for C++](../../)
