---
title: "System::Net::PathList classe"
linktitle: "PathList"
second_title: "Aspose.Font per C++"
description: "System::Net::PathList classe. Rappresenta l'elenco delle istanze della classe CookieCollection. Gli oggetti di questa classe devono essere allocati solo utilizzando la funzione System::MakeObject(). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fallimenti di asserzione. Avvolgere sempre questa classe in un puntatore System::SmartPtr e utilizzare tale puntatore per passarlo alle funzioni come argomento in C++."
type: docs
weight: 3000
url: /it/cpp/system.net/pathlist/
---
## PathList class


Rappresenta l'elenco delle istanze della classe [CookieCollection](../cookiecollection/). Gli oggetti di questa classe devono essere allocati solo utilizzando la funzione [System::MakeObject()](../../system/makeobject/). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fallimenti di asserzione. Avvolgere sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e utilizzare tale puntatore per passarlo alle funzioni come argomento.

```cpp
class PathList : public System::Object
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| static [Create](./create/)() | Crea una nuova istanza. |
| [get_Count](./get_count/)() const | Restituisce il numero di elementi. |
| [get_SyncRoot](./get_syncroot/)() const | Restituisce l'oggetto attraverso il quale la collezione è sincronizzata. |
| [GetCookiesCount](./getcookiescount/)() | Restituisce il numero di cookie di tutti gli elementi della collezione. |
| [GetEnumerator](./getenumerator/)() | Restituisce l'enumeratore per la collezione corrente. |
| [idx_get](./idx_get/)(String) | Ottiene la collezione di cookie per il percorso specificato. |
| [idx_set](./idx_set/)(String, System::SharedPtr\<CookieCollection\>) | Imposta la collezione di cookie per il percorso specificato. |
## Vedi anche

* Class [Object](../../system/object/)
* Namespace [System::Net](../)
* Library [Aspose.Font for C++](../../)
