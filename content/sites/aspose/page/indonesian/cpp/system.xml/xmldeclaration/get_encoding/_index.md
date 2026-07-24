---
title: "System::Xml::XmlDeclaration::get_Encoding metode"
linktitle: "get_Encoding"
second_title: "Aspose.Page untuk C++"
description: "System::Xml::XmlDeclaration::get_Encoding metode. Mengembalikan tingkat enkoding dokumen XML dalam C++."
type: docs
weight: 200
url: /id/cpp/system.xml/xmldeclaration/get_encoding/
---
## XmlDeclaration::get_Encoding method


Mengembalikan tingkat enkoding dokumen XML.

```cpp
String System::Xml::XmlDeclaration::get_Encoding()
```


### ReturnValue

Nama enkoding karakter yang valid.
## Catatan



Nama enkoding karakter yang paling umum didukung untuk XML adalah sebagai berikut: |||
|-|-|
| Kategori | Nama Enkoding |
| Unicode | UTF-8, UTF-16 |
| ISO 10646 | ISO-10646-UCS-2, ISO-10646-UCS-4 |
| ISO 8859 | ISO-8859-n (di mana "n" adalah digit dari 1 sampai 9) |
| JIS X-0208-1997 | ISO-2022-JP, Shift_JIS, EUC-JP |

Nilai ini bersifat opsional. Jika nilai tidak diatur, metode ini mengembalikan [String::Empty](../../../system/string/empty/). Jika atribut encoding tidak disertakan, encoding UTF-8 diasumsikan saat dokumen ditulis atau disimpan.
## Lihat Juga

* Class [String](../../../system/string/)
* Class [XmlDeclaration](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
