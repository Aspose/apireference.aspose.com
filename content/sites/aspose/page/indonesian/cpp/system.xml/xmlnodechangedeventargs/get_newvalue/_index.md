---
title: "Metode System::Xml::XmlNodeChangedEventArgs::get_NewValue"
linktitle: "get_NewValue"
second_title: "Aspose.Page untuk C++"
description: "Metode System::Xml::XmlNodeChangedEventArgs::get_NewValue. Mengembalikan nilai baru dari node dalam C++."
type: docs
weight: 400
url: /id/cpp/system.xml/xmlnodechangedeventargs/get_newvalue/
---
## XmlNodeChangedEventArgs::get_NewValue method


Mengembalikan nilai baru dari node.

```cpp
String System::Xml::XmlNodeChangedEventArgs::get_NewValue()
```


### ReturnValue

Nilai baru dari node. Metode ini mengembalikan **nullptr** jika node bukan atribut maupun node teks, atau jika node sedang dihapus. Jika dipanggil dalam peristiwa **XmlDocument::NodeChanging**, **get_NewValue** mengembalikan nilai node jika perubahan berhasil. Jika dipanggil dalam peristiwa **XmlDocument::NodeChanged**, **get_NewValue** mengembalikan nilai saat ini dari node.

## Lihat Juga

* Class [String](../../../system/string/)
* Class [XmlNodeChangedEventArgs](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
