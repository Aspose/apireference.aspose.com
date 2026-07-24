---
title: "System::Xml::XmlValidatingReader::get_LocalName 方法"
linktitle: "get_LocalName"
second_title: "Aspose.Page 适用于 C++"
description: "System::Xml::XmlValidatingReader::get_LocalName 方法。返回当前节点的本地名称，适用于 C++。"
type: docs
weight: 1600
url: /zh/cpp/system.xml/xmlvalidatingreader/get_localname/
---
## XmlValidatingReader::get_LocalName method


返回当前节点的本地名称。

```cpp
String System::Xml::XmlValidatingReader::get_LocalName() override
```


### ReturnValue

去除前缀后的当前节点名称。例如，**LocalName** 对于元素 **<bk:book>** 为 **book**。对于没有名称的节点类型（如 **[Text](../../../system.text/)**、**Comment** 等），此方法返回 [String::Empty](../../../system/string/empty/)。

## 另见

* Class [String](../../../system/string/)
* Class [XmlValidatingReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
