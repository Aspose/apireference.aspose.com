---
title: "System::Xml::XmlNodeChangedEventArgs::get_OldValue メソッド"
linktitle: "get_OldValue"
second_title: "C++ 用 Aspose.Page"
description: "System::Xml::XmlNodeChangedEventArgs::get_OldValue メソッド。C++ でノードの元の値を返します。"
type: docs
weight: 700
url: /ja/cpp/system.xml/xmlnodechangedeventargs/get_oldvalue/
---
## XmlNodeChangedEventArgs::get_OldValue method


ノードの元の値を返します。

```cpp
String System::Xml::XmlNodeChangedEventArgs::get_OldValue()
```


### ReturnValue

ノードの元の値。このメソッドは、ノードが属性でもテキストノードでもない場合、またはノードが挿入される場合は **nullptr** を返します。**XmlDocument::NodeChanging** イベント内で呼び出された場合、**get_OldValue** は変更が成功したときに置き換えられるノードの現在の値を返します。**XmlDocument::NodeChanged** イベント内で呼び出された場合、**get_OldValue** は変更前のノードの値を返します。

## 参照

* Class [String](../../../system/string/)
* Class [XmlNodeChangedEventArgs](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
