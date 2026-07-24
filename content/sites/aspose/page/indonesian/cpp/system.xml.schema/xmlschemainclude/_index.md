---
title: "Kelas System::Xml::Schema::XmlSchemaInclude"
linktitle: "XmlSchemaInclude"
second_title: "Aspose.Page untuk C++"
description: "Kelas System::Xml::Schema::XmlSchemaInclude. Mewakili elemen include dari XML Schema sebagaimana ditentukan oleh World Wide Web Consortium (W3C). Kelas ini digunakan untuk menyertakan deklarasi dan definisi dari skema eksternal. Deklarasi dan definisi yang disertakan kemudian tersedia untuk diproses dalam skema yang memuatnya dalam C++."
type: docs
weight: 3600
url: /id/cpp/system.xml.schema/xmlschemainclude/
---
## XmlSchemaInclude class


Mewakili elemen **include** dari XML [Schema](../) sebagaimana ditentukan oleh Konsorsium World Wide [Web](../../system.web/) (W3C). Kelas ini digunakan untuk menyertakan deklarasi dan definisi dari skema eksternal. Deklarasi dan definisi yang disertakan kemudian tersedia untuk diproses dalam skema yang berisi.

```cpp
class XmlSchemaInclude : public System::Xml::Schema::XmlSchemaExternal
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| [get_Annotation](./get_annotation/)() | Mengembalikan nilai **annotation**. |
| [set_Annotation](./set_annotation/)(const SharedPtr\<XmlSchemaAnnotation\>\&) | Mengatur nilai **annotation**. |
| [XmlSchemaInclude](./xmlschemainclude/)() | Menginisialisasi instance baru dari kelas [XmlSchemaInclude](./). |
## Typedefs

| Typedef | Deskripsi |
| --- | --- |
| [Ptr](./ptr/) | Alias untuk shared pointer ke instance kelas ini. |
## Catatan



Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi [System::MakeObject()](../../system/makeobject/). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer [System::SmartPtr](../../system/smartptr/) dan gunakan pointer ini untuk meneruskannya ke fungsi sebagai argumen.

## Lihat Juga

* Class [XmlSchemaExternal](../xmlschemaexternal/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Page for C++](../../)
