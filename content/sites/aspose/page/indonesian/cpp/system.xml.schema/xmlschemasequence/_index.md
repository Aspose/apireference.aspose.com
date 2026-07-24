---
title: "System::Xml::Schema::XmlSchemaSequence kelas"
linktitle: "XmlSchemaSequence"
second_title: "Aspose.Page untuk C++"
description: "System::Xml::Schema::XmlSchemaSequence kelas. Mewakili elemen sequence (kompositor) dari XML Schema sebagaimana ditentukan oleh World Wide Web Consortium (W3C). Sequence mengharuskan elemen‑elemen dalam grup muncul dalam urutan yang ditentukan di dalam elemen yang memuatnya dalam C++."
type: docs
weight: 5700
url: /id/cpp/system.xml.schema/xmlschemasequence/
---
## XmlSchemaSequence class


Mewakili elemen **sequence** (kompositor) dari XML [Schema](../) sebagaimana ditentukan oleh World Wide [Web](../../system.web/) Consortium (W3C). **Sequence** mengharuskan elemen dalam grup muncul dalam urutan yang ditentukan di dalam elemen yang memuatnya.

```cpp
class XmlSchemaSequence : public System::Xml::Schema::XmlSchemaGroupBase
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| [get_Items](./get_items/)() override | Elemen‑elemen yang terkandung dalam kompositor. Kumpulan dari [XmlSchemaElement](../xmlschemaelement/), [XmlSchemaGroupRef](../xmlschemagroupref/), [XmlSchemaChoice](../xmlschemachoice/), [XmlSchemaSequence](./), atau [XmlSchemaAny](../xmlschemaany/). |
| [XmlSchemaSequence](./xmlschemasequence/)() | Menginisialisasi instance baru dari kelas [XmlSchemaSequence](./). |
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
