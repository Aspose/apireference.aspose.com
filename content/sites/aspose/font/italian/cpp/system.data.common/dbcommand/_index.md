---
title: "System::Data::Common::DbCommand classe"
linktitle: "DbCommand"
second_title: "Aspose.Font per C++"
description: "Classe System::Data::Common::DbCommand. Comando del database. Gli oggetti di questa classe devono essere allocati solo usando la funzione System::MakeObject(). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fallimenti di asserzione. Avvolgere sempre questa classe in un puntatore System::SmartPtr e utilizzare questo puntatore per passarlo alle funzioni come argomento in C++."
type: docs
weight: 100
url: /it/cpp/system.data.common/dbcommand/
---
## DbCommand class


Comando del database. Gli oggetti di questa classe devono essere allocati solo usando la funzione [System::MakeObject()](../../system/makeobject/). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fallimenti di asserzione. Avvolgere sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e utilizzare questo puntatore per passarlo alle funzioni come argomento.

```cpp
class DbCommand : public System::Object
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| virtual [ExecuteNonQuery](./executenonquery/)() | Esegue un comando non di query. |
| virtual [ExecuteReader](./executereader/)() | Esegue un comando di query. |
| virtual [get_CommandText](./get_commandtext/)() const | Informazioni RTTI. |
| virtual [get_Connection](./get_connection/)() const | Ottiene la connessione al database associata al comando. |
| virtual [set_CommandText](./set_commandtext/)(String) const | Imposta il testo del comando DB. |
| virtual [set_Connection](./set_connection/)(SharedPtr\<System::Data::Common::DbConnection\>) | Ottiene la connessione al database associata al comando. |
## Vedi anche

* Class [Object](../../system/object/)
* Namespace [System::Data::Common](../)
* Library [Aspose.Font for C++](../../)
