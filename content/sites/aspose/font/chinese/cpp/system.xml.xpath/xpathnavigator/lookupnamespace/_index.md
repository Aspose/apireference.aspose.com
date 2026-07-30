---
title: "System::Xml::XPath::XPathNavigator::LookupNamespace 方法"
linktitle: "LookupNamespace"
second_title: "Aspose.Font 适用于 C++"
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


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| prefix | const String\& | 要解析其命名空间 URI 的前缀。若要匹配默认命名空间，请传入 [String::Empty](../../../system/string/empty/)。 |

### ReturnValue

一个包含指定命名空间前缀所分配的命名空间 URI 的 [String](../../../system/string/)；如果未为指定前缀分配命名空间 URI，则为 **nullptr**。返回的 [String](../../../system/string/) 已原子化。

## 另见

* Class [String](../../../system/string/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Font for C++](../../../)
