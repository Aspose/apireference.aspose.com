---
title: "System::Xml::XmlWhitespace::CloneNode method"
linktitle: "CloneNode"
second_title: "C++ 用 Aspose.Page"
description: "System::Xml::XmlWhitespace::CloneNode method. このノードの複製を C++ で作成します。"
type: docs
weight: 100
url: /ja/cpp/system.xml/xmlwhitespace/clonenode/
---
## XmlWhitespace::CloneNode method


このノードの複製を作成します。

```cpp
SharedPtr<XmlNode> System::Xml::XmlWhitespace::CloneNode(bool deep) override
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| 深さ | bool | **true** は指定されたノード以下のサブツリーを再帰的にクローンします。**false** はノード自体のみをクローンします。空白ノードの場合、クローンされたノードはパラメータ設定に関係なく常にデータ値を含みます。 |

### ReturnValue

クローンされたノードです。

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Class [XmlWhitespace](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
