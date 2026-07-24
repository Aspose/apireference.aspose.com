---
title: "Kelas System::Xml::Schema::XmlSchemaType"
linktitle: "XmlSchemaType"
second_title: "Aspose.Page untuk C++"
description: "Kelas System::Xml::Schema::XmlSchemaType. Kelas dasar untuk semua tipe sederhana dan tipe kompleks dalam C++."
type: docs
weight: 6800
url: /id/cpp/system.xml.schema/xmlschematype/
---
## XmlSchemaType class


Kelas dasar untuk semua tipe sederhana dan tipe kompleks.

```cpp
class XmlSchemaType : public System::Xml::Schema::XmlSchemaAnnotated
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| [get_BaseSchemaType](./get_baseschematype/)() | Mengembalikan tipe objek pasca-kompilasi atau tipe data XML [Schema](../) Definition Language (XSD) bawaan, elemen simpleType, atau elemen complexType. Ini adalah nilai infoset pasca-kompilasi skema. |
| [get_BaseXmlSchemaType](./get_basexmlschematype/)() | Mengembalikan nilai pasca-kompilasi untuk tipe dasar dari tipe skema ini. |
| [get_Datatype](./get_datatype/)() | Mengembalikan nilai pasca-kompilasi untuk tipe data dari tipe kompleks. |
| [get_DerivedBy](./get_derivedby/)() | Mengembalikan informasi pasca-kompilasi tentang bagaimana elemen ini diturunkan dari tipe dasarnya. |
| [get_Final](./get_final/)() | Mengembalikan atribut final dari derivasi tipe yang menunjukkan apakah derivasi lebih lanjut diizinkan. |
| [get_FinalResolved](./get_finalresolved/)() | Mengembalikan interpretasi pasca-kompilasi dari nilai [XmlSchemaType::get_Final](./get_final/). |
| virtual [get_IsMixed](./get_ismixed/)() | Mengembalikan nilai yang menunjukkan apakah tipe ini memiliki model konten campuran. Panggilan ini hanya valid dalam tipe kompleks. |
| [get_Name](./get_name/)() | Mengembalikan nama tipe. |
| [get_QualifiedName](./get_qualifiedname/)() | Mengembalikan nama yang memenuhi syarat untuk tipe yang dibangun dari atribut **Name** dari tipe ini. Ini adalah nilai pasca-kompilasi skema. |
| [get_TypeCode](./get_typecode/)() | Mengembalikan [XmlTypeCode](../xmltypecode/) dari tipe. |
| static [GetBuiltInComplexType](./getbuiltincomplextype/)(XmlTypeCode) | Mengembalikan sebuah [XmlSchemaComplexType](../xmlschemacomplextype/) yang mewakili tipe kompleks bawaan dari tipe kompleks yang ditentukan. |
| static [GetBuiltInComplexType](./getbuiltincomplextype/)(const SharedPtr\<XmlQualifiedName\>\&) | Mengembalikan sebuah [XmlSchemaComplexType](../xmlschemacomplextype/) yang mewakili tipe kompleks bawaan dari tipe kompleks yang ditentukan oleh nama yang memenuhi syarat. |
| static [GetBuiltInSimpleType](./getbuiltinsimpletype/)(const SharedPtr\<XmlQualifiedName\>\&) | Mengembalikan sebuah [XmlSchemaSimpleType](../xmlschemasimpletype/) yang mewakili tipe sederhana bawaan dari tipe sederhana yang ditentukan oleh nama yang memenuhi syarat. |
| static [GetBuiltInSimpleType](./getbuiltinsimpletype/)(XmlTypeCode) | Mengembalikan sebuah [XmlSchemaSimpleType](../xmlschemasimpletype/) yang mewakili tipe sederhana bawaan dari tipe sederhana yang ditentukan. |
| static [IsDerivedFrom](./isderivedfrom/)(SharedPtr\<XmlSchemaType\>, const SharedPtr\<XmlSchemaType\>\&, XmlSchemaDerivationMethod) | Mengembalikan nilai yang menunjukkan apakah tipe skema turunan yang ditentukan diturunkan dari tipe skema dasar yang ditentukan. |
| [set_Final](./set_final/)(XmlSchemaDerivationMethod) | Mengatur atribut final dari derivasi tipe yang menunjukkan apakah derivasi lebih lanjut diizinkan. |
| virtual [set_IsMixed](./set_ismixed/)(bool) | Mengatur nilai yang menunjukkan apakah tipe ini memiliki model konten campuran. Pemanggilan ini hanya valid pada tipe kompleks. |
| [set_Name](./set_name/)(const String\&) | Mengatur nama tipe. |
| [XmlSchemaType](./xmlschematype/)() | Menginisialisasi sebuah instance baru dari kelas [XmlSchemaType](./). |
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
