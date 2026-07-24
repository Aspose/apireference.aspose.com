---
title: "System::Data::Common::DbCommand klasse"
linktitle: "DbCommand"
second_title: "Aspose.Page voor C++"
description: "System::Data::Common::DbCommand klasse. Database‑opdracht. Objecten van deze klasse mogen alleen worden gealloceerd met de System::MakeObject()‑functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een System::SmartPtr‑pointer en gebruik deze pointer om deze als argument aan functies door te geven in C++."
type: docs
weight: 100
url: /nl/cpp/system.data.common/dbcommand/
---
## DbCommand class


Database‑opdracht. Objecten van deze klasse mogen alleen worden gealloceerd met de [System::MakeObject()](../../system/makeobject/)‑functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in de [System::SmartPtr](../../system/smartptr/)‑pointer en gebruik deze pointer om deze als argument aan functies door te geven.

```cpp
class DbCommand : public System::Object
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| virtual [ExecuteNonQuery](./executenonquery/)() | Voert een niet-query opdracht uit. |
| virtual [ExecuteReader](./executereader/)() | Voert een query opdracht uit. |
| virtual [get_CommandText](./get_commandtext/)() const | RTTI-informatie. |
| virtual [get_Connection](./get_connection/)() const | Haalt de databaseverbinding op die bij de opdracht hoort. |
| virtual [set_CommandText](./set_commandtext/)(String) const | Stelt de DB-opdrachttekst in. |
| virtual [set_Connection](./set_connection/)(SharedPtr\<System::Data::Common::DbConnection\>) | Haalt de databaseverbinding op die bij de opdracht hoort. |
## Zie ook

* Class [Object](../../system/object/)
* Namespace [System::Data::Common](../)
* Library [Aspose.Page for C++](../../)
