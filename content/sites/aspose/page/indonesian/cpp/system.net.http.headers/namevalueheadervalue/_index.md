---
title: "System::Net::Http::Headers::NameValueHeaderValue kelas"
linktitle: "NameValueHeaderValue"
second_title: "Aspose.Page untuk C++"
description: "System::Net::Http::Headers::NameValueHeaderValue kelas. Mewakili pasangan kunci/nilai yang digunakan dalam header. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi System::MakeObject(). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer System::SmartPtr dan gunakan pointer ini untuk meneruskannya ke fungsi sebagai argumen dalam C++."
type: docs
weight: 1400
url: /id/cpp/system.net.http.headers/namevalueheadervalue/
---
## NameValueHeaderValue class


Mewakili pasangan kunci/nilai yang digunakan dalam header. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi [System::MakeObject()](../../system/makeobject/). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer [System::SmartPtr](../../system/smartptr/) dan gunakan pointer ini untuk meneruskannya ke fungsi sebagai argumen.

```cpp
class NameValueHeaderValue : public virtual System::ICloneable
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| [Equals](./equals/)(System::SharedPtr\<Object\>) override | Membandingkan objek menggunakan semantik C# [Object.Equals](../../system/object/equals/). |
| static [Find](./find/)(System::SharedPtr\<ObjectCollection\<System::SharedPtr\<NameValueHeaderValue\>\>\>, String) | Menemukan instance kelas NameValueHeaderValue dalam koleksi berdasarkan nama yang ditentukan. |
| [get_Name](./get_name/)() | Mengembalikan nama dari instance saat ini. |
| [get_Value](./get_value/)() | Mendapatkan nilai dari instance saat ini. |
| [GetHashCode](./gethashcode/)() const override | Analog dari metode C# [Object.GetHashCode()](../../system/object/gethashcode/). Memungkinkan hashing objek kustom. |
| static [GetHashCode](./gethashcode/)(System::SharedPtr\<ObjectCollection\<System::SharedPtr\<NameValueHeaderValue\>\>\>) | Mengembalikan kode hash dari semua item koleksi. |
| static [GetNameValueLength](./getnamevaluelength/)(String, int32_t, System::SharedPtr\<NameValueHeaderValue\>\&) | Mengonversi string yang diberikan dari indeks yang ditentukan menjadi sebuah instance dari kelas [NameValueHeaderValue](./). |
| static [GetNameValueLength](./getnamevaluelength/)(String, int32_t, HeaderFunc\<System::SharedPtr\<NameValueHeaderValue\>\>, System::SharedPtr\<NameValueHeaderValue\>\&) | Mengonversi string yang diberikan dari indeks yang ditentukan menjadi sebuah instance dari kelas [NameValueHeaderValue](./). |
| static [GetNameValueListLength](./getnamevaluelistlength/)(String, int32_t, char16_t, System::SharedPtr\<ObjectCollection\<System::SharedPtr\<NameValueHeaderValue\>\>\>) | Mengonversi string yang diberikan dari indeks yang ditentukan menjadi koleksi instance kelas NameValueHeaderValue dan mengembalikan panjang substring yang diparse. |
| static [GetValueLength](./getvaluelength/)(String, int32_t) | Mengembalikan panjang nilai dari indeks yang ditentukan. |
| [NameValueHeaderValue](./namevalueheadervalue/)() | Membuat instance baru. |
| [NameValueHeaderValue](./namevalueheadervalue/)(String) | Membuat instance baru. |
| [NameValueHeaderValue](./namevalueheadervalue/)(String, String) | Membuat instance baru. |
| static [Parse](./parse/)(String) | Mengonversi string yang diberikan menjadi sebuah instance dari kelas [NameValueHeaderValue](./). |
| [set_Value](./set_value/)(String) | Menetapkan nilai pada instance saat ini. |
| [ToString](./tostring/)() const override | Analog dari metode C# [Object.ToString()](../../system/object/tostring/). Memungkinkan mengonversi objek khusus menjadi string. |
| static [ToString](./tostring/)(System::SharedPtr\<ObjectCollection\<System::SharedPtr\<NameValueHeaderValue\>\>\>, char16_t, bool, System::SharedPtr\<Text::StringBuilder\>) | Mengembalikan representasi string dari koleksi instance kelas NameValueHeaderValue. |
| static [ToString](./tostring/)(System::SharedPtr\<ObjectCollection\<System::SharedPtr\<NameValueHeaderValue\>\>\>, char16_t, bool) | Mengembalikan representasi string dari koleksi instance kelas NameValueHeaderValue. |
| static [TryParse](./tryparse/)(String, System::SharedPtr\<NameValueHeaderValue\>\&) | Mencoba mengonversi string yang diberikan menjadi sebuah instance dari kelas [NameValueHeaderValue](./). |
## Lihat Juga

* Class [ICloneable](../../system/icloneable/)
* Namespace [System::Net::Http::Headers](../)
* Library [Aspose.Page for C++](../../)
