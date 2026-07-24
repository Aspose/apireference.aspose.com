---
title: "System::Xml::XmlAttributeCollection::InsertBefore メソッド"
linktitle: "InsertBefore"
second_title: "C++ 用 Aspose.Page"
description: "System::Xml::XmlAttributeCollection::InsertBefore メソッド。指定された属性を、指定された参照属性の直前に挿入します（C++）。"
type: docs
weight: 500
url: /ja/cpp/system.xml/xmlattributecollection/insertbefore/
---
## XmlAttributeCollection::InsertBefore method


指定された属性を、指定された参照属性の直前に挿入します。

```cpp
SharedPtr<XmlAttribute> System::Xml::XmlAttributeCollection::InsertBefore(const SharedPtr<XmlAttribute> &newNode, const SharedPtr<XmlAttribute> &refNode)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| newNode | const SharedPtr\<XmlAttribute\>\& | 挿入する属性。 |
| refNode | const SharedPtr\<XmlAttribute\>\& | 参照属性です。**newNode** は **refNode** の前に配置されます。 |

### ReturnValue

コレクションに挿入する [XmlAttribute](../../xmlattribute/)。

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlAttribute](../../xmlattribute/)
* Class [XmlAttributeCollection](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
