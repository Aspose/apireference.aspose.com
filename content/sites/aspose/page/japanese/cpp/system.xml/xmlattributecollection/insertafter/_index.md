---
title: "System::Xml::XmlAttributeCollection::InsertAfter メソッド"
linktitle: "InsertAfter"
second_title: "C++ 用 Aspose.Page"
description: "System::Xml::XmlAttributeCollection::InsertAfter メソッド。C++ で指定された属性を、指定された参照属性の直後に挿入します。"
type: docs
weight: 400
url: /ja/cpp/system.xml/xmlattributecollection/insertafter/
---
## XmlAttributeCollection::InsertAfter method


指定された属性を、指定された参照属性の直後に挿入します。

```cpp
SharedPtr<XmlAttribute> System::Xml::XmlAttributeCollection::InsertAfter(const SharedPtr<XmlAttribute> &newNode, const SharedPtr<XmlAttribute> &refNode)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| newNode | const SharedPtr\<XmlAttribute\>\& | 挿入する属性。 |
| refNode | const SharedPtr\<XmlAttribute\>\& | 参照属性です。**newNode** は **refNode** の後に配置されます。 |

### ReturnValue

コレクションに挿入する [XmlAttribute](../../xmlattribute/)。

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlAttribute](../../xmlattribute/)
* Class [XmlAttributeCollection](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
