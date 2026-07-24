---
title: "System::Xml::Schema::XmlSchemaCollection::Contains yöntemi"
linktitle: "Contains"
second_title: "Aspose.Page için C++"
description: "System::Xml::Schema::XmlSchemaCollection::Contains yöntemi. C++'da belirtilen XmlSchema'nun targetNamespace'inin koleksiyonda olup olmadığını gösteren bir değer döndürür."
type: docs
weight: 300
url: /tr/cpp/system.xml.schema/xmlschemacollection/contains/
---
## XmlSchemaCollection::Contains(const SharedPtr\<XmlSchema\>\&) method


Belirtilen [XmlSchema](../../xmlschema/) öğesinin **targetNamespace**'inin koleksiyonda olup olmadığını gösteren bir değer döndürür.

```cpp
bool System::Xml::Schema::XmlSchemaCollection::Contains(const SharedPtr<XmlSchema> &schema)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| schema | const SharedPtr\<XmlSchema\>\& | [XmlSchema](../../xmlschema/) nesnesi. |

### ReturnValue

**true** if there is a schema in the collection with the same **targetNamespace**; otherwise, **false**.

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlSchema](../../xmlschema/)
* Class [XmlSchemaCollection](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
## XmlSchemaCollection::Contains(const String\&) method


Belirtilen ad alanına sahip bir şemanın koleksiyonda olup olmadığını gösteren bir değer döndürür.

```cpp
bool System::Xml::Schema::XmlSchemaCollection::Contains(const String &ns)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| ns | const String\& | Şema ile ilişkili ad alanı URI'si. XML Şemaları için bu genellikle hedef ad alanı olur. |

### ReturnValue

**true** if a schema with the specified namespace is in the collection; otherwise, **false**.

## Ayrıca Bakınız

* Class [String](../../../system/string/)
* Class [XmlSchemaCollection](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
