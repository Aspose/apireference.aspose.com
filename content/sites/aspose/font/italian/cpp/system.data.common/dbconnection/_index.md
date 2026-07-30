---
title: "System::Data::Common::DbConnection classe"
linktitle: "DbConnection"
second_title: "Aspose.Font per C++"
description: "Classe System::Data::Common::DbConnection. Connessione al database. Gli oggetti di questa classe devono essere allocati solo usando la funzione System::MakeObject(). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fallimenti di asserzione. Avvolgere sempre questa classe in un puntatore System::SmartPtr e utilizzare questo puntatore per passarlo alle funzioni come argomento in C++."
type: docs
weight: 200
url: /it/cpp/system.data.common/dbconnection/
---
## DbConnection class


Connessione al database. Gli oggetti di questa classe devono essere allocati solo usando la funzione [System::MakeObject()](../../system/makeobject/). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fallimenti di asserzione. Avvolgere sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e utilizzare questo puntatore per passarlo alle funzioni come argomento.

```cpp
class DbConnection : public System::Object
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| virtual [get_ConnectionString](./get_connectionstring/)() const | Informazioni RTTI. |
| virtual [Open](./open/)() | Apre la connessione al database. |
| virtual [set_ConnectionString](./set_connectionstring/)(String) const | Imposta le informazioni di connessione (ad es. server e porta). |
## Vedi anche

* Class [Object](../../system/object/)
* Namespace [System::Data::Common](../)
* Library [Aspose.Font for C++](../../)
