---
title: "Classe System::Collections::ObjectModel::ReadOnlyCollection"
linktitle: "ReadOnlyCollection"
second_title: "Aspose.Font per C++"
description: "Classe System::Collections::ObjectModel::ReadOnlyCollection. Avvolge un contenitore specifico per accedervi in modalità sola lettura. Gli oggetti di questa classe devono essere allocati solo usando la funzione System::MakeObject(). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgi sempre questa classe in un puntatore System::SmartPtr e usa questo puntatore per passarlo alle funzioni come argomento in C++."
type: docs
weight: 300
url: /it/cpp/system.collections.objectmodel/readonlycollection/
---
## ReadOnlyCollection class


Avvolge un contenitore specifico per accedervi in modalità sola lettura. Gli oggetti di questa classe devono essere allocati solo usando la funzione [System::MakeObject()](../../system/makeobject/). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgi sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e usa questo puntatore per passarlo alle funzioni come argomento.

```cpp
template<typename T>class ReadOnlyCollection : public virtual System::Object,
                                               public System::Collections::Generic::IList<T>
```


| Parametro | Descrizione |
| --- | --- |
| T | Tipo di elemento. |
## Metodi

| Metodo | Descrizione |
| --- | --- |
| [Contains](./contains/)(const T\&) const override | Verifica se il contenitore contiene un elemento specifico. |
| [CopyTo](./copyto/)(System::ArrayPtr\<T\>, int) override | Copia gli elementi del contenitore in elementi di un array esistente. |
| [get_Count](./get_count/)() const override | Ottiene il conteggio degli elementi del contenitore. |
| [get_IsReadOnly](./get_isreadonly/)() const override | Verifica se la collezione è di sola lettura. |
| [GetEnumerator](./getenumerator/)() override | Ottiene l'enumeratore della collezione. |
| [idx_get](./idx_get/)(int) const override | Ottiene l'elemento in una posizione specifica. |
| [IndexOf](./indexof/)(const T\&) const override | Cerca un elemento specifico nella collezione. |
| [ReadOnlyCollection](./readonlycollection/)(const SharedPtr\<Generic::IList\<T\>\>\&) | Avvolge una collezione di sola lettura attorno a una collezione specifica. |
| [SetTemplateWeakPtr](./settemplateweakptr/)(uint32_t) override | Non fa nulla poiché la collezione di sola lettura avvolge solo i dati e non memorizza nulla. |
| [virtualizeBeginConstIterator](./virtualizebeginconstiterator/)() const override | Ottiene l'implementazione dell'iteratore const begin per il contenitore corrente. |
| [virtualizeBeginIterator](./virtualizebeginiterator/)() override | Ottiene l'implementazione dell'iteratore begin per il contenitore corrente. |
| [virtualizeEndConstIterator](./virtualizeendconstiterator/)() const override | Ottiene l'implementazione dell'iteratore const end per il contenitore corrente. |
| [virtualizeEndIterator](./virtualizeenditerator/)() override | Ottiene l'implementazione dell'iteratore end per il contenitore corrente. |
## Typedefs

| Typedef | Descrizione |
| --- | --- |
| [BaseType](./basetype/) | Interfaccia implementata. |
| [IEnumeratorPtr](./ienumeratorptr/) | Contenitore di elementi identici. |
| [ValueType](./valuetype/) | Tipo valore. |

## Vedi anche

* Class [Object](../../system/object/)
* Class [IList](../../system.collections.generic/ilist/)
* Namespace [System::Collections::ObjectModel](../)
* Library [Aspose.Font for C++](../../)
