---
title: "System::Drawing::Imaging::PropertyItem class"
linktitle: "PropertyItem"
second_title: "Aspose.Page untuk C++"
description: "System::Drawing::Imaging::PropertyItem class. Mewakili properti metadata yang akan dimasukkan ke dalam file gambar. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi System::MakeObject(). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer System::SmartPtr dan gunakan pointer ini untuk meneruskannya ke fungsi sebagai argumen dalam C++."
type: docs
weight: 1400
url: /id/cpp/system.drawing.imaging/propertyitem/
---
## PropertyItem class


Mewakili properti metadata yang akan dimasukkan ke dalam file gambar. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi [System::MakeObject()](../../system/makeobject/). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer [System::SmartPtr](../../system/smartptr/) dan gunakan pointer ini untuk meneruskannya ke fungsi sebagai argumen.

```cpp
class PropertyItem : public System::Object
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| [get_Id](./get_id/)() const | Mengembalikan ID properti yang diwakili oleh objek saat ini. |
| [get_Len](./get_len/)() const | Mengembalikan panjang properti yang diwakili oleh objek saat ini dalam byte. |
| [get_Type](./get_type/)() const | Mengembalikan tipe properti yang diwakili oleh objek saat ini dalam byte. |
| [get_Value](./get_value/)() const | Mengembalikan nilai properti yang diwakili oleh objek saat ini dalam byte. |
| [PropertyItem](./propertyitem/)() | Membuat instance baru dari kelas [PropertyItem](./). |
| [set_Id](./set_id/)(int32_t) | Mengatur ID properti yang diwakili oleh objek saat ini. |
| [set_Len](./set_len/)(int32_t) | Mengatur panjang properti yang diwakili oleh objek saat ini dalam byte. |
| [set_Type](./set_type/)(int16_t) | Mengatur tipe properti yang diwakili oleh objek saat ini dalam byte. |
| [set_Value](./set_value/)(const System::ArrayPtr\<uint8_t\>\&) | Mengatur tipe properti yang diwakili oleh objek saat ini dalam byte. |
## Lihat Juga

* Class [Object](../../system/object/)
* Namespace [System::Drawing::Imaging](../)
* Library [Aspose.Page for C++](../../)
