---
title: "System::Xml::Schema::XmlSchemaSet::Reprocess 方法"
linktitle: "重新处理"
second_title: "Aspose.Page 适用于 C++"
description: "System::Xml::Schema::XmlSchemaSet::Reprocess 方法。重新处理已存在于 XmlSchemaSet 中的 XML Schema 定义语言 (XSD) 架构（C++）。"
type: docs
weight: 1500
url: /zh/cpp/system.xml.schema/xmlschemaset/reprocess/
---
## XmlSchemaSet::Reprocess method


重新处理已存在于 [XmlSchemaSet](../) 中的 XML [Schema](../../) 定义语言 (XSD) 架构。

```cpp
SharedPtr<XmlSchema> System::Xml::Schema::XmlSchemaSet::Reprocess(SharedPtr<XmlSchema> schema)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| 架构 | SharedPtr\<XmlSchema\> | 要重新处理的架构。 |

### ReturnValue

如果架构是有效的，则返回一个 [XmlSchema](../../xmlschema/) 对象。如果架构无效且指定了 [ValidationEventHandler](../../validationeventhandler/)，则返回 **nullptr** 并触发相应的验证事件。否则，将抛出 [XmlSchemaException](../../xmlschemaexception/)。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlSchema](../../xmlschema/)
* Class [XmlSchemaSet](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
