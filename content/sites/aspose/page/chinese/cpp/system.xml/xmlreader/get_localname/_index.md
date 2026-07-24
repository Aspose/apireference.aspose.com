---
title: "System::Xml::XmlReader::get_LocalName 方法"
linktitle: "get_LocalName"
second_title: "Aspose.Page 适用于 C++"
description: "System::Xml::XmlReader::get_LocalName 方法。 当在派生类中重写时，获取当前节点的本地名称（C++）。"
type: docs
weight: 1400
url: /zh/cpp/system.xml/xmlreader/get_localname/
---
## XmlReader::get_LocalName method


在派生类中重写时，获取当前节点的本地名称。

```cpp
virtual String System::Xml::XmlReader::get_LocalName()=0
```


### ReturnValue

去除前缀后的当前节点名称。例如，**LocalName** 对于元素 **<bk:book>** 为 **book**。对于没有名称的节点类型（如 **[Text](../../../system.text/)**、**Comment** 等），此方法返回 [String::Empty](../../../system/string/empty/)。

## 另见

* Class [String](../../../system/string/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
