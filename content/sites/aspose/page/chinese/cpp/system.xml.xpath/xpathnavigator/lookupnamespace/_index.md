---
title: "System::Xml::XPath::XPathNavigator::LookupNamespace 方法"
linktitle: "LookupNamespace"
second_title: "Aspose.Page 适用于 C++"
description: "System::Xml::XPath::XPathNavigator::LookupNamespace 方法。返回指定前缀的命名空间 URI，使用 C++。"
type: docs
weight: 4700
url: /zh/cpp/system.xml.xpath/xpathnavigator/lookupnamespace/
---
## XPathNavigator::LookupNamespace method


返回指定前缀的命名空间 URI。

```cpp
String System::Xml::XPath::XPathNavigator::LookupNamespace(const String &prefix) override
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| prefix | const String\& | 您想要解析其命名空间 URI 的前缀。若要匹配默认命名空间，请传递 [String::Empty](../../../system/string/empty/)。 |

### ReturnValue

一个 [String](../../../system/string/)，其中包含分配给指定命名空间前缀的命名空间 URI；如果未为指定前缀分配命名空间 URI，则为 **nullptr**。返回的 [String](../../../system/string/) 已原子化。

## 另见

* Class [String](../../../system/string/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
