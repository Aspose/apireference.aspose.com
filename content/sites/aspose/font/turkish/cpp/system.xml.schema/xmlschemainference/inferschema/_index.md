---
title: "System::Xml::Schema::XmlSchemaInference::InferSchema yöntemi"
linktitle: "InferSchema"
second_title: "Aspose.Font için C++"
description: "System::Xml::Schema::XmlSchemaInference::InferSchema yöntemi. C++'da belirtilen XmlReader nesnesinde bulunan XML belgesinden bir XML Şema Tanım Dili (XSD) şeması çıkarır."
type: docs
weight: 400
url: /tr/cpp/system.xml.schema/xmlschemainference/inferschema/
---
## XmlSchemaInference::InferSchema(const SharedPtr\<XmlReader\>\&) method


Belirtilen [XmlReader](../../../system.xml/xmlreader/) nesnesinde bulunan XML belgesinden bir XML [Şema](../../) Tanım Dili (XSD) şeması çıkarır.

```cpp
SharedPtr<XmlSchemaSet> System::Xml::Schema::XmlSchemaInference::InferSchema(const SharedPtr<XmlReader> &instanceDocument)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| instanceDocument | const SharedPtr\<XmlReader\>\& | Şema çıkarılacak XML belgesini içeren bir [XmlReader](../../../system.xml/xmlreader/) nesnesi. |

### ReturnValue

Çıkarılan şemaları içeren bir [XmlSchemaSet](../../xmlschemaset/) nesnesi.

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlSchemaSet](../../xmlschemaset/)
* Class [XmlReader](../../../system.xml/xmlreader/)
* Class [XmlSchemaInference](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Font for C++](../../../)
## XmlSchemaInference::InferSchema(const SharedPtr\<XmlReader\>\&, SharedPtr\<XmlSchemaSet\>) method


Belirtilen [XmlReader](../../../system.xml/xmlreader/) nesnesinde bulunan XML belgesinden bir XML [Şema](../../) Tanım Dili (XSD) şeması çıkarır ve aynı hedef ad alanına sahip [XmlSchemaSet](../../xmlschemaset/) nesnesinde bulunan mevcut bir şema kullanılarak çıkarılan şema iyileştirilir.

```cpp
SharedPtr<XmlSchemaSet> System::Xml::Schema::XmlSchemaInference::InferSchema(const SharedPtr<XmlReader> &instanceDocument, SharedPtr<XmlSchemaSet> schemas)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| instanceDocument | const SharedPtr\<XmlReader\>\& | Şema çıkarılacak XML belgesini içeren bir [XmlReader](../../../system.xml/xmlreader/) nesnesi. |
| schemas | SharedPtr\<XmlSchemaSet\> | Çıkarılan şemayı iyileştirmek için kullanılan mevcut bir şemayı içeren bir [XmlSchemaSet](../../xmlschemaset/) nesnesi. |

### ReturnValue

Çıkarılan şemaları içeren bir [XmlSchemaSet](../../xmlschemaset/) nesnesi.

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlSchemaSet](../../xmlschemaset/)
* Class [XmlReader](../../../system.xml/xmlreader/)
* Class [XmlSchemaInference](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Font for C++](../../../)
