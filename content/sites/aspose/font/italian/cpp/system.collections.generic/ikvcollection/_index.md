---
title: "classe System::Collections::Generic::IKVCollection"
linktitle: "IKVCollection"
second_title: "Aspose.Font per C++"
description: "classe System::Collections::Generic::IKVCollection. Interfaccia di un contenitore che contiene chiavi o valori del contenitore simile a un dizionario. Gli oggetti di questa classe devono essere allocati solo usando la funzione System::MakeObject(). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fallimenti di asserzione. Avvolgere sempre questa classe in un puntatore System::SmartPtr e utilizzare tale puntatore per passarlo alle funzioni come argomento in C++."
type: docs
weight: 2500
url: /it/cpp/system.collections.generic/ikvcollection/
---
## IKVCollection class


Interfaccia di un contenitore che contiene chiavi o valori del contenitore simile a un dizionario. Gli oggetti di questa classe devono essere allocati solo usando la funzione [System::MakeObject()](../../system/makeobject/). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fallimenti di asserzione. Avvolgere sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e utilizzare tale puntatore per passarlo alle funzioni come argomento.

```cpp
template<typename T>class IKVCollection : public System::Collections::Generic::IList<T>
```


| Parametro | Descrizione |
| --- | --- |
| T | [KeyValuePair](../keyvaluepair/) tipo. |
## Metodi

| Metodo | Descrizione |
| --- | --- |
| [Add](./add/)(const T\&) override | Aggiunge un elemento al contenitore. |
| [Clear](./clear/)() override | Elimina tutti gli elementi dal contenitore. |
| [Contains](./contains/)(const T\&) const override | Verifica se l'elemento è presente nel contenitore. |
| virtual [get_Count](./get_count/)() const | Restituisce il numero di elementi nel contenitore. |
| [get_IsReadOnly](./get_isreadonly/)() const override | Verifica se il contenitore è di sola lettura. |
| virtual [GetEnumerator](./getenumerator/)() | Informazioni RTTI. |
| virtual [idx_get](./idx_get/)(int) const | Funzione getter. |
| [idx_set](./idx_set/)(int, T) override | Funzione setter. |
| [IndexOf](./indexof/)(const T\&) const override | Restituisce l'indice dell'elemento nel contenitore. |
| [Insert](./insert/)(int, const T\&) override | Inserisce l'elemento nella posizione specificata. |
| [Remove](./remove/)(const T\&) override | Rimuove l'elemento dal contenitore. |
| [RemoveAt](./removeat/)(int) override | Rimuove l'elemento alla posizione specificata. |

## Vedi anche

* Class [IList](../ilist/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Font for C++](../../)
