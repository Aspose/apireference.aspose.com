---
title: "System::Data::DataRow klasse"
linktitle: "DataRow"
second_title: "Aspose.Page voor C++"
description: "System::Data::DataRow class. Rij in de dataset. Objecten van deze klasse mogen alleen worden gealloceerd met de System::MakeObject() functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een System::SmartPtr pointer en gebruik deze pointer om deze als argument aan functies door te geven in C++."
type: docs
weight: 500
url: /nl/cpp/system.data/datarow/
---
## DataRow class


Rij in de dataset. Objecten van deze klasse mogen alleen worden gealloceerd met de [System::MakeObject()](../../system/makeobject/) functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een [System::SmartPtr](../../system/smartptr/) pointer en gebruik deze pointer om deze als argument aan functies door te geven.

```cpp
class DataRow : public System::Object
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [get_Table](./get_table/)() | Haalt de tabel op waartoe de rij behoort. |
| [GetChildRows](./getchildrows/)(const System::SharedPtr\<System::Data::DataRelation\>\&) | Haalt rijen op die als kind worden beschouwd via de opgegeven relatie. |
| [idx_get](./idx_get/)(const int32_t) | RTTI-informatie. |
## Zie ook

* Class [Object](../../system/object/)
* Namespace [System::Data](../)
* Library [Aspose.Page for C++](../../)
