---
title: "System::Collections::Concurrent::ConcurrentDictionary kelas"
linktitle: "ConcurrentDictionary"
second_title: "Aspose.Page untuk C++"
description: "kelas System::Collections::Concurrent::ConcurrentDictionary. Implementasi kamus yang aman terhadap thread. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi System::MakeObject(). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer System::SmartPtr dan gunakan pointer tersebut untuk meneruskannya ke fungsi sebagai argumen dalam C++."
type: docs
weight: 100
url: /id/cpp/system.collections.concurrent/concurrentdictionary/
---
## ConcurrentDictionary class


Implementasi kamus yang aman terhadap thread. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi [System::MakeObject()](../../system/makeobject/). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer [System::SmartPtr](../../system/smartptr/) dan gunakan pointer tersebut untuk meneruskannya ke fungsi sebagai argumen.

```cpp
template<class TKey,class TValue>class ConcurrentDictionary : public System::Collections::Generic::Dictionary<TKey, TValue>
```


| Parameter | Deskripsi |
| --- | --- |
| TKey | Tipe kunci. |
| TValue | Tipe nilai. |
## Metode

| Metode | Deskripsi |
| --- | --- |
| [Add](./add/)(const TKey\&, const TValue\&) override | Menambahkan nilai ke dalam kamus. |
| [Clear](./clear/)() override | Menghapus semua elemen dalam wadah. |
| [CopyTo](./copyto/)(ArrayPtr\<System::Collections::Generic::KeyValuePair\<TKey, TValue\>\>, int) override | Menyalin elemen kontainer ke elemen array yang sudah ada. |
| [get_KeysInternal](./get_keysinternal/)() const override | Mendapatkan koleksi pembungkus untuk mengakses kunci kamus. |
| [idx_set](./idx_set/)(const TKey\&, TValue) override | Informasi RTTI. |
| [Remove](./remove/)(const TKey\&) override | Menghapus elemen dari wadah. |
| [TryAdd](./tryadd/)(const TKey\&, const TValue\&) | Mencoba menambahkan pasangan kunci/nilai ke dalam kamus. |
## Typedefs

| Typedef | Deskripsi |
| --- | --- |
| [BaseType](./basetype/) | Tipe implementasi. |
| [ThisType](./thistype/) | Tipe ini. |
## Catatan



```cpp
#include <system/collections/concurrent/concurrent_dictionary.h>
#include <system/smart_ptr.h>

using namespace System;
using namespace System::Collections::Generic;

int main()
{
  const int itemsCount = 32;

  // Buat instance kelas ConcurrentDictionary.
  auto concurrentDictionary = MakeObject<ConcurrentDictionary<int, int>>();

  // Isi kamus konkuren.
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

## Lihat Juga

* Class [Dictionary](../../system.collections.generic/dictionary/)
* Namespace [System::Collections::Concurrent](../)
* Library [Aspose.Page for C++](../../)
