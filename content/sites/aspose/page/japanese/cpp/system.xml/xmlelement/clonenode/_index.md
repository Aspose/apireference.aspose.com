---
title: "System::Xml::XmlElement::CloneNode メソッド"
linktitle: "CloneNode"
second_title: "C++ 用 Aspose.Page"
description: "System::Xml::XmlElement::CloneNode メソッド。C++ でこのノードの複製を作成します。"
type: docs
weight: 100
url: /ja/cpp/system.xml/xmlelement/clonenode/
---
## XmlElement::CloneNode method


このノードの複製を作成します。

```cpp
SharedPtr<XmlNode> System::Xml::XmlElement::CloneNode(bool deep) override
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| deep | bool | **true** を指定すると、指定ノード以下のサブツリーを再帰的にクローンします。**false** を指定すると、ノード自体のみ（ノードが [XmlElement](../) の場合は属性も）をクローンします。 |

### ReturnValue

クローンされたノードです。

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Class [XmlElement](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
