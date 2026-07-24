---
title: "Metode System::Xml::XmlNodeChangedEventArgs::get_OldValue"
linktitle: "get_OldValue"
second_title: "Aspose.Page untuk C++"
description: "Metode System::Xml::XmlNodeChangedEventArgs::get_OldValue. Mengembalikan nilai asli dari node dalam C++."
type: docs
weight: 700
url: /id/cpp/system.xml/xmlnodechangedeventargs/get_oldvalue/
---
## XmlNodeChangedEventArgs::get_OldValue method


Mengembalikan nilai asli node.

```cpp
String System::Xml::XmlNodeChangedEventArgs::get_OldValue()
```


### ReturnValue

Nilai asli dari node. Metode ini mengembalikan **nullptr** jika node bukan atribut maupun node teks, atau jika node sedang disisipkan. Jika dipanggil dalam peristiwa **XmlDocument::NodeChanging**, **get_OldValue** mengembalikan nilai saat ini dari node yang akan diganti jika perubahan berhasil. Jika dipanggil dalam peristiwa **XmlDocument::NodeChanged**, **get_OldValue** mengembalikan nilai node sebelum perubahan.

## Lihat Juga

* Class [String](../../../system/string/)
* Class [XmlNodeChangedEventArgs](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
