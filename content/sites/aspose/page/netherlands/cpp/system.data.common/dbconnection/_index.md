---
title: "System::Data::Common::DbConnection klasse"
linktitle: "DbConnection"
second_title: "Aspose.Page voor C++"
description: "System::Data::Common::DbConnection klasse. Databaseverbinding. Objecten van deze klasse mogen alleen worden gealloceerd met de System::MakeObject()‑functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een System::SmartPtr‑pointer en gebruik deze pointer om deze als argument aan functies door te geven in C++."
type: docs
weight: 200
url: /nl/cpp/system.data.common/dbconnection/
---
## DbConnection class


Databaseverbinding. Objecten van deze klasse mogen alleen worden gealloceerd met de [System::MakeObject()](../../system/makeobject/)‑functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in de [System::SmartPtr](../../system/smartptr/)‑pointer en gebruik deze pointer om deze als argument aan functies door te geven.

```cpp
class DbConnection : public System::Object
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| virtual [get_ConnectionString](./get_connectionstring/)() const | RTTI-informatie. |
| virtual [Open](./open/)() | Opent verbinding met de database. |
| virtual [set_ConnectionString](./set_connectionstring/)(String) const | Stelt verbindingsinformatie in (bijv. server en poort). |
## Zie ook

* Class [Object](../../system/object/)
* Namespace [System::Data::Common](../)
* Library [Aspose.Page for C++](../../)
