---
title: "System::Xml::XmlNodeReader::ReadAttributeValue メソッド"
linktitle: "ReadAttributeValue"
second_title: "C++ 用 Aspose.Page"
description: "System::Xml::XmlNodeReader::ReadAttributeValue メソッド。C++ で属性値を 1 つ以上の Text、EntityReference、または EndEntity ノードに解析します。"
type: docs
weight: 3100
url: /ja/cpp/system.xml/xmlnodereader/readattributevalue/
---
## XmlNodeReader::ReadAttributeValue method


属性値を 1 つ以上の **[Text](../../../system.text/)**、**EntityReference**、または **EndEntity** ノードに解析します。

```cpp
bool System::Xml::XmlNodeReader::ReadAttributeValue() override
```


### ReturnValue

**true** if there are nodes to return. **false** if the reader is not positioned on an attribute node when the initial call is made or if all the attribute values have been read. An empty attribute, such as, **misc=""**, returns **true** with a single node with a value of [String::Empty](../../../system/string/empty/).

## 参照

* Class [XmlNodeReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
