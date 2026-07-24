---
title: "System::Xml::XmlComment::CloneNode メソッド"
linktitle: "CloneNode"
second_title: "C++ 用 Aspose.Page"
description: "System::Xml::XmlComment::CloneNode メソッド。このノードの複製を C++ で作成します。"
type: docs
weight: 100
url: /ja/cpp/system.xml/xmlcomment/clonenode/
---
## XmlComment::CloneNode method


このノードの複製を作成します。

```cpp
SharedPtr<XmlNode> System::Xml::XmlComment::CloneNode(bool deep) override
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| 深さ | bool | **true** は指定されたノード以下のサブツリーを再帰的にクローンします。**false** はノード自体のみをクローンします。コメントノードは子を持たないため、パラメータ設定に関係なくクローンされたノードは常にテキストコンテンツを含みます。 |

### ReturnValue

クローンされたノードです。

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Class [XmlComment](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
