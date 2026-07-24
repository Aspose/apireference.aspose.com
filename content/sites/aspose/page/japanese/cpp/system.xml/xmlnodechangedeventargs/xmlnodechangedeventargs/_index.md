---
title: "System::Xml::XmlNodeChangedEventArgs::XmlNodeChangedEventArgs コンストラクタ"
linktitle: "XmlNodeChangedEventArgs"
second_title: "C++ 用 Aspose.Page"
description: "System::Xml::XmlNodeChangedEventArgs::XmlNodeChangedEventArgs コンストラクタ。C++ で XmlNodeChangedEventArgs クラスの新しいインスタンスを初期化します。"
type: docs
weight: 100
url: /ja/cpp/system.xml/xmlnodechangedeventargs/xmlnodechangedeventargs/
---
## XmlNodeChangedEventArgs::XmlNodeChangedEventArgs constructor


[XmlNodeChangedEventArgs](../) クラスの新しいインスタンスを初期化します。

```cpp
System::Xml::XmlNodeChangedEventArgs::XmlNodeChangedEventArgs(const SharedPtr<XmlNode> &node, const SharedPtr<XmlNode> &oldParent, const SharedPtr<XmlNode> &newParent, const String &oldValue, const String &newValue, XmlNodeChangedAction action)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| node | const SharedPtr\<XmlNode\>\& | イベントを生成した [XmlNode](../../xmlnode/)。 |
| oldParent | const SharedPtr\<XmlNode\>\& | イベントを生成した [XmlNode](../../xmlnode/) の古い親 [XmlNode](../../xmlnode/)。 |
| newParent | const SharedPtr\<XmlNode\>\& | イベントを生成した [XmlNode](../../xmlnode/) の新しい親 [XmlNode](../../xmlnode/)。 |
| oldValue | const String\& | イベントを生成した [XmlNode](../../xmlnode/) の古い値。 |
| newValue | const String\& | イベントを生成した [XmlNode](../../xmlnode/) の新しい値。 |
| action | XmlNodeChangedAction | [XmlNodeChangedAction](../../xmlnodechangedaction/)。 |

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Class [String](../../../system/string/)
* Enum [XmlNodeChangedAction](../../xmlnodechangedaction/)
* Class [XmlNodeChangedEventArgs](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
