---
title: "Metode System::Xml::XmlReaderSettings::get_NameTable"
linktitle: "get_NameTable"
second_title: "Aspose.Page untuk C++"
description: "Metode System::Xml::XmlReaderSettings::get_NameTable. Mengembalikan XmlNameTable yang digunakan untuk perbandingan string teratomisasi dalam C++."
type: docs
weight: 1500
url: /id/cpp/system.xml/xmlreadersettings/get_nametable/
---
## XmlReaderSettings::get_NameTable method


Mengembalikan [XmlNameTable](../../xmlnametable/) yang digunakan untuk perbandingan string teratomisasi.

```cpp
SharedPtr<XmlNameTable> System::Xml::XmlReaderSettings::get_NameTable()
```


### ReturnValue

[XmlNameTable](../../xmlnametable/) yang menyimpan semua string teratomisasi yang digunakan oleh semua instance [XmlReader](../../xmlreader/) yang dibuat menggunakan objek [XmlReaderSettings](../) ini. Nilai default adalah **nullptr**. Instance [XmlReader](../../xmlreader/) yang dibuat akan menggunakan [NameTable](../../nametable/) kosong baru jika nilai ini **nullptr**.

## Lihat Juga

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNameTable](../../xmlnametable/)
* Class [XmlReaderSettings](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
