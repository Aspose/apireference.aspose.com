---
title: "kelas System::Collections::ObjectModel::KeyedCollection"
linktitle: "KeyedCollection"
second_title: "Aspose.Page untuk C++"
description: "System::Collections::ObjectModel::KeyedCollection class. Koleksi abstrak elemen dengan kunci tersemat. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi System::MakeObject() . Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer System::SmartPtr dan gunakan pointer ini untuk meneruskannya ke fungsi sebagai argumen dalam C++."
type: docs
weight: 200
url: /id/cpp/system.collections.objectmodel/keyedcollection/
---
## KeyedCollection class


Koleksi abstrak elemen dengan kunci tersemat. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi [System::MakeObject()](../../system/makeobject/) . Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer [System::SmartPtr](../../system/smartptr/) dan gunakan pointer ini untuk meneruskannya ke fungsi sebagai argumen.

```cpp
template<typename TKey,typename TItem>class KeyedCollection : public System::Collections::ObjectModel::Collection<TItem>
```


| Parameter | Deskripsi |
| --- | --- |
| TKey | Tipe kunci. |
| TItem | tipe nilai. |
## Metode

| Metode | Deskripsi |
| --- | --- |
| [Add](./add/)(const TItem\&) override | Tambahkan item ke akhir kontainer. |
| [Contains](./contains/)(TKey) | Memeriksa apakah kunci ada di dalam kontainer. |
| [get_Comparer](./get_comparer/)() | Mendapatkan pembanding. |
| [idx_get](./idx_get/)(TKey) | Mendapatkan item pada indeks tertentu. |
| [Remove](./remove/)(TKey) | Menghapus kunci dari kontainer. |
| [SetTemplateWeakPtr](./settemplateweakptr/)(uint32_t) override | Membuat argumen templat tertentu diperlakukan sebagai weak pointer alih-alih shared pointer (jika berlaku). |
## Bidang

| Bidang | Deskripsi |
| --- | --- |
| static [defaultThreshold](./defaultthreshold/) | Ambang batas pembuatan kamus lookup, default. |

## Lihat Juga

* Class [Collection](../collection/)
* Namespace [System::Collections::ObjectModel](../)
* Library [Aspose.Page for C++](../../)
