---
title: "System::Xml::Schema::XmlSchemaAny class"
linktitle: "XmlSchemaAny"
second_title: "Aspose.Page untuk C++"
description: "System::Xml::Schema::XmlSchemaAny class. Mewakili elemen any dari World Wide Web Consortium (W3C) dalam C++."
type: docs
weight: 800
url: /id/cpp/system.xml.schema/xmlschemaany/
---
## XmlSchemaAny class


Mewakili elemen **any** dari World Wide [Web](../../system.web/) Consortium (W3C).

```cpp
class XmlSchemaAny : public System::Xml::Schema::XmlSchemaParticle
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| [get_Namespace](./get_namespace/)() | Mengembalikan namespace yang berisi elemen yang dapat digunakan. |
| [get_ProcessContents](./get_processcontents/)() | Mengembalikan informasi tentang bagaimana aplikasi atau pemroses XML harus menangani validasi dokumen XML untuk elemen yang ditentukan oleh elemen **any**. |
| [set_Namespace](./set_namespace/)(const String\&) | Mengatur namespace yang berisi elemen yang dapat digunakan. |
| [set_ProcessContents](./set_processcontents/)(XmlSchemaContentProcessing) | Mengatur informasi tentang bagaimana aplikasi atau pemroses XML harus menangani validasi dokumen XML untuk elemen yang ditentukan oleh elemen **any**. |
| [XmlSchemaAny](./xmlschemaany/)() | Menginisialisasi instance baru dari kelas [XmlSchemaAny](./). |
## Typedefs

| Typedef | Deskripsi |
| --- | --- |
| [Ptr](./ptr/) | Alias untuk shared pointer ke instance kelas ini. |
## Catatan



Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi [System::MakeObject()](../../system/makeobject/). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer [System::SmartPtr](../../system/smartptr/) dan gunakan pointer ini untuk meneruskannya ke fungsi sebagai argumen.

## Lihat Juga

* Class [XmlSchemaParticle](../xmlschemaparticle/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Page for C++](../../)
