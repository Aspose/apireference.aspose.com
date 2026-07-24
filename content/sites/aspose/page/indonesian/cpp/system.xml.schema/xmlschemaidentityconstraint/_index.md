---
title: "Kelas System::Xml::Schema::XmlSchemaIdentityConstraint"
linktitle: "XmlSchemaIdentityConstraint"
second_title: "Aspose.Page untuk C++"
description: "Kelas System::Xml::Schema::XmlSchemaIdentityConstraint. Kelas untuk batasan identitas: elemen key, keyref, dan unique dalam C++."
type: docs
weight: 3400
url: /id/cpp/system.xml.schema/xmlschemaidentityconstraint/
---
## XmlSchemaIdentityConstraint class


Kelas untuk kendala identitas: elemen **key**, **keyref**, dan **unique**.

```cpp
class XmlSchemaIdentityConstraint : public System::Xml::Schema::XmlSchemaAnnotated
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| [get_Fields](./get_fields/)() | Mengembalikan koleksi bidang yang berlaku sebagai anak untuk pemilih ekspresi XML Path Language ([XPath](../../system.xml.xpath/)). |
| [get_Name](./get_name/)() | Mengembalikan nama batasan identitas. |
| [get_QualifiedName](./get_qualifiedname/)() | Mengembalikan nama lengkap batasan identitas, yang menyimpan interpretasi pasca-kompilasi dari nilai **QualifiedName**. |
| [get_Selector](./get_selector/)() | Mengembalikan elemen **selector** ekspresi [XPath](../../system.xml.xpath/). |
| [set_Name](./set_name/)(const String\&) | Mengatur nama batasan identitas. |
| [set_Selector](./set_selector/)(const SharedPtr\<XmlSchemaXPath\>\&) | Mengatur elemen **selector** ekspresi [XPath](../../system.xml.xpath/). |
| [XmlSchemaIdentityConstraint](./xmlschemaidentityconstraint/)() | Menginisialisasi instance baru dari kelas [XmlSchemaIdentityConstraint](./). |
## Typedefs

| Typedef | Deskripsi |
| --- | --- |
| [Ptr](./ptr/) | Alias untuk shared pointer ke instance kelas ini. |
## Catatan



Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi [System::MakeObject()](../../system/makeobject/). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer [System::SmartPtr](../../system/smartptr/) dan gunakan pointer ini untuk meneruskannya ke fungsi sebagai argumen.

## Lihat Juga

* Class [XmlSchemaAnnotated](../xmlschemaannotated/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Page for C++](../../)
