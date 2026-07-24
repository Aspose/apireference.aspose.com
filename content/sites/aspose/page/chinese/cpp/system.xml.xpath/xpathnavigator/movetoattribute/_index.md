---
title: "System::Xml::XPath::XPathNavigator::MoveToAttribute 方法"
linktitle: "MoveToAttribute"
second_title: "Aspose.Page 适用于 C++"
description: "System::Xml::XPath::XPathNavigator::MoveToAttribute 方法。将 XPathNavigator 移动到具有匹配本地名称和命名空间 URI 的属性（C++）。"
type: docs
weight: 5100
url: /zh/cpp/system.xml.xpath/xpathnavigator/movetoattribute/
---
## XPathNavigator::MoveToAttribute method


将 [XPathNavigator](../) 移动到具有匹配本地名称和命名空间 URI 的属性。

```cpp
virtual bool System::Xml::XPath::XPathNavigator::MoveToAttribute(String localName, String namespaceURI)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| localName | 字符串 | 属性的本地名称。 |
| namespaceURI | 字符串 | 属性的命名空间 URI；空命名空间时为 **nullptr**。 |

### ReturnValue

**true** if the [XPathNavigator](../) is successful moving to the attribute; otherwise, **false**. If **false**, the position of the [XPathNavigator](../) is unchanged.

## 另见

* Class [String](../../../system/string/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
