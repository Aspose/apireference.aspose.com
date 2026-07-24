---
title: "System::Xml::XmlReaderSettings::get_NameTable メソッド"
linktitle: "get_NameTable"
second_title: "C++ 用 Aspose.Page"
description: "System::Xml::XmlReaderSettings::get_NameTable メソッド。C++ でアトミック文字列比較に使用される XmlNameTable を返します。"
type: docs
weight: 1500
url: /ja/cpp/system.xml/xmlreadersettings/get_nametable/
---
## XmlReaderSettings::get_NameTable method


アトミック文字列比較に使用される [XmlNameTable](../../xmlnametable/) を返します。

```cpp
SharedPtr<XmlNameTable> System::Xml::XmlReaderSettings::get_NameTable()
```


### ReturnValue

この [XmlReaderSettings](../) オブジェクトを使用して作成されたすべての [XmlReader](../../xmlreader/) インスタンスで使用されるすべてのアトミック文字列を格納する [XmlNameTable](../../xmlnametable/)。デフォルトは **nullptr** です。この値が **nullptr** の場合、作成された [XmlReader](../../xmlreader/) インスタンスは新しい空の [NameTable](../../nametable/) を使用します。

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNameTable](../../xmlnametable/)
* Class [XmlReaderSettings](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
