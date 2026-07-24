---
title: "System::Xml::XmlNameTable::Add metode"
linktitle: "Add"
second_title: "Aspose.Page untuk C++"
description: "System::Xml::XmlNameTable::Add metode. Ketika dioverride dalam kelas turunan, mengatomkan string yang ditentukan dan menambahkannya ke XmlNameTable dalam C++."
type: docs
weight: 100
url: /id/cpp/system.xml/xmlnametable/add/
---
## XmlNameTable::Add(const ArrayPtr\<char16_t\>\&, int32_t, int32_t) method


Ketika dioverride dalam kelas turunan, mengatomkan string yang ditentukan dan menambahkannya ke [XmlNameTable](../).

```cpp
virtual const String & System::Xml::XmlNameTable::Add(const ArrayPtr<char16_t> &array, int32_t offset, int32_t length)=0
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| array | const ArrayPtr\<char16_t\>\& | Array karakter yang berisi nama yang akan ditambahkan. |
| offset | int32_t | Indeks berbasis nol ke dalam array yang menentukan karakter pertama dari nama. |
| length | int32_t | Jumlah karakter dalam nama. |

### ReturnValue

String yang teratomkan baru atau yang sudah ada jika sudah ada. Jika length nol, [String::Empty](../../../system/string/empty/) dikembalikan.

## Lihat Juga

* Class [String](../../../system/string/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [XmlNameTable](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlNameTable::Add(const String\&) method


Ketika dioverride dalam kelas turunan, mengatomkan string yang ditentukan dan menambahkannya ke [XmlNameTable](../).

```cpp
virtual const String & System::Xml::XmlNameTable::Add(const String &array)=0
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| array | const String\& | Nama yang akan ditambahkan. |

### ReturnValue

String yang teratomkan baru atau yang sudah ada jika sudah ada.

## Lihat Juga

* Class [String](../../../system/string/)
* Class [XmlNameTable](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
