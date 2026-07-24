---
title: "System::Xml::XPath::XPathNavigator::MoveToFollowing 方法"
linktitle: "MoveToFollowing"
second_title: "Aspose.Page 适用于 C++"
description: "System::Xml::XPath::XPathNavigator::MoveToFollowing 方法。将 XPathNavigator 移动到文档顺序中指定本地名称和命名空间 URI 的元素（C++）。"
type: docs
weight: 5700
url: /zh/cpp/system.xml.xpath/xpathnavigator/movetofollowing/
---
## XPathNavigator::MoveToFollowing(String, String) method


将 [XPathNavigator](../) 移动到文档顺序中指定本地名称和命名空间 URI 的元素。

```cpp
virtual bool System::Xml::XPath::XPathNavigator::MoveToFollowing(String localName, String namespaceURI)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| localName | 字符串 | 元素的本地名称。 |
| namespaceURI | 字符串 | 元素的命名空间 URI。 |

### ReturnValue

**true** if the [XPathNavigator](../) moved successfully; otherwise, **false**.

## 另见

* Class [String](../../../system/string/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
## XPathNavigator::MoveToFollowing(String, String, SharedPtr\<XPathNavigator\>) method


将 [XPathNavigator](../) 移动到文档顺序中指定本地名称和命名空间 URI 的元素，并移动到指定的边界。

```cpp
virtual bool System::Xml::XPath::XPathNavigator::MoveToFollowing(String localName, String namespaceURI, SharedPtr<XPathNavigator> end)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| localName | 字符串 | 元素的本地名称。 |
| namespaceURI | 字符串 | 元素的命名空间 URI。 |
| end | SharedPtr\<XPathNavigator\> | 位于元素边界上的 [XPathNavigator](../) 对象，在搜索后续元素时，当前的 [XPathNavigator](../) 不会越过该边界。 |

### ReturnValue

**true** if the [XPathNavigator](../) moved successfully; otherwise, **false**.

## 另见

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNavigator](../)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
## XPathNavigator::MoveToFollowing(XPathNodeType) method


将 [XPathNavigator](../) 移动到文档顺序中指定的 [XPathNodeType](../../xpathnodetype/) 的下一个元素。

```cpp
virtual bool System::Xml::XPath::XPathNavigator::MoveToFollowing(XPathNodeType type)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| type | XPathNodeType | The 元素的 [XPathNodeType](../../xpathnodetype/)。该 [XPathNodeType](../../xpathnodetype/) 不能是 [XPathNodeType::Attribute](../../xpathnodetype/) 或 [XPathNodeType::Namespace](../../xpathnodetype/)。 |

### ReturnValue

**true** if the [XPathNavigator](../) moved successfully; otherwise, **false**.

## 另见

* Enum [XPathNodeType](../../xpathnodetype/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
## XPathNavigator::MoveToFollowing(XPathNodeType, SharedPtr\<XPathNavigator\>) method


将 [XPathNavigator](../) 移动到指定的 [XPathNodeType](../../xpathnodetype/) 的后续元素，移动到指定的边界，按文档顺序。

```cpp
virtual bool System::Xml::XPath::XPathNavigator::MoveToFollowing(XPathNodeType type, SharedPtr<XPathNavigator> end)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| type | XPathNodeType | The 元素的 [XPathNodeType](../../xpathnodetype/)。该 [XPathNodeType](../../xpathnodetype/) 不能是 [XPathNodeType::Attribute](../../xpathnodetype/) 或 [XPathNodeType::Namespace](../../xpathnodetype/)。 |
| end | SharedPtr\<XPathNavigator\> | 位于元素边界上的 [XPathNavigator](../) 对象，在搜索后续元素时，当前的 [XPathNavigator](../) 不会越过该边界。 |

### ReturnValue

**true** if the [XPathNavigator](../) moved successfully; otherwise, **false**.

## 另见

* Enum [XPathNodeType](../../xpathnodetype/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNavigator](../)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
