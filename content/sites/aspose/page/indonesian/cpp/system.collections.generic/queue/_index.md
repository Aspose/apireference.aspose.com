---
title: "System::Collections::Generic::Queue class"
linktitle: "Queue"
second_title: "Aspose.Page untuk C++"
description: "System::Collections::Generic::Queue class. Deklarasi maju kelas Queue dalam C++."
type: docs
weight: 3600
url: /id/cpp/system.collections.generic/queue/
---
## Queue class


[Queue](./) class forward declaration.

```cpp
template<typename T>class Queue : public System::Collections::Generic::IEnumerable<T>
```


| Parameter | Deskripsi |
| --- | --- |
| T | Tipe elemen. |
## Nested classes

* Class [Enumerator](./enumerator/)
## Metode

| Metode | Deskripsi |
| --- | --- |
| virtual [Clear](./clear/)() | Menghapus semua elemen dalam antrian. |
| virtual [Contains](./contains/)(const T\&) const | Memeriksa apakah antrian berisi elemen tertentu menggunakan operator == untuk membandingkan elemen. |
| [data](./data/)() | Pengakses struktur data dasar. |
| [data](./data/)() const | Pengakses struktur data dasar. |
| [Dequeue](./dequeue/)() | Mendapatkan item dari awal antrian. |
| [Enqueue](./enqueue/)(const T\&) | Menempatkan item ke akhir antrian. |
| virtual [get_Count](./get_count/)() const | Mendapatkan jumlah elemen dalam antrian. |
| [GetEnumerator](./getenumerator/)() override | Mendapatkan enumerator untuk mengiterasi antrian. |
| [Peek](./peek/)() | Mendapatkan item dari awal antrian, tetapi tidak menghapusnya dari antrian. |
| [Queue](./queue/)() | Membuat antrian kosong. |
| [Queue](./queue/)(int) | Membuat antrian kosong. |
| [Queue](./queue/)(const SharedPtr\<IEnumerable\<T\>\>\&) | Konstruktor penyalinan. |
| [virtualizeBeginConstIterator](./virtualizebeginconstiterator/)() const override | Mendapatkan implementasi begin const iterator untuk kontainer saat ini. |
| [virtualizeBeginIterator](./virtualizebeginiterator/)() override | Mendapatkan implementasi begin iterator untuk kontainer saat ini. |
| [virtualizeEndConstIterator](./virtualizeendconstiterator/)() const override | Mendapatkan implementasi end const iterator untuk kontainer saat ini. |
| [virtualizeEndIterator](./virtualizeenditerator/)() override | Mendapatkan implementasi end iterator untuk kontainer saat ini. |
## Typedefs

| Typedef | Deskripsi |
| --- | --- |
| [IEnumerablePtr](./ienumerableptr/) | Kontainer elemen dengan tipe yang sama. |
| [IEnumeratorPtr](./ienumeratorptr/) | [Enumerator](./enumerator/) tipe. |
| [queue_t](./queue_t/) | Informasi RTTI. |
| [ValueType](./valuetype/) | Tipe ini. |
## Catatan


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
  // Buat instance kelas Queue.
  auto queue = MakeObject<Queue<int>>();

  // Isi antrian.
  queue->Enqueue(1);
  queue->Enqueue(2);
  queue->Enqueue(3);

  // Cetak item pertama antrian. Metode Peek tidak menghapus item dari antrian.
  std::cout << queue->Peek() << std::endl;
  // Cetak item-item antrian.
  PrintItems(queue);

  // Cetak item pertama antrian. Metode Dequeue menghapus item dari antrian.
  std::cout << queue->Dequeue() << std::endl;
  // Cetak item-item antrian.
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

## Lihat Juga

* Class [IEnumerable](../ienumerable/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
