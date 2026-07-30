---
title: "System::Xml::XmlReader::get_LocalName 方法"
linktitle: "get_LocalName"
second_title: "Aspose.Font 适用于 C++"
description: "System::Xml::XmlReader::get_LocalName 方法。当在派生类中被重写时，获取 C++ 中当前节点的本地名称。"
type: docs
weight: 1400
url: /zh/cpp/system.xml/xmlreader/get_localname/
---
## XmlReader::get_LocalName method


当在派生类中被重写时，获取当前节点的本地名称。

```cpp
virtual String System::Xml::XmlReader::get_LocalName()=0
```


### ReturnValue

当前节点去除前缀后的名称。例如，元素 **<bk:book>** 的 **LocalName** 为 **book**。对于没有名称的节点类型（如 **[Text](../../../system.text/)**、**Comment** 等），此方法返回 [String::Empty](../../../system/string/empty/)。

## 另见

* Class [String](../../../system/string/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
