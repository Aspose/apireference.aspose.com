---
title: "System::Net::Http::Headers::ProductInfoHeaderValue kelas"
linktitle: "ProductInfoHeaderValue"
second_title: "Aspose.Page untuk C++"
description: "System::Net::Http::Headers::ProductInfoHeaderValue kelas. Mewakili produk atau komentar dalam nilai header ''User-Agent''. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi System::MakeObject(). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan mengakibatkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer System::SmartPtr dan gunakan pointer ini untuk meneruskannya ke fungsi sebagai argumen dalam C++."
type: docs
weight: 1800
url: /id/cpp/system.net.http.headers/productinfoheadervalue/
---
## ProductInfoHeaderValue class


Mewakili produk atau komentar dalam nilai header 'User-Agent'. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi [System::MakeObject()](../../system/makeobject/). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan mengakibatkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer [System::SmartPtr](../../system/smartptr/) dan gunakan pointer ini untuk meneruskannya ke fungsi sebagai argumen.

```cpp
class ProductInfoHeaderValue : public System::ICloneable
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| [Equals](./equals/)(System::SharedPtr\<Object\>) override | Membandingkan objek menggunakan semantik C# [Object.Equals](../../system/object/equals/). |
| [get_Comment](./get_comment/)() | Mengembalikan komentar. |
| [get_Product](./get_product/)() | Informasi RTTI. |
| [GetHashCode](./gethashcode/)() const override | Analog dari metode C# [Object.GetHashCode()](../../system/object/gethashcode/). Memungkinkan hashing objek kustom. |
| static [GetProductInfoLength](./getproductinfolength/)(String, int32_t, System::SharedPtr\<ProductInfoHeaderValue\>\&) | Mengonversi string yang diberikan dari indeks yang ditentukan menjadi instance dari kelas [ProductInfoHeaderValue](./). |
| static [Parse](./parse/)(String) | Mengonversi string yang diberikan menjadi instance dari kelas [ProductInfoHeaderValue](./). |
| [ProductInfoHeaderValue](./productinfoheadervalue/)(String, String) | Membuat instance baru. |
| [ProductInfoHeaderValue](./productinfoheadervalue/)(System::SharedPtr\<ProductHeaderValue\>) | Membuat instance baru. |
| [ProductInfoHeaderValue](./productinfoheadervalue/)(String) | Membuat instance baru. |
| [ToString](./tostring/)() const override | Analog dari metode C# [Object.ToString()](../../system/object/tostring/). Memungkinkan mengonversi objek khusus menjadi string. |
| static [TryParse](./tryparse/)(String, System::SharedPtr\<ProductInfoHeaderValue\>\&) | Mencoba mengonversi string yang diberikan menjadi instance dari kelas [ProductInfoHeaderValue](./). |
## Lihat Juga

* Class [ICloneable](../../system/icloneable/)
* Namespace [System::Net::Http::Headers](../)
* Library [Aspose.Page for C++](../../)
