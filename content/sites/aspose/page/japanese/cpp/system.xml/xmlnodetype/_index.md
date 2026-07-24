---
title: "System::Xml::XmlNodeType 列挙体"
linktitle: "XmlNodeType"
second_title: "C++ 用 Aspose.Page"
description: "System::Xml::XmlNodeType 列挙体。C++ におけるノードの種類を指定します。"
type: docs
weight: 6200
url: /ja/cpp/system.xml/xmlnodetype/
---
## XmlNodeType enum


ノードの種類を指定します。

```cpp
enum class XmlNodeType
```

### 値

| 名前 | 値 | 説明 |
| --- | --- | --- |
| None | 0 | [XmlReader](../xmlreader/) が **Read** メソッドを呼び出していない場合に返されます。 |
| Element | 1 | 要素（例: **<item>**）。 |
| Attribute | 2 | 属性（例: **id='123'**）。 |
| Text | 3 | ノードのテキスト内容。[XmlNodeType::Text](./) ノードは子ノードを持つことができません。これは [XmlNodeType::Attribute](./)、[XmlNodeType::DocumentFragment](./)、[XmlNodeType::Element](./)、および [XmlNodeType::EntityReference](./) ノードの子ノードとして現れます。 |
| CDATA | 4 | CDATA セクション（例: **my escaped text**）。 |
| EntityReference | 5 | エンティティへの参照（例: **&num;**）。 |
| Entity | 6 | エンティティ宣言（例: **<!ENTITY...>**）。 |
| ProcessingInstruction | 7 | 処理命令（例: **<?pi test?>**）。 |
| Comment | 8 | コメント（例: ****）。 |
| Document | 9 | ドキュメントツリーのルートとして、XML ドキュメント全体へのアクセスを提供するドキュメントオブジェクト。 |
| DocumentType | 10 | 次のタグで示される文書型宣言です（例: **<!DOCTYPE...>**）。 |
| DocumentFragment | 11 | 文書フラグメントです。 |
| Notation | 12 | 文書型宣言内の表記（例: **<!NOTATION...>**）。 |
| Whitespace | 13 | マークアップ間の空白です。 |
| SignificantWhitespace | 14 | 混在コンテンツモデルにおけるマークアップ間の空白、または **xml:space=\"preserve\"** スコープ内の空白です。 |
| EndElement | 15 | 終了要素タグです（例: ****）。 |
| EndEntity | 16 | エンティティ置換の終端に達したとき、[XmlReader](../xmlreader/) が [XmlReader::ResolveEntity](../xmlreader/resolveentity/) の呼び出しの結果として返されます。 |
| XmlDeclaration | 17 | XML 宣言です（例: **<?xml version='1.0'?>**）。[XmlNodeType::XmlDeclaration](./) ノードは文書内で最初のノードでなければなりません。子ノードを持つことはできません。[XmlNodeType::Document](./) ノードの子ノードです。バージョンやエンコーディング情報を提供する属性を持つことができます。 |

## 参照

* Namespace [System::Xml](../)
* Library [Aspose.Page for C++](../../)
