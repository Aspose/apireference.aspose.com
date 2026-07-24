---
title: "classe System::Collections::Concurrent::ConcurrentDictionary"
linktitle: "ConcurrentDictionary"
second_title: "Aspose.Page per C++"
description: "classe System::Collections::Concurrent::ConcurrentDictionary. Implementazione di dizionario thread-safe. Gli oggetti di questa classe dovrebbero essere allocati solo utilizzando la funzione System::MakeObject(). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fallimenti di asserzione. Avvolgere sempre questa classe in un puntatore System::SmartPtr e utilizzare tale puntatore per passarlo alle funzioni come argomento in C++."
type: docs
weight: 100
url: /it/cpp/system.collections.concurrent/concurrentdictionary/
---
## ConcurrentDictionary class


Implementazione di dizionario thread-safe. Gli oggetti di questa classe dovrebbero essere allocati solo utilizzando la funzione [System::MakeObject()](../../system/makeobject/). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fallimenti di asserzione. Avvolgere sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e utilizzare tale puntatore per passarlo alle funzioni come argomento.

```cpp
template<class TKey,class TValue>class ConcurrentDictionary : public System::Collections::Generic::Dictionary<TKey, TValue>
```


| Parametro | Descrizione |
| --- | --- |
| TKey | Tipo di chiave. |
| TValue | Tipo valore. |
## Metodi

| Metodo | Descrizione |
| --- | --- |
| [Add](./add/)(const TKey\&, const TValue\&) override | Aggiunge un valore al dizionario. |
| [Clear](./clear/)() override | Elimina tutti gli elementi nel contenitore. |
| [CopyTo](./copyto/)(ArrayPtr\<System::Collections::Generic::KeyValuePair\<TKey, TValue\>\>, int) override | Copia gli elementi del contenitore negli elementi esistenti dell'array. |
| [get_KeysInternal](./get_keysinternal/)() const override | Ottiene la collezione wrapper per accedere alle chiavi del dizionario. |
| [idx_set](./idx_set/)(const TKey\&, TValue) override | Informazioni RTTI. |
| [Remove](./remove/)(const TKey\&) override | Rimuove l'elemento dal contenitore. |
| [TryAdd](./tryadd/)(const TKey\&, const TValue\&) | Prova ad aggiungere una coppia chiave/valore al dizionario. |
## Typedefs

| Typedef | Descrizione |
| --- | --- |
| [BaseType](./basetype/) | Tipo di implementazione. |
| [ThisType](./thistype/) | Questo tipo. |
## Osservazioni



```cpp
#include <system/collections/concurrent/concurrent_dictionary.h>
#include <system/smart_ptr.h>

using namespace System;
using namespace System::Collections::Generic;

int main()
{
  const int itemsCount = 32;

  // Crea l'istanza della classe ConcurrentDictionary.
  auto concurrentDictionary = MakeObject<ConcurrentDictionary<int, int>>();

  // Riempi il dizionario concorrente.
  for (auto i = 0; i < itemsCount; ++i)
  {
    concurrentDictionary->Add(i, i * i);
  }

  Console::WriteLine(concurrentDictionary->idx_get(3));

  return 0;
}
/*
This code example produces the following output:
9
*/
```

## Vedi anche

* Class [Dictionary](../../system.collections.generic/dictionary/)
* Namespace [System::Collections::Concurrent](../)
* Library [Aspose.Page for C++](../../)
