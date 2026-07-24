---
title: "System::Xml::Schema::XmlSchemaSet::RemoveRecursive method"
linktitle: "RemoveRecursive"
second_title: "Aspose.Page 适用于 C++"
description: "System::Xml::Schema::XmlSchemaSet::RemoveRecursive method. 在 C++ 中从 XmlSchemaSet 中移除指定的 XML 架构定义语言 (XSD) 架构及其导入的所有架构。"
type: docs
weight: 1400
url: /zh/cpp/system.xml.schema/xmlschemaset/removerecursive/
---
## XmlSchemaSet::RemoveRecursive method


从 [XmlSchemaSet](../) 中移除指定的 XML [Schema](../../) 定义语言 (XSD) 架构及其导入的所有架构。

```cpp
bool System::Xml::Schema::XmlSchemaSet::RemoveRecursive(const SharedPtr<XmlSchema> &schemaToRemove)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| schemaToRemove | const SharedPtr\<XmlSchema\>\& | 要从 [XmlSchemaSet](../) 中移除的 [XmlSchema](../../xmlschema/) 对象。 |

### ReturnValue

**true** if the [XmlSchema](../../xmlschema/) object and all its imports were successfully removed; otherwise, **false**.

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlSchema](../../xmlschema/)
* Class [XmlSchemaSet](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
