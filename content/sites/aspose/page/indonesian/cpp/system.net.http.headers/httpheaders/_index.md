---
title: "Kelas System::Net::Http::Headers::HttpHeaders"
linktitle: "HttpHeaders"
second_title: "Aspose.Page untuk C++"
description: "Kelas System::Net::Http::Headers::HttpHeaders. Kumpulan header HTTP. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi System::MakeObject(). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer System::SmartPtr dan gunakan pointer tersebut untuk meneruskan ke fungsi sebagai argumen dalam C++."
type: docs
weight: 700
url: /id/cpp/system.net.http.headers/httpheaders/
---
## HttpHeaders class


Kumpulan header HTTP. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi [System::MakeObject()](../../system/makeobject/). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer [System::SmartPtr](../../system/smartptr/) dan gunakan pointer tersebut untuk meneruskan ke fungsi sebagai argumen.

```cpp
class HttpHeaders : public System::Collections::Generic::IEnumerable<System::Collections::Generic::KeyValuePair<System::String, System::SharedPtr<System::Collections::Generic::IEnumerable<System::String>>>>
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| [Add](./add/)(String, System::SharedPtr\<Collections::Generic::IEnumerable\<String\>\>) | Memvalidasi pasangan nama-nilai baru dan menambahkannya ke koleksi saat ini. |
| [Add](./add/)(String, String) | Memvalidasi pasangan nama-nilai baru dan menambahkannya ke koleksi saat ini. |
| virtual [AddHeaders](./addheaders/)(System::SharedPtr\<HttpHeaders\>) | Menggabungkan instance HttpHeaders-class yang ditentukan dengan yang saat ini. |
| [AddParsedValue](./addparsedvalue/)(String, System::SharedPtr\<Object\>) | Menambil header dengan nama yang ditentukan dan menambahkan nilai yang diurai ke header. |
| [Clear](./clear/)() | Menghapus semua item dari koleksi. |
| [Contains](./contains/)(String) |  |
| [ContainsParsedValue](./containsparsedvalue/)(String, System::SharedPtr\<Object\>) | Memeriksa apakah header berisi nilai yang ditentukan. |
| [GetEnumerator](./getenumerator/)() override | Mendapatkan enumerator. |
| [GetHeaderString](./getheaderstring/)(String) | Mengembalikan representasi string dari nilai berdasarkan nama header yang ditentukan. |
| [GetHeaderString](./getheaderstring/)(String, System::SharedPtr\<Object\>) | Mengembalikan representasi string dari nilai berdasarkan nama header yang ditentukan. |
| [GetHeaderStrings](./getheaderstrings/)() | Mengembalikan koleksi yang berisi representasi string dari nilai-nilai header. |
| [GetParsedValues](./getparsedvalues/)(String) | Mengembalikan nilai yang diurai berdasarkan nama header yang ditentukan. |
| [GetValues](./getvalues/)(String) | Mengembalikan nilai yang sesuai berdasarkan nama yang ditentukan. |
| static [ParsedValuesAsList](./parsedvaluesaslist/)(const System::SharedPtr\<Object\>) | Mengonversi nilai yang diurai menjadi daftar. |
| [Remove](./remove/)(String) | Mencoba menghapus item berdasarkan nama yang ditentukan. |
| [RemoveParsedValue](./removeparsedvalue/)(String, System::SharedPtr\<Object\>) | Menambil header dengan nama yang ditentukan dan menghapus nilai yang diurai dari header. |
| [SetConfiguration](./setconfiguration/)(System::SharedPtr\<Collections::Generic::Dictionary\<String, System::SharedPtr\<HttpHeaderParser\>\>\>, System::SharedPtr\<Collections::Generic::HashSet\<String\>\>) |  |
| [SetOrRemoveParsedValue](./setorremoveparsedvalue/)(String, System::SharedPtr\<Object\>) | Menambil header dengan nama yang ditentukan dan mengatur atau menghapus nilainya. Nilai header akan dihapus ketika parameter 'value' bernilai nullptr, jika tidak nilai yang diurai akan diatur. |
| [SetParsedValue](./setparsedvalue/)(String, System::SharedPtr\<Object\>) | Menambil header dengan nama yang ditentukan dan mengatur nilai yang diurai ke header. |
| [ToString](./tostring/)() const override | Analog dari metode C# [Object.ToString()](../../system/object/tostring/). Memungkinkan mengonversi objek khusus menjadi string. |
| [TryAddWithoutValidation](./tryaddwithoutvalidation/)(String, String) | Mencoba menambahkan pasangan nama-nilai baru ke koleksi saat ini. |
| [TryAddWithoutValidation](./tryaddwithoutvalidation/)(String, System::SharedPtr\<Collections::Generic::IEnumerable\<String\>\>) | Menambahkan koleksi pasangan nama-nilai ke koleksi saat ini. |
| [TryGetValues](./trygetvalues/)(String, System::SharedPtr\<Collections::Generic::IEnumerable\<String\>\>\&) | Mencoba mendapatkan nilai yang sesuai berdasarkan nama yang ditentukan. |
| [TryParseAndAddValue](./tryparseandaddvalue/)(String, String) | Mencoba mengurai nilai yang ditentukan dan menambahkannya ke nilai header. |
## Lihat Juga

* Class [IEnumerable](../../system.collections.generic/ienumerable/)
* Namespace [System::Net::Http::Headers](../)
* Library [Aspose.Page for C++](../../)
