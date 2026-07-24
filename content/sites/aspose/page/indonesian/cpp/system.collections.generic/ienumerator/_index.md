---
title: "System::Collections::Generic::IEnumerator class"
linktitle: "IEnumerator"
second_title: "Aspose.Page untuk C++"
description: "System::Collections::Generic::IEnumerator class. Antarmuka enumerator yang dapat digunakan untuk mengiterasi beberapa elemen. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi System::MakeObject(). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu balut kelas ini ke dalam pointer System::SmartPtr dan gunakan pointer ini untuk meneruskan ke fungsi sebagai argumen dalam C++."
type: docs
weight: 2300
url: /id/cpp/system.collections.generic/ienumerator/
---
## IEnumerator class


Antarmuka enumerator yang dapat digunakan untuk mengiterasi beberapa elemen. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi [System::MakeObject()](../../system/makeobject/). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer [System::SmartPtr](../../system/smartptr/) dan gunakan pointer tersebut untuk meneruskan ke fungsi sebagai argumen.

```cpp
template<typename T>class IEnumerator : public virtual System::IDisposable,
                                        public System::Details::EnumeratorBasedIterator<T>,
                                        protected System::Details::IteratorPointerUpdater<T, false>
```


| Parameter | Deskripsi |
| --- | --- |
| T | Tipe elemen. |
## Metode

| Metode | Deskripsi |
| --- | --- |
| [AsVirtualizedIterator](./asvirtualizediterator/)() | Mempersiapkan iterator untuk digunakan oleh kelas VirtualizedIterator. |
| [CloneIterator](./cloneiterator/)() const override | Mengkloning iterator saat ini. |
| virtual [Current](./current/)() const | Mendapatkan elemen saat ini. |
| virtual [get_Current](./get_current/)() const | Mendapatkan elemen saat ini. |
| [IEnumerator](./ienumerator/)() |  |
| [IncrementIterator](./incrementiterator/)() override | Memindahkan iterator satu langkah maju. |
| [InitializeIterator](./initializeiterator/)() override | Melakukan pemanggilan pertama [MoveNext()](./movenext/) dan mempersiapkan objek enumerator untuk digunakan oleh VirtualizedIterator. |
| [MarkOwnedByVirtualizedIterator](./markownedbyvirtualizediterator/)() | Menandai enumerator yang dimiliki oleh virtualized iterator. |
| virtual [MoveNext](./movenext/)() | Memindahkan enumerator ke elemen berikutnya. Jika tidak ada elemen yang direferensikan sebelumnya, mengatur referensi ke elemen pertama yang tersedia. Jika akhir kontainer tercapai, tidak melakukan apa‑apa. |
| virtual [Reset](./reset/)() | Mengatur ulang enumerator ke posisi sebelum elemen pertama. |
| virtual [~IEnumerator](./~ienumerator/)() |  |
## Typedefs

| Typedef | Deskripsi |
| --- | --- |
| [ValueType](./valuetype/) | Tipe nilai. |
## Catatan



```cpp
#include <system/collections/list.h>
#include <system/smart_ptr.h>

using namespace System;
using namespace System::Collections::Generic;

int main()
{
  // Buat instance kelas List.
  auto collection = MakeObject<List<int>>();

  // Isi daftar.
  collection->Add(1);
  collection->Add(2);
  collection->Add(3);

  // Dapatkan enumerator dari daftar.
  auto enumerator = collection->GetEnumerator();

  while (enumerator->MoveNext())
  {
    // Dapatkan elemen saat ini dan cetak.
    std::cout << enumerator->get_Current() << ' ';
  }

  // Reset enumerator.
  enumerator->Reset();

  return 0;
}
/*
This code example produces the following output:
1 2 3
*/
```

## Lihat Juga

* Class [IDisposable](../../system/idisposable/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
