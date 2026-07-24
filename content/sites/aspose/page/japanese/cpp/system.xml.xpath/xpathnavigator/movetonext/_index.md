---
title: "System::Xml::XPath::XPathNavigator::MoveToNext メソッド"
linktitle: "MoveToNext"
second_title: "C++ 用 Aspose.Page"
description: "System::Xml::XPath::XPathNavigator::MoveToNext メソッド。派生クラスでオーバーライドされた場合、C++ で現在のノードの次の兄弟ノードへ XPathNavigator を移動させます。"
type: docs
weight: 6000
url: /ja/cpp/system.xml.xpath/xpathnavigator/movetonext/
---
## XPathNavigator::MoveToNext() method


派生クラスでオーバーライドされた場合、現在のノードの次の兄弟ノードへ [XPathNavigator](../) を移動させます。

```cpp
virtual bool System::Xml::XPath::XPathNavigator::MoveToNext()=0
```


### ReturnValue

**true** if the [XPathNavigator](../) is successful moving to the next sibling node; otherwise **false** if there are no more siblings or if the [XPathNavigator](../) is currently positioned on an attribute node. If **false**, the position of the [XPathNavigator](../) is unchanged.

## 参照

* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
## XPathNavigator::MoveToNext(String, String) method


指定されたローカル名と名前空間 URI を持つ次の兄弟ノードへ [XPathNavigator](../) を移動させます。

```cpp
virtual bool System::Xml::XPath::XPathNavigator::MoveToNext(String localName, String namespaceURI)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| localName | String | 移動先の次の兄弟ノードのローカル名です。 |
| namespaceURI | String | 移動先の次の兄弟ノードの名前空間 URI です。 |

### ReturnValue

**true** if the [XPathNavigator](../) is successful moving to the next sibling node; **false** if there are no more siblings, or if the [XPathNavigator](../) is currently positioned on an attribute node. If **false**, the position of the [XPathNavigator](../) is unchanged.

## 参照

* Class [String](../../../system/string/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
## XPathNavigator::MoveToNext(XPathNodeType) method


指定された [XPathNodeType](../../xpathnodetype/) に一致する、現在のノードの次の兄弟ノードへ [XPathNavigator](../) を移動させます。

```cpp
virtual bool System::Xml::XPath::XPathNavigator::MoveToNext(XPathNodeType type)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| type | XPathNodeType | 移動先の兄弟ノードの [XPathNodeType](../../xpathnodetype/) です。 |

### ReturnValue

**true** if the [XPathNavigator](../) is successful moving to the next sibling node; otherwise, **false** if there are no more siblings or if the [XPathNavigator](../) is currently positioned on an attribute node. If **false**, the position of the [XPathNavigator](../) is unchanged.

## 参照

* Enum [XPathNodeType](../../xpathnodetype/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
