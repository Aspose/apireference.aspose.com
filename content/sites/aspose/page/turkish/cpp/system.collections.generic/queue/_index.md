---
title: "System::Collections::Generic::Queue class"
linktitle: "Queue"
second_title: "Aspose.Page için C++"
description: "System::Collections::Generic::Queue class. C++'da Queue sınıfının ileri bildirimidir."
type: docs
weight: 3600
url: /tr/cpp/system.collections.generic/queue/
---
## Queue class


[Queue](./) class forward declaration.

```cpp
template<typename T>class Queue : public System::Collections::Generic::IEnumerable<T>
```


| Parameter | Açıklama |
| --- | --- |
| T | Öğe türü. |
## Nested classes

* Class [Enumerator](./enumerator/)
## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| virtual [Clear](./clear/)() | Kuyruktaki tüm öğeleri siler. |
| virtual [Contains](./contains/)(const T\&) const | Kuyruğun belirli bir öğeyi içerip içermediğini, öğeleri karşılaştırmak için == operatörünü kullanarak kontrol eder. |
| [data](./data/)() | Temel veri yapısı erişicisi. |
| [data](./data/)() const | Temel veri yapısı erişicisi. |
| [Dequeue](./dequeue/)() | Kuyruğun başından öğeyi alır. |
| [Enqueue](./enqueue/)(const T\&) | Öğeyi kuyruğun sonuna ekler. |
| virtual [get_Count](./get_count/)() const | Kuyruktaki öğe sayısını alır. |
| [GetEnumerator](./getenumerator/)() override | Kuyruğu dolaşmak için bir yineleyici alır. |
| [Peek](./peek/)() | Kuyruğun başından öğeyi alır, ancak kuyruğun içinden kaldırmaz. |
| [Queue](./queue/)() | Boş bir kuyruk oluşturur. |
| [Queue](./queue/)(int) | Boş bir kuyruk oluşturur. |
| [Queue](./queue/)(const SharedPtr\<IEnumerable\<T\>\>\&) | Kopya yapıcı. |
| [virtualizeBeginConstIterator](./virtualizebeginconstiterator/)() const override | Mevcut konteyner için begin const iterator'un uygulanmasını alır. |
| [virtualizeBeginIterator](./virtualizebeginiterator/)() override | Mevcut konteyner için begin iterator'un uygulanmasını alır. |
| [virtualizeEndConstIterator](./virtualizeendconstiterator/)() const override | Mevcut konteyner için end const iterator'un uygulanmasını alır. |
| [virtualizeEndIterator](./virtualizeenditerator/)() override | Mevcut konteyner için end iterator'un uygulanmasını alır. |
## Typedefs

| Typedef | Açıklama |
| --- | --- |
| [IEnumerablePtr](./ienumerableptr/) | Aynı tipteki öğelerin kapsayıcısı. |
| [IEnumeratorPtr](./ienumeratorptr/) | [Enumerator](./enumerator/) türü. |
| [queue_t](./queue_t/) | RTTI bilgisi. |
| [ValueType](./valuetype/) | Bu tip. |
## Açıklamalar


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
  // Queue-class örneğini oluştur.
  auto queue = MakeObject<Queue<int>>();

  // Kuyruğu doldur.
  queue->Enqueue(1);
  queue->Enqueue(2);
  queue->Enqueue(3);

  // Kuyruğun ilk öğesini yazdır. Peek yöntemi kuyruğun bir öğesini kaldırmaz.
  std::cout << queue->Peek() << std::endl;
  // Kuyruk öğelerini yazdır.
  PrintItems(queue);

  // Kuyruğun ilk öğesini yazdır. Dequeue yöntemi kuyruğun bir öğesini kaldırır.
  std::cout << queue->Dequeue() << std::endl;
  // Kuyruk öğelerini yazdır.
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

## Ayrıca Bakınız

* Class [IEnumerable](../ienumerable/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
