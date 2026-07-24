---
title: "System::Xml::XmlNamedNodeMap::SetNamedItem メソッド"
linktitle: "SetNamedItem"
second_title: "C++ 用 Aspose.Page"
description: "System::Xml::XmlNamedNodeMap::SetNamedItem メソッド。C++ において XmlNode::get_Name の値を使用して XmlNode を追加します。"
type: docs
weight: 1000
url: /ja/cpp/system.xml/xmlnamednodemap/setnameditem/
---
## XmlNamedNodeMap::SetNamedItem method


[XmlNode](../../xmlnode/) をその [XmlNode::get_Name](../../xmlnode/get_name/) の値を使用して追加します。

```cpp
virtual SharedPtr<XmlNode> System::Xml::XmlNamedNodeMap::SetNamedItem(SharedPtr<XmlNode> node)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| node | SharedPtr\<XmlNode\> | [XmlNamedNodeMap](../) に格納するための [XmlNode](../../xmlnode/)。同じ名前のノードがマップに既に存在する場合、新しいノードで置き換えられます。 |

### ReturnValue

もし **node** が同じ名前の既存ノードを置き換える場合、古いノードが返されます。そうでなければ **nullptr** が返されます。

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Class [XmlNamedNodeMap](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
