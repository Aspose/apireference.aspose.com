---
title: "System::BoxedValue kelas"
linktitle: "BoxedValue"
second_title: "Aspose.Page untuk C++"
description: "System::BoxedValue kelas. Mewakili nilai yang dibungkus. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi System::MakeObject(). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer System::SmartPtr dan gunakan pointer ini untuk meneruskannya ke fungsi sebagai argumen dalam C++."
type: docs
weight: 800
url: /id/cpp/system/boxedvalue/
---
## BoxedValue class


Mewakili nilai yang dibungkus. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi [System::MakeObject()](../makeobject/). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer [System::SmartPtr](../smartptr/) dan gunakan pointer ini untuk meneruskannya ke fungsi sebagai argumen.

```cpp
template<class T>class BoxedValue : public System::BoxedValueBase
```


| Parameter | Deskripsi |
| --- | --- |
| T | Tipe nilai yang dibungkus yang diwakili oleh kelas |
## Metode

| Metode | Deskripsi |
| --- | --- |
| [BoxedValue](./boxedvalue/)(const T\&) | Membuat sebuah objek yang mewakili nilai yang dibungkus yang ditentukan. |
| [Equals](./equals/)(ptr) override | Menentukan kesetaraan nilai yang dibungkus yang diwakili oleh objek saat ini dan objek yang ditentukan. |
| [GetHashCode](./gethashcode/)() const override | Mengembalikan kode hash untuk objek saat ini. |
| [GetType](./gettype/)() const override | Mendapatkan tipe sebenarnya dari objek. |
| [GetTypeCode](./gettypecode/)() const override | Mengembalikan nilai yang mewakili tipe nilai yang dibungkus yang diwakili oleh objek saat ini. |
| [GetUnsignedLongLongValue](./getunsignedlonglongvalue/)() const override | Mengembalikan nilai numerik dari objek yang dibungkus jika dapat dikast, nol jika tidak. |
| [is](./is/)() const | Menentukan apakah tipe nilai yang dibungkus yang diwakili oleh objek saat ini adalah **V**. |
| [IsBoxedEnum](./isboxedenum/)() override | Menentukan apakah objek saat ini mewakili nilai yang dibungkus dari tipe enum. |
| static [Parse](../boxedvaluebase/parse/)(const TypeInfo\&, const String\&, bool) | Membungkus nilai konstanta enumerasi dari enumerasi yang ditentukan dengan nama yang ditentukan. Sebuah parameter menentukan apakah huruf besar/kecil harus diabaikan saat menginterpretasikan string yang menentukan nama konstanta enumerasi. |
| static [Parse](../boxedvaluebase/parse/)(const TypeInfo\&, const String\&) | Membungkus nilai konstanta enumerasi dari enumerasi yang ditentukan dengan nama yang ditentukan. |
| [ToString](./tostring/)() const override | Mengonversi nilai yang dibungkus yang diwakili oleh objek saat ini menjadi string. |
| [ToString](../boxedvaluebase/tostring/)(const System::String\&) const | Mengonversi objek yang dibungkus menjadi string menggunakan string format yang ditentukan. |
| [unbox](./unbox/)() const | Melepaskan nilai yang diwakili oleh objek saat ini. |

## Lihat Juga

* Class [BoxedValueBase](../boxedvaluebase/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
