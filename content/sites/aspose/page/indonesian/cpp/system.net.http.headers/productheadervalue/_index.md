---
title: "System::Net::Http::Headers::ProductHeaderValue kelas"
linktitle: "ProductHeaderValue"
second_title: "Aspose.Page untuk C++"
description: "System::Net::Http::Headers::ProductHeaderValue kelas. Mewakili token produk dalam nilai header ''User-Agent''. Objek kelas ini hanya boleh dialokasikan menggunakan fungsi System::MakeObject(). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer System::SmartPtr dan gunakan pointer ini untuk meneruskannya ke fungsi sebagai argumen dalam C++."
type: docs
weight: 1700
url: /id/cpp/system.net.http.headers/productheadervalue/
---
## ProductHeaderValue class


Mewakili token produk dalam nilai header 'User-Agent'. Objek kelas ini hanya boleh dialokasikan menggunakan fungsi [System::MakeObject()](../../system/makeobject/). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer [System::SmartPtr](../../system/smartptr/) dan gunakan pointer ini untuk meneruskannya ke fungsi sebagai argumen.

```cpp
class ProductHeaderValue : public System::ICloneable
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| [Equals](./equals/)(System::SharedPtr\<Object\>) override | Membandingkan objek menggunakan semantik C# [Object.Equals](../../system/object/equals/). |
| [get_Name](./get_name/)() | Informasi RTTI. |
| [get_Version](./get_version/)() | Mengembalikan versi token produk. |
| [GetHashCode](./gethashcode/)() const override | Analog dari metode C# [Object.GetHashCode()](../../system/object/gethashcode/). Memungkinkan hashing objek kustom. |
| static [GetProductLength](./getproductlength/)(String, int32_t, System::SharedPtr\<ProductHeaderValue\>\&) | Mengonversi string yang diberikan mulai dari indeks yang ditentukan menjadi instance dari kelas [ProductHeaderValue](./). |
| static [Parse](./parse/)(String) | Mengonversi string yang diberikan menjadi instance dari kelas [ProductHeaderValue](./). |
| [ProductHeaderValue](./productheadervalue/)(String) | Membuat instance baru. |
| [ProductHeaderValue](./productheadervalue/)(String, String) | Membuat instance baru. |
| [ToString](./tostring/)() const override | Analog dari metode C# [Object.ToString()](../../system/object/tostring/). Memungkinkan mengonversi objek khusus menjadi string. |
| static [TryParse](./tryparse/)(String, System::SharedPtr\<ProductHeaderValue\>\&) | Mencoba mengonversi string yang diberikan menjadi instance dari kelas [ProductHeaderValue](./). |
## Lihat Juga

* Class [ICloneable](../../system/icloneable/)
* Namespace [System::Net::Http::Headers](../)
* Library [Aspose.Page for C++](../../)
