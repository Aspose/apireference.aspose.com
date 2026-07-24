---
title: "System::Xml::XmlTextReader::get_Name メソッド"
linktitle: "get_Name"
second_title: "C++ 用 Aspose.Page"
description: "System::Xml::XmlTextReader::get_Name メソッド。現在のノードの完全修飾名を返します。C++ 用です。"
type: docs
weight: 1900
url: /ja/cpp/system.xml/xmltextreader/get_name/
---
## XmlTextReader::get_Name method


現在のノードの修飾名を返します。

```cpp
String System::Xml::XmlTextReader::get_Name() override
```


### ReturnValue

現在のノードの完全修飾名です。例として、要素 **<bk:book>** の **Name** は **bk:book** です。
## 備考



返される名前はノードの [XmlTextReader::get_NodeType](../get_nodetype/) の値に依存します。以下のノードタイプは一覧の値を返します。それ以外のノードタイプは空文字列を返します。 |||
|-|-|
| ノードタイプ | 名前 |
| Attribute | 属性の名前です。 |
| DocumentType | ドキュメントタイプ名です。 |
| Element | タグ名です。 |
| EntityReference | 参照されているエンティティの名前です。 |
| ProcessingInstruction | 処理指示のターゲットです。 |
| XmlDeclaration | 文字列リテラル xml です。 |

## 参照

* Class [String](../../../system/string/)
* Class [XmlTextReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
