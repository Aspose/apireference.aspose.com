---
title: "System::Xml::XPath::XPathNavigator::SelectChildren メソッド"
linktitle: "SelectChildren"
second_title: "C++ 用 Aspose.Page"
description: "System::Xml::XPath::XPathNavigator::SelectChildren メソッド。C++ で指定されたローカル名と名前空間 URI を持つ現在のノードのすべての子ノードを選択します。"
type: docs
weight: 7300
url: /ja/cpp/system.xml.xpath/xpathnavigator/selectchildren/
---
## XPathNavigator::SelectChildren(String, String) method


指定されたローカル名と名前空間 URI を持つ現在のノードのすべての子ノードを選択します。

```cpp
virtual SharedPtr<XPathNodeIterator> System::Xml::XPath::XPathNavigator::SelectChildren(String name, String namespaceURI)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| name | String | 子ノードのローカル名。 |
| namespaceURI | String | 子ノードの名前空間 URI。 |

### ReturnValue

選択されたノードを含む [XPathNodeIterator](../../xpathnodeiterator/)。

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNodeIterator](../../xpathnodeiterator/)
* Class [String](../../../system/string/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
## XPathNavigator::SelectChildren(XPathNodeType) method


現在のノードの子ノードのうち、対応する [XPathNodeType](../../xpathnodetype/) を持つすべてを選択します。

```cpp
virtual SharedPtr<XPathNodeIterator> System::Xml::XPath::XPathNavigator::SelectChildren(XPathNodeType type)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| type | XPathNodeType | 子ノードの [XPathNodeType](../../xpathnodetype/)。 |

### ReturnValue

選択されたノードを含む [XPathNodeIterator](../../xpathnodeiterator/)。

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNodeIterator](../../xpathnodeiterator/)
* Enum [XPathNodeType](../../xpathnodetype/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
