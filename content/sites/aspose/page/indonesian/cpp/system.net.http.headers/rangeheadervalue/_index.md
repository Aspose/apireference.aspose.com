---
title: "System::Net::Http::Headers::RangeHeaderValue class"
linktitle: "RangeHeaderValue"
second_title: "Aspose.Page untuk C++"
description: "System::Net::Http::Headers::RangeHeaderValue class. Mewakili nilai dari header ''Range''. Objek-objek kelas ini hanya boleh dialokasikan menggunakan fungsi System::MakeObject(). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer System::SmartPtr dan gunakan pointer tersebut untuk meneruskan ke fungsi sebagai argumen dalam C++."
type: docs
weight: 2000
url: /id/cpp/system.net.http.headers/rangeheadervalue/
---
## RangeHeaderValue class


Mewakili nilai dari header 'Range'. Objek-objek kelas ini hanya boleh dialokasikan menggunakan fungsi [System::MakeObject()](../../system/makeobject/). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer [System::SmartPtr](../../system/smartptr/) dan gunakan pointer tersebut untuk meneruskan ke fungsi sebagai argumen.

```cpp
class RangeHeaderValue : public System::ICloneable
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| [Equals](./equals/)(System::SharedPtr\<Object\>) override | Membandingkan objek menggunakan semantik C# [Object.Equals](../../system/object/equals/). |
| [get_Ranges](./get_ranges/)() | Mengembalikan koleksi rentang. |
| [get_Unit](./get_unit/)() | Informasi RTTI. |
| [GetHashCode](./gethashcode/)() const override | Analog dari metode C# [Object.GetHashCode()](../../system/object/gethashcode/). Memungkinkan hashing objek kustom. |
| static [GetRangeLength](./getrangelength/)(String, int32_t, System::SharedPtr\<Object\>\&) | Mengonversi string yang diberikan dari indeks yang ditentukan menjadi instance dari kelas [RangeHeaderValue](./). |
| static [Parse](./parse/)(String) | Mengonversi string yang diberikan menjadi sebuah instance dari kelas [RangeHeaderValue](./). |
| [RangeHeaderValue](./rangeheadervalue/)() | Membuat instance baru. |
| [RangeHeaderValue](./rangeheadervalue/)(Nullable\<int64_t\>, Nullable\<int64_t\>) | Membuat instance baru. |
| [set_Unit](./set_unit/)(String) | Menetapkan satu unit. |
| [ToString](./tostring/)() const override | Analog dari metode C# [Object.ToString()](../../system/object/tostring/). Memungkinkan mengonversi objek khusus menjadi string. |
| static [TryParse](./tryparse/)(String, System::SharedPtr\<RangeHeaderValue\>\&) | Mencoba mengonversi string yang diberikan menjadi sebuah instance dari kelas [RangeHeaderValue](./). |
## Lihat Juga

* Class [ICloneable](../../system/icloneable/)
* Namespace [System::Net::Http::Headers](../)
* Library [Aspose.Page for C++](../../)
