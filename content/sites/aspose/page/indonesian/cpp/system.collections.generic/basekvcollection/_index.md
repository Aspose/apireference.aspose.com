---
title: "Kelas System::Collections::Generic::BaseKVCollection"
linktitle: "BaseKVCollection"
second_title: "Aspose.Page untuk C++"
description: "Kelas System::Collections::Generic::BaseKVCollection. Menyimpan kode umum untuk koleksi kunci atau nilai. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi System::MakeObject(). Jangan pernah membuat instance tipe ini pada stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer System::SmartPtr dan gunakan pointer tersebut untuk meneruskannya ke fungsi sebagai argumen dalam C++."
type: docs
weight: 700
url: /id/cpp/system.collections.generic/basekvcollection/
---
## BaseKVCollection class


Menyimpan kode umum untuk koleksi kunci atau nilai. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi [System::MakeObject()](../../system/makeobject/). Jangan pernah membuat instance tipe ini pada stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer [System::SmartPtr](../../system/smartptr/) dan gunakan pointer tersebut untuk meneruskannya ke fungsi sebagai argumen.

```cpp
template<typename Dict,typename KV>class BaseKVCollection : public System::Collections::Generic::IKVCollection<KV>
```


| Parameter | Deskripsi |
| --- | --- |
| Dict | [Dictionary](../dictionary/) tipe. |
| KV | Tipe kunci atau nilai, tergantung pada antarmuka yang digunakan. |
## Metode

| Metode | Deskripsi |
| --- | --- |
| [BaseKVCollection](./basekvcollection/)(const typename Dict::Ptr\&) | Membuat koleksi. |
| [CopyTo](./copyto/)(ArrayPtr\<KV\>, int) override | Menyalin data ke elemen array yang ada. |
| [get_Count](./get_count/)() const override | Mendapatkan jumlah elemen. |
| [SetTemplateWeakPtr](./settemplateweakptr/)(uint32_t) override | Mengaktifkan kompilasi, tetapi sebenarnya tidak melakukan apa‑apa karena struktur ini tidak memiliki data. |

## Lihat Juga

* Class [IKVCollection](../ikvcollection/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
