---
title: "Classe System::Array"
linktitle: "Array"
second_title: "Aspose.Font per C++"
description: "Classe System::Array. Classe che rappresenta una struttura dati array. Gli oggetti di questa classe devono essere allocati solo usando le funzioni System::MakeArray() e System::MakeObject(). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fallimenti di asserzione. Avvolgi sempre questa classe in un puntatore System::SmartPtr e usa questo puntatore per passarlo alle funzioni come argomento in C++."
type: docs
weight: 200
url: /it/cpp/system/array/
---
## Array class


Classe che rappresenta una struttura dati array. Gli oggetti di questa classe devono essere allocati solo usando le funzioni [System::MakeArray()](../makearray/) e [System::MakeObject()](../makeobject/). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fallimenti di asserzione. Avvolgi sempre questa classe in un puntatore [System::SmartPtr](../smartptr/) e usa questo puntatore per passarlo alle funzioni come argomento.

```cpp
template<typename T>class Array : public virtual System::Object,
                                  public System::Collections::Generic::IList<T>
```


| Parametro | Descrizione |
| --- | --- |
| T | Tipo degli elementi di un array |
## Nested classes

* Class [Enumerator](./enumerator/)
## Metodi

| Metodo | Descrizione |
| --- | --- |
| [Add](./add/)(const T\&) override | Non supportato perché l'array rappresentato dall'oggetto corrente è di sola lettura. |
| [Array](./array/)() | Costruisce un array vuoto. |
| [Array](./array/)(int, const T\&) | Costruttore di riempimento. |
| [Array](./array/)(typename std::enable_if\<std::is_arithmetic\<T\>::value\&&std::is_arithmetic\<ValueType\>::value\&&std::is_convertible\<ValueType, T\>::value, int\>::type, ValueType) | Costruttore di riempimento. |
| [Array](./array/)(int, const T) | Costruttore di riempimento. |
| [Array](./array/)(vector_t\&&) | Costruttore di spostamento. |
| [Array](./array/)(const vector_t\&) | Costruttore di copia. |
| [Array](./array/)(const std::vector\<Q\>\&) | Costruisce un oggetto [Array](./) e lo riempie con valori copiati da un oggetto std::vector il cui tipo di valori è lo stesso di **T** ma diverso da **[UnderlyingType](./underlyingtype/)**. |
| [Array](./array/)(std::vector\<Q\>\&&) | Costruisce un oggetto [Array](./) e lo riempie con valori spostati da un oggetto std::vector il cui tipo di valori è lo stesso di **T** ma diverso da **[UnderlyingType](./underlyingtype/)**. |
| [Array](./array/)(std::initializer_list\<UnderlyingType\>) | Costruisce un oggetto [Array](./) e lo riempie con valori dalla lista di inizializzazione specificata contenente elementi di tipo **[UnderlyingType](./underlyingtype/)**. |
| [Array](./array/)(const std::array\<UnderlyingType, InitArraySize\>\&) | Costruisce un oggetto [Array](./) e lo riempie con valori dall'array specificato contenente elementi di tipo **[UnderlyingType](./underlyingtype/)**. |
| [Array](./array/)(std::initializer_list\<bool\>, int) | Costruisce un oggetto [Array](./) e lo riempie con valori dalla lista di inizializzazione specificata contenente elementi di tipo bool. |
| [begin](./begin/)() | Restituisce un iteratore al primo elemento del contenitore. Se il contenitore è vuoto, l'iteratore restituito sarà uguale a [end()](./end/). |
| [begin](./begin/)() const | Restituisce un iteratore al primo elemento del contenitore qualificato come const. Se il contenitore è vuoto, l'iteratore restituito sarà uguale a [end()](./end/). |
| static [BinarySearch](./binarysearch/)(System::ArrayPtr\<T\>, const T\&) | Esegue una ricerca binaria nell'array ordinato. |
| static [BinarySearch](./binarysearch/)(System::ArrayPtr\<T\>, const Y\&, const SharedPtr\<Collections::Generic::IComparer\<Z\>\>\&) | NON IMPLEMENTATO. |
| [cbegin](./cbegin/)() const | Restituisce un iteratore al primo elemento qualificato come const del contenitore. Se il contenitore è vuoto, l'iteratore restituito sarà uguale a [cend()](./cend/). |
| [cend](./cend/)() const | Restituisce un iteratore all'elemento successivo all'ultimo elemento del contenitore. Questo elemento funge da segnaposto; tentare di accedervi provoca un comportamento indefinito. |
| [Clear](./clear/)() override | Non supportato perché l'array rappresentato dall'oggetto corrente è di sola lettura. |
| static [Clear](./clear/)(const ArrayPtr\<Type\>\&, int, int) | Sostituisce i valori **count** a partire dall'indice **startIndex** nell'array specificato con i valori predefiniti. |
| [Clone](./clone/)() | Clona l'array. |
| static [ConstrainedCopy](./constrainedcopy/)(const ArrayPtr\<SrcType\>\&, int64_t, const ArrayPtr\<DstType\>\&, int64_t, int64_t) | Copia un intervallo di elementi da un [System.Array](./) a partire dalla sorgente specificata. |
| [Contains](./contains/)(const T\&) const override | Determina se l'elemento specificato è presente nell'array. |
| static [ConvertAll](./convertall/)(ArrayPtr\<InputType\>, Converter\<InputType, OutputType\>) | Costruisce un nuovo oggetto [Array](./) e lo riempie con gli elementi dell'array specificato convertiti al tipo **OutputType** utilizzando il delegato convertitore specificato. |
| static [ConvertAll](./convertall/)(ArrayPtr\<InputType\>, std::function\<OutputType(InputType)>) | Costruisce un nuovo oggetto [Array](./) e lo riempie con gli elementi dell'array specificato convertiti al tipo **OutputType** utilizzando l'oggetto funzione convertitore specificato. |
| static [Copy](./copy/)(const ArrayPtr\<SrcType\>\&, const ArrayPtr\<DstType\>\&, int64_t) | Copia il numero specificato di elementi dall'array di origine all'array di destinazione. |
| static [Copy](./copy/)(System::Details::ArrayView\<SrcType\>, const ArrayPtr\<DstType\>\&, int64_t) | Copia il numero specificato di elementi dalla vista dell'array di origine all'array di destinazione. |
| static [Copy](./copy/)(const ArrayPtr\<SrcType\>\&, System::Details::ArrayView\<DstType\>, int64_t) | Copia il numero specificato di elementi dall'array di origine alla vista dell'array di destinazione. |
| static [Copy](./copy/)(System::Details::ArrayView\<SrcType\>, System::Details::ArrayView\<DstType\>, int64_t) | Copia il numero specificato di elementi dalla vista dell'array di origine alla vista dell'array di destinazione. |
| static [Copy](./copy/)(System::Details::StackArray\<SrcType, N\>\&, const ArrayPtr\<DstType\>\&, int64_t) | Copia il numero specificato di elementi dall'array di origine nello stack all'array di destinazione. |
| static [Copy](./copy/)(const ArrayPtr\<SrcType\>\&, System::Details::StackArray\<DstType, N\>\&, int64_t) | Copia il numero specificato di elementi dall'array di origine all'array di destinazione nello stack. |
| static [Copy](./copy/)(System::Details::StackArray\<SrcType, NS\>\&, System::Details::StackArray\<DstType, ND\>\&, int64_t) | Copia il numero specificato di elementi dall'array di origine nello stack all'array di destinazione nello stack. |
| static [Copy](./copy/)(const ArrayPtr\<SrcType\>\&, int64_t, const ArrayPtr\<DstType\>\&, int64_t, int64_t) | Copia un numero specificato di elementi dall'array di origine a partire dall'indice specificato alla posizione specificata nell'array di destinazione. |
| static [Copy](./copy/)(System::Details::ArrayView\<SrcType\>, int64_t, const ArrayPtr\<DstType\>\&, int64_t, int64_t) | Copia un numero specificato di elementi dalla vista dell'array di origine a partire dall'indice specificato alla posizione specificata nell'array di destinazione. |
| static [Copy](./copy/)(const ArrayPtr\<SrcType\>\&, int64_t, System::Details::ArrayView\<DstType\>, int64_t, int64_t) | Copia un numero specificato di elementi dall'array di origine a partire dall'indice specificato alla posizione specificata nella vista dell'array di destinazione. |
| static [Copy](./copy/)(System::Details::ArrayView\<SrcType\>, int64_t, System::Details::ArrayView\<DstType\>, int64_t, int64_t) | Copia un numero specificato di elementi dalla vista dell'array di origine a partire dall'indice specificato alla posizione specificata nella vista dell'array di destinazione. |
| static [Copy](./copy/)(System::Details::StackArray\<SrcType, N\>\&, int64_t, const ArrayPtr\<DstType\>\&, int64_t, int64_t) | Copia un numero specificato di elementi dall'array di origine nello stack a partire dall'indice specificato alla posizione specificata nell'array di destinazione. |
| static [Copy](./copy/)(const ArrayPtr\<SrcType\>\&, int64_t, System::Details::StackArray\<DstType, N\>\&, int64_t, int64_t) | Copia un numero specificato di elementi dall'array di origine a partire dall'indice specificato alla posizione specificata nell'array di destinazione nello stack. |
| static [Copy](./copy/)(System::Details::StackArray\<SrcType, NS\>\&, int64_t, System::Details::StackArray\<DstType, ND\>\&, int64_t, int64_t) | Copia un numero specificato di elementi dall'array di origine nello stack a partire dall'indice specificato alla posizione specificata nell'array di destinazione nello stack. |
| static [Copy](./copy/)(System::Details::ArrayView\<SrcType\>\&, int64_t, System::Details::StackArray\<DstType, ND\>\&, int64_t, int64_t) | Copia un numero specificato di elementi dalla vista dell'array di origine a partire dall'indice specificato alla posizione specificata nell'array di destinazione nello stack. |
| [CopyTo](./copyto/)(ArrayPtr\<T\>, int) override | Copia tutti gli elementi dell'array corrente nell'array di destinazione specificato. Gli elementi vengono inseriti nell'array di destinazione a partire dall'indice specificato dall'argomento arrayIndex. |
| [CopyTo](./copyto/)(const ArrayPtr\<DstType\>\&, int64_t) const | Copia tutti gli elementi dell'array corrente nell'array di destinazione specificato. Gli elementi vengono inseriti nell'array di destinazione a partire dall'indice specificato dall'argomento dstIndex. |
| [CopyTo](./copyto/)(const System::Details::ArrayView\<DstType\>\&, int64_t) const | Copia tutti gli elementi dell'array corrente nella vista dell'array di destinazione specificata. Gli elementi vengono inseriti nella vista dell'array di destinazione a partire dall'indice specificato dall'argomento dstIndex. |
| [CopyTo](./copyto/)(const ArrayPtr\<DstType\>\&, int64_t, int64_t, int64_t) const | Copia un numero specificato di elementi dall'array corrente a partire dalla posizione specificata verso l'array di destinazione specificato. Gli elementi vengono inseriti nell'array di destinazione a partire dall'indice specificato dall'argomento dstIndex. |
| [CopyTo](./copyto/)(const System::Details::ArrayView\<DstType\>\&, int64_t, int64_t, int64_t) const | Copia un numero specificato di elementi dall'array corrente a partire da una posizione specificata nella vista dell'array di destinazione. Gli elementi vengono inseriti nella vista dell'array di destinazione a partire dall'indice specificato dall'argomento dstIndex. |
| [Count](./count/)() const | Restituisce un numero che rappresenta il numero totale di tutti gli elementi in tutte le dimensioni dell'array. |
| [crbegin](./crbegin/)() const | Restituisce un iteratore inverso al primo elemento del contenitore invertito. Corrisponde all'ultimo elemento del contenitore non invertito. Se il contenitore è vuoto, l'iteratore restituito è uguale a [crend()](./crend/). |
| [crend](./crend/)() const | Restituisce un iteratore inverso all'elemento successivo all'ultimo elemento del contenitore invertito. Corrisponde all'elemento precedente al primo elemento del contenitore non invertito. Questo elemento funge da segnaposto; tentare di accedervi provoca un comportamento indefinito. |
| [data](./data/)() | Restituisce un riferimento alla struttura dati interna utilizzata per memorizzare gli elementi dell'array. |
| [data](./data/)() const | Restituisce un riferimento costante alla struttura dati interna utilizzata per memorizzare gli elementi dell'array. |
| [data_ptr](./data_ptr/)() | Restituisce un puntatore grezzo all'inizio del buffer di memoria dove sono memorizzati gli elementi dell'array. |
| [data_ptr](./data_ptr/)() const | Restituisce un puntatore grezzo costante all'inizio del buffer di memoria dove sono memorizzati gli elementi dell'array. |
| [end](./end/)() | Restituisce un iteratore all'elemento successivo all'ultimo elemento del contenitore. Questo elemento funge da segnaposto; tentare di accedervi provoca un comportamento indefinito. |
| [end](./end/)() const | Restituisce un iteratore all'elemento successivo all'ultimo elemento del contenitore qualificato come const. Questo elemento funge da segnaposto; tentare di accedervi provoca un comportamento indefinito. |
| static [Exists](./exists/)(ArrayPtr\<T\>, std::function\<bool(T)>) | Determina se l'oggetto [Array](./) specificato contiene un elemento che soddisfa i requisiti del predicato specificato. |
| static [Find](./find/)(System::ArrayPtr\<T\>, System::Predicate\<T\>) | Cerca il primo elemento nell'array specificato che soddisfa le condizioni del predicato specificato. |
| static [FindAll](./findall/)(System::ArrayPtr\<T\>, System::Predicate\<T\>) | Recupera tutti gli elementi che corrispondono alle condizioni definite dal predicato specificato. |
| static [FindIndex](./findindex/)(System::ArrayPtr\<T\>, System::Predicate\<T\>) | Cerca il primo elemento nell'array specificato che soddisfa le condizioni del predicato specificato. |
| static [ForEach](./foreach/)(const ArrayPtr\<T\>\&, System::Action\<T\>) | Esegue l'azione specificata su ogni elemento dell'array specificato. |
| [get_Count](./get_count/)() const override | Restituisce la dimensione dell'array. |
| [get_IsReadOnly](./get_isreadonly/)() const override | Indica se l'array è di sola lettura. |
| [get_Length](./get_length/)() const | Restituisce un intero a 32 bit che rappresenta il numero totale di tutti gli elementi in tutte le dimensioni dell'array. |
| [get_LongLength](./get_longlength/)() const | Restituisce un intero a 64 bit che rappresenta il numero totale di tutti gli elementi in tutte le dimensioni dell'array. |
| [get_Rank](./get_rank/)() const | NON IMPLEMENTATO. |
| [GetEnumerator](./getenumerator/)() override | Restituisce un puntatore all'oggetto [Enumerator](./enumerator/) che fornisce l'interfaccia IEnumerator agli elementi dell'array rappresentato dall'oggetto corrente. |
| [GetLength](./getlength/)(int) | Restituisce il numero di elementi nella dimensione specificata. |
| [GetLongLength](./getlonglength/)(int) | Restituisce il numero di elementi nella dimensione specificata come intero a 64 bit. |
| [GetLowerBound](./getlowerbound/)(int) const | Restituisce il limite inferiore della dimensione specificata. |
| [GetSizeTLength](./getsizetlength/)() const | Restituisce una variabile std::size_t che rappresenta il numero totale di tutti gli elementi in tutte le dimensioni dell'array. |
| [GetUpperBound](./getupperbound/)(int) | Restituisce il limite superiore della dimensione specificata. |
| [idx_get](./idx_get/)(int) const override | Restituisce l'elemento all'indice specificato. |
| [idx_set](./idx_set/)(int, T) override | Imposta il valore specificato come elemento dell'array all'indice specificato. |
| [IndexOf](./indexof/)(const T\&) const override | Determina l'indice della prima occorrenza dell'elemento specificato nell'array. |
| static [IndexOf](./indexof/)(const ArrayPtr\<ArrayType\>\&, const ValueType\&) | Determina l'indice della prima occorrenza dell'elemento specificato nell'array. |
| static [IndexOf](./indexof/)(const ArrayPtr\<ArrayType\>\&, const ValueType\&, int) | Determina l'indice della prima occorrenza dell'elemento specificato nell'array a partire dall'indice specificato. |
| static [IndexOf](./indexof/)(const ArrayPtr\<ArrayType\>\&, const ValueType\&, int, int) | Determina l'indice della prima occorrenza dell'elemento specificato in un intervallo di elementi dell'array specificato dall'indice di partenza e dal numero di elementi nell'intervallo. |
| [Init](./init/)(const T) | Riempie l'array rappresentato dall'oggetto corrente con i valori dell'array specificato. |
| [Initialize](./initialize/)() | Riempie l'array con gli oggetti costruiti di default del tipo **T**. |
| [Insert](./insert/)(int, const T\&) override | Non supportato perché l'array rappresentato dall'oggetto corrente è di sola lettura. |
| static [LastIndexOf](./lastindexof/)(const ArrayPtr\<ArrayType\>\&, const ValueType\&, int, int) | Determina l'indice dell'ultima occorrenza dell'elemento specificato in un intervallo di elementi dell'array specificato dall'indice di partenza e dal numero di elementi nell'intervallo. |
| static [LastIndexOf](./lastindexof/)(const ArrayPtr\<ArrayType\>\&, const ValueType\&, int) | Determina l'indice dell'ultima occorrenza dell'elemento specificato nell'array a partire dall'indice specificato. |
| static [LastIndexOf](./lastindexof/)(const ArrayPtr\<ArrayType\>\&, const ValueType\&) | Determina l'indice dell'ultima occorrenza dell'elemento specificato nell'array. |
| [Max](./max/)() const | Trova l'elemento più grande nell'array usando [operator<()](../operator_/) per confrontare gli elementi. |
| [Min](./min/)() const | Trova l'elemento più piccolo nell'array usando [operator<()](../operator_/) per confrontare gli elementi. |
| [operator[]](./operator[]/)(int) | Restituisce un elemento all'indice specificato. |
| [operator[]](./operator[]/)(int) const | Restituisce un elemento all'indice specificato. |
| [rbegin](./rbegin/)() | Restituisce un iteratore inverso al primo elemento del contenitore invertito. Corrisponde all'ultimo elemento del contenitore non invertito. Se il contenitore è vuoto, l'iteratore restituito è uguale a [rend()](./rend/). |
| [rbegin](./rbegin/)() const | Restituisce un iteratore inverso al primo elemento del contenitore invertito. Corrisponde all'ultimo elemento del contenitore non invertito. Se il contenitore è vuoto, l'iteratore restituito è uguale a [rend()](./rend/). |
| [Remove](./remove/)(const T\&) override | Non supportato perché l'array rappresentato dall'oggetto corrente è di sola lettura. |
| [RemoveAt](./removeat/)(int) override | Non supportato perché l'array rappresentato dall'oggetto corrente è di sola lettura. |
| [rend](./rend/)() | Restituisce un iteratore inverso all'elemento successivo all'ultimo elemento del contenitore invertito. Corrisponde all'elemento precedente al primo elemento del contenitore non invertito. Questo elemento funge da segnaposto; tentare di accedervi provoca un comportamento indefinito. |
| [rend](./rend/)() const | Restituisce un iteratore inverso all'elemento successivo all'ultimo elemento del contenitore invertito. Corrisponde all'elemento precedente al primo elemento del contenitore non invertito. Questo elemento funge da segnaposto; tentare di accedervi provoca un comportamento indefinito. |
| static [Resize](./resize/)(ArrayPtr\<Type\>\&, int) | Cambia la dimensione dell'array specificato al valore specificato o crea un nuovo array con la dimensione specificata. |
| static [Reverse](./reverse/)(const ArrayPtr\<Type\>\&) | Inverte gli elementi nell'array specificato. |
| static [Reverse](./reverse/)(const ArrayPtr\<Type\>\&, int, int) | Inverte un intervallo di elementi nell'array specificato. |
| [SetTemplateWeakPtr](./settemplateweakptr/)(uint32_t) override | Fa sì che l'array tratti i puntatori memorizzati come deboli (se applicabile). |
| [SetValue](./setvalue/)(const T\&, int) | Imposta il valore dell'elemento all'indice specificato. |
| static [Sort](./sort/)(const ArrayPtr\<Type\>\&) | Ordina gli elementi nell'array specificato usando il comparatore predefinito. |
| static [Sort](./sort/)(const ArrayPtr\<Type\>\&, int, int) | Ordina un intervallo di elementi nell'array specificato usando il comparatore predefinito. |
| static [Sort](./sort/)(const ArrayPtr\<Type\>\&, const SharedPtr\<System::Collections::Generic::IComparer\<T\>\>\&) | Ordina gli elementi nell'array specificato usando il comparatore specificato. |
| static [Sort](./sort/)(const ArrayPtr\<Type\>\&, const SharedPtr\<System::Collections::Generic::IComparer\<Y\>\>\&) | NON IMPLEMENTATO. |
| static [Sort](./sort/)(const ArrayPtr\<TKey\>\&, const ArrayPtr\<TValue\>\&) | Ordina due array, uno contenente le chiavi e l'altro gli elementi corrispondenti, in base ai valori dell'array contenente le chiavi, i cui elementi sono confrontati usando operator<. |
| static [Sort](./sort/)(const ArrayPtr\<TKey\>\&, const ArrayPtr\<TValue\>\&, int, int) | Ordina due array, uno contenente le chiavi e l'altro gli elementi corrispondenti, in base ai valori dell'array contenente le chiavi, i cui elementi sono confrontati usando il comparatore predefinito. |
| static [TrueForAll](./trueforall/)(System::ArrayPtr\<T\>, System::Predicate\<T\>) | Determina se tutti gli elementi nell'array specificato soddisfano le condizioni definite dal predicato specificato. |
| [virtualizeBeginConstIterator](./virtualizebeginconstiterator/)() const override | Ottiene l'implementazione dell'iteratore const begin per il contenitore corrente. |
| [virtualizeBeginIterator](./virtualizebeginiterator/)() override | Ottiene l'implementazione dell'iteratore begin per il contenitore corrente. |
| [virtualizeEndConstIterator](./virtualizeendconstiterator/)() const override | Ottiene l'implementazione dell'iteratore const end per il contenitore corrente. |
| [virtualizeEndIterator](./virtualizeenditerator/)() override | Ottiene l'implementazione dell'iteratore end per il contenitore corrente. |
## Typedefs

