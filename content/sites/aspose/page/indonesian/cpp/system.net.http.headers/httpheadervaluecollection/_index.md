---
title: "Kelas System::Net::Http::Headers::HttpHeaderValueCollection"
linktitle: "HttpHeaderValueCollection"
second_title: "Aspose.Page untuk C++"
description: "Kelas System::Net::Http::Headers::HttpHeaderValueCollection. Mewakili koleksi nilai-nilai header. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi System::MakeObject(). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu balut kelas ini ke dalam pointer System::SmartPtr dan gunakan pointer ini untuk meneruskan ke fungsi sebagai argumen dalam C++."
type: docs
weight: 800
url: /id/cpp/system.net.http.headers/httpheadervaluecollection/
---
## HttpHeaderValueCollection class


Mewakili koleksi nilai-nilai header. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi [System::MakeObject()](../../system/makeobject/). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu balut kelas ini ke dalam pointer [System::SmartPtr](../../system/smartptr/) dan gunakan pointer ini untuk meneruskan ke fungsi sebagai argumen.

```cpp
template<typename T>class HttpHeaderValueCollection : public System::Collections::Generic::ICollection<T>
```


| Parameter | Deskripsi |
| --- | --- |
| The | tipe nilai-nilai header yang direpresentasikan dalam koleksi. |
## Metode

| Metode | Deskripsi |
| --- | --- |
| [Add](./add/)(const T\&) override | Menambahkan elemen ke dalam koleksi. |
| [Clear](./clear/)() override | Menghapus semua elemen dari koleksi. |
| [Contains](./contains/)(const T\&) const override | Memeriksa apakah elemen ada dalam koleksi. |
| [CopyTo](./copyto/)(System::ArrayPtr\<T\>, int32_t) override | Menyalin semua elemen koleksi ke elemen array yang sudah ada. |
| [get_Count](./get_count/)() const override | Informasi RTTI. |
| [get_IsReadOnly](./get_isreadonly/)() | Mendapatkan nilai yang menunjukkan apakah koleksi saat ini bersifat read-only. |
| [get_IsSpecialValueSet](./get_isspecialvalueset/)() | Mendapatkan nilai yang menunjukkan apakah koleksi saat ini berisi "special value". |
| [GetEnumerator](./getenumerator/)() override | Mendapatkan enumerator. |
| [GetHeaderStringWithoutSpecial](./getheaderstringwithoutspecial/)() | Mengembalikan representasi string dari koleksi saat ini tanpa "special value". |
| [HttpHeaderValueCollection](./httpheadervaluecollection/)(String, System::SharedPtr\<HttpHeaders\>) | Membuat instance baru. |
| [HttpHeaderValueCollection](./httpheadervaluecollection/)(String, System::SharedPtr\<HttpHeaders\>, Action\<System::SharedPtr\<HttpHeaderValueCollection\<T\>\>, T\>) | Membuat instance baru. |
| [HttpHeaderValueCollection](./httpheadervaluecollection/)(String, System::SharedPtr\<HttpHeaders\>, T) | Membuat instance baru. |
| [HttpHeaderValueCollection](./httpheadervaluecollection/)(String, System::SharedPtr\<HttpHeaders\>, T, Action\<System::SharedPtr\<HttpHeaderValueCollection\<T\>\>, T\>) | Membuat instance baru. |
| [ParseAdd](./parseadd/)(String) | Menganalisis representasi string header dan menambahkannya ke koleksi saat ini. |
| [Remove](./remove/)(const T\&) override | Menghapus elemen dari koleksi. |
| [RemoveSpecialValue](./removespecialvalue/)() | Menghapus "special value". |
| [SetSpecialValue](./setspecialvalue/)() | Menetapkan "special value". |
| [SetTemplateWeakPtr](./settemplateweakptr/)(uint32_t) override | Atur argumen templat ke‑n menjadi pointer lemah (bukan berbagi). Memungkinkan penggantian pointer dalam kontainer ke mode lemah. |
| [ToString](./tostring/)() const override | Analog dari metode C# [Object.ToString()](../../system/object/tostring/). Memungkinkan mengonversi objek khusus menjadi string. |
| [TryParseAdd](./tryparseadd/)(String) | Mencoba menganalisis representasi string header dan menambahkannya ke koleksi saat ini. |

## Lihat Juga

* Class [ICollection](../../system.collections.generic/icollection/)
* Namespace [System::Net::Http::Headers](../)
* Library [Aspose.Page for C++](../../)
