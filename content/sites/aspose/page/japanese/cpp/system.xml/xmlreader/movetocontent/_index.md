---
title: "System::Xml::XmlReader::MoveToContent メソッド"
linktitle: "MoveToContent"
second_title: "C++ 用 Aspose.Page"
description: "System::Xml::XmlReader::MoveToContent メソッド。現在のノードがコンテンツ（空白以外のテキスト、CDATA、Element、EndElement、EntityReference、または EndEntity）ノードかどうかを確認します。ノードがコンテンツでない場合、リーダーは次のコンテンツノードまたはファイルの終端までスキップします。C++ では、次のタイプのノードをスキップします：ProcessingInstruction、DocumentType、Comment、Whitespace、または SignificantWhitespace。"
type: docs
weight: 3300
url: /ja/cpp/system.xml/xmlreader/movetocontent/
---
## XmlReader::MoveToContent method


現在のノードがコンテンツノード（空白以外のテキスト、**CDATA**、**Element**、**EndElement**、**EntityReference**、または **EndEntity**）かどうかをチェックします。ノードがコンテンツノードでない場合、リーダーは次のコンテンツノードまたはファイルの終端までスキップします。次のタイプのノードはスキップされます：**ProcessingInstruction**、**DocumentType**、**Comment**、**Whitespace**、または **SignificantWhitespace**。

```cpp
virtual XmlNodeType System::Xml::XmlReader::MoveToContent()
```


### ReturnValue

メソッドで見つかった現在のノードの [XmlReader::get_NodeType](../get_nodetype/) 値、またはリーダーが入力ストリームの終端に達した場合は [XmlNodeType::None](../../xmlnodetype/) です。

## 参照

* Enum [XmlNodeType](../../xmlnodetype/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
