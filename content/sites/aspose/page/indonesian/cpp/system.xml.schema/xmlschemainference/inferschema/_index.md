---
title: "System::Xml::Schema::XmlSchemaInference::InferSchema method"
linktitle: "InferSchema"
second_title: "Aspose.Page untuk C++"
description: "Metode System::Xml::Schema::XmlSchemaInference::InferSchema. Menyimpulkan skema XML Schema Definition Language (XSD) dari dokumen XML yang terdapat dalam objek XmlReader yang ditentukan dalam C++."
type: docs
weight: 400
url: /id/cpp/system.xml.schema/xmlschemainference/inferschema/
---
## XmlSchemaInference::InferSchema(const SharedPtr\<XmlReader\>\&) method


Menyimpulkan skema XML [Schema](../../) Definition Language (XSD) dari dokumen XML yang terdapat dalam objek [XmlReader](../../../system.xml/xmlreader/) yang ditentukan.

```cpp
SharedPtr<XmlSchemaSet> System::Xml::Schema::XmlSchemaInference::InferSchema(const SharedPtr<XmlReader> &instanceDocument)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| instanceDocument | const SharedPtr\<XmlReader\>\& | Sebuah objek [XmlReader](../../../system.xml/xmlreader/) yang berisi dokumen XML untuk disimpulkan skemanya. |

### ReturnValue

Sebuah objek [XmlSchemaSet](../../xmlschemaset/) yang berisi skema yang disimpulkan.

## Lihat Juga

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlSchemaSet](../../xmlschemaset/)
* Class [XmlReader](../../../system.xml/xmlreader/)
* Class [XmlSchemaInference](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
## XmlSchemaInference::InferSchema(const SharedPtr\<XmlReader\>\&, SharedPtr\<XmlSchemaSet\>) method


Menyimpulkan skema XML [Schema](../../) Definition Language (XSD) dari dokumen XML yang terdapat dalam objek [XmlReader](../../../system.xml/xmlreader/) yang ditentukan, dan memperbaiki skema yang disimpulkan menggunakan skema yang ada dalam objek [XmlSchemaSet](../../xmlschemaset/) yang ditentukan dengan namespace target yang sama.

```cpp
SharedPtr<XmlSchemaSet> System::Xml::Schema::XmlSchemaInference::InferSchema(const SharedPtr<XmlReader> &instanceDocument, SharedPtr<XmlSchemaSet> schemas)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| instanceDocument | const SharedPtr\<XmlReader\>\& | Sebuah objek [XmlReader](../../../system.xml/xmlreader/) yang berisi dokumen XML untuk disimpulkan skemanya. |
| schemas | SharedPtr\<XmlSchemaSet\> | Sebuah objek [XmlSchemaSet](../../xmlschemaset/) yang berisi skema yang ada digunakan untuk memperbaiki skema yang disimpulkan. |

### ReturnValue

Sebuah objek [XmlSchemaSet](../../xmlschemaset/) yang berisi skema yang disimpulkan.

## Lihat Juga

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlSchemaSet](../../xmlschemaset/)
* Class [XmlReader](../../../system.xml/xmlreader/)
* Class [XmlSchemaInference](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
