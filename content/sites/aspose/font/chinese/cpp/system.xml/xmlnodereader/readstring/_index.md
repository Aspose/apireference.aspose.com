---
title: "System::Xml::XmlNodeReader::ReadString 方法"
linktitle: "ReadString"
second_title: "Aspose.Font 适用于 C++"
description: "System::Xml::XmlNodeReader::ReadString 方法。将元素或文本节点的内容读取为字符串（C++）。"
type: docs
weight: 3600
url: /zh/cpp/system.xml/xmlnodereader/readstring/
---
## XmlNodeReader::ReadString method


将元素或文本节点的内容读取为字符串。

```cpp
String System::Xml::XmlNodeReader::ReadString() override
```


### ReturnValue

元素或类文本节点的内容（这可以包括 CDATA、[Text](../../../system.text/) 节点等）。如果读取器定位在非元素或文本节点上，或在当前上下文中没有更多文本内容可返回，则可能为空字符串。注意：文本节点可以是元素节点或属性文本节点。

## 另见

* Class [String](../../../system/string/)
* Class [XmlNodeReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
