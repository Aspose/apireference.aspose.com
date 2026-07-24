---
title: "System::Xml::XmlElement::RemoveAttributeAt メソッド"
linktitle: "RemoveAttributeAt"
second_title: "C++ 用 Aspose.Page"
description: "System::Xml::XmlElement::RemoveAttributeAt メソッド。指定されたインデックスの属性ノードを要素から削除します。（削除された属性にデフォルト値がある場合、すぐに置き換えられます）C++ において。"
type: docs
weight: 2000
url: /ja/cpp/system.xml/xmlelement/removeattributeat/
---
## XmlElement::RemoveAttributeAt method


要素から指定されたインデックスの属性ノードを削除します。（削除された属性にデフォルト値がある場合、すぐに置き換えられます）。

```cpp
virtual SharedPtr<XmlNode> System::Xml::XmlElement::RemoveAttributeAt(int32_t i)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| i | int32_t | 削除するノードのインデックスです。最初のノードのインデックスは 0 です。 |

### ReturnValue

削除された属性ノード、または指定されたインデックスにノードがない場合は**nullptr**です。

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Class [XmlElement](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
