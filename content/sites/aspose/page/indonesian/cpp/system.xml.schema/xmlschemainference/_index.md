---
title: "System::Xml::Schema::XmlSchemaInference kelas"
linktitle: "XmlSchemaInference"
second_title: "Aspose.Page untuk C++"
description: "System::Xml::Schema::XmlSchemaInference kelas. Menyimpulkan skema XML Schema Definition Language (XSD) dari dokumen XML. Kelas XmlSchemaInference tidak dapat diwariskan dalam C++."
type: docs
weight: 3700
url: /id/cpp/system.xml.schema/xmlschemainference/
---
## XmlSchemaInference class


Menyimpulkan skema XML [Schema](../) Definition Language (XSD) dari dokumen XML. Kelas [XmlSchemaInference](./) tidak dapat diwariskan.

```cpp
class XmlSchemaInference : public System::Object
```

## Enums

| Enum | Deskripsi |
| --- | --- |
| [InferenceOption](./inferenceoption/) | Mempengaruhi informasi kejadian dan tipe yang disimpulkan oleh kelas [XmlSchemaInference](./) untuk elemen dan atribut dalam dokumen XML. |
## Metode

| Metode | Deskripsi |
| --- | --- |
| [get_Occurrence](./get_occurrence/)() | Mengembalikan nilai [XmlSchemaInference::InferenceOption](./inferenceoption/) yang mempengaruhi deklarasi kejadian skema yang disimpulkan dari dokumen XML. |
| [get_TypeInference](./get_typeinference/)() | Mengembalikan nilai [XmlSchemaInference::InferenceOption](./inferenceoption/) yang mempengaruhi tipe yang disimpulkan dari dokumen XML. |
| [InferSchema](./inferschema/)(const SharedPtr\<XmlReader\>\&) | Menyimpulkan skema XML [Schema](../) Definition Language (XSD) dari dokumen XML yang terdapat dalam objek [XmlReader](../../system.xml/xmlreader/) yang ditentukan. |
| [InferSchema](./inferschema/)(const SharedPtr\<XmlReader\>\&, SharedPtr\<XmlSchemaSet\>) | Menyimpulkan skema XML [Schema](../) Definition Language (XSD) dari dokumen XML yang terdapat dalam objek [XmlReader](../../system.xml/xmlreader/) yang ditentukan, dan memperbaiki skema yang disimpulkan menggunakan skema yang ada dalam objek [XmlSchemaSet](../xmlschemaset/) yang ditentukan dengan namespace target yang sama. |
| [set_Occurrence](./set_occurrence/)(XmlSchemaInference::InferenceOption) | Mengatur nilai [XmlSchemaInference::InferenceOption](./inferenceoption/) yang mempengaruhi deklarasi kejadian skema yang disimpulkan dari dokumen XML. |
| [set_TypeInference](./set_typeinference/)(XmlSchemaInference::InferenceOption) | Mengatur nilai [XmlSchemaInference::InferenceOption](./inferenceoption/) yang memengaruhi tipe yang disimpulkan dari dokumen XML. |
| [XmlSchemaInference](./xmlschemainference/)() | Menginisialisasi instance baru dari kelas [XmlSchemaInference](./). |
## Typedefs

| Typedef | Deskripsi |
| --- | --- |
| [Ptr](./ptr/) | Alias untuk shared pointer ke instance kelas ini. |
## Catatan



Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi [System::MakeObject()](../../system/makeobject/). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer [System::SmartPtr](../../system/smartptr/) dan gunakan pointer ini untuk meneruskannya ke fungsi sebagai argumen.

## Lihat Juga

* Class [Object](../../system/object/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Page for C++](../../)
