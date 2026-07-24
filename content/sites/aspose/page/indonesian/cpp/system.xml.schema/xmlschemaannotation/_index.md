---
title: "Kelas System::Xml::Schema::XmlSchemaAnnotation"
linktitle: "XmlSchemaAnnotation"
second_title: "Aspose.Page untuk C++"
description: "Kelas System::Xml::Schema::XmlSchemaAnnotation. Mewakili elemen anotasi World Wide Web Consortium (W3C) dalam C++."
type: docs
weight: 700
url: /id/cpp/system.xml.schema/xmlschemaannotation/
---
## XmlSchemaAnnotation class


Mewakili elemen **annotation** World Wide [Web](../../system.web/) Consortium (W3C).

```cpp
class XmlSchemaAnnotation : public System::Xml::Schema::XmlSchemaObject
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| [get_Id](./get_id/)() | Mengembalikan id string. |
| [get_Items](./get_items/)() | Mengembalikan koleksi **Items** yang digunakan untuk menyimpan elemen anak **appinfo** dan **documentation**. |
| [get_UnhandledAttributes](./get_unhandledattributes/)() | Mengembalikan atribut yang memenuhi syarat yang tidak termasuk dalam namespace target skema. |
| [set_Id](./set_id/)(const String\&) | Mengatur id string. |
| [set_UnhandledAttributes](./set_unhandledattributes/)(const ArrayPtr\<SharedPtr\<XmlAttribute\>\>\&) | Mengatur atribut yang memenuhi syarat yang tidak termasuk dalam namespace target skema. |
| [XmlSchemaAnnotation](./xmlschemaannotation/)() | Menginisialisasi instance baru dari kelas [XmlSchemaAnnotation](./). |
## Typedefs

| Typedef | Deskripsi |
| --- | --- |
| [Ptr](./ptr/) | Alias untuk shared pointer ke instance kelas ini. |
## Catatan



Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi [System::MakeObject()](../../system/makeobject/). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer [System::SmartPtr](../../system/smartptr/) dan gunakan pointer ini untuk meneruskannya ke fungsi sebagai argumen.

## Lihat Juga

* Class [XmlSchemaObject](../xmlschemaobject/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Page for C++](../../)
