---
title: "System::Xml::Schema::XmlSchemaElement class"
linktitle: "XmlSchemaElement"
second_title: "Aspose.Page untuk C++"
description: "System::Xml::Schema::XmlSchemaElement class. Mewakili elemen element dari XML Schema sebagaimana ditentukan oleh World Wide Web Consortium (W3C). Kelas ini adalah kelas dasar untuk semua tipe partikel dan digunakan untuk mendeskripsikan sebuah elemen dalam dokumen XML di C++."
type: docs
weight: 2600
url: /id/cpp/system.xml.schema/xmlschemaelement/
---
## XmlSchemaElement class


Mewakili **element** element dari XML [Schema](../) sebagaimana ditentukan oleh World Wide [Web](../../system.web/) Consortium (W3C). Kelas ini adalah kelas dasar untuk semua tipe partikel dan digunakan untuk mendeskripsikan sebuah elemen dalam dokumen XML.

```cpp
class XmlSchemaElement : public System::Xml::Schema::XmlSchemaParticle
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| [get_Block](./get_block/)() | Mengembalikan derivasi **Block**. |
| [get_BlockResolved](./get_blockresolved/)() | Mengembalikan interpretasi pasca-kompilasi dari nilai **Block**. |
| [get_Constraints](./get_constraints/)() | Mengembalikan koleksi batasan pada elemen. |
| [get_DefaultValue](./get_defaultvalue/)() | Mengembalikan nilai default elemen jika isinya adalah tipe sederhana atau konten elemen adalah **textOnly**. |
| [get_ElementSchemaType](./get_elementschematype/)() | Mengembalikan objek [XmlSchemaType](../xmlschematype/) yang mewakili tipe elemen berdasarkan nilai [XmlSchemaElement::get_SchemaType](./get_schematype/) atau [XmlSchemaElement::get_SchemaTypeName](./get_schematypename/) dari elemen. |
| [get_ElementType](./get_elementtype/)() | Mengembalikan objek berdasarkan [XmlSchemaElement](./) atau [XmlSchemaElement](./) dari elemen, yang menyimpan interpretasi pasca-kompilasi dari nilai **ElementType**. |
| [get_Final](./get_final/)() | Mengembalikan nilai **Final** untuk menunjukkan bahwa tidak ada derivasi lebih lanjut yang diizinkan. |
| [get_FinalResolved](./get_finalresolved/)() | Mengembalikan interpretasi pasca-kompilasi dari nilai **Final**. |
| [get_FixedValue](./get_fixedvalue/)() | Mengembalikan nilai tetap. |
| [get_Form](./get_form/)() | Mengembalikan bentuk untuk elemen. |
| [get_IsAbstract](./get_isabstract/)() | Mengembalikan informasi untuk menunjukkan apakah elemen dapat digunakan dalam dokumen instance. |
| [get_IsNillable](./get_isnillable/)() | Mengembalikan informasi yang menunjukkan apakah **xsi:nil** dapat muncul dalam data instance. Menunjukkan apakah nilai nil eksplisit dapat diberikan kepada elemen. |
| [get_Name](./get_name/)() | Mengembalikan nama elemen. |
| [get_QualifiedName](./get_qualifiedname/)() | Mengembalikan nama terkuantisasi sebenarnya untuk elemen yang diberikan. |
| [get_RefName](./get_refname/)() | Mengembalikan nama referensi dari elemen yang dideklarasikan dalam skema ini (atau skema lain yang ditunjukkan oleh namespace yang ditentukan). |
| [get_SchemaType](./get_schematype/)() | Mengembalikan tipe elemen. Ini dapat berupa tipe kompleks atau tipe sederhana. |
| [get_SchemaTypeName](./get_schematypename/)() | Mengembalikan nama tipe data bawaan yang didefinisikan dalam skema ini atau skema lain yang ditunjukkan oleh namespace yang ditentukan. |
| [get_SubstitutionGroup](./get_substitutiongroup/)() | Mengembalikan nama elemen yang digantikan oleh elemen ini. |
| [set_Block](./set_block/)(XmlSchemaDerivationMethod) | Mengatur derivasi **Block**. |
| [set_DefaultValue](./set_defaultvalue/)(const String\&) | Mengatur nilai default elemen jika isinya adalah tipe sederhana atau isi elemen adalah **textOnly**. |
| [set_Final](./set_final/)(XmlSchemaDerivationMethod) | Mengatur nilai **Final** untuk menunjukkan bahwa tidak ada derivasi lebih lanjut yang diizinkan. |
| [set_FixedValue](./set_fixedvalue/)(const String\&) | Mengatur nilai tetap. |
| [set_Form](./set_form/)(XmlSchemaForm) | Mengatur bentuk untuk elemen. |
| [set_IsAbstract](./set_isabstract/)(bool) | Mengatur informasi untuk menunjukkan apakah elemen dapat digunakan dalam dokumen instance. |
| [set_IsNillable](./set_isnillable/)(bool) | Mengatur informasi yang menunjukkan apakah **xsi:nil** dapat muncul dalam data instance. Menunjukkan apakah nilai nil eksplisit dapat diberikan kepada elemen. |
| [set_Name](./set_name/)(const String\&) | Mengatur nama elemen. |
| [set_RefName](./set_refname/)(const SharedPtr\<XmlQualifiedName\>\&) | Mengatur nama referensi elemen yang dideklarasikan dalam skema ini (atau skema lain yang ditunjukkan oleh namespace yang ditentukan). |
| [set_SchemaType](./set_schematype/)(const SharedPtr\<XmlSchemaType\>\&) | Mengatur tipe elemen. Ini dapat berupa tipe kompleks atau tipe sederhana. |
| [set_SchemaTypeName](./set_schematypename/)(const SharedPtr\<XmlQualifiedName\>\&) | Mengatur nama tipe data bawaan yang didefinisikan dalam skema ini atau skema lain yang ditunjukkan oleh namespace yang ditentukan. |
| [set_SubstitutionGroup](./set_substitutiongroup/)(const SharedPtr\<XmlQualifiedName\>\&) | Mengatur nama elemen yang digantikan oleh elemen ini. |
| [XmlSchemaElement](./xmlschemaelement/)() | Menginisialisasi instance baru dari kelas [XmlSchemaElement](./). |
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
