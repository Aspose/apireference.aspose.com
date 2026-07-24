---
title: "System::Xml::XPath::XPathNodeIterator クラス"
linktitle: "XPathNodeIterator"
second_title: "C++ 用 Aspose.Page"
description: "System::Xml::XPath::XPathNodeIterator クラス。C++ で選択されたノードの集合に対するイテレータを提供します。"
type: docs
weight: 600
url: /ja/cpp/system.xml.xpath/xpathnodeiterator/
---
## XPathNodeIterator class


選択されたノード集合に対するイテレータを提供します。

```cpp
class XPathNodeIterator : public System::Collections::Generic::IEnumerable<SharedPtr<System::Xml::XPath::XPathNavigator>>
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| virtual [Clone](./clone/)() | 派生クラスでオーバーライドされた場合、この [XPathNodeIterator](./) オブジェクトのクローンを返します。 |
| virtual [get_Count](./get_count/)() | 選択されたノード集合の最後のノードのインデックスを返します。 |
| virtual [get_Current](./get_current/)() | 派生クラスでオーバーライドされた場合、この [XPathNodeIterator](./) に対する [XPathNavigator](../xpathnavigator/) オブジェクトを取得し、現在のコンテキストノードに位置付けます。 |
| virtual [get_CurrentPosition](./get_currentposition/)() | 派生クラスでオーバーライドされた場合、選択されたノード集合における現在位置のインデックスを取得します。 |
| [GetEnumerator](./getenumerator/)() override | 選択されたノード集合を反復するための IEnumerator オブジェクトを返します。 |
| virtual [MoveNext](./movenext/)() | 派生クラスでオーバーライドされた場合、[XPathNodeIterator::get_Current](./get_current/) メソッドが返す [XPathNavigator](../xpathnavigator/) オブジェクトを、選択されたノード集合の次のノードへ移動させます。 |
| [XPathNodeIterator](./xpathnodeiterator/)() | [XPathNodeIterator](./) クラスの新しいインスタンスを初期化します。 |
## Typedefs

| 型定義 | 説明 |
| --- | --- |
| [Ptr](./ptr/) | このクラスのインスタンスへの共有ポインタのエイリアスです。 |
## 参照

* Class [IEnumerable](../../system.collections.generic/ienumerable/)
* Namespace [System::Xml::XPath](../)
* Library [Aspose.Page for C++](../../)
