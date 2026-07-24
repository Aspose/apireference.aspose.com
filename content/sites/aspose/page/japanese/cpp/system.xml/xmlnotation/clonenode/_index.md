---
title: "System::Xml::XmlNotation::CloneNode メソッド"
linktitle: "CloneNode"
second_title: "C++ 用 Aspose.Page"
description: "System::Xml::XmlNotation::CloneNode メソッド。このノードの複製を作成します。Notation ノードはクローンできません。C++ で XmlNotation オブジェクトに対してこのメソッドを呼び出すと例外がスローされます。"
type: docs
weight: 100
url: /ja/cpp/system.xml/xmlnotation/clonenode/
---
## XmlNotation::CloneNode method


このノードの複製を作成します。Notation ノードはクローンできません。[XmlNotation](../) オブジェクトに対してこのメソッドを呼び出すと例外がスローされます。

```cpp
SharedPtr<XmlNode> System::Xml::XmlNotation::CloneNode(bool deep) override
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| 深さ | bool | 指定されたノード以下のサブツリーを再帰的にクローンする場合は **true**、ノード自体のみをクローンする場合は **false** を指定します。 |

### ReturnValue

メソッドが呼び出されたノードの [XmlNode](../../xmlnode/) コピーです。

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Class [XmlNotation](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
