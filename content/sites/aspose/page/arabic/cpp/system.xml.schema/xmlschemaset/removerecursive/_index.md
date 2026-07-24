---
title: "طريقة System::Xml::Schema::XmlSchemaSet::RemoveRecursive"
linktitle: "RemoveRecursive"
second_title: "Aspose.Page لـ C++"
description: "طريقة System::Xml::Schema::XmlSchemaSet::RemoveRecursive. تُزيل مخطط لغة تعريف مخطط XML (XSD) المحدد وجميع المخططات التي يستوردها من XmlSchemaSet في C++."
type: docs
weight: 1400
url: /ar/cpp/system.xml.schema/xmlschemaset/removerecursive/
---
## XmlSchemaSet::RemoveRecursive method


تُزيل مخطط XML [Schema](../../) لغة التعريف (XSD) المحدد وجميع المخططات التي يستوردها من [XmlSchemaSet](../).

```cpp
bool System::Xml::Schema::XmlSchemaSet::RemoveRecursive(const SharedPtr<XmlSchema> &schemaToRemove)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| schemaToRemove | const SharedPtr\<XmlSchema\>\& | كائن [XmlSchema](../../xmlschema/) لإزالته من [XmlSchemaSet](../). |

### ReturnValue

**true** if the [XmlSchema](../../xmlschema/) object and all its imports were successfully removed; otherwise, **false**.

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlSchema](../../xmlschema/)
* Class [XmlSchemaSet](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
