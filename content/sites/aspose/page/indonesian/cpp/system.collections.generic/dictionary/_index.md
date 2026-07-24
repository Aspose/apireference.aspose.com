---
title: "kelas System::Collections::Generic::Dictionary"
linktitle: "Dictionary"
second_title: "Aspose.Page untuk C++"
description: "kelas System::Collections::Generic::Dictionary. Deklarasi maju kelas Dictionary dalam C++."
type: docs
weight: 1100
url: /id/cpp/system.collections.generic/dictionary/
---
## Dictionary class


Deklarasi maju kelas [Dictionary](./).

```cpp
template<typename TKey,typename TValue>class Dictionary : public System::Collections::Generic::BaseDictionary<std::unordered_map<TKey, TValue, EqualityComparerHashAdapter<TKey>, EqualityComparerAdapter<TKey>, ASPOSE_MAP_ALLOCATOR_TYPE(TKey, TValue)>>
```


| Parameter | Deskripsi |
| --- | --- |
| TKey | Tipe kunci. |
| TValue | Tipe nilai. |
## Nested classes

* Class [Enumerator](./enumerator/)
## Metode

| Metode | Deskripsi |
| --- | --- |
| [Dictionary](./dictionary/)() | Membuat kamus kosong. |
| [Dictionary](./dictionary/)(const map_t\&) | Menyalin data dari peta. |
| [Dictionary](./dictionary/)(int) | Overload yang sesuai dengan pembuatan kamus yang telah dialokasikan sebelumnya; sebenarnya tidak melakukan alokasi. |
| [Dictionary](./dictionary/)(const SharedPtr\<IDictionary\<TKey, TValue\>\>\&) | Konstruktor penyalinan. |
| [Dictionary](./dictionary/)(const SharedPtr\<IDictionary\<TKey, TValue\>\>\&, const SharedPtr\<IEqualityComparer\<TKey\>\>\&) | Konstruktor penyalinan. |
| [Dictionary](./dictionary/)(const SharedPtr\<IEqualityComparer\<TKey\>\>\&) | Membuat kamus kosong. |
| [Dictionary](./dictionary/)(int, const SharedPtr\<IEqualityComparer\<TKey\>\>\&) | Membuat kamus kosong. |
| [GetEnumerator](./getenumerator/)() override | Membuat objek enumerator. |
## Typedefs

| Typedef | Deskripsi |
| --- | --- |
| [IEnumerablePtr](./ienumerableptr/) | Penunjuk ke antarmuka enumerable. |
| [IEnumeratorPtr](./ienumeratorptr/) | Penunjuk ke enumerator. |
| [KeyCollection](./keycollection/) | Informasi RTTI. |
| [KVPair](./kvpair/) | Tipe pasangan kunci-nilai. |
| [map_t](./map_t/) | Tipe data dasar. |
| [Ptr](./ptr/) | Tipe pointer. |
| [ValueCollection](./valuecollection/) | Koleksi nilai untuk diekstrak. |
## Catatan


[Dictionary](./) that maps values to keys. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.


```cpp
#include <system/collections/dictionary.h>
#include <system/smart_ptr.h>

using namespace System;
using namespace System::Collections::Generic;

int main()
{
  // Buat instance kelas Dictionary.
  auto dictionary = MakeObject<Dictionary<int, String>>();

  // Isi kamus.
  dictionary->Add(0, u"Foo");
  dictionary->Add(1, u"Bar");
  dictionary->Add(2, u"Baz");

  // Cetak item kamus.
  for (const auto &pair: dictionary)
  {
    std::cout << pair.get_Key() << " - " << pair.get_Value() << std::endl;
  }

  return 0;
}
/*
This code example produces the following output:
0 - Foo
1 - Bar
2 - Baz
*/
```

## Lihat Juga

* Class [BaseDictionary](../basedictionary/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
