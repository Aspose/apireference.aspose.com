---
title: "System::Xml::XPath::XPathNavigator::MoveToChild 方法"
linktitle: "MoveToChild"
second_title: "Aspose.Font 适用于 C++"
description: "System::Xml::XPath::XPathNavigator::MoveToChild 方法。将 XPathNavigator 移动到具有指定本地名称和命名空间 URI 的子节点（在 C++ 中）。"
type: docs
weight: 5200
url: /zh/cpp/system.xml.xpath/xpathnavigator/movetochild/
---
## XPathNavigator::MoveToChild(String, String) method


将 [XPathNavigator](../) 移动到具有指定本地名称和命名空间 URI 的子节点。

```cpp
virtual bool System::Xml::XPath::XPathNavigator::MoveToChild(String localName, String namespaceURI)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| localName | String | 要移动到的子节点的本地名称。 |
| namespaceURI | String | 要移动到的子节点的命名空间 URI。 |

### ReturnValue

**true** if the [XPathNavigator](../) is successful moving to the child node; otherwise, **false**. If **false**, the position of the [XPathNavigator](../) is unchanged.

## 另见

* Class [String](../../../system/string/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Font for C++](../../../)
## XPathNavigator::MoveToChild(XPathNodeType) method


将 [XPathNavigator](../) 移动到指定的 [XPathNodeType](../../xpathnodetype/) 的子节点。

```cpp
virtual bool System::Xml::XPath::XPathNavigator::MoveToChild(XPathNodeType type)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| type | XPathNodeType | 要移动到的子节点的 [XPathNodeType](../../xpathnodetype/)。 |

### ReturnValue

**true** if the [XPathNavigator](../) is successful moving to the child node; otherwise, **false**. If **false**, the position of the [XPathNavigator](../) is unchanged.

## 另见

* Enum [XPathNodeType](../../xpathnodetype/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Font for C++](../../../)