| Typedef | Descrizione |
| --- | --- |
| [const_iterator](./const_iterator/) | Tipo di iteratore const. |
| [const_reverse_iterator](./const_reverse_iterator/) | Tipo di iteratore inverso const. |
| [EnumerablePtr](./enumerableptr/) | Un alias per il tipo di puntatore condiviso che punta a un oggetto IEnumerable contenente elementi del tipo **T**. |
| [EnumeratorPtr](./enumeratorptr/) | Un alias per il tipo di puntatore condiviso che punta a un oggetto IEnumerator contenente elementi del tipo **T**. |
| [iterator](./iterator/) | Tipo di iteratore. |
| [reverse_iterator](./reverse_iterator/) | Tipo di iteratore inverso. |
| [UnderlyingType](./underlyingtype/) | Alias per il tipo usato per rappresentare ogni elemento dell'array. |
| [ValueType](./valuetype/) | Alias per il tipo degli elementi dell'array. |
## Osservazioni



```cpp
#include <system/array.h>
#include <system/smart_ptr.h>

using namespace System;

void Print(const SmartPtr<Array<int32_t>> &arrayPtr)
{
  for (auto item: arrayPtr)
  {
    std::cout << item << ' ';
  }
  std::cout << std::endl;
}

int main()
{
  // Crea e riempi l'array.
  auto arrayPtr = MakeObject<Array<int32_t>>(5, 0);
  for (auto i = 0; i < arrayPtr->get_Length(); ++i)
  {
    arrayPtr[i] = 5 - i;
  }

  // Stampa gli elementi dell'array.
  Print(arrayPtr);

  // Ordina gli elementi dell'array in ordine crescente.
  Array<int32_t>::Sort(arrayPtr);

  // Stampa gli elementi dell'array.
  Print(arrayPtr);

  // Stampa il conteggio degli elementi dell'array.
  std::cout << arrayPtr->get_Length() << std::endl;

  // Stampa l'indice dell'elemento che è uguale a 4.
  std::cout << arrayPtr->IndexOf(4) << std::endl;

  // Ridimensiona l'array.
  Array<int32_t>::Resize(arrayPtr, 3);

  // Stampa gli elementi dell'array.
  Print(arrayPtr);

  return 0;
}
/*
This code example produces the following output:
5 4 3 2 1
1 2 3 4 5
5
3
1 2 3
*/
```

## Vedi anche

* Class [Object](../object/)
* Class [IList](../../system.collections.generic/ilist/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
