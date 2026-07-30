---
title: "System::Xml::XPath::XPathNavigator::GetAttribute 方法"
linktitle: "GetAttribute"
second_title: "Aspose.Font 适用于 C++"
description: "System::Xml::XPath::XPathNavigator::GetAttribute 方法。 返回具有指定本地名称和命名空间 URI 的属性值（C++）。"
type: docs
weight: 3800
url: /zh/cpp/system.xml.xpath/xpathnavigator/getattribute/
---
## XPathNavigator::GetAttribute method


返回具有指定本地名称和命名空间 URI 的属性的值。

```cpp
virtual String System::Xml::XPath::XPathNavigator::GetAttribute(String localName, String namespaceURI)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| localName | String | 属性的本地名称。 **localName** 区分大小写。 |
| namespaceURI | String | 属性的命名空间 URI。 |

### ReturnValue

一个包含指定属性值的 [String](../../../system/string/)，如果未找到匹配的属性，或 [XPathNavigator](../) 未定位在元素节点上，则为 [String::Empty](../../../system/string/empty/)。

## 另见

* Class [String](../../../system/string/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Font for C++](../../../)
