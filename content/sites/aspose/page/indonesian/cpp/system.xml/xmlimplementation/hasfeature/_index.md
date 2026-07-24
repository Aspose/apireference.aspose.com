---
title: "System::Xml::XmlImplementation::HasFeature metode"
linktitle: "HasFeature"
second_title: "Aspose.Page untuk C++"
description: "System::Xml::XmlImplementation::HasFeature metode. Menguji apakah implementasi Document Object Model (DOM) mendukung fitur tertentu dalam C++."
type: docs
weight: 300
url: /id/cpp/system.xml/xmlimplementation/hasfeature/
---
## XmlImplementation::HasFeature method


Menguji apakah Document [Object](../../../system/object/) Model (DOM) mengimplementasikan fitur tertentu.

```cpp
bool System::Xml::XmlImplementation::HasFeature(const String &strFeature, const String &strVersion)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| strFeature | const String\& | Nama paket dari fitur yang akan diuji. Nama ini tidak peka huruf besar/kecil. |
| strVersion | const String\& | Ini adalah nomor versi dari nama paket untuk diuji. Jika versi tidak ditentukan (**nullptr**), mendukung versi apa pun dari fitur menyebabkan metode mengembalikan **true**. |

### ReturnValue

**true** if the feature is implemented in the specified version; otherwise, **false**.
## Catatan



Tabel berikut menunjukkan kombinasi yang menyebabkan **HasFeature** mengembalikan **true**. |||
|-|-|
| strFeature | strVersion |
| XML | 1.0 |
| XML | 2.0 |

## Lihat Juga

* Class [String](../../../system/string/)
* Class [XmlImplementation](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
