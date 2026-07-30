---
title: "System::Xml::XmlReader::get_SchemaInfo 方法"
linktitle: "get_SchemaInfo"
second_title: "Aspose.Font 适用于 C++"
description: "System::Xml::XmlReader::get_SchemaInfo 方法。返回因 C++ 中的模式验证而分配给当前节点的模式信息。"
type: docs
weight: 2200
url: /zh/cpp/system.xml/xmlreader/get_schemainfo/
---
## XmlReader::get_SchemaInfo method


返回因模式验证而分配给当前节点的模式信息。

```cpp
virtual SharedPtr<Schema::IXmlSchemaInfo> System::Xml::XmlReader::get_SchemaInfo()
```


### ReturnValue

一个包含当前节点模式信息的 IXmlSchemaInfo 对象。可以在元素、属性或具有非空 [XmlReader::get_ValueType](../get_valuetype/) 值的文本节点上设置 [Schema](../../../system.xml.schema/) 信息。如果当前节点不是上述节点类型之一，或如果 [XmlReader](../) 实例未报告模式信息，则此方法返回 **nullptr**。如果此方法从 [XmlTextReader](../../xmltextreader/) 或 [XmlValidatingReader](../../xmlvalidatingreader/) 对象调用，则此方法始终返回 **nullptr**。这些 [XmlReader](../) 实现不通过 get_SchemaInfo 方法公开模式信息。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IXmlSchemaInfo](../../../system.xml.schema/ixmlschemainfo/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
