---
title: "System::Xml::XmlDocumentType::CloneNode メソッド"
linktitle: "CloneNode"
second_title: "C++ 用 Aspose.Page"
description: "System::Xml::XmlDocumentType::CloneNode メソッド。C++ でこのノードの複製を作成します。"
type: docs
weight: 100
url: /ja/cpp/system.xml/xmldocumenttype/clonenode/
---
## XmlDocumentType::CloneNode method


このノードの複製を作成します。

```cpp
SharedPtr<XmlNode> System::Xml::XmlDocumentType::CloneNode(bool deep) override
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| 深さ | bool | **true** は指定されたノード以下のサブツリーを再帰的にクローンします。**false** はノード自体のみをクローンします。DocumentType ノードの場合、パラメーター設定に関係なく、クローンされたノードは常にサブツリーを含みます。 |

### ReturnValue

クローンされたノードです。

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Class [XmlDocumentType](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
