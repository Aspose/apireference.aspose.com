---
title: "System::Xml::XmlEntity::CloneNode メソッド"
linktitle: "CloneNode"
second_title: "C++ 用 Aspose.Page"
description: "System::Xml::XmlEntity::CloneNode メソッド。このノードの複製を作成します。エンティティノードはクローンできません。C++ で XmlEntity オブジェクトに対してこのメソッドを呼び出すと例外がスローされます。"
type: docs
weight: 100
url: /ja/cpp/system.xml/xmlentity/clonenode/
---
## XmlEntity::CloneNode method


このノードの複製を作成します。エンティティノードはクローンできません。[XmlEntity](../) オブジェクトに対してこのメソッドを呼び出すと例外がスローされます。

```cpp
SharedPtr<XmlNode> System::Xml::XmlEntity::CloneNode(bool deep) override
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| 深さ | bool | 指定されたノード以下のサブツリーを再帰的にクローンする場合は **true**、ノード自体のみをクローンする場合は **false** を指定します。 |

### ReturnValue

このメソッドが呼び出された [XmlNode](../../xmlnode/) のコピーです。

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Class [XmlEntity](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
