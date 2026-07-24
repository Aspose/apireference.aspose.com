---
title: "System::Xml::XmlNodeChangedEventArgs::get_NewValue メソッド"
linktitle: "get_NewValue"
second_title: "C++ 用 Aspose.Page"
description: "System::Xml::XmlNodeChangedEventArgs::get_NewValue メソッド。C++ でノードの新しい値を返します。"
type: docs
weight: 400
url: /ja/cpp/system.xml/xmlnodechangedeventargs/get_newvalue/
---
## XmlNodeChangedEventArgs::get_NewValue method


ノードの新しい値を返します。

```cpp
String System::Xml::XmlNodeChangedEventArgs::get_NewValue()
```


### ReturnValue

ノードの新しい値。このメソッドは、ノードが属性でもテキストノードでもない場合、またはノードが削除される場合は **nullptr** を返します。**XmlDocument::NodeChanging** イベント内で呼び出された場合、**get_NewValue** は変更が成功したときのノードの値を返します。**XmlDocument::NodeChanged** イベント内で呼び出された場合、**get_NewValue** は現在のノードの値を返します。

## 参照

* Class [String](../../../system/string/)
* Class [XmlNodeChangedEventArgs](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
