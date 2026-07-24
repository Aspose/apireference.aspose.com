---
title: "System::Xml::XmlNamedNodeMap::Item メソッド"
linktitle: "Item"
second_title: "C++ 用 Aspose.Page"
description: "System::Xml::XmlNamedNodeMap::Item メソッド。C++ において XmlNamedNodeMap の指定されたインデックスのノードを取得します。"
type: docs
weight: 800
url: /ja/cpp/system.xml/xmlnamednodemap/item/
---
## XmlNamedNodeMap::Item method


[XmlNamedNodeMap](../) の指定されたインデックスのノードを取得します。

```cpp
virtual SharedPtr<XmlNode> System::Xml::XmlNamedNodeMap::Item(int32_t index)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| index | int32_t | 取得するノードのインデックス位置は [XmlNamedNodeMap](../) からです。インデックスはゼロベースです。そのため、最初のノードのインデックスは 0 で、最後のノードのインデックスは [XmlNamedNodeMap::get_Count](../get_count/) - 1 です。 |

### ReturnValue

指定されたインデックスにある [XmlNode](../../xmlnode/) を返します。**index** が 0 未満、または [XmlNamedNodeMap::get_Count](../get_count/) の値以上の場合、**nullptr** が返されます。

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Class [XmlNamedNodeMap](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
