---
title: "System::Data::Common::DbDataReader klasse"
linktitle: "DbDataReader"
second_title: "Aspose.Page voor C++"
description: "System::Data::Common::DbDataReader klasse. API om gegevens uit de database te ontvangen. Objecten van deze klasse mogen alleen worden gealloceerd met de System::MakeObject() functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een System::SmartPtr pointer en gebruik deze pointer om deze als argument aan functies door te geven in C++."
type: docs
weight: 400
url: /nl/cpp/system.data.common/dbdatareader/
---
## DbDataReader class


API om gegevens uit de database te ontvangen. Objecten van deze klasse mogen alleen worden gealloceerd met de [System::MakeObject()](../../system/makeobject/) functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een [System::SmartPtr](../../system/smartptr/) pointer en gebruik deze pointer om deze als argument aan functies door te geven.

```cpp
class DbDataReader : public System::Object
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| virtual [Close](./close/)() | Sluit het gegevensophaal kanaal. |
| virtual [idx_get](./idx_get/)(String) | Haalt benoemd item op. |
| virtual [idx_get](./idx_get/)(int) | Haalt item op op index. |
| virtual [Read](./read/)() | Leest het volgende record uit de database. |
## Typedefs

| Typedef | Beschrijving |
| --- | --- |
| [Ptr](./ptr/) | RTTI-informatie. |
## Zie ook

* Class [Object](../../system/object/)
* Namespace [System::Data::Common](../)
* Library [Aspose.Page for C++](../../)
