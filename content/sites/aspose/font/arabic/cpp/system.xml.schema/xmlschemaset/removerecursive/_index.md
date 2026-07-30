---
title: "System::Xml::Schema::XmlSchemaSet::RemoveRecursive طريقة"
linktitle: "RemoveRecursive"
second_title: "Aspose.Font لـ C++"
description: "System::Xml::Schema::XmlSchemaSet::RemoveRecursive طريقة. يزيل مخطط لغة تعريف XML (XSD) المحدد وجميع المخططات التي يستوردها من XmlSchemaSet في C++."
type: docs
weight: 1400
url: /ar/cpp/system.xml.schema/xmlschemaset/removerecursive/
---
## XmlSchemaSet::RemoveRecursive method


يزيل مخطط XML [Schema](../../) المحدد وجميع المخططات التي يستوردها من [XmlSchemaSet](../).

```cpp
bool System::Xml::Schema::XmlSchemaSet::RemoveRecursive(const SharedPtr<XmlSchema> &schemaToRemove)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| schemaToRemove | const SharedPtr\<XmlSchema\>\& | كائن [XmlSchema](../../xmlschema/) لإزالته من [XmlSchemaSet](../). |

### ReturnValue

**true** if the [XmlSchema](../../xmlschema/) object and all its imports were successfully removed; otherwise, **false**.

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlSchema](../../xmlschema/)
* Class [XmlSchemaSet](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Font for C++](../../../)
