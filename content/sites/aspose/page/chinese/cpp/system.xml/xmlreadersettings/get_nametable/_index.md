---
title: "System::Xml::XmlReaderSettings::get_NameTable 方法"
linktitle: "get_NameTable"
second_title: "Aspose.Page 适用于 C++"
description: "System::Xml::XmlReaderSettings::get_NameTable 方法。返回在 C++ 中用于原子化字符串比较的 XmlNameTable。"
type: docs
weight: 1500
url: /zh/cpp/system.xml/xmlreadersettings/get_nametable/
---
## XmlReaderSettings::get_NameTable method


返回用于原子化字符串比较的 [XmlNameTable](../../xmlnametable/)。

```cpp
SharedPtr<XmlNameTable> System::Xml::XmlReaderSettings::get_NameTable()
```


### ReturnValue

此 [XmlNameTable](../../xmlnametable/) 存储了使用此 [XmlReaderSettings](../) 对象创建的所有 [XmlReader](../../xmlreader/) 实例所使用的全部原子化字符串。默认是 **nullptr**。如果该值为 **nullptr**，创建的 [XmlReader](../../xmlreader/) 实例将使用一个新的空 [NameTable](../../nametable/)。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNameTable](../../xmlnametable/)
* Class [XmlReaderSettings](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
