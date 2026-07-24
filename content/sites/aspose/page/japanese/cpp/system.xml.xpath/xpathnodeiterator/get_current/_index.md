---
title: "System::Xml::XPath::XPathNodeIterator::get_Current メソッド"
linktitle: "get_Current"
second_title: "C++ 用 Aspose.Page"
description: "System::Xml::XPath::XPathNodeIterator::get_Current メソッド。派生クラスでオーバーライドされた場合、C++ で現在のコンテキストノード上に位置するこの XPathNodeIterator の XPathNavigator オブジェクトを取得します。"
type: docs
weight: 400
url: /ja/cpp/system.xml.xpath/xpathnodeiterator/get_current/
---
## XPathNodeIterator::get_Current method


派生クラスでオーバーライドされた場合、この [XPathNodeIterator](../) の現在のコンテキストノード上に位置する [XPathNavigator](../../xpathnavigator/) オブジェクトを取得します。

```cpp
virtual const SharedPtr<XPathNavigator> & System::Xml::XPath::XPathNodeIterator::get_Current()=0
```


### ReturnValue

選択されたノード集合が取得されたコンテキストノード上に位置する [XPathNavigator](../../xpathnavigator/) オブジェクトです。選択された集合の最初のノードに [XPathNodeIterator](../) を移動させるには、[XPathNodeIterator::MoveNext](../movenext/) メソッドを呼び出す必要があります。

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNavigator](../../xpathnavigator/)
* Class [XPathNodeIterator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
