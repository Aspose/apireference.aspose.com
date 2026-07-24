---
title: "System::Xml::XmlNode::Supports metode"
linktitle: "Supports"
second_title: "Aspose.Page untuk C++"
description: "System::Xml::XmlNode::Supports metode. Menguji apakah implementasi DOM mendukung fitur spesifik dalam C++."
type: docs
weight: 4400
url: /id/cpp/system.xml/xmlnode/supports/
---
## XmlNode::Supports method


Menguji apakah implementasi DOM mendukung fitur tertentu.

```cpp
virtual bool System::Xml::XmlNode::Supports(String feature, String version)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| fitur | String | Nama paket dari fitur yang akan diuji. Nama ini tidak peka huruf besar/kecil. |
| versi | String | Nomor versi dari nama paket yang akan diuji. Jika versi tidak ditentukan (null), mendukung versi apa pun dari fitur menyebabkan metode mengembalikan true. |

### ReturnValue

**true** if the feature is implemented in the specified version; otherwise, **false**.
## Catatan



Tabel berikut menjelaskan kombinasi yang mengembalikan **true**. |||
|-|-|
| Fitur | Versi |
| XML | 1.0 |
| XML | 2.0 |

## Lihat Juga

* Class [String](../../../system/string/)
* Class [XmlNode](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
