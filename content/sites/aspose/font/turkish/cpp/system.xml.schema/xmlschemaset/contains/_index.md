---
title: "System::Xml::Schema::XmlSchemaSet::Contains method"
linktitle: "Contains"
second_title: "Aspose.Font için C++"
description: "System::Xml::Schema::XmlSchemaSet::Contains method. Belirtilen XML Şema tanım dili (XSD) XmlSchema nesnesinin C++'de XmlSchemaSet içinde olup olmadığını gösterir."
type: docs
weight: 400
url: /tr/cpp/system.xml.schema/xmlschemaset/contains/
---
## XmlSchemaSet::Contains(const SharedPtr\<XmlSchema\>\&) method


Belirtilen XML [Şema](../../) tanım dili (XSD) [XmlSchema](../../xmlschema/) nesnesinin [XmlSchemaSet](../) içinde olup olmadığını gösterir.

```cpp
bool System::Xml::Schema::XmlSchemaSet::Contains(const SharedPtr<XmlSchema> &schema)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| schema | const SharedPtr\<XmlSchema\>\& | [XmlSchema](../../xmlschema/) nesnesi. |

### ReturnValue

**true** if the [XmlSchema](../../xmlschema/) object is in the [XmlSchemaSet](../); otherwise, **false**.

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlSchema](../../xmlschema/)
* Class [XmlSchemaSet](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Font for C++](../../../)
## XmlSchemaSet::Contains(String) method


Belirtilen hedef ad alanı URI'sine sahip bir XML [Şema](../../) tanım dili (XSD) şemasının [XmlSchemaSet](../) içinde olup olmadığını gösterir.

```cpp
bool System::Xml::Schema::XmlSchemaSet::Contains(String targetNamespace)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| targetNamespace | Dize | Şemanın **targetNamespace** özelliği. |

### ReturnValue

**true** if a schema with the specified target namespace URI is in the [XmlSchemaSet](../); otherwise, **false**.

## Ayrıca Bakınız

* Class [String](../../../system/string/)
* Class [XmlSchemaSet](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Font for C++](../../../)
