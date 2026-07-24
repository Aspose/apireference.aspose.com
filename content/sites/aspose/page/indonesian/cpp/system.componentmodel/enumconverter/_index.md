---
title: "Kelas System::ComponentModel::EnumConverter"
linktitle: "EnumConverter"
second_title: "Aspose.Page untuk C++"
description: "Kelas System::ComponentModel::EnumConverter. Kelas dummy untuk kode yang menggunakan EnumConverter yang diterjemahkan agar dapat dikompilasi. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi System::MakeObject(). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer System::SmartPtr dan gunakan pointer ini untuk melewatkannya ke fungsi sebagai argumen dalam C++."
type: docs
weight: 700
url: /id/cpp/system.componentmodel/enumconverter/
---
## EnumConverter class


Kelas dummy untuk kode yang menggunakan EnumConverter yang diterjemahkan agar dapat dikompilasi. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi [System::MakeObject()](../../system/makeobject/). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer [System::SmartPtr](../../system/smartptr/) dan gunakan pointer ini untuk melewatkannya ke fungsi sebagai argumen.

```cpp
class EnumConverter : public System::ComponentModel::TypeConverter
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| [CanConvertFrom](./canconvertfrom/)(const System::SharedPtr\<ITypeDescriptorContext\>\&, const System::TypeInfo\&) | Memeriksa apakah tipe dapat dikonversi; belum diimplementasikan. |
| [CanConvertTo](./canconvertto/)(const System::SharedPtr\<ITypeDescriptorContext\>\&, const System::TypeInfo\&) | Memeriksa apakah tipe dapat dikonversi; belum diimplementasikan. |
| [ConvertFrom](./convertfrom/)(const System::SharedPtr\<ITypeDescriptorContext\>\&, const System::SharedPtr\<System::Globalization::CultureInfo\>\&, const System::SharedPtr\<System::Object\>\&) override | Melakukan konversi tipe sebenarnya; belum diimplementasikan. |
| [ConvertTo](./convertto/)(const System::SharedPtr\<ITypeDescriptorContext\>\&, const System::SharedPtr\<System::Globalization::CultureInfo\>\&, const System::SharedPtr\<System::Object\>\&, const System::TypeInfo\&) override | Melakukan konversi tipe sebenarnya; belum diimplementasikan. |
| [EnumConverter](./enumconverter/)(const System::TypeInfo\&) | Informasi RTTI. |
| [get_EnumType](./get_enumtype/)() | Mendapatkan tipe enum yang digunakan oleh [EnumConverter](./); belum diimplementasikan. |
## Lihat Juga

* Class [TypeConverter](../typeconverter/)
* Namespace [System::ComponentModel](../)
* Library [Aspose.Page for C++](../../)
