---
title: "System::Xml::XPath::XPathNavigator::SelectAncestors 方法"
linktitle: "SelectAncestors"
second_title: "Aspose.Page 适用于 C++"
description: "System::Xml::XPath::XPathNavigator::SelectAncestors 方法。选择当前节点的所有祖先节点，这些节点具有指定的本地名称和命名空间 URI（C++）。"
type: docs
weight: 7200
url: /zh/cpp/system.xml.xpath/xpathnavigator/selectancestors/
---
## XPathNavigator::SelectAncestors(String, String, bool) method


选择当前节点所有具有指定本地名称和命名空间 URI 的祖先节点。

```cpp
virtual SharedPtr<XPathNodeIterator> System::Xml::XPath::XPathNavigator::SelectAncestors(String name, String namespaceURI, bool matchSelf)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| name | 字符串 | 祖先节点的本地名称。 |
| namespaceURI | 字符串 | 祖先节点的命名空间 URI。 |
| matchSelf | bool | 要在选择中包含上下文节点，请使用 **true**；否则使用 **false**。 |

### ReturnValue

一个包含所选节点的 [XPathNodeIterator](../../xpathnodeiterator/)。返回的节点按文档的逆序排列。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNodeIterator](../../xpathnodeiterator/)
* Class [String](../../../system/string/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
## XPathNavigator::SelectAncestors(XPathNodeType, bool) method


选择当前节点的所有具有匹配的 [XPathNodeType](../../xpathnodetype/) 的祖先节点。

```cpp
virtual SharedPtr<XPathNodeIterator> System::Xml::XPath::XPathNavigator::SelectAncestors(XPathNodeType type, bool matchSelf)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| type | XPathNodeType | 祖先节点的 [XPathNodeType](../../xpathnodetype/)。 |
| matchSelf | bool | 要在选择中包含上下文节点，请使用 **true**；否则使用 **false**。 |

### ReturnValue

一个包含所选节点的 [XPathNodeIterator](../../xpathnodeiterator/)。返回的节点按文档的逆序排列。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNodeIterator](../../xpathnodeiterator/)
* Enum [XPathNodeType](../../xpathnodetype/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
