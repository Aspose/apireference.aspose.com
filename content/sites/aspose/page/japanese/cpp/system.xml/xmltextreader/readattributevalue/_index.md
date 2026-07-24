---
title: "System::Xml::XmlTextReader::ReadAttributeValue メソッド"
linktitle: "ReadAttributeValue"
second_title: "C++ 用 Aspose.Page"
description: "System::Xml::XmlTextReader::ReadAttributeValue メソッド。C++ で属性値を 1 つ以上の Text、EntityReference、または EndEntity ノードに解析します。"
type: docs
weight: 4300
url: /ja/cpp/system.xml/xmltextreader/readattributevalue/
---
## XmlTextReader::ReadAttributeValue method


属性値を 1 つ以上の **[Text](../../../system.text/)**、**EntityReference**、または **EndEntity** ノードに解析します。

```cpp
bool System::Xml::XmlTextReader::ReadAttributeValue() override
```


### ReturnValue

**true** if there are nodes to return. **false** if the reader is not positioned on an attribute node when the initial call is made or if all the attribute values have been read. An empty attribute, such as, **misc=""**, returns **true** with a single node with a value of [String::Empty](../../../system/string/empty/).

## 参照

* Class [XmlTextReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
