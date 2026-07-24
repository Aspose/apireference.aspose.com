---
title: "System::Collections::Generic::Queue klasse"
linktitle: "Queue"
second_title: "Aspose.Page voor C++"
description: "System::Collections::Generic::Queue klasse. Voorwaartse declaratie van de Queue-klasse in C++."
type: docs
weight: 3600
url: /nl/cpp/system.collections.generic/queue/
---
## Queue class


[Queue](./) class forward declaration.

```cpp
template<typename T>class Queue : public System::Collections::Generic::IEnumerable<T>
```


| Parameter | Beschrijving |
| --- | --- |
| T | Elementtype. |
## Nested classes

* Class [Enumerator](./enumerator/)
## Methoden

| Methode | Beschrijving |
| --- | --- |
| virtual [Clear](./clear/)() | Verwijdert alle elementen in de queue. |
| virtual [Contains](./contains/)(const T\&) const | Controleert of de queue een specifiek element bevat met behulp van operator == om elementen te vergelijken. |
| [data](./data/)() | Toegang tot onderliggende datastructuur. |
| [data](./data/)() const | Toegang tot onderliggende datastructuur. |
| [Dequeue](./dequeue/)() | Haalt een item op van het begin van de queue. |
| [Enqueue](./enqueue/)(const T\&) | Plaatst een item aan het einde van de queue. |
| virtual [get_Count](./get_count/)() const | Haalt het aantal elementen in de queue op. |
| [GetEnumerator](./getenumerator/)() override | Haalt een enumerator op om door de queue te itereren. |
| [Peek](./peek/)() | Haalt een item op van het begin van de queue, maar verwijdert het niet uit de queue. |
| [Queue](./queue/)() | Construeert een lege queue. |
| [Queue](./queue/)(int) | Construeert een lege queue. |
| [Queue](./queue/)(const SharedPtr\<IEnumerable\<T\>\>\&) | Copy-constructor. |
| [virtualizeBeginConstIterator](./virtualizebeginconstiterator/)() const override | Haalt de implementatie van begin const iterator voor de huidige container op. |
| [virtualizeBeginIterator](./virtualizebeginiterator/)() override | Haalt de implementatie van begin iterator voor de huidige container op. |
| [virtualizeEndConstIterator](./virtualizeendconstiterator/)() const override | Haalt de implementatie van end const iterator voor de huidige container op. |
| [virtualizeEndIterator](./virtualizeenditerator/)() override | Haalt de implementatie van end iterator voor de huidige container op. |
## Typedefs

| Typedef | Beschrijving |
| --- | --- |
| [IEnumerablePtr](./ienumerableptr/) | Container van elementen van hetzelfde type. |
| [IEnumeratorPtr](./ienumeratorptr/) | [Enumerator](./enumerator/) type. |
| [queue_t](./queue_t/) | RTTI-informatie. |
| [ValueType](./valuetype/) | Dit type. |
## Opmerkingen


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
  // Maak een instantie van de Queue-klasse.
  auto queue = MakeObject<Queue<int>>();

  // Vul de queue.
  queue->Enqueue(1);
  queue->Enqueue(2);
  queue->Enqueue(3);

  // Print het eerste queue-item. De Peek-methode verwijdert geen item uit de queue.
  std::cout << queue->Peek() << std::endl;
  // Print de queue-items.
  PrintItems(queue);

  // Print het eerste queue-item. De Dequeue-methode verwijdert een item uit de queue.
  std::cout << queue->Dequeue() << std::endl;
  // Print de queue-items.
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

## Zie ook

* Class [IEnumerable](../ienumerable/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
