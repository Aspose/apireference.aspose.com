---
title: "classe System::Data::Common::DbDataReader"
linktitle: "DbDataReader"
second_title: "Aspose.Font per C++"
description: "classe System::Data::Common::DbDataReader. API per ricevere dati dal database. Gli oggetti di questa classe devono essere allocati solo usando la funzione System::MakeObject(). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fallimenti di asserzione. Avvolgere sempre questa classe in un puntatore System::SmartPtr e utilizzare questo puntatore per passarlo alle funzioni come argomento in C++."
type: docs
weight: 400
url: /it/cpp/system.data.common/dbdatareader/
---
## DbDataReader class


API per ricevere dati dal database. Gli oggetti di questa classe devono essere allocati solo usando la funzione [System::MakeObject()](../../system/makeobject/) . Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fallimenti di asserzione. Avvolgere sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e utilizzare questo puntatore per passarlo alle funzioni come argomento.

```cpp
class DbDataReader : public System::Object
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| virtual [Close](./close/)() | Chiude il canale di recupero dati. |
| virtual [idx_get](./idx_get/)(String) | Ottiene l'elemento con nome. |
| virtual [idx_get](./idx_get/)(int) | Ottiene l'elemento per indice. |
| virtual [Read](./read/)() | Legge il record successivo dal database. |
## Typedefs

| Typedef | Descrizione |
| --- | --- |
| [Ptr](./ptr/) | Informazioni RTTI. |
## Vedi anche

* Class [Object](../../system/object/)
* Namespace [System::Data::Common](../)
* Library [Aspose.Font for C++](../../)
