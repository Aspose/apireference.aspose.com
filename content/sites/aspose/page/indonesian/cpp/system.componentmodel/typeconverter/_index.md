---
title: "Kelas System::ComponentModel::TypeConverter"
linktitle: "TypeConverter"
second_title: "Aspose.Page untuk C++"
description: "Kelas System::ComponentModel::TypeConverter. Kelas yang menangani konversi tipe dalam model komponen. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi System::MakeObject(). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer System::SmartPtr dan gunakan pointer tersebut untuk meneruskan ke fungsi sebagai argumen dalam C++."
type: docs
weight: 1400
url: /id/cpp/system.componentmodel/typeconverter/
---
## TypeConverter class


Kelas yang menangani konversi tipe dalam model komponen. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi [System::MakeObject()](../../system/makeobject/). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer [System::SmartPtr](../../system/smartptr/) dan gunakan pointer tersebut untuk meneruskan ke fungsi sebagai argumen.

```cpp
class TypeConverter : public System::Object
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| [ConvertFrom](./convertfrom/)(const System::SharedPtr\<System::Object\>\&) | Mengonversi objek. |
| virtual [ConvertFrom](./convertfrom/)(const System::SharedPtr\<ITypeDescriptorContext\>\&, const System::SharedPtr\<System::Globalization::CultureInfo\>\&, const System::SharedPtr\<System::Object\>\&) | Mengonversi objek. |
| [ConvertFrom](./convertfrom/)(const System::SharedPtr\<ITypeDescriptorContext\>\&, const System::SharedPtr\<System::Globalization::CultureInfo\>\&, const System::String\&) | Mengonversi string ke objek. |
| [ConvertFromInvariantString](./convertfrominvariantstring/)(const System::String\&) | Mengonversi string invarian menjadi objek. |
| [ConvertFromInvariantString](./convertfrominvariantstring/)(const System::SharedPtr\<ITypeDescriptorContext\>\&, const System::String\&) | Mengonversi string invarian menjadi objek. |
| [ConvertFromString](./convertfromstring/)(const System::String\&) | Mengonversi string ke objek. |
| [ConvertFromString](./convertfromstring/)(const System::SharedPtr\<ITypeDescriptorContext\>\&, const System::String\&) | Mengonversi string ke objek. |
| [ConvertFromString](./convertfromstring/)(const System::SharedPtr\<ITypeDescriptorContext\>\&, const System::SharedPtr\<System::Globalization::CultureInfo\>\&, const System::String\&) | Mengonversi string ke objek. |
| [ConvertTo](./convertto/)(const System::SharedPtr\<System::Object\>\&, const System::TypeInfo\&) | Mengonversi objek ke tipe tertentu. |
| virtual [ConvertTo](./convertto/)(const System::SharedPtr\<ITypeDescriptorContext\>\&, const System::SharedPtr\<System::Globalization::CultureInfo\>\&, const System::SharedPtr\<System::Object\>\&, const System::TypeInfo\&) | Mengonversi objek ke tipe tertentu. |
| [ConvertToInvariantString](./converttoinvariantstring/)(const System::SharedPtr\<System::Object\>\&) | Mengonversi objek menjadi string invarian. |
| [ConvertToInvariantString](./converttoinvariantstring/)(const System::SharedPtr\<ITypeDescriptorContext\>\&, const System::SharedPtr\<System::Object\>\&) | Mengonversi objek menjadi string invarian. |
| [ConvertToString](./converttostring/)(const System::SharedPtr\<System::Object\>\&) | Mengonversi objek menjadi string. |
| [ConvertToString](./converttostring/)(const System::SharedPtr\<ITypeDescriptorContext\>\&, const System::SharedPtr\<System::Object\>\&) | Mengonversi objek menjadi string. |
| [ConvertToString](./converttostring/)(const System::SharedPtr\<ITypeDescriptorContext\>\&, const System::SharedPtr\<System::Globalization::CultureInfo\>\&, const System::SharedPtr\<System::Object\>\&) | Mengonversi objek menjadi string. |
| [TypeConverter](./typeconverter/)() | Informasi RTTI. |
## Lihat Juga

* Class [Object](../../system/object/)
* Namespace [System::ComponentModel](../)
* Library [Aspose.Page for C++](../../)
