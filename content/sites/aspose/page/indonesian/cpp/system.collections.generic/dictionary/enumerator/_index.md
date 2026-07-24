---
title: "System::Collections::Generic::Dictionary::Enumerator kelas"
linktitle: "Enumerator"
second_title: "Aspose.Page untuk C++"
description: "System::Collections::Generic::Dictionary::Enumerator kelas. Enumerator yang memungkinkan iterasi melalui kamus. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi System::MakeObject(). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer System::SmartPtr dan gunakan pointer ini untuk meneruskannya ke fungsi sebagai argumen dalam C++."
type: docs
weight: 1000
url: /id/cpp/system.collections.generic/dictionary/enumerator/
---
## Enumerator class


[Enumerator](./) that allows iterating through the dictionary. Objects of this class should only be allocated using [System::MakeObject()](../../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class Enumerator : public System::Collections::Generic::SimpleEnumerator<map_t, KVPair>
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| [CloneIterator](./cloneiterator/)() const override | Informasi RTTI. |
| [Enumerator](./enumerator/)(Ptr) | Membuat enumerator. |
## Lihat Juga

* Class [SimpleEnumerator](../../simpleenumerator/)
* Class [Dictionary](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Page for C++](../../../)
