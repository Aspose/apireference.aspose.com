---
title: "System::Data::Common::DbProviderFactory classe"
linktitle: "DbProviderFactory"
second_title: "Aspose.Page per C++"
description: "System::Data::Common::DbProviderFactory classe. Provider per accedere al database. Gli oggetti di questa classe devono essere allocati solo utilizzando la funzione System::MakeObject(). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgi sempre questa classe in un puntatore System::SmartPtr e utilizza questo puntatore per passarlo alle funzioni come argomento in C++."
type: docs
weight: 600
url: /it/cpp/system.data.common/dbproviderfactory/
---
## DbProviderFactory class


Provider per accedere al database. Gli oggetti di questa classe devono essere allocati solo utilizzando la funzione [System::MakeObject()](../../system/makeobject/). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgi sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e utilizza questo puntatore per passarlo alle funzioni come argomento.

```cpp
class DbProviderFactory : public System::Object
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| virtual [CreateCommand](./createcommand/)() | Informazioni RTTI. |
| virtual [CreateConnection](./createconnection/)() | Crea una connessione al database. |
## Vedi anche

* Class [Object](../../system/object/)
* Namespace [System::Data::Common](../)
* Library [Aspose.Page for C++](../../)
