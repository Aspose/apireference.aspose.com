---
title: "System::Xml::XPath::XPathNavigator::SelectChildren 方法"
linktitle: "SelectChildren"
second_title: "Aspose.Font 适用于 C++"
description: "System::Xml::XPath::XPathNavigator::SelectChildren 方法。选择当前节点中具有在 C++ 中指定的本地名称和命名空间 URI 的所有子节点。"
type: docs
weight: 7300
url: /zh/cpp/system.xml.xpath/xpathnavigator/selectchildren/
---
## XPathNavigator::SelectChildren(String, String) method


选择当前节点的所有具有指定本地名称和命名空间 URI 的子节点。

```cpp
virtual SharedPtr<XPathNodeIterator> System::Xml::XPath::XPathNavigator::SelectChildren(String name, String namespaceURI)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 名称 | String | 子节点的本地名称。 |
| namespaceURI | String | 子节点的命名空间 URI。 |

### ReturnValue

一个包含所选节点的 [XPathNodeIterator](../../xpathnodeiterator/)。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNodeIterator](../../xpathnodeiterator/)
* Class [String](../../../system/string/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Font for C++](../../../)
## XPathNavigator::SelectChildren(XPathNodeType) method


选择当前节点中具有匹配的 [XPathNodeType](../../xpathnodetype/) 的所有子节点。

```cpp
virtual SharedPtr<XPathNodeIterator> System::Xml::XPath::XPathNavigator::SelectChildren(XPathNodeType type)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| type | XPathNodeType | 子节点的 [XPathNodeType](../../xpathnodetype/)。 |

### ReturnValue

一个包含所选节点的 [XPathNodeIterator](../../xpathnodeiterator/)。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNodeIterator](../../xpathnodeiterator/)
* Enum [XPathNodeType](../../xpathnodetype/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Font for C++](../../../)
