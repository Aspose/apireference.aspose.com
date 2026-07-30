---
title: "System::Xml::XmlDocument::ReadNode 方法"
linktitle: "ReadNode"
second_title: "Aspose.Font 适用于 C++"
description: "System::Xml::XmlDocument::ReadNode 方法。根据 XmlReader 中的信息创建 XmlNode 对象。读取器必须定位在节点或属性上（C++）。"
type: docs
weight: 3600
url: /zh/cpp/system.xml/xmldocument/readnode/
---
## XmlDocument::ReadNode method


根据 [XmlReader](../../xmlreader/) 中的信息创建一个 [XmlNode](../../xmlnode/) 对象。读取器必须定位在节点或属性上。

```cpp
virtual SharedPtr<XmlNode> System::Xml::XmlDocument::ReadNode(SharedPtr<XmlReader> reader)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 读取器 | SharedPtr\<XmlReader\> | XML 源。 |

### ReturnValue

新的 [XmlNode](../../xmlnode/) 或 **nullptr**（如果没有更多节点）。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Class [XmlReader](../../xmlreader/)
* Class [XmlDocument](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
