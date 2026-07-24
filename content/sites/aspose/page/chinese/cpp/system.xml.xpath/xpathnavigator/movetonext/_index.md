---
title: "System::Xml::XPath::XPathNavigator::MoveToNext 方法"
linktitle: "MoveToNext"
second_title: "Aspose.Page 适用于 C++"
description: "System::Xml::XPath::XPathNavigator::MoveToNext 方法。当在派生类中被重写时，将 XPathNavigator 移动到当前节点的下一个兄弟节点（在 C++ 中）。"
type: docs
weight: 6000
url: /zh/cpp/system.xml.xpath/xpathnavigator/movetonext/
---
## XPathNavigator::MoveToNext() method


当在派生类中被重写时，将 [XPathNavigator](../) 移动到当前节点的下一个兄弟节点。

```cpp
virtual bool System::Xml::XPath::XPathNavigator::MoveToNext()=0
```


### ReturnValue

**true** if the [XPathNavigator](../) is successful moving to the next sibling node; otherwise **false** if there are no more siblings or if the [XPathNavigator](../) is currently positioned on an attribute node. If **false**, the position of the [XPathNavigator](../) is unchanged.

## 另见

* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
## XPathNavigator::MoveToNext(String, String) method


将 [XPathNavigator](../) 移动到具有指定本地名称和命名空间 URI 的下一个兄弟节点。

```cpp
virtual bool System::Xml::XPath::XPathNavigator::MoveToNext(String localName, String namespaceURI)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| localName | 字符串 | 要移动到的下一个兄弟节点的本地名称。 |
| namespaceURI | 字符串 | 要移动到的下一个兄弟节点的命名空间 URI。 |

### ReturnValue

**true** if the [XPathNavigator](../) is successful moving to the next sibling node; **false** if there are no more siblings, or if the [XPathNavigator](../) is currently positioned on an attribute node. If **false**, the position of the [XPathNavigator](../) is unchanged.

## 另见

* Class [String](../../../system/string/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
## XPathNavigator::MoveToNext(XPathNodeType) method


将 [XPathNavigator](../) 移动到当前节点的下一个与指定的 [XPathNodeType](../../xpathnodetype/) 匹配的兄弟节点。

```cpp
virtual bool System::Xml::XPath::XPathNavigator::MoveToNext(XPathNodeType type)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| type | XPathNodeType | 要移动到的兄弟节点的 [XPathNodeType](../../xpathnodetype/)。 |

### ReturnValue

**true** if the [XPathNavigator](../) is successful moving to the next sibling node; otherwise, **false** if there are no more siblings or if the [XPathNavigator](../) is currently positioned on an attribute node. If **false**, the position of the [XPathNavigator](../) is unchanged.

## 另见

* Enum [XPathNodeType](../../xpathnodetype/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
