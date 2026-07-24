---
title: "System::Xml::XPath::XPathNavigator::MoveToChild メソッド"
linktitle: "MoveToChild"
second_title: "C++ 用 Aspose.Page"
description: "System::Xml::XPath::XPathNavigator::MoveToChild メソッド。C++ で指定されたローカル名と名前空間 URI を持つ子ノードへ XPathNavigator を移動します。"
type: docs
weight: 5200
url: /ja/cpp/system.xml.xpath/xpathnavigator/movetochild/
---
## XPathNavigator::MoveToChild(String, String) method


[XPathNavigator](../) を指定されたローカル名と名前空間 URI を持つ子ノードへ移動します。

```cpp
virtual bool System::Xml::XPath::XPathNavigator::MoveToChild(String localName, String namespaceURI)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| localName | String | 移動先の子ノードのローカル名。 |
| namespaceURI | String | 移動先の子ノードの名前空間 URI。 |

### ReturnValue

**true** if the [XPathNavigator](../) is successful moving to the child node; otherwise, **false**. If **false**, the position of the [XPathNavigator](../) is unchanged.

## 参照

* Class [String](../../../system/string/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
## XPathNavigator::MoveToChild(XPathNodeType) method


[XPathNavigator](../) を指定された [XPathNodeType](../../xpathnodetype/) の子ノードへ移動します。

```cpp
virtual bool System::Xml::XPath::XPathNavigator::MoveToChild(XPathNodeType type)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| type | XPathNodeType | 移動先の子ノードの [XPathNodeType](../../xpathnodetype/)。 |

### ReturnValue

**true** if the [XPathNavigator](../) is successful moving to the child node; otherwise, **false**. If **false**, the position of the [XPathNavigator](../) is unchanged.

## 参照

* Enum [XPathNodeType](../../xpathnodetype/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
