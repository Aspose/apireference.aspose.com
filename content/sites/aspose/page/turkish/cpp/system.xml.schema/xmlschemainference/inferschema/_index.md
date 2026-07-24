---
title: "System::Xml::Schema::XmlSchemaInference::InferSchema method"
linktitle: "InferSchema"
second_title: "Aspose.Page için C++"
description: "System::Xml::Schema::XmlSchemaInference::InferSchema yöntemi. C++'ta belirtilen XmlReader nesnesinde bulunan XML belgesinden bir XML Şema Tanım Dili (XSD) şeması çıkarır."
type: docs
weight: 400
url: /tr/cpp/system.xml.schema/xmlschemainference/inferschema/
---
## XmlSchemaInference::InferSchema(const SharedPtr\<XmlReader\>\&) method


Belirtilen [XmlReader](../../../system.xml/xmlreader/) nesnesinde bulunan XML belgesinden bir XML [Schema](../../) Tanım Dili (XSD) şeması çıkarır.

```cpp
SharedPtr<XmlSchemaSet> System::Xml::Schema::XmlSchemaInference::InferSchema(const SharedPtr<XmlReader> &instanceDocument)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| instanceDocument | const SharedPtr\<XmlReader\>\& | [XmlReader](../../../system.xml/xmlreader/) nesnesi, şema çıkarılacak XML belgesini içerir. |

### ReturnValue

[XmlSchemaSet](../../xmlschemaset/) nesnesi, çıkarılan şemaları içerir.

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlSchemaSet](../../xmlschemaset/)
* Class [XmlReader](../../../system.xml/xmlreader/)
* Class [XmlSchemaInference](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
## XmlSchemaInference::InferSchema(const SharedPtr\<XmlReader\>\&, SharedPtr\<XmlSchemaSet\>) method


Belirtilen [XmlReader](../../../system.xml/xmlreader/) nesnesinde bulunan XML belgesinden bir XML [Schema](../../) Tanım Dili (XSD) şeması çıkarır ve aynı hedef ad alanına sahip [XmlSchemaSet](../../xmlschemaset/) nesnesinde bulunan mevcut bir şemayı kullanarak çıkarılan şemayı iyileştirir.

```cpp
SharedPtr<XmlSchemaSet> System::Xml::Schema::XmlSchemaInference::InferSchema(const SharedPtr<XmlReader> &instanceDocument, SharedPtr<XmlSchemaSet> schemas)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| instanceDocument | const SharedPtr\<XmlReader\>\& | [XmlReader](../../../system.xml/xmlreader/) nesnesi, şema çıkarılacak XML belgesini içerir. |
| schemas | SharedPtr\<XmlSchemaSet\> | [XmlSchemaSet](../../xmlschemaset/) nesnesi, çıkarılan şemayı iyileştirmek için kullanılan mevcut bir şemayı içerir. |

### ReturnValue

[XmlSchemaSet](../../xmlschemaset/) nesnesi, çıkarılan şemaları içerir.

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlSchemaSet](../../xmlschemaset/)
* Class [XmlReader](../../../system.xml/xmlreader/)
* Class [XmlSchemaInference](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
