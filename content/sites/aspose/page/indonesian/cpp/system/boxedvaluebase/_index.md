---
title: "Kelas System::BoxedValueBase"
linktitle: "BoxedValueBase"
second_title: "Aspose.Page untuk C++"
description: "System::BoxedValueBase class. Kelas dasar yang mendefinisikan antarmuka dan mengimplementasikan beberapa metode fundamental dari kelas turunan yang mewakili nilai yang dibungkus. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi System::MakeObject(). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer System::SmartPtr dan gunakan pointer ini untuk meneruskannya ke fungsi sebagai argumen dalam C++."
type: docs
weight: 900
url: /id/cpp/system/boxedvaluebase/
---
## BoxedValueBase class


Kelas dasar yang mendefinisikan antarmuka dan mengimplementasikan beberapa metode fundamental dari kelas turunan yang mewakili nilai yang dibungkus. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi [System::MakeObject()](../makeobject/). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer [System::SmartPtr](../smartptr/) dan gunakan pointer ini untuk meneruskannya ke fungsi sebagai argumen.

```cpp
class BoxedValueBase : public System::Object
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| virtual [GetTypeCode](./gettypecode/)() const | Mengembalikan nilai yang mewakili tipe nilai yang dibungkus yang diwakili oleh objek saat ini. |
| virtual [GetUnsignedLongLongValue](./getunsignedlonglongvalue/)() const | Mengonversi nilai yang dibungkus yang diwakili oleh objek saat ini menjadi nilai integer 64-bit. |
| virtual [IsBoxedEnum](./isboxedenum/)() | Menentukan apakah objek saat ini mewakili nilai yang dibungkus dari tipe enum. |
| static [Parse](./parse/)(const TypeInfo\&, const String\&, bool) | Membungkus nilai konstanta enumerasi dari enumerasi yang ditentukan dengan nama yang ditentukan. Sebuah parameter menentukan apakah huruf besar/kecil harus diabaikan saat menginterpretasikan string yang menentukan nama konstanta enumerasi. |
| static [Parse](./parse/)(const TypeInfo\&, const String\&) | Membungkus nilai konstanta enumerasi dari enumerasi yang ditentukan dengan nama yang ditentukan. |
| [ToString](./tostring/)(const System::String\&) const | Mengonversi objek yang dibungkus menjadi string menggunakan string format yang ditentukan. |
| virtual [ToString](./tostring/)() const | Analog dari metode C# [Object.ToString()](../object/tostring/). Memungkinkan konversi objek khusus menjadi string. |
## Lihat Juga

* Class [Object](../object/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
