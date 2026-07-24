---
title: "System::Xml::XmlNode::get_LocalName メソッド"
linktitle: "get_LocalName"
second_title: "C++ 用 Aspose.Page"
description: "System::Xml::XmlNode::get_LocalName メソッド。C++ で派生クラスでオーバーライドされた場合、ノードのローカル名を返します。"
type: docs
weight: 1400
url: /ja/cpp/system.xml/xmlnode/get_localname/
---
## XmlNode::get_LocalName method


派生クラスでオーバーライドされた場合、ノードのローカル名を返します。

```cpp
virtual String System::Xml::XmlNode::get_LocalName()=0
```


### ReturnValue

プレフィックスが除かれたノードの名前です。例えば、要素 **<bk:book>** の場合、**LocalName** は **book** です。
## 備考



返される名前はノードの [XmlNode::get_NodeType](../get_nodetype/) に依存します: |||
|-|-|
| 型 | 名前 |
| Attribute | 属性のローカル名。 |
| CDATA | #cdata-section |
| Comment | #comment |
| Document | #document |
| DocumentFragment | #document-fragment |
| DocumentType | ドキュメントタイプ名です。 |
| Element | 要素のローカル名です。 |
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
