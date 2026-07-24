---
title: "System::Xml::XmlSignificantWhitespace::CloneNode メソッド"
linktitle: "CloneNode"
second_title: "C++ 用 Aspose.Page"
description: "System::Xml::XmlSignificantWhitespace::CloneNode メソッド。C++ でこのノードの複製を作成します。"
type: docs
weight: 100
url: /ja/cpp/system.xml/xmlsignificantwhitespace/clonenode/
---
## XmlSignificantWhitespace::CloneNode method


このノードの複製を作成します。

```cpp
SharedPtr<XmlNode> System::Xml::XmlSignificantWhitespace::CloneNode(bool deep) override
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| 深さ | bool | 指定されたノード以下のサブツリーを再帰的にクローンする場合は **true**、ノード自体だけをクローンする場合は **false**。重要な空白ノードの場合、パラメータ設定に関係なくクローンされたノードは常にデータ値を含みます。 |

### ReturnValue

クローンされたノードです。

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Class [XmlSignificantWhitespace](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
