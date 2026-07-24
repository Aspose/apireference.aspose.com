---
title: "System::Xml::XmlEntityReference::CloneNode メソッド"
linktitle: "CloneNode"
second_title: "C++ 用 Aspose.Page"
description: "System::Xml::XmlEntityReference::CloneNode メソッド。C++ でこのノードの複製を作成します。"
type: docs
weight: 100
url: /ja/cpp/system.xml/xmlentityreference/clonenode/
---
## XmlEntityReference::CloneNode method


このノードの複製を作成します。

```cpp
SharedPtr<XmlNode> System::Xml::XmlEntityReference::CloneNode(bool deep) override
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| deep | bool | **true** は、指定されたノード以下のサブツリーを再帰的にクローンします。**false** は、ノード自体のみをクローンします。[XmlEntityReference](../) ノードの場合、このメソッドは常に子を持たないエンティティ参照ノードを返します。置換テキストはノードが親に挿入されたときに設定されます。 |

### ReturnValue

クローンされたノードです。

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Class [XmlEntityReference](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
