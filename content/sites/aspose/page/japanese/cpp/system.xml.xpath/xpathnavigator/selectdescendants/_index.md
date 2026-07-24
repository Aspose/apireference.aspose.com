---
title: "System::Xml::XPath::XPathNavigator::SelectDescendants メソッド"
linktitle: "SelectDescendants"
second_title: "C++ 用 Aspose.Page"
description: "System::Xml::XPath::XPathNavigator::SelectDescendants メソッド。C++で指定されたローカル名と名前空間URIを持つ、現在のノードのすべての子孫ノードを選択します。"
type: docs
weight: 7400
url: /ja/cpp/system.xml.xpath/xpathnavigator/selectdescendants/
---
## XPathNavigator::SelectDescendants(String, String, bool) method


指定されたローカル名と名前空間 URI を持つ現在のノードのすべての子孫ノードを選択します。

```cpp
virtual SharedPtr<XPathNodeIterator> System::Xml::XPath::XPathNavigator::SelectDescendants(String name, String namespaceURI, bool matchSelf)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| name | String | 子孫ノードのローカル名。 |
| namespaceURI | String | 子孫ノードの名前空間URI。 |
| matchSelf | bool | **true** を指定するとコンテキストノードを選択に含めます。そうでなければ **false**。 |

### ReturnValue

選択されたノードを含む [XPathNodeIterator](../../xpathnodeiterator/)。

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNodeIterator](../../xpathnodeiterator/)
* Class [String](../../../system/string/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
## XPathNavigator::SelectDescendants(XPathNodeType, bool) method


現在のノードの、[XPathNodeType](../../xpathnodetype/) が一致するすべての子孫ノードを選択します。

```cpp
virtual SharedPtr<XPathNodeIterator> System::Xml::XPath::XPathNavigator::SelectDescendants(XPathNodeType type, bool matchSelf)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| type | XPathNodeType | 子孫ノードの [XPathNodeType](../../xpathnodetype/)。 |
| matchSelf | bool | **true** を指定するとコンテキストノードを選択に含めます。そうでなければ **false**。 |

### ReturnValue

選択されたノードを含む [XPathNodeIterator](../../xpathnodeiterator/)。

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNodeIterator](../../xpathnodeiterator/)
* Enum [XPathNodeType](../../xpathnodetype/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
