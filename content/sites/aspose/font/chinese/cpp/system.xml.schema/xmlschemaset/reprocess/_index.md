---
title: "System::Xml::Schema::XmlSchemaSet::Reprocess 方法"
linktitle: "重新处理"
second_title: "Aspose.Font 适用于 C++"
description: "System::Xml::Schema::XmlSchemaSet::Reprocess 方法。 在 C++ 中重新处理已存在于 XmlSchemaSet 中的 XML Schema 定义语言 (XSD) 架构。"
type: docs
weight: 1500
url: /zh/cpp/system.xml.schema/xmlschemaset/reprocess/
---
## XmlSchemaSet::Reprocess method


重新处理已存在于 [XmlSchemaSet](../) 中的 XML [Schema](../../) 定义语言 (XSD) 架构。

```cpp
SharedPtr<XmlSchema> System::Xml::Schema::XmlSchemaSet::Reprocess(SharedPtr<XmlSchema> schema)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 模式 | SharedPtr\<XmlSchema\> | 要重新处理的模式。 |

### ReturnValue

如果模式是有效的，则返回一个 [XmlSchema](../../xmlschema/) 对象。如果模式无效且指定了 [ValidationEventHandler](../../validationeventhandler/)，则返回 **nullptr** 并引发相应的验证事件。否则，将抛出 [XmlSchemaException](../../xmlschemaexception/)。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlSchema](../../xmlschema/)
* Class [XmlSchemaSet](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Font for C++](../../../)
