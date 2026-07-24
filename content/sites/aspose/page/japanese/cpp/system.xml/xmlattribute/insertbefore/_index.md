---
title: "System::Xml::XmlAttribute::InsertBefore メソッド"
linktitle: "InsertBefore"
second_title: "C++ 用 Aspose.Page"
description: "System::Xml::XmlAttribute::InsertBefore メソッド。指定されたノードを、指定された参照ノードの直前に C++ で挿入します。"
type: docs
weight: 1500
url: /ja/cpp/system.xml/xmlattribute/insertbefore/
---
## XmlAttribute::InsertBefore method


指定されたノードを、指定された参照ノードの直前に挿入します。

```cpp
SharedPtr<XmlNode> System::Xml::XmlAttribute::InsertBefore(SharedPtr<XmlNode> newChild, SharedPtr<XmlNode> refChild) override
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| newChild | SharedPtr\<XmlNode\> | 挿入する [XmlNode](../../xmlnode/)。 |
| refChild | SharedPtr\<XmlNode\> | 参照ノードとなる [XmlNode](../../xmlnode/)。**newChild** はこのノードの前に配置されます。 |

### ReturnValue

挿入された [XmlNode](../../xmlnode/)。

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Class [XmlAttribute](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
