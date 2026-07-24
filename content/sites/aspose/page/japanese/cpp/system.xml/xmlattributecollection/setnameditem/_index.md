---
title: "System::Xml::XmlAttributeCollection::SetNamedItem メソッド"
linktitle: "SetNamedItem"
second_title: "C++ 用 Aspose.Page"
description: "System::Xml::XmlAttributeCollection::SetNamedItem メソッド。C++ で XmlNode::get_Name の結果を使用して XmlNode を追加します。"
type: docs
weight: 1000
url: /ja/cpp/system.xml/xmlattributecollection/setnameditem/
---
## XmlAttributeCollection::SetNamedItem method


[XmlNode](../../xmlnode/) を、その [XmlNode::get_Name](../../xmlnode/get_name/) の結果を使用して追加します。

```cpp
SharedPtr<XmlNode> System::Xml::XmlAttributeCollection::SetNamedItem(SharedPtr<XmlNode> node) override
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| ノード | SharedPtr\<XmlNode\> | このコレクションに格納する属性ノードです。ノードは後でその名前でアクセスできるようになります。同じ名前のノードがすでにコレクションに存在する場合は新しいノードで置き換えられます。存在しない場合はコレクションの末尾に追加されます。 |

### ReturnValue

**node** が同じ名前の既存ノードを置き換える場合、古いノードが返されます。そうでない場合は追加されたノードが返されます。

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Class [XmlAttributeCollection](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
