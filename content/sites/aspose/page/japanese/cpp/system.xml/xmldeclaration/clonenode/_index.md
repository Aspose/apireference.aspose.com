---
title: "System::Xml::XmlDeclaration::CloneNode method"
linktitle: "CloneNode"
second_title: "C++ 用 Aspose.Page"
description: "System::Xml::XmlDeclaration::CloneNode メソッド。このノードの複製を C++ で作成します。"
type: docs
weight: 100
url: /ja/cpp/system.xml/xmldeclaration/clonenode/
---
## XmlDeclaration::CloneNode method


このノードの複製を作成します。

```cpp
SharedPtr<XmlNode> System::Xml::XmlDeclaration::CloneNode(bool deep) override
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| deep | bool | **true** は指定されたノード以下のサブツリーを再帰的にクローンします。**false** はノード自体のみをクローンします。 [XmlDeclaration](../) ノードは子を持たないため、クローンされたノードは常にデータ値を含み、パラメータ設定に関係なく含まれます。 |

### ReturnValue

クローンされたノードです。

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Class [XmlDeclaration](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
