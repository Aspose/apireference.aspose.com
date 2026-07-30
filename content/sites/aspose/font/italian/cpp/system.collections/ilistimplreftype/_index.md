---
title: "classe System::Collections::IListImplRefType"
linktitle: "IListImplRefType"
second_title: "Aspose.Font per C++"
description: "classe System::Collections::IListImplRefType. Stub che implementa l'interfaccia System::Collections::IList su un oggetto System::Collections::Generic::List. Implementazione per tipi di riferimento in C++."
type: docs
weight: 1100
url: /it/cpp/system.collections/ilistimplreftype/
---
## IListImplRefType class


Stub che implementa l'interfaccia [System::Collections::IList](../ilist/) su un oggetto [System::Collections::Generic::List](../../system.collections.generic/list/). Implementazione per tipi di riferimento.

```cpp
template<typename T>class IListImplRefType : public virtual System::Collections::IList
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [Add](./add/)(SharedPtr\<System::Object\>) override | Aggiunge un elemento alla fine della lista. |
| static [BoxValue](./boxvalue/)(System::SharedPtr\<T\>) | Conversione del riferimento di tipo in valore oggetto in oggetto. |
| [Clear](./clear/)() override | Elimina tutti gli elementi. |
| [Contains](./contains/)(SharedPtr\<System::Object\>) const override | Verifica se l'elemento è presente nell'elenco. |
| [get_Count](./get_count/)() const override | [ICollection.get_Count()](../icollection/get_count/) implementazione dei metodi Restituisce il numero di elementi nella collezione. |
| [GetEnumerator](./getenumerator/)() override | [IEnumerable.GetEnumerator()](../ienumerable/getenumerator/) implementazione Restituisce un enumeratore che itera attraverso una collezione. |
| [idx_get](./idx_get/)(int, int) const override | Restituisce l'elemento all'indice specificato. |
| [IListImplRefType](./ilistimplreftype/)(System::SharedPtr\<System::Collections::Generic::List\<System::SharedPtr\<T\>\>\>) | Crea una nuova istanza di oggetto. |
| [IndexOf](./indexof/)(System::SharedPtr\<System::Object\>) const override | Restituisce l'indice della prima occorrenza dell'elemento nel contenitore. |
| [Insert](./insert/)(int, System::SharedPtr\<System::Object\>) override | Inserisce l'elemento nella posizione specificata, spostando gli altri elementi. |
| [Remove](./remove/)(SharedPtr\<System::Object\>) override | Rimuove la prima istanza dell'elemento specifico dall'elenco. |
| [RemoveAt](./removeat/)(int) override | Rimuove l'elemento alla posizione specificata. |
| static [UnboxValue](./unboxvalue/)(System::SharedPtr\<System::Object\>) | Conversione del valore oggetto in un riferimento di tipo particolare. |
## Vedi anche

* Class [IList](../ilist/)
* Namespace [System::Collections](../)
* Library [Aspose.Font for C++](../../)
