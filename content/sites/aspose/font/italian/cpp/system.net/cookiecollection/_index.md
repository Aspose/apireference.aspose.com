---
title: "System::Net::CookieCollection classe"
linktitle: "CookieCollection"
second_title: "Aspose.Font per C++"
description: "System::Net::CookieCollection classe. Rappresenta un elenco di cookie ordinati. Gli oggetti di questa classe devono essere allocati solo utilizzando la funzione System::MakeObject(). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fallimenti di asserzione. Avvolgere sempre questa classe in un puntatore System::SmartPtr e utilizzare tale puntatore per passarlo alle funzioni come argomento in C++."
type: docs
weight: 200
url: /it/cpp/system.net/cookiecollection/
---
## CookieCollection class


Rappresenta un elenco di cookie ordinati. Gli oggetti di questa classe devono essere allocati solo utilizzando la funzione [System::MakeObject()](../../system/makeobject/). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fallimenti di asserzione. Avvolgere sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e utilizzare tale puntatore per passarlo alle funzioni come argomento.

```cpp
class CookieCollection : public System::Collections::Generic::ICollection<System::SharedPtr<System::Net::Cookie>>
```

## Enums

| Enumerazione | Descrizione |
| --- | --- |
| [Stamp](./stamp/) | Informazioni RTTI. |
## Metodi

| Metodo | Descrizione |
| --- | --- |
| [Add](./add/)(const System::SharedPtr\<Cookie\>\&) override | Aggiunge un cookie alla raccolta. |
| [Add](./add/)(System::SharedPtr\<CookieCollection\>) | Aggiunge i cookie dalla collezione specificata a quella corrente. |
| [Clear](./clear/)() override | Rimuove tutti i cookie dalla collezione. |
| [Contains](./contains/)(const System::SharedPtr\<Cookie\>\&) const override | Verifica se la raccolta contiene il cookie specificato. |
| [CookieCollection](./cookiecollection/)() | Crea una nuova istanza. |
| [get_Count](./get_count/)() const override | Ottiene il numero di elementi nella collezione. |
| [get_IsOtherVersionSeen](./get_isotherversionseen/)() | Restituisce un valore che indica se la raccolta contiene un cookie con una versione diversa da [Cookie::MaxSupportedVersion](../cookie/maxsupportedversion/). |
| [GetEnumerator](./getenumerator/)() override | Ottiene l'enumeratore. |
| [idx_get](./idx_get/)(int32_t) | Restituisce un cookie dalla raccolta di cookie all'indice specificato. |
| [idx_get](./idx_get/)(String) | Restituisce un cookie dalla raccolta di cookie per nome specificato. |
| [IndexOf](./indexof/)(System::SharedPtr\<Cookie\>) | Restituisce l'indice del cookie specificato. |
| [InternalAdd](./internaladd/)(System::SharedPtr\<Cookie\>, bool) | Aggiunge il cookie specificato alla raccolta. |
| [Remove](./remove/)(const System::SharedPtr\<Cookie\>\&) override | Rimuove il cookie specificato dalla raccolta. |
| [RemoveAt](./removeat/)(int32_t) | Rimuove un cookie all'indice specificato. |
| [TimeStamp](./timestamp/)(CookieCollection::Stamp) | Aggiorna il timestamp secondo lo scenario specificato e restituisce un nuovo valore. |
| [virtualizeBeginConstIterator](./virtualizebeginconstiterator/)() const override | Ottiene l'implementazione dell'iteratore const begin per il contenitore corrente. |
| [virtualizeBeginIterator](./virtualizebeginiterator/)() override | Ottiene l'implementazione dell'iteratore begin per il contenitore corrente. |
| [virtualizeEndConstIterator](./virtualizeendconstiterator/)() const override | Ottiene l'implementazione dell'iteratore const end per il contenitore corrente. |
| [virtualizeEndIterator](./virtualizeenditerator/)() override | Ottiene l'implementazione dell'iteratore end per il contenitore corrente. |
## Vedi anche

* Class [ICollection](../../system.collections.generic/icollection/)
* Namespace [System::Net](../)
* Library [Aspose.Font for C++](../../)
