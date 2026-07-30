---
title: "System::Collections::Specialized::NameValueCollection classe"
linktitle: "NameValueCollection"
second_title: "Aspose.Font per C++"
description: "System::Collections::Specialized::NameValueCollection classe. Collezione di chiavi String associate e valori String che possono essere accessi sia tramite la chiave sia tramite l'indice in C++."
type: docs
weight: 200
url: /it/cpp/system.collections.specialized/namevaluecollection/
---
## NameValueCollection class


Collezione di chiavi [String](../../system/string/) associate e valori [String](../../system/string/) che possono essere accessi sia con la chiave sia con l'indice.

```cpp
class NameValueCollection : public System::Collections::Generic::ICollection<System::String>
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [Add](./add/)(const String\&) override | Sovrascrivi il metodo [ICollection](../../system.collections/icollection/) - non implementato. |
| [Add](./add/)(const System::SharedPtr\<NameValueCollection\>\&) | Copia le voci della [NameValueCollection](./) specificata in quella corrente. |
| virtual [Add](./add/)(const String\&, const String\&) | Aggiunge una voce con il nome e il valore specificati. |
| [Clear](./clear/)() override | Elimina tutti gli elementi. |
| [Contains](./contains/)(const String\&) const override | Verifica se l'elemento è presente nella collezione. |
| [CopyTo](./copyto/)(System::ArrayPtr\<String\>, int32_t) override | Copia gli elementi della collezione negli elementi di array esistenti. |
| virtual [Get](./get/)(const String\&) | Ottiene i valori associati alla chiave specificata. |
| virtual [get_AllKeys](./get_allkeys/)() | Ottiene tutte le chiavi. |
| [get_Count](./get_count/)() const override | Ottiene il numero di coppie chiave/valore. |
| virtual [get_Keys](./get_keys/)() | Ottiene tutte le chiavi. |
| [GetEnumerator](./getenumerator/)() override | Ottiene l'enumeratore per iterare attraverso la collezione. |
| virtual [GetValues](./getvalues/)(const String\&) | Ottiene i valori associati alla chiave specificata. |
| [HasKeys](./haskeys/)() | Ottiene un valore che indica se la [NameValueCollection](./) contiene chiavi non nulle. |
| [idx_get](./idx_get/)(const String\&) | Ottiene il valore all'indice specificato. |
| [idx_set](./idx_set/)(const String\&, const String\&) | Imposta il valore di una voce. |
| [NameValueCollection](./namevaluecollection/)() | Inizializza una nuova istanza della classe [NameValueCollection](./) che è vuota. |
| [NameValueCollection](./namevaluecollection/)(const System::SharedPtr\<NameValueCollection\>\&) | Copia le voci dalla [NameValueCollection](./) specificata a una nuova [NameValueCollection](./). |
| [Remove](./remove/)(const String\&) override | Rimuove l'elemento specifico. |
| virtual [Set](./set/)(const String\&, const String\&) | Imposta il valore di una voce. |
| [virtualizeBeginConstIterator](./virtualizebeginconstiterator/)() const override | Ottiene l'implementazione dell'iteratore const begin per il contenitore corrente. |
| [virtualizeBeginIterator](./virtualizebeginiterator/)() override | Ottiene l'implementazione dell'iteratore begin per il contenitore corrente. |
| [virtualizeEndConstIterator](./virtualizeendconstiterator/)() const override | Ottiene l'implementazione dell'iteratore const end per il contenitore corrente. |
| [virtualizeEndIterator](./virtualizeenditerator/)() override | Ottiene l'implementazione dell'iteratore end per il contenitore corrente. |
## Vedi anche

* Class [ICollection](../../system.collections.generic/icollection/)
* Namespace [System::Collections::Specialized](../)
* Library [Aspose.Font for C++](../../)
