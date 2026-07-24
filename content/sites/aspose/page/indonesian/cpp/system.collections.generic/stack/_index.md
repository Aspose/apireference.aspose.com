---
title: "Kelas System::Collections::Generic::Stack"
linktitle: "Stack"
second_title: "Aspose.Page untuk C++"
description: "Kelas System::Collections::Generic::Stack. Deklarasi maju kelas Stack dalam C++."
type: docs
weight: 4600
url: /id/cpp/system.collections.generic/stack/
---
## Stack class


[Stack](./) class forward declaration.

```cpp
template<typename T>class Stack : public System::Collections::Generic::IEnumerable<T>
```


| Parameter | Deskripsi |
| --- | --- |
| T | Tipe elemen. |
## Nested classes

* Class [Enumerator](./enumerator/)
## Metode

| Metode | Deskripsi |
| --- | --- |
| [AddRange](./addrange/)(IEnumerablePtr) | Menempatkan elemen ke dalam stack. |
| virtual [Clear](./clear/)() | Menghapus semua elemen dari stack. |
| virtual [Contains](./contains/)(const T\&) const | Memeriksa apakah item tertentu ada di dalam kontainer; menggunakan operator == untuk perbandingan. |
| [data](./data/)() | Aksesor struktur data internal. |
| [data](./data/)() const | Aksesor struktur data internal. |
| virtual [get_Count](./get_count/)() const | Mendapatkan jumlah elemen dalam stack. |
| [GetEnumerator](./getenumerator/)() override | Mendapatkan enumerator untuk mengiterasi stack saat ini. |
| [Peek](./peek/)() | Mendapatkan elemen dari puncak stack, tetapi tetap menyimpannya di stack. |
| [Pop](./pop/)() | Mendapatkan elemen dari puncak stack. |
| [Push](./push/)(const T\&) | Menempatkan elemen di puncak stack. |
| [Stack](./stack/)() | Membuat stack kosong. |
| [Stack](./stack/)(int) | Membuat stack kosong. |
| [Stack](./stack/)(IEnumerablePtr) | Konstruktor penyalinan. |
| virtual [ToArray](./toarray/)() | Mengonversi stack menjadi array. |
| [virtualizeBeginConstIterator](./virtualizebeginconstiterator/)() const override | Mendapatkan implementasi begin const iterator untuk kontainer saat ini. |
| [virtualizeBeginIterator](./virtualizebeginiterator/)() override | Mendapatkan implementasi begin iterator untuk kontainer saat ini. |
| [virtualizeEndConstIterator](./virtualizeendconstiterator/)() const override | Mendapatkan implementasi end const iterator untuk kontainer saat ini. |
| [virtualizeEndIterator](./virtualizeenditerator/)() override | Mendapatkan implementasi end iterator untuk kontainer saat ini. |
## Typedefs

| Typedef | Deskripsi |
| --- | --- |
| [IEnumerablePtr](./ienumerableptr/) | Koleksi yang berisi elemen dengan tipe yang sama. |
| [IEnumeratorPtr](./ienumeratorptr/) | [Enumerator](./enumerator/) tipe. |
| [stack_t](./stack_t/) | Informasi RTTI. |
| [ValueType](./valuetype/) | Tipe nilai. |
## Catatan


[Stack](./) class wrapping std::list. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.


```cpp
#include <system/collections/stack.h>
#include <system/smart_ptr.h>

using namespace System;
using namespace System::Collections::Generic;

void PrintItems(const SmartPtr<IEnumerable<int>> &stack)
{
  for (const auto item: stack)
  {
    std::cout << item << ' ';
  }
  std::cout << std::endl;
}

int main()
{
  // Buat instance kelas Stack.
  auto stack = MakeObject<Stack<int>>();

  // Isi stack.
  stack->Push(1);
  stack->Push(2);
  stack->Push(3);

  // Cetak item terakhir dari stack. Metode Peek tidak menghapus item dari stack.
  std::cout << stack->Peek() << std::endl;
  PrintItems(stack);

  // Cetak item terakhir dari stack. Metode Pop menghapus item dari stack.
  std::cout << stack->Pop() << std::endl;
  PrintItems(stack);

  return 0;
}
/*
This code example produces the following output:
3
3 2 1
3
2 1
*/
```

## Lihat Juga

* Class [IEnumerable](../ienumerable/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
