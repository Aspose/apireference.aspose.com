---
title: "System::Xml::XmlAttribute::InsertAfter メソッド"
linktitle: "InsertAfter"
second_title: "C++ 用 Aspose.Page"
description: "System::Xml::XmlAttribute::InsertAfter メソッド。C++ で指定された参照ノードの直後に指定されたノードを挿入します。"
type: docs
weight: 1400
url: /ja/cpp/system.xml/xmlattribute/insertafter/
---
## XmlAttribute::InsertAfter method


指定されたノードを、指定された参照ノードの直後に挿入します。

```cpp
SharedPtr<XmlNode> System::Xml::XmlAttribute::InsertAfter(SharedPtr<XmlNode> newChild, SharedPtr<XmlNode> refChild) override
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| newChild | SharedPtr\<XmlNode\> | 挿入する [XmlNode](../../xmlnode/)。 |
| refChild | SharedPtr\<XmlNode\> | 参照ノードである [XmlNode](../../xmlnode/)。**newChild** は **refChild** の後に配置されます。 |

### ReturnValue

挿入された [XmlNode](../../xmlnode/)。

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Class [XmlAttribute](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
