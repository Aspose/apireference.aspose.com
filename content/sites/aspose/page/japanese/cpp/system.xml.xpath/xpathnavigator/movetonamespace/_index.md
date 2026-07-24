---
title: "System::Xml::XPath::XPathNavigator::MoveToNamespace メソッド"
linktitle: "MoveToNamespace"
second_title: "C++ 用 Aspose.Page"
description: "System::Xml::XPath::XPathNavigator::MoveToNamespace メソッド。C++ で指定された名前空間プレフィックスを持つ名前空間ノードへ XPathNavigator を移動させます。"
type: docs
weight: 5900
url: /ja/cpp/system.xml.xpath/xpathnavigator/movetonamespace/
---
## XPathNavigator::MoveToNamespace method


[XPathNavigator](../) を指定された名前空間プレフィックスを持つ名前空間ノードへ移動させます。

```cpp
virtual bool System::Xml::XPath::XPathNavigator::MoveToNamespace(String name)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| name | String | 名前空間ノードの名前空間プレフィックスです。 |

### ReturnValue

**true** if the [XPathNavigator](../) is successful moving to the specified namespace; **false** if a matching namespace node was not found, or if the [XPathNavigator](../) is not positioned on an element node. If **false**, the position of the [XPathNavigator](../) is unchanged.

## 参照

* Class [String](../../../system/string/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
