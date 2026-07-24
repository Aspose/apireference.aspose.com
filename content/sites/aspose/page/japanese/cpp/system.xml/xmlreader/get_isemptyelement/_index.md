---
title: "System::Xml::XmlReader::get_IsEmptyElement メソッド"
linktitle: "get_IsEmptyElement"
second_title: "C++ 用 Aspose.Page"
description: "System::Xml::XmlReader::get_IsEmptyElement メソッド。派生クラスでオーバーライドされた場合、C++ で現在のノードが空要素かどうか（例: <MyElement/>）を示す値を取得します。"
type: docs
weight: 1300
url: /ja/cpp/system.xml/xmlreader/get_isemptyelement/
---
## XmlReader::get_IsEmptyElement method


派生クラスでオーバーライドされた場合、現在のノードが空要素かどうかを示す値を取得します（例: **<MyElement/>**）。

```cpp
virtual bool System::Xml::XmlReader::get_IsEmptyElement()=0
```


### ReturnValue

**true** if the current node is an element ([XmlReader::get_NodeType](../get_nodetype/) equals [XmlNodeType::Element](../../xmlnodetype/)) that ends with **/>**; otherwise, **false**.

## 参照

* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
