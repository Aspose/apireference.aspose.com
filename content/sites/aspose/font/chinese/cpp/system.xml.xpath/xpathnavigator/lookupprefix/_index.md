---
title: "System::Xml::XPath::XPathNavigator::LookupPrefix 方法"
linktitle: "LookupPrefix"
second_title: "Aspose.Font 适用于 C++"
description: "System::Xml::XPath::XPathNavigator::LookupPrefix 方法。返回在 C++ 中为指定命名空间 URI 声明的前缀。"
type: docs
weight: 4800
url: /zh/cpp/system.xml.xpath/xpathnavigator/lookupprefix/
---
## XPathNavigator::LookupPrefix method


返回为指定的命名空间 URI 声明的前缀。

```cpp
String System::Xml::XPath::XPathNavigator::LookupPrefix(const String &namespaceURI) override
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| namespaceURI | const String\& | 用于解析前缀的命名空间 URI。 |

### ReturnValue

一个包含指定命名空间 URI 所分配的命名空间前缀的 [String](../../../system/string/)；如果未为指定的命名空间 URI 分配前缀，则为 [String::Empty](../../../system/string/empty/)。返回的 [String](../../../system/string/) 已原子化。

## 另见

* Class [String](../../../system/string/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Font for C++](../../../)
