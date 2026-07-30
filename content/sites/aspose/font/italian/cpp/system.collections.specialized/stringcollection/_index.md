---
title: "System::Collections::Specialized::StringCollection classe"
linktitle: "StringCollection"
second_title: "Aspose.Font per C++"
description: "System::Collections::Specialized::StringCollection classe. Elenco indicizzato di stringhe. Gli oggetti di questa classe dovrebbero essere allocati solo usando la funzione System::MakeObject(). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fallimenti di asserzione. Avvolgi sempre questa classe in un puntatore System::SmartPtr e usa questo puntatore per passarlo alle funzioni come argomento in C++."
type: docs
weight: 300
url: /it/cpp/system.collections.specialized/stringcollection/
---
## StringCollection class


Elenco indicizzato di stringhe. Gli oggetti di questa classe dovrebbero essere allocati solo usando la funzione [System::MakeObject()](../../system/makeobject/). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fallimenti di asserzione. Avvolgi sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e usa questo puntatore per passarlo alle funzioni come argomento.

```cpp
class StringCollection : public System::Collections::Generic::IEnumerable<System::String>
```

## Nested classes

* Class [Enumerator](./enumerator/)
## Metodi

| Metodo | Descrizione |
| --- | --- |
| [Add](./add/)(const System::String\&) | Aggiunge il valore alla fine dell'elenco. |
| [AddRange](./addrange/)(const ArrayPtr\<System::String\>\&) | Aggiungi elementi al contenitore. |
| [begin](./begin/)() | Restituisce un iteratore al primo elemento del contenitore. Se il contenitore è vuoto, l'iteratore restituito sarà uguale a [end()](./end/). |
| [begin](./begin/)() const | Restituisce un iteratore al primo elemento del contenitore qualificato come const. Se il contenitore è vuoto, l'iteratore restituito sarà uguale a [end()](./end/). |
| [cbegin](./cbegin/)() const | Restituisce un iteratore al primo elemento qualificato come const del contenitore. Se il contenitore è vuoto, l'iteratore restituito sarà uguale a [cend()](./cend/). |
| [cend](./cend/)() const | Restituisce un iteratore all'elemento successivo all'ultimo elemento del contenitore. Questo elemento funge da segnaposto; tentare di accedervi provoca un comportamento indefinito. |
| [Clear](./clear/)() | Elimina tutti gli elementi. |
| [Contains](./contains/)(const System::String\&) const | Verifica se una stringa specifica è presente nel contenitore. |
| [CopyTo](./copyto/)(const ArrayPtr\<System::String\>\&, const int32_t) const | Copia gli elementi in un array esistente. |
| [crbegin](./crbegin/)() const | Restituisce un iteratore inverso al primo elemento del contenitore invertito. Corrisponde all'ultimo elemento del contenitore non invertito. Se il contenitore è vuoto, l'iteratore restituito è uguale a [crend()](./crend/). |
| [crend](./crend/)() const | Restituisce un iteratore inverso all'elemento successivo all'ultimo elemento del contenitore invertito. Corrisponde all'elemento precedente al primo elemento del contenitore non invertito. Questo elemento funge da segnaposto; tentare di accedervi provoca un comportamento indefinito. |
| [data](./data/)() | Accessor interno alla struttura dati. |
| [data](./data/)() const | Accessor interno alla struttura dati. |
| [end](./end/)() | Restituisce un iteratore all'elemento successivo all'ultimo elemento del contenitore. Questo elemento funge da segnaposto; tentare di accedervi provoca un comportamento indefinito. |
| [end](./end/)() const | Restituisce un iteratore all'elemento successivo all'ultimo elemento del contenitore qualificato come const. Questo elemento funge da segnaposto; tentare di accedervi provoca un comportamento indefinito. |
| [get_Count](./get_count/)() const | Ottiene il numero di elementi nella collezione. |
| [GetEnumerator](./getenumerator/)() override | Ottiene l'enumeratore che itera attraverso la collezione corrente. |
| [idx_get](./idx_get/)(int) const | Ottiene il valore nella posizione specificata. |
| [idx_set](./idx_set/)(int, const System::String\&) | Imposta il valore nella posizione specificata. |
| [IndexOf](./indexof/)(const System::String\&) const | Cerca una stringa specifica nel contenitore. |
| [Insert](./insert/)(int, const System::String\&) | Inserisce un valore specifico nel contenitore. |
| [operator[]](./operator[]/)(int) | Funzione di accesso. |
| [rbegin](./rbegin/)() | Restituisce un iteratore inverso al primo elemento del contenitore invertito. Corrisponde all'ultimo elemento del contenitore non invertito. Se il contenitore è vuoto, l'iteratore restituito è uguale a [rend()](./rend/). |
| [rbegin](./rbegin/)() const | Restituisce un iteratore inverso al primo elemento del contenitore invertito. Corrisponde all'ultimo elemento del contenitore non invertito. Se il contenitore è vuoto, l'iteratore restituito è uguale a [rend()](./rend/). |
| [Remove](./remove/)(const System::String\&) | Rimuove la prima occorrenza della stringa specificata. |
| [RemoveAt](./removeat/)(int) | Rimuove l'elemento nella posizione specificata. |
| [rend](./rend/)() | Restituisce un iteratore inverso all'elemento successivo all'ultimo elemento del contenitore invertito. Corrisponde all'elemento precedente al primo elemento del contenitore non invertito. Questo elemento funge da segnaposto; tentare di accedervi provoca un comportamento indefinito. |
| [rend](./rend/)() const | Restituisce un iteratore inverso all'elemento successivo all'ultimo elemento del contenitore invertito. Corrisponde all'elemento precedente al primo elemento del contenitore non invertito. Questo elemento funge da segnaposto; tentare di accedervi provoca un comportamento indefinito. |
| [StringCollection](./stringcollection/)() | Crea una raccolta di stringhe vuota. |
| [virtualizeBeginConstIterator](./virtualizebeginconstiterator/)() const override | Ottiene l'implementazione dell'iteratore const begin per il contenitore corrente. |
| [virtualizeBeginIterator](./virtualizebeginiterator/)() override | Ottiene l'implementazione dell'iteratore begin per il contenitore corrente. |
| [virtualizeEndConstIterator](./virtualizeendconstiterator/)() const override | Ottiene l'implementazione dell'iteratore const end per il contenitore corrente. |
| [virtualizeEndIterator](./virtualizeenditerator/)() override | Ottiene l'implementazione dell'iteratore end per il contenitore corrente. |
## Typedefs

| Typedef | Descrizione |
| --- | --- |
| [const_iterator](./const_iterator/) | Tipo di iteratore const. |
| [const_reverse_iterator](./const_reverse_iterator/) | Tipo di iteratore inverso const. |
| [iterator](./iterator/) | Tipo di iteratore. |
| [reverse_iterator](./reverse_iterator/) | Tipo di iteratore inverso. |
## Vedi anche

* Class [IEnumerable](../../system.collections.generic/ienumerable/)
* Namespace [System::Collections::Specialized](../)
* Library [Aspose.Font for C++](../../)
