---
title: "System::Data::IDataReader class"
linktitle: "IDataReader"
second_title: "Aspose.Page voor C++"
description: "System::Data::IDataReader class. Interface om opeenvolgende gegevens van te lezen. Objecten van deze klasse mogen alleen worden gealloceerd met de System::MakeObject() functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit runtime‑fouten en/of assertiefouten veroorzaakt. Wrap deze klasse altijd in een System::SmartPtr pointer en gebruik deze pointer om deze als argument aan functies door te geven in C++."
type: docs
weight: 1200
url: /nl/cpp/system.data/idatareader/
---
## IDataReader class


Interface om opeenvolgende gegevens van te lezen. Objecten van deze klasse mogen alleen worden gealloceerd met de [System::MakeObject()](../../system/makeobject/) functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit runtime‑fouten en/of assertiefouten veroorzaakt. Wrap deze klasse altijd in de [System::SmartPtr](../../system/smartptr/) pointer en gebruik deze pointer om deze als argument aan functies door te geven.

```cpp
class IDataReader : public System::Data::IDataRecord
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| virtual [Read](./read/)() | RTTI-informatie. |
## Zie ook

* Class [IDataRecord](../idatarecord/)
* Namespace [System::Data](../)
* Library [Aspose.Page for C++](../../)
