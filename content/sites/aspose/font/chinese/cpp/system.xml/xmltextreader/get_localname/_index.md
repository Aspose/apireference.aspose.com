---
title: "System::Xml::XmlTextReader::get_LocalName 方法"
linktitle: "get_LocalName"
second_title: "Aspose.Font 适用于 C++"
description: "System::Xml::XmlTextReader::get_LocalName 方法。返回当前节点在 C++ 中的本地名称。"
type: docs
weight: 1800
url: /zh/cpp/system.xml/xmltextreader/get_localname/
---
## XmlTextReader::get_LocalName method


返回当前节点的本地名称。

```cpp
String System::Xml::XmlTextReader::get_LocalName() override
```


### ReturnValue

当前节点去除前缀后的名称。例如，元素 **<bk:book>** 的 **LocalName** 为 **book**。对于没有名称的节点类型（如 **[Text](../../../system.text/)**、**Comment** 等），此方法返回 [String::Empty](../../../system/string/empty/)。

## 另见

* Class [String](../../../system/string/)
* Class [XmlTextReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
