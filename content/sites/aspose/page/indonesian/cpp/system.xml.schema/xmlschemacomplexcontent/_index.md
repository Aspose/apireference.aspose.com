---
title: "Kelas System::Xml::Schema::XmlSchemaComplexContent"
linktitle: "XmlSchemaComplexContent"
second_title: "Aspose.Page untuk C++"
description: "Kelas System::Xml::Schema::XmlSchemaComplexContent. Mewakili elemen complexContent dari XML Schema sebagaimana ditentukan oleh World Wide Web Consortium (W3C). Kelas ini mewakili model konten kompleks untuk tipe kompleks. Ini berisi ekstensi atau pembatasan pada tipe kompleks yang memiliki hanya elemen atau konten campuran dalam C++."
type: docs
weight: 1800
url: /id/cpp/system.xml.schema/xmlschemacomplexcontent/
---
## XmlSchemaComplexContent class


Mewakili elemen **complexContent** dari XML [Schema](../) sebagaimana ditentukan oleh World Wide [Web](../../system.web/) Consortium (W3C). Kelas ini mewakili model konten kompleks untuk tipe kompleks. Ini berisi ekstensi atau pembatasan pada tipe kompleks yang memiliki hanya elemen atau konten campuran.

```cpp
class XmlSchemaComplexContent : public System::Xml::Schema::XmlSchemaContentModel
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| [get_Content](./get_content/)() override | Mengembalikan konten. |
| [get_IsMixed](./get_ismixed/)() | Mengembalikan informasi yang menentukan apakah tipe memiliki model konten campuran. |
| [set_Content](./set_content/)(SharedPtr\<XmlSchemaContent\>) override | Mengatur konten. |
| [set_IsMixed](./set_ismixed/)(bool) | Mengatur informasi yang menentukan apakah tipe memiliki model konten campuran. |
| [XmlSchemaComplexContent](./xmlschemacomplexcontent/)() | Menginisialisasi sebuah instance baru dari kelas [XmlSchemaComplexContent](./). |
## Typedefs

| Typedef | Deskripsi |
| --- | --- |
| [Ptr](./ptr/) | Alias untuk shared pointer ke instance kelas ini. |
## Catatan



Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi [System::MakeObject()](../../system/makeobject/). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer [System::SmartPtr](../../system/smartptr/) dan gunakan pointer ini untuk meneruskannya ke fungsi sebagai argumen.

## Lihat Juga

* Class [XmlSchemaContentModel](../xmlschemacontentmodel/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Page for C++](../../)
