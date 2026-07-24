---
title: "System::Xml::XmlAttribute::PrependChild method"
linktitle: "PrependChild"
second_title: "C++ 用 Aspose.Page"
description: "System::Xml::XmlAttribute::PrependChild method. 指定されたノードをこのノードの子ノードリストの先頭に追加します（C++）。"
type: docs
weight: 1600
url: /ja/cpp/system.xml/xmlattribute/prependchild/
---
## XmlAttribute::PrependChild method


指定されたノードを、このノードの子ノードリストの先頭に追加します。

```cpp
SharedPtr<XmlNode> System::Xml::XmlAttribute::PrependChild(SharedPtr<XmlNode> newChild) override
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| newChild | SharedPtr\<XmlNode\> | 追加する [XmlNode](../../xmlnode/)。[XmlDocumentFragment](../../xmldocumentfragment/) の場合、ドキュメントフラグメント全体の内容がこのノードの子リストに移動されます。 |

### ReturnValue

追加された [XmlNode](../../xmlnode/)。

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Class [XmlAttribute](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
