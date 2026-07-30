---
title: "System::Xml::Schema::XmlSchemaSet::RemoveRecursive yöntemi"
linktitle: "RemoveRecursive"
second_title: "Aspose.Font için C++"
description: "System::Xml::Schema::XmlSchemaSet::RemoveRecursive yöntemi. Belirtilen XML Şema tanım dili (XSD) şemasını ve içe aktardığı tüm şemaları XmlSchemaSet'ten C++'ta kaldırır."
type: docs
weight: 1400
url: /tr/cpp/system.xml.schema/xmlschemaset/removerecursive/
---
## XmlSchemaSet::RemoveRecursive method


Belirtilen XML [Schema](../../) tanım dili (XSD) şemasını ve içe aktardığı tüm şemaları [XmlSchemaSet](../) üzerinden kaldırır.

```cpp
bool System::Xml::Schema::XmlSchemaSet::RemoveRecursive(const SharedPtr<XmlSchema> &schemaToRemove)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| schemaToRemove | const SharedPtr\<XmlSchema\>\& | [XmlSchema](../../xmlschema/) nesnesi, [XmlSchemaSet](../) içinden kaldırılacak. |

### ReturnValue

**true** if the [XmlSchema](../../xmlschema/) object and all its imports were successfully removed; otherwise, **false**.

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlSchema](../../xmlschema/)
* Class [XmlSchemaSet](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Font for C++](../../../)
