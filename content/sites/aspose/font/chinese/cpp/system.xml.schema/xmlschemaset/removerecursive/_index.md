---
title: "System::Xml::Schema::XmlSchemaSet::RemoveRecursive 方法"
linktitle: "RemoveRecursive"
second_title: "Aspose.Font 适用于 C++"
description: "System::Xml::Schema::XmlSchemaSet::RemoveRecursive 方法。删除 XmlSchemaSet 中指定的 XML Schema 定义语言 (XSD) 模式以及它导入的所有模式，使用 C++。"
type: docs
weight: 1400
url: /zh/cpp/system.xml.schema/xmlschemaset/removerecursive/
---
## XmlSchemaSet::RemoveRecursive method


删除指定的 XML [Schema](../../) 定义语言 (XSD) 模式以及它从 [XmlSchemaSet](../) 导入的所有模式。

```cpp
bool System::Xml::Schema::XmlSchemaSet::RemoveRecursive(const SharedPtr<XmlSchema> &schemaToRemove)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| schemaToRemove | const SharedPtr\<XmlSchema\>\& | 要从 [XmlSchemaSet](../) 中删除的 [XmlSchema](../../xmlschema/) 对象。 |

### ReturnValue

**true** if the [XmlSchema](../../xmlschema/) object and all its imports were successfully removed; otherwise, **false**.

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlSchema](../../xmlschema/)
* Class [XmlSchemaSet](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Font for C++](../../../)
