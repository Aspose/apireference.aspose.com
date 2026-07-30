---
title: "System::Data::DataRow classe"
linktitle: "DataRow"
second_title: "Aspose.Font per C++"
description: "System::Data::DataRow classe. Riga nel set di dati. Gli oggetti di questa classe dovrebbero essere allocati solo utilizzando la funzione System::MakeObject(). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fallimenti di asserzione. Avvolgi sempre questa classe in un puntatore System::SmartPtr e utilizza questo puntatore per passarlo alle funzioni come argomento in C++."
type: docs
weight: 500
url: /it/cpp/system.data/datarow/
---
## DataRow class


Riga nel set di dati. Gli oggetti di questa classe devono essere allocati solo utilizzando la funzione [System::MakeObject()](../../system/makeobject/) funzione. Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò proverà errori di runtime e/o fault di asserzione. Avvolgi sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e utilizza questo puntatore per passarlo alle funzioni come argomento.

```cpp
class DataRow : public System::Object
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [get_Table](./get_table/)() | Ottiene la riga della tabella a cui appartiene. |
| [GetChildRows](./getchildrows/)(const System::SharedPtr\<System::Data::DataRelation\>\&) | Ottiene le righe considerate figlie tramite la relazione specificata. |
| [idx_get](./idx_get/)(const int32_t) | Informazioni RTTI. |
## Vedi anche

* Class [Object](../../system/object/)
* Namespace [System::Data](../)
* Library [Aspose.Font for C++](../../)
