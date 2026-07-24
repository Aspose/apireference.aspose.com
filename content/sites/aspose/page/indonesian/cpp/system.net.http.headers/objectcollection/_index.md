---
title: "System::Net::Http::Headers::ObjectCollection class"
linktitle: "ObjectCollection"
second_title: "Aspose.Page untuk C++"
description: "System::Net::Http::Headers::ObjectCollection class. Mewakili kumpulan objek dalam C++."
type: docs
weight: 1600
url: /id/cpp/system.net.http.headers/objectcollection/
---
## ObjectCollection class


Mewakili koleksi objek.

```cpp
template<typename T>class ObjectCollection : public System::Collections::ObjectModel::Collection<T>
```


| Parameter | Deskripsi |
| --- | --- |
| T | Tipe objek. Objek-objek kelas ini hanya boleh dialokasikan menggunakan fungsi [System::MakeObject()](../../system/makeobject/). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer [System::SmartPtr](../../system/smartptr/) dan gunakan pointer tersebut untuk meneruskan ke fungsi sebagai argumen. |
## Metode

| Metode | Deskripsi |
| --- | --- |
| [ObjectCollection](./objectcollection/)() | Informasi RTTI. |
| [ObjectCollection](./objectcollection/)(Action\<T\>) | Membuat instance baru. |
| [SetTemplateWeakPtr](./settemplateweakptr/)(uint32_t) override | Atur argumen templat ke‑n menjadi pointer lemah (bukan berbagi). Memungkinkan penggantian pointer dalam kontainer ke mode lemah. |

## Lihat Juga

* Class [Collection](../../system.collections.objectmodel/collection/)
* Namespace [System::Net::Http::Headers](../)
* Library [Aspose.Page for C++](../../)
