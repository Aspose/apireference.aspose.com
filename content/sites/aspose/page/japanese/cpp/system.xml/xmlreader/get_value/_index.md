---
title: "System::Xml::XmlReader::get_Value メソッド"
linktitle: "get_Value"
second_title: "C++ 用 Aspose.Page"
description: "System::Xml::XmlReader::get_Value メソッド。派生クラスでオーバーライドされた場合、C++ で現在のノードのテキスト値を取得します。"
type: docs
weight: 2400
url: /ja/cpp/system.xml/xmlreader/get_value/
---
## XmlReader::get_Value method


派生クラスでオーバーライドされた場合、現在のノードのテキスト値を取得します。

```cpp
virtual String System::Xml::XmlReader::get_Value()=0
```


### ReturnValue

返される値はノードの [XmlReader::get_NodeType](../get_nodetype/) の値に依存します。
## 備考



次の表は、戻り値を持つノードタイプを一覧表示しています。その他のすべてのノードタイプは [String::Empty](../../../system/string/empty/) を返します。 |||
|-|-|
| ノード タイプ | 値 |
| Attribute | 属性の値です。 |
| CDATA | CDATA セクションの内容です。 |
| Comment | コメントの内容です。 |
| DocumentType | 内部サブセットです。 |
| ProcessingInstruction | 対象を除いた全体の内容です。 |
| SignificantWhitespace | 混在コンテンツモデルにおけるマークアップ間の空白です。 |
| Text | テキストノードの内容です。 |
| Whitespace | マークアップ間の空白です。 |
| XmlDeclaration | 宣言の内容です。 |

## 参照

* Class [String](../../../system/string/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
