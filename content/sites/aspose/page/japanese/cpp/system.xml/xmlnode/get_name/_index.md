---
title: "System::Xml::XmlNode::get_Name メソッド"
linktitle: "get_Name"
second_title: "C++ 用 Aspose.Page"
description: "System::Xml::XmlNode::get_Name メソッド。派生クラスでオーバーライドされた場合、C++ でノードの修飾名を返します。"
type: docs
weight: 1500
url: /ja/cpp/system.xml/xmlnode/get_name/
---
## XmlNode::get_Name method


派生クラスでオーバーライドされた場合、ノードの修飾名を返します。

```cpp
virtual String System::Xml::XmlNode::get_Name()=0
```


### ReturnValue

ノードの修飾名。
## 備考



返される名前はノードの [XmlNode::get_NodeType](../get_nodetype/) に依存します: |||
|-|-|
| 型 | 名前 |
| Attribute | 属性の完全修飾名です。 |
| CDATA | #cdata-section |
| Comment | #comment |
| Document | #document |
| DocumentFragment | #document-fragment |
| DocumentType | ドキュメントタイプ名です。 |
| Element | 要素の修飾名です。 |
| Entity | エンティティの名前です。 |
| EntityReference | 参照されているエンティティの名前です。 |
| Notation | 表記名です。 |
| ProcessingInstruction | 処理指示のターゲットです。 |
| Text | #text |
| Whitespace | #whitespace |
| SignificantWhitespace | #significant-whitespace |
| XmlDeclaration | #xml-declaration |

## 参照

* Class [String](../../../system/string/)
* Class [XmlNode](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
