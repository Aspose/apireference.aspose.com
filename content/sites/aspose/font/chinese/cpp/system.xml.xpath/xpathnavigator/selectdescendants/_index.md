---
title: "System::Xml::XPath::XPathNavigator::SelectDescendants 方法"
linktitle: "SelectDescendants"
second_title: "Aspose.Font 适用于 C++"
description: "System::Xml::XPath::XPathNavigator::SelectDescendants 方法。选择当前节点的所有后代节点，这些节点的本地名称和命名空间 URI 在 C++ 中指定。"
type: docs
weight: 7400
url: /zh/cpp/system.xml.xpath/xpathnavigator/selectdescendants/
---
## XPathNavigator::SelectDescendants(String, String, bool) method


选择当前节点的所有具有指定本地名称和命名空间 URI 的后代节点。

```cpp
virtual SharedPtr<XPathNodeIterator> System::Xml::XPath::XPathNavigator::SelectDescendants(String name, String namespaceURI, bool matchSelf)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 名称 | String | 后代节点的本地名称。 |
| namespaceURI | String | 后代节点的命名空间 URI。 |
| matchSelf | bool | **true** 表示在选择中包含上下文节点；否则为 **false**。 |

### ReturnValue

一个包含所选节点的 [XPathNodeIterator](../../xpathnodeiterator/)。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNodeIterator](../../xpathnodeiterator/)
* Class [String](../../../system/string/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Font for C++](../../../)
## XPathNavigator::SelectDescendants(XPathNodeType, bool) method


选择当前节点的所有后代节点，这些节点的 [XPathNodeType](../../xpathnodetype/) 匹配。

```cpp
virtual SharedPtr<XPathNodeIterator> System::Xml::XPath::XPathNavigator::SelectDescendants(XPathNodeType type, bool matchSelf)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| type | XPathNodeType | 后代节点的 [XPathNodeType](../../xpathnodetype/)。 |
| matchSelf | bool | **true** 表示在选择中包含上下文节点；否则为 **false**。 |

### ReturnValue

一个包含所选节点的 [XPathNodeIterator](../../xpathnodeiterator/)。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNodeIterator](../../xpathnodeiterator/)
* Enum [XPathNodeType](../../xpathnodetype/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Font for C++](../../../)
