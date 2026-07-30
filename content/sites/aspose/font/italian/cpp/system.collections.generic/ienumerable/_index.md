---
title: "classe System::Collections::Generic::IEnumerable"
linktitle: "IEnumerable"
second_title: "Aspose.Font per C++"
description: "classe System::Collections::Generic::IEnumerable. Interfaccia di un oggetto che fornisce un enumeratore sugli elementi contenuti in C++."
type: docs
weight: 2200
url: /it/cpp/system.collections.generic/ienumerable/
---
## IEnumerable class


Interfaccia di un oggetto che fornisce un enumeratore sugli elementi contenuti.

```cpp
template<typename T>class IEnumerable : public virtual System::Object
```


| Parametro | Descrizione |
| --- | --- |
| T | Tipo di elemento. |
## Metodi

| Metodo | Descrizione |
| --- | --- |
| [begin](./begin/)() | Restituisce un iteratore che punta al primo elemento (se presente) della collezione. Questo iteratore non può essere usato per modificare un oggetto referenziato perché [GetEnumerator()](./getenumerator/) restituisce una copia dell'oggetto T. |
| [begin](./begin/)() const | Restituisce un iteratore che punta al primo elemento (se presente) dell'istanza qualificata come const della collezione. |
| [cbegin](./cbegin/)() const | Restituisce un iteratore che punta al primo elemento qualificato come const (se presente) della collezione. |
| [cend](./cend/)() const | Restituisce un iteratore che punta subito dopo l'ultimo elemento qualificato come const (se presente) della collezione. |
| [end](./end/)() | Restituisce un iteratore che punta subito dopo l'ultimo elemento (se presente) della collezione. Questo iteratore non può essere usato per modificare un oggetto referenziato perché [GetEnumerator()](./getenumerator/) restituisce una copia dell'oggetto T. |
| [end](./end/)() const | Restituisce un iteratore che punta subito dopo l'ultimo elemento (se presente) dell'istanza qualificata come const della collezione. |
| virtual [GetEnumerator](./getenumerator/)() | Ottiene l'enumeratore. |
| [LINQ_Aggregate](./linq_aggregate/)(const Func\<T, T, T\>\&) | Applica una funzione di accumulatore su una sequenza. |
| [LINQ_All](./linq_all/)(std::function\<bool(T)>) | Determina se tutti gli elementi di una sequenza soddisfano una condizione. |
| [LINQ_Any](./linq_any/)() | Determina se una sequenza contiene qualche elemento. |
| [LINQ_Any](./linq_any/)(std::function\<bool(T)>) | Determina se esiste qualche elemento di una sequenza o se soddisfa una condizione. |
| [LINQ_Cast](./linq_cast/)() | Esegue il cast degli elementi al tipo specificato. |
| [LINQ_Cast](./linq_cast/)() |  |
| [LINQ_Concat](./linq_concat/)(SharedPtr\<IEnumerable\<T\>\>) | Concatena due sequenze. |
| [LINQ_Contains](./linq_contains/)(T) | Determina se una sequenza contiene un valore specificato. |
| [LINQ_Count](./linq_count/)() | Restituisce il numero di elementi nella sequenza (calcolato tramite conteggio diretto). |
| [LINQ_Count](./linq_count/)(const Func\<T, bool\>\&) | Restituisce il numero di elementi nella sequenza che soddisfano la condizione specificata. |
| [LINQ_ElementAt](./linq_elementat/)(int) | Restituisce l'elemento a un indice specificato in una sequenza. |
| [LINQ_ElementAtOrDefault](./linq_elementatordefault/)(int) | Restituisce l'elemento a un indice specificato in una sequenza. |
| [LINQ_First](./linq_first/)() | Restituisce il primo elemento di una sequenza. |
| [LINQ_First](./linq_first/)(const Func\<T, bool\>\&) | Restituisce il primo elemento di una sequenza che soddisfa la condizione specificata. |
| [LINQ_FirstOrDefault](./linq_firstordefault/)() | Restituisce il primo elemento di una sequenza, o un valore predefinito se la sequenza è vuota. |
| [LINQ_FirstOrDefault](./linq_firstordefault/)(std::function\<bool(T)>) | Restituisce il primo elemento della sequenza che soddisfa una condizione o un valore predefinito se non viene trovato alcun elemento. |
| [LINQ_GroupBy](./linq_groupby/)(System::Func\<T, Key\>) | Raggruppa gli elementi di una sequenza. |
| [LINQ_GroupBy](./linq_groupby/)(System::Func\<T, Key\>, System::Func\<T, Element\>) | Raggruppa gli elementi di una sequenza. |
| [LINQ_GroupBy](./linq_groupby/)(System::Func\<Source, Key\>) |  |
| [LINQ_GroupBy](./linq_groupby/)(System::Func\<Source, Key\>, System::Func\<Source, Element\>) |  |
| [LINQ_Last](./linq_last/)() | Restituisce l'ultimo elemento di una sequenza. |
| [LINQ_LastOrDefault](./linq_lastordefault/)() | Restituisce l'ultimo elemento di una sequenza, o un valore predefinito se la sequenza è vuota. |
| [LINQ_Max](./linq_max/)(const Func\<T, ResultType\>\&) | Invoca una funzione di trasformazione su ogni elemento di una sequenza generica e restituisce il valore massimo risultante. |
| [LINQ_Max](./linq_max/)(const Func\<Source, ResultType\>\&) |  |
| [LINQ_Min](./linq_min/)(const Func\<T, ResultType\>\&) | Invoca una funzione di trasformazione su ogni elemento di una sequenza generica e restituisce il valore minimo risultante. |
| [LINQ_Min](./linq_min/)(const Func\<Source, ResultType\>\&) |  |
| [LINQ_OfType](./linq_oftype/)() | Filtra gli elementi della sequenza in base al tipo specificato. |
| [LINQ_OfType](./linq_oftype/)() |  |
| [LINQ_OrderBy](./linq_orderby/)(const Func\<T, Key\>\&) | Ordina gli elementi di una sequenza in ordine crescente secondo i valori chiave selezionati da keySelector. |
| [LINQ_OrderBy](./linq_orderby/)(const Func\<Source, Key\>\&) |  |
| [LINQ_OrderByDescending](./linq_orderbydescending/)(const Func\<T, Key\>\&) | Ordina gli elementi di una sequenza in ordine decrescente secondo i valori chiave selezionati da keySelector. |
| [LINQ_OrderByDescending](./linq_orderbydescending/)(const Func\<Source, Key\>\&) |  |
| [LINQ_Reverse](./linq_reverse/)() | Inverte l'ordine degli elementi in una sequenza. |
| [LINQ_Select](./linq_select/)(const Func\<T, ResultType\>\&) | Trasforma gli elementi di una sequenza. |
| [LINQ_Select](./linq_select/)(const Func\<T, int32_t, ResultType\>\&) | Trasforma ogni elemento di una sequenza in una nuova forma incorporando l'indice dell'elemento. |
| [LINQ_Select](./linq_select/)(const Func\<Source, Result\>\&) |  |
| [LINQ_Select](./linq_select/)(const Func\<Source, int32_t, Result\>\&) |  |
| [LINQ_SelectMany](./linq_selectmany/)(const Func\<T, SharedPtr\<IEnumerable\<ResultType\>\>\>\&) | Proietta ogni elemento di una sequenza e combina le sequenze risultanti in un'unica sequenza. |
| [LINQ_SelectMany](./linq_selectmany/)(const Func\<Source, SharedPtr\<IEnumerable\<Result\>\>\>\&) |  |
| [LINQ_Take](./linq_take/)(int32_t) | Restituisce un numero specificato di elementi contigui dall'inizio di una sequenza. |
| [LINQ_ToArray](./linq_toarray/)() | Crea un array da una sequenza. |
| [LINQ_ToList](./linq_tolist/)() | Crea un [List<T>](../list/) da una sequenza. |
| [LINQ_Where](./linq_where/)(std::function\<bool(T)>) | Filtra una sequenza in base al predicato specificato. |
| virtual [virtualizeBeginConstIterator](./virtualizebeginconstiterator/)() const | Ottiene l'implementazione dell'iteratore const begin per il contenitore corrente. |
| virtual [virtualizeBeginIterator](./virtualizebeginiterator/)() | Ottiene l'implementazione dell'iteratore begin per il contenitore corrente. |
| virtual [virtualizeEndConstIterator](./virtualizeendconstiterator/)() const | Ottiene l'implementazione dell'iteratore const end per il contenitore corrente. |
| virtual [virtualizeEndIterator](./virtualizeenditerator/)() | Ottiene l'implementazione dell'iteratore end per il contenitore corrente. |
## Typedefs

| Typedef | Descrizione |
| --- | --- |
| [const_iterator](./const_iterator/) | Tipo di iteratore const. |
| [IEnumeratorType](./ienumeratortype/) | Informazioni RTTI. |
| [iterator](./iterator/) | Tipo di iteratore. |
| [ValueType](./valuetype/) |  |
| [virtualized_iterator](./virtualized_iterator/) | Tipo base dell'iteratore interno. |
| [virtualized_iterator_element](./virtualized_iterator_element/) | Tipo di elemento dell'iteratore interno. |

## Vedi anche

* Class [Object](../../system/object/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Font for C++](../../)
