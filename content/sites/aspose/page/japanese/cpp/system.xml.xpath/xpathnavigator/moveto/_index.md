---
title: "System::Xml::XPath::XPathNavigator::MoveTo メソッド"
linktitle: "MoveTo"
second_title: "C++ 用 Aspose.Page"
description: "System::Xml::XPath::XPathNavigator::MoveTo メソッド。派生クラスでオーバーライドされた場合、C++ で指定された XPathNavigator と同じ位置に XPathNavigator を移動させます。"
type: docs
weight: 5000
url: /ja/cpp/system.xml.xpath/xpathnavigator/moveto/
---
## XPathNavigator::MoveTo method


派生クラスでオーバーライドされた場合、指定された[XPathNavigator](../) と同じ位置に[XPathNavigator](../) を移動させます。

```cpp
virtual bool System::Xml::XPath::XPathNavigator::MoveTo(SharedPtr<XPathNavigator> other)=0
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| other | SharedPtr\<XPathNavigator\> | 移動したいノード上に位置する[XPathNavigator](../)です。 |

### ReturnValue

**true** if the [XPathNavigator](../) is successful moving to the same position as the specified [XPathNavigator](../); otherwise, **false**. If **false**, the position of the [XPathNavigator](../) is unchanged.

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNavigator](../)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
