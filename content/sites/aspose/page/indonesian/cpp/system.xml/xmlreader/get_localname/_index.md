---
title: "System::Xml::XmlReader::get_LocalName metode"
linktitle: "get_LocalName"
second_title: "Aspose.Page untuk C++"
description: "System::Xml::XmlReader::get_LocalName metode. Ketika dioverride dalam kelas turunan, mendapatkan nama lokal dari node saat ini dalam C++."
type: docs
weight: 1400
url: /id/cpp/system.xml/xmlreader/get_localname/
---
## XmlReader::get_LocalName method


Saat ditimpa dalam kelas turunan, mendapatkan nama lokal node saat ini.

```cpp
virtual String System::Xml::XmlReader::get_LocalName()=0
```


### ReturnValue

Nama node saat ini dengan prefiks dihapus. Misalnya, **LocalName** adalah **book** untuk elemen **<bk:book>**. Untuk tipe node yang tidak memiliki nama (seperti **[Text](../../../system.text/)**, **Comment**, dan sebagainya), metode ini mengembalikan [String::Empty](../../../system/string/empty/).

## Lihat Juga

* Class [String](../../../system/string/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
