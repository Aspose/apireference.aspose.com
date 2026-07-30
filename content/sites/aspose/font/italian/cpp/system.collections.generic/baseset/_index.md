---
title: "classe System::Collections::Generic::BaseSet"
linktitle: "BaseSet"
second_title: "Aspose.Font per C++"
description: "Come utilizzare la classe System::Collections::Generic::BaseSet in C++."
type: docs
weight: 800
url: /it/cpp/system.collections.generic/baseset/
---
## BaseSet class




```cpp
template<typename T,typename SET_T>class BaseSet : public virtual System::Object,
                                                   public System::Collections::Generic::ICollection<T>
```

## Nested classes

* Class [Enumerator](./enumerator/)
## Metodi

| Metodo | Descrizione |
| --- | --- |
| [_add_range](./_add_range/)(std::initializer_list\<T\>) | Specifico per C++. |
| [Add](./add/)(const T\&) override | Aggiunge un elemento al set. |
| [begin](./begin/)() const | Ottiene l'iteratore al primo elemento della collezione qualificata come const. |
| [cbegin](./cbegin/)() const | Ottiene l'iteratore al primo elemento qualificato come const della collezione. |
| [cend](./cend/)() const | Ottiene l'iteratore per un elemento qualificato const inesistente oltre la fine della collezione. |
| [Clear](./clear/)() override | Elimina tutti gli elementi nel set. |
| [Contains](./contains/)(const T\&) const override | Verifica se l'elemento è presente nel set. |
| [CopyTo](./copyto/)(ArrayPtr\<T\>, int) override | Copia il contenuto dell'hash negli elementi esistenti dell'array. |
| [data](./data/)() | Accessor della struttura dati sottostante. |
| [data](./data/)() const | Accessor della struttura dati sottostante. |
| [end](./end/)() const | Ottiene l'iteratore per un elemento inesistente oltre la fine della collezione qualificata come const. |
| [get_Count](./get_count/)() const override | Ottiene il numero di elementi nel set. |
| [GetEnumerator](./getenumerator/)() override | Crea enumeratore. |
| [Remove](./remove/)(const T\&) override | Rimuove l'elemento dal set. |
| [TryAdd](./tryadd/)(const T\&) | Aggiunge un elemento al set. |
| [virtualizeBeginConstIterator](./virtualizebeginconstiterator/)() const override | Ottiene l'implementazione dell'iteratore const begin per il contenitore corrente. |
| [virtualizeBeginIterator](./virtualizebeginiterator/)() override | Ottiene l'implementazione dell'iteratore begin per il contenitore corrente. |
| [virtualizeEndConstIterator](./virtualizeendconstiterator/)() const override | Ottiene l'implementazione dell'iteratore const end per il contenitore corrente. |
| [virtualizeEndIterator](./virtualizeenditerator/)() override | Ottiene l'implementazione dell'iteratore end per il contenitore corrente. |
## Typedefs

| Typedef | Descrizione |
| --- | --- |
| [BaseType](./basetype/) | Interfaccia implementata. |
| [const_iterator](./const_iterator/) | Tipo di iteratore const. |
| [IEnumerablePtr](./ienumerableptr/) | Puntatore all'interfaccia Enumerable. |
| [IEnumeratorPtr](./ienumeratorptr/) | Puntatore [Enumerator](./enumerator/). |
| [iterator](./iterator/) | Tipo di iteratore. |
| [set_t](./set_t/) | Tipo di dato sottostante. |
| [ThisPtr](./thisptr/) | Tipo puntatore. |
| [ThisType](./thistype/) | Tipo self. |
| [ValueType](./valuetype/) | Tipo valore. |
## Vedi anche

* Class [Object](../../system/object/)
* Class [ICollection](../icollection/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Font for C++](../../)
