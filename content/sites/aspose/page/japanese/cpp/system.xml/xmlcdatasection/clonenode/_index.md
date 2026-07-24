---
title: "System::Xml::XmlCDataSection::CloneNode メソッド"
linktitle: "CloneNode"
second_title: "C++ 用 Aspose.Page"
description: "System::Xml::XmlCDataSection::CloneNode メソッド。C++ でこのノードの複製を作成します。"
type: docs
weight: 100
url: /ja/cpp/system.xml/xmlcdatasection/clonenode/
---
## XmlCDataSection::CloneNode method


このノードの複製を作成します。

```cpp
SharedPtr<XmlNode> System::Xml::XmlCDataSection::CloneNode(bool deep) override
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| 深さ | bool | **true**：指定されたノード以下のサブツリーを再帰的にクローンする；**false**：ノード自体のみをクローンする。CDATA ノードは子を持たないため、パラメータ設定に関係なく、クローンされたノードは常にデータ内容を含みます。 |

### ReturnValue

クローンされたノードです。

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Class [XmlCDataSection](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
