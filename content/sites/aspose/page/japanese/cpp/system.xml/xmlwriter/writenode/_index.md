---
title: "System::Xml::XmlWriter::WriteNode メソッド"
linktitle: "WriteNode"
second_title: "C++ 用 Aspose.Page"
description: "System::Xml::XmlWriter::WriteNode メソッド。派生クラスでオーバーライドされた場合、リーダーからライターへすべてをコピーし、リーダーを次の兄弟要素の開始位置へ移動させます（C++）。"
type: docs
weight: 2600
url: /ja/cpp/system.xml/xmlwriter/writenode/
---
## XmlWriter::WriteNode(SharedPtr\<XmlReader\>, bool) method


派生クラスでオーバーライドされた場合、リーダーからライターへすべてをコピーし、リーダーを次の兄弟要素の開始位置へ移動させます。

```cpp
virtual void System::Xml::XmlWriter::WriteNode(SharedPtr<XmlReader> reader, bool defattr)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| reader | SharedPtr\<XmlReader\> | 読み取り元となる [XmlReader](../../xmlreader/)。 |
| defattr | bool | デフォルト属性を[XmlReader](../../xmlreader/)からコピーする場合は**true**、それ以外の場合は**false**です。 |

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../../xmlreader/)
* Class [XmlWriter](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlWriter::WriteNode(SharedPtr\<XPath::XPathNavigator\>, bool) method


XPathNavigator オブジェクトからライターへすべてをコピーします。XPathNavigator の位置は変更されません。

```cpp
virtual void System::Xml::XmlWriter::WriteNode(SharedPtr<XPath::XPathNavigator> navigator, bool defattr)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| ナビゲーター | SharedPtr\<XPath::XPathNavigator\> | コピー元となる XPathNavigator。 |
| defattr | bool | **true** はデフォルト属性をコピーします。そうでなければ **false**。 |

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNavigator](../../../system.xml.xpath/xpathnavigator/)
* Class [XmlWriter](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
