---
title: "System::Xml::XPath::XPathNavigator::SelectAncestors メソッド"
linktitle: "SelectAncestors"
second_title: "C++ 用 Aspose.Page"
description: "System::Xml::XPath::XPathNavigator::SelectAncestors メソッド。C++ で現在のノードの指定されたローカル名と名前空間 URI を持つすべての祖先ノードを選択します。"
type: docs
weight: 7200
url: /ja/cpp/system.xml.xpath/xpathnavigator/selectancestors/
---
## XPathNavigator::SelectAncestors(String, String, bool) method


指定されたローカル名と名前空間 URI を持つ現在のノードのすべての先祖ノードを選択します。

```cpp
virtual SharedPtr<XPathNodeIterator> System::Xml::XPath::XPathNavigator::SelectAncestors(String name, String namespaceURI, bool matchSelf)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| name | String | 祖先ノードのローカル名。 |
| namespaceURI | String | 祖先ノードの名前空間 URI。 |
| matchSelf | bool | 選択にコンテキストノードを含めるには、**true**；それ以外の場合は、**false**です。 |

### ReturnValue

選択されたノードを含む[XPathNodeIterator](../../xpathnodeiterator/)です。返されるノードは文書順の逆順です。

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNodeIterator](../../xpathnodeiterator/)
* Class [String](../../../system/string/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
## XPathNavigator::SelectAncestors(XPathNodeType, bool) method


現在のノードの先祖ノードのうち、[XPathNodeType](../../xpathnodetype/) が一致するものすべてを選択します。

```cpp
virtual SharedPtr<XPathNodeIterator> System::Xml::XPath::XPathNavigator::SelectAncestors(XPathNodeType type, bool matchSelf)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| type | XPathNodeType | 先祖ノードの[XPathNodeType](../../xpathnodetype/)です。 |
| matchSelf | bool | 選択にコンテキストノードを含めるには、**true**；それ以外の場合は、**false**です。 |

### ReturnValue

選択されたノードを含む[XPathNodeIterator](../../xpathnodeiterator/)です。返されるノードは文書順の逆順です。

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNodeIterator](../../xpathnodeiterator/)
* Enum [XPathNodeType](../../xpathnodetype/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
