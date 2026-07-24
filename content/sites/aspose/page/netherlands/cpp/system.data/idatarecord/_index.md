---
title: "System::Data::IDataRecord class"
linktitle: "IDataRecord"
second_title: "Aspose.Page voor C++"
description: "System::Data::IDataRecord class. Interface voor een record met kolommen. Objecten van deze klasse mogen alleen worden gealloceerd met de System::MakeObject() functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit runtime‑fouten en/of assertiefouten veroorzaakt. Wrap deze klasse altijd in een System::SmartPtr pointer en gebruik deze pointer om deze als argument aan functies door te geven in C++."
type: docs
weight: 1300
url: /nl/cpp/system.data/idatarecord/
---
## IDataRecord class


Interface voor een record met kolommen. Objecten van deze klasse mogen alleen worden gealloceerd met de [System::MakeObject()](../../system/makeobject/) functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit runtime‑fouten en/of assertiefouten veroorzaakt. Wrap deze klasse altijd in de [System::SmartPtr](../../system/smartptr/) pointer en gebruik deze pointer om deze als argument aan functies door te geven.

```cpp
class IDataRecord : public virtual System::Object
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| virtual [get_FieldCount](./get_fieldcount/)() | RTTI-informatie. |
| virtual [GetName](./getname/)(const int32_t) | Haalt de naam van het veld op op de opgegeven positie. |
| virtual [idx_get](./idx_get/)(const int32_t) | Haalt de waarde op op de opgegeven index. |
## Zie ook

* Class [Object](../../system/object/)
* Namespace [System::Data](../)
* Library [Aspose.Page for C++](../../)
