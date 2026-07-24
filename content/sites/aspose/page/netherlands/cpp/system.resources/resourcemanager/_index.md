---
title: "System::Resources::ResourceManager klasse"
linktitle: "ResourceManager"
second_title: "Aspose.Page voor C++"
description: "System::Resources::ResourceManager klasse. Biedt een API om resources te beheren. Niet geïmplementeerd. Objecten van deze klasse mogen alleen worden gealloceerd met de functie System::MakeObject() functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit runtime‑fouten en/of assertiefouten kan veroorzaken. Wikkel deze klasse altijd in een System::SmartPtr pointer en gebruik deze pointer om deze als argument aan functies door te geven in C++."
type: docs
weight: 100
url: /nl/cpp/system.resources/resourcemanager/
---
## ResourceManager class


Biedt een API om resources te beheren. Niet geïmplementeerd. Objecten van deze klasse mogen alleen worden gealloceerd met de functie [System::MakeObject()](../../system/makeobject/). Maak nooit een instantie van dit type op de stack of met operator new, omdat dit runtime‑fouten en/of assertiefouten kan veroorzaken. Wikkel deze klasse altijd in een [System::SmartPtr](../../system/smartptr/) pointer en gebruik deze pointer om deze als argument aan functies door te geven.

```cpp
class ResourceManager : public System::Object
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| virtual [GetObject__](./getobject__/)(String) | Haalt object op uit resource. Naam is niet GetObject() om het GetObjectA-definitieprobleem te omzeilen. |
| virtual [GetObject__](./getobject__/)(String, SharedPtr\<System::Globalization::CultureInfo\>) | Haalt object op uit resource. Naam is niet GetObject() om het GetObjectA-definitieprobleem te omzeilen. |
| virtual [GetString](./getstring/)(String) | Haalt string‑resource op. |
| virtual [GetString](./getstring/)(String, SharedPtr\<System::Globalization::CultureInfo\>) | Haalt string‑resource op. |
| [ResourceManager](./resourcemanager/)(const String\&, const SharedPtr\<Reflection::Assembly\>\&) | RTTI-informatie. |
## Zie ook

* Class [Object](../../system/object/)
* Namespace [System::Resources](../)
* Library [Aspose.Page for C++](../../)
