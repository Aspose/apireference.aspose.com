---
title: "System::Xml::Schema::XmlSchemaChoice class"
linktitle: "XmlSchemaChoice"
second_title: "Aspose.Page untuk C++"
description: "Kelas System::Xml::Schema::XmlSchemaChoice. Mewakili elemen choice (compositor) dari XML Schema sebagaimana ditentukan oleh World Wide Web Consortium (W3C). Choice hanya mengizinkan satu dari anaknya muncul dalam sebuah instance di C++."
type: docs
weight: 1400
url: /id/cpp/system.xml.schema/xmlschemachoice/
---
## XmlSchemaChoice class


Mewakili elemen **choice** (compositor) dari XML [Schema](../) sebagaimana ditentukan oleh World Wide [Web](../../system.web/) Consortium (W3C). **choice** hanya mengizinkan satu dari anaknya muncul dalam sebuah instance.

```cpp
class XmlSchemaChoice : public System::Xml::Schema::XmlSchemaGroupBase
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| [get_Items](./get_items/)() override | Mengembalikan koleksi elemen yang terkandung dalam compositor (**choice**): [XmlSchemaElement](../xmlschemaelement/), [XmlSchemaGroupRef](../xmlschemagroupref/), [XmlSchemaChoice](./), [XmlSchemaSequence](../xmlschemasequence/), atau [XmlSchemaAny](../xmlschemaany/). |
| [XmlSchemaChoice](./xmlschemachoice/)() | Menginisialisasi sebuah instance baru dari kelas [XmlSchemaChoice](./). |
## Typedefs

| Typedef | Deskripsi |
| --- | --- |
| [Ptr](./ptr/) | Alias untuk shared pointer ke instance kelas ini. |
## Catatan



Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi [System::MakeObject()](../../system/makeobject/). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer [System::SmartPtr](../../system/smartptr/) dan gunakan pointer ini untuk meneruskannya ke fungsi sebagai argumen.

## Lihat Juga

* Class [XmlSchemaGroupBase](../xmlschemagroupbase/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Page for C++](../../)
