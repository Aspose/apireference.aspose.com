---
title: "System::Xml::XmlValidatingReader::get_Value メソッド"
linktitle: "get_Value"
second_title: "C++ 用 Aspose.Page"
description: "System::Xml::XmlValidatingReader::get_Value メソッド。現在のノードのテキスト値を返します（C++）。"
type: docs
weight: 2900
url: /ja/cpp/system.xml/xmlvalidatingreader/get_value/
---
## XmlValidatingReader::get_Value method


現在のノードのテキスト値を返します。

```cpp
String System::Xml::XmlValidatingReader::get_Value() override
```


### ReturnValue

返される値はノードの XmlValidatingReader::NodeType に依存します。
## 備考



次の表は、戻り値を持つノードタイプを一覧表示しています。その他のすべてのノードタイプは [String::Empty](../../../system/string/empty/) を返します。 |||
|-|-|
| ノードタイプ | 値 |
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
* Class [XmlValidatingReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
