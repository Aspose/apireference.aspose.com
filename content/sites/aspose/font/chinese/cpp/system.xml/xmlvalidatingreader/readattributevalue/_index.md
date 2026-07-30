---
title: "System::Xml::XmlValidatingReader::ReadAttributeValue 方法"
linktitle: "ReadAttributeValue"
second_title: "Aspose.Font 适用于 C++"
description: "System::Xml::XmlValidatingReader::ReadAttributeValue 方法。在 C++ 中将属性值解析为一个或多个 Text、EntityReference 或 EndEntity 节点。"
type: docs
weight: 4000
url: /zh/cpp/system.xml/xmlvalidatingreader/readattributevalue/
---
## XmlValidatingReader::ReadAttributeValue method


将属性值解析为一个或多个 **[Text](../../../system.text/)**、**EntityReference** 或 **EndEntity** 节点。

```cpp
bool System::Xml::XmlValidatingReader::ReadAttributeValue() override
```


### ReturnValue

**true** if there are nodes to return. **false** if the reader is not positioned on an attribute node when the initial call is made or if all the attribute values have been read. An empty attribute, such as, **misc=""**, returns **true** with a single node with a value of [String::Empty](../../../system/string/empty/).

## 另见

* Class [XmlValidatingReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
