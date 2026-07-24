---
title: "System::Xml::XmlReader::ReadAttributeValue メソッド"
linktitle: "ReadAttributeValue"
second_title: "C++ 用 Aspose.Page"
description: "System::Xml::XmlReader::ReadAttributeValue メソッド。派生クラスでオーバーライドされた場合、C++ で属性値を 1 つ以上の Text、EntityReference、または EndEntity ノードに解析します。"
type: docs
weight: 3800
url: /ja/cpp/system.xml/xmlreader/readattributevalue/
---
## XmlReader::ReadAttributeValue method


派生クラスでオーバーライドされた場合、属性値を 1 つ以上の **[Text](../../../system.text/)**、**EntityReference**、または **EndEntity** ノードに解析します。

```cpp
virtual bool System::Xml::XmlReader::ReadAttributeValue()=0
```


### ReturnValue

**true** if there are nodes to return. **false** if the reader is not positioned on an attribute node when the initial call is made or if all the attribute values have been read. An empty attribute, such as, **misc=""**, returns **true** with a single node with a value of [String::Empty](../../../system/string/empty/).

## 参照

* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
