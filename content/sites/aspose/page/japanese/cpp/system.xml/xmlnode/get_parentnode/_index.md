---
title: "System::Xml::XmlNode::get_ParentNode メソッド"
linktitle: "get_ParentNode"
second_title: "C++ 用 Aspose.Page"
description: "System::Xml::XmlNode::get_ParentNode メソッド。C++ でこのノードの親ノードを返します（親を持てるノードの場合）。"
type: docs
weight: 2100
url: /ja/cpp/system.xml/xmlnode/get_parentnode/
---
## XmlNode::get_ParentNode method


このノードの親ノードを返します（親を持てるノードの場合）。

```cpp
virtual SharedPtr<XmlNode> System::Xml::XmlNode::get_ParentNode() final
```


### ReturnValue

現在のノードの親である[XmlNode](../)。
## 備考



ノードが作成されたばかりでまだツリーに追加されていない場合、またはツリーから削除された場合、親は **nullptr** です。その他のすべてのノードについては、返される値はノードの [XmlNode::get_NodeType](../get_nodetype/) に依存します。以下の表は **get_NodeType** メソッドの可能な戻り値を示しています。 |||
|-|-|
| NodeType | ParentNode の戻り値 |
| Attribute, Document, DocumentFragment, Entity, Notation | nullptr を返します；これらのノードは親を持ちません。 |
| CDATA | CDATA セクションを含む要素またはエンティティ参照を返します。 |
| Comment | コメントを含む要素、エンティティ参照、ドキュメントタイプ、またはドキュメントを返します。 |
| DocumentType | ドキュメントノードを返します。 |
| Element | 要素の親ノードを返します。要素がツリーのルートノードである場合、親はドキュメントノードです。 |
| EntityReference | エンティティ参照を含む要素、属性、またはエンティティ参照を返します。 |
| ProcessingInstruction | 処理命令を含むドキュメント、要素、ドキュメントタイプ、またはエンティティ参照を返します。 |
| Text | テキストノードを含む親要素、属性、またはエンティティ参照を返します。 |

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../)
* Class [XmlNode](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
