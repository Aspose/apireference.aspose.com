---
title: "System::Xml::XmlReader::get_Name メソッド"
linktitle: "get_Name"
second_title: "C++ 用 Aspose.Page"
description: "System::Xml::XmlReader::get_Name メソッド。派生クラスでオーバーライドされた場合、C++ で現在のノードの完全修飾名を取得します。"
type: docs
weight: 1500
url: /ja/cpp/system.xml/xmlreader/get_name/
---
## XmlReader::get_Name method


派生クラスでオーバーライドされた場合、現在のノードの修飾名を取得します。

```cpp
virtual String System::Xml::XmlReader::get_Name()
```


### ReturnValue

現在のノードの完全修飾名です。例として、要素 **<bk:book>** の **Name** は **bk:book** です。
## 備考



返される名前はノードの [XmlReader::get_NodeType](../get_nodetype/) の値に依存します。以下のノードタイプは一覧の値を返します。その他のノードタイプは空文字列を返します。 |||
|-|-|
| ノード タイプ | 名前 |
| Attribute | 属性の名前です。 |
| DocumentType | ドキュメントタイプ名です。 |
| Element | タグ名です。 |
| EntityReference | 参照されているエンティティの名前です。 |
| ProcessingInstruction | 処理指示のターゲットです。 |
| XmlDeclaration | 文字列リテラル xml です。 |

## 参照

* Class [String](../../../system/string/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
