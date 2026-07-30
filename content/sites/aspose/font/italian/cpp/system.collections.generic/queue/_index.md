---
title: "Classe System::Collections::Generic::Queue"
linktitle: "Coda"
second_title: "Aspose.Font per C++"
description: "System::Collections::Generic::Queue classe. Dichiarazione anticipata della classe Queue in C++."
type: docs
weight: 3600
url: /it/cpp/system.collections.generic/queue/
---
## Queue class


[Queue](./) class forward declaration.

```cpp
template<typename T>class Queue : public System::Collections::Generic::IEnumerable<T>
```


| Parametro | Descrizione |
| --- | --- |
| T | Tipo di elemento. |
## Nested classes

* Class [Enumerator](./enumerator/)
## Metodi

| Metodo | Descrizione |
| --- | --- |
| virtual [Clear](./clear/)() | Elimina tutti gli elementi nella coda. |
| virtual [Contains](./contains/)(const T\&) const | Verifica se la coda contiene un elemento specifico usando l'operatore == per confrontare gli elementi. |
| [data](./data/)() | Accessor della struttura dati sottostante. |
| [data](./data/)() const | Accessor della struttura dati sottostante. |
| [Dequeue](./dequeue/)() | Ottiene l'elemento dall'inizio della coda. |
| [Enqueue](./enqueue/)(const T\&) | Inserisce l'elemento alla fine della coda. |
| virtual [get_Count](./get_count/)() const | Ottiene il numero di elementi nella coda. |
| [GetEnumerator](./getenumerator/)() override | Ottiene l'enumeratore per iterare attraverso la coda. |
| [Peek](./peek/)() | Ottiene l'elemento dall'inizio della coda, ma non lo rimuove dalla coda. |
| [Queue](./queue/)() | Crea una coda vuota. |
| [Queue](./queue/)(int) | Crea una coda vuota. |
| [Queue](./queue/)(const SharedPtr\<IEnumerable\<T\>\>\&) | Costruttore di copia. |
| [virtualizeBeginConstIterator](./virtualizebeginconstiterator/)() const override | Ottiene l'implementazione dell'iteratore const begin per il contenitore corrente. |
| [virtualizeBeginIterator](./virtualizebeginiterator/)() override | Ottiene l'implementazione dell'iteratore begin per il contenitore corrente. |
| [virtualizeEndConstIterator](./virtualizeendconstiterator/)() const override | Ottiene l'implementazione dell'iteratore const end per il contenitore corrente. |
| [virtualizeEndIterator](./virtualizeenditerator/)() override | Ottiene l'implementazione dell'iteratore end per il contenitore corrente. |
## Typedefs

| Typedef | Descrizione |
| --- | --- |
| [IEnumerablePtr](./ienumerableptr/) | Contenitore di elementi dello stesso tipo. |
| [IEnumeratorPtr](./ienumeratorptr/) | [Enumerator](./enumerator/) tipo. |
| [queue_t](./queue_t/) | Informazioni RTTI. |
| [ValueType](./valuetype/) | Questo tipo. |
## Osservazioni


[Queue](./) container wrapping STL list. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.


```cpp
#include <system/collections/queue.h>
#include <system/smart_ptr.h>

using namespace System;
using namespace System::Collections::Generic;

void PrintItems(const SmartPtr<IEnumerable<int>> &queue)
{
  for (const int item: queue)
  {
    std::cout << item << ' ';
  }
  std::cout << std::endl;
}

int main()
{
  // Crea l'istanza della classe Queue-class.
  auto queue = MakeObject<Queue<int>>();

  // Riempi la coda.
  queue->Enqueue(1);
  queue->Enqueue(2);
  queue->Enqueue(3);

  // Stampa il primo elemento della coda. Il metodo Peek non rimuove alcun elemento dalla coda.
  std::cout << queue->Peek() << std::endl;
  // Stampa gli elementi della coda.
  PrintItems(queue);

  // Stampa il primo elemento della coda. Il metodo Dequeue rimuove un elemento dalla coda.
  std::cout << queue->Dequeue() << std::endl;
  // Stampa gli elementi della coda.
  PrintItems(queue);

  return 0;
}
/*
This code example produces the following output:
1
1 2 3
1
2 3
*/
```

## Vedi anche

* Class [IEnumerable](../ienumerable/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Font for C++](../../)
