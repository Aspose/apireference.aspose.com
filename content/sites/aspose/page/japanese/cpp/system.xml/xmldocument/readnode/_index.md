---
title: "System::Xml::XmlDocument::ReadNode メソッド"
linktitle: "ReadNode"
second_title: "C++ 用 Aspose.Page"
description: "System::Xml::XmlDocument::ReadNode メソッド。XmlReader の情報に基づいて XmlNode オブジェクトを作成します。リーダーは C++ でノードまたは属性上に位置している必要があります。"
type: docs
weight: 3600
url: /ja/cpp/system.xml/xmldocument/readnode/
---
## XmlDocument::ReadNode method


[XmlReader](../../xmlreader/) の情報に基づいて [XmlNode](../../xmlnode/) オブジェクトを作成します。リーダーはノードまたは属性上に位置している必要があります。

```cpp
virtual SharedPtr<XmlNode> System::Xml::XmlDocument::ReadNode(SharedPtr<XmlReader> reader)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| リーダー | SharedPtr\<XmlReader\> | XML ソース。 |

### ReturnValue

新しい [XmlNode](../../xmlnode/)、またはノードがもう存在しない場合は **nullptr**。

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Class [XmlReader](../../xmlreader/)
* Class [XmlDocument](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
