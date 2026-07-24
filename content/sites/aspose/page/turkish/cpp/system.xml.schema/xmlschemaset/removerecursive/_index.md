---
title: "System::Xml::Schema::XmlSchemaSet::RemoveRecursive metodu"
linktitle: "RemoveRecursive"
second_title: "Aspose.Page için C++"
description: "System::Xml::Schema::XmlSchemaSet::RemoveRecursive metodu. Belirtilen XML Şema tanım dili (XSD) şemasını ve içe aktardığı tüm şemaları C++'ta XmlSchemaSet'ten kaldırır."
type: docs
weight: 1400
url: /tr/cpp/system.xml.schema/xmlschemaset/removerecursive/
---
## XmlSchemaSet::RemoveRecursive method


Belirtilen XML [Schema](../../) tanım dili (XSD) şemasını ve içe aktardığı tüm şemaları [XmlSchemaSet](../) içinden kaldırır.

```cpp
bool System::Xml::Schema::XmlSchemaSet::RemoveRecursive(const SharedPtr<XmlSchema> &schemaToRemove)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| schemaToRemove | const SharedPtr\<XmlSchema\>\& | Kaldırılacak [XmlSchema](../../xmlschema/) nesnesi [XmlSchemaSet](../) içinde. |

### ReturnValue

**true** if the [XmlSchema](../../xmlschema/) object and all its imports were successfully removed; otherwise, **false**.

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlSchema](../../xmlschema/)
* Class [XmlSchemaSet](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
