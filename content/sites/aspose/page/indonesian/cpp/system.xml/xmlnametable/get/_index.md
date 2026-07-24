---
title: "System::Xml::XmlNameTable::Get metode"
linktitle: "Dapatkan"
second_title: "Aspose.Page untuk C++"
description: "System::Xml::XmlNameTable::Get metode. Ketika dioverride dalam kelas turunan, mengambil string yang teratomkan yang berisi karakter yang sama dengan rentang karakter yang ditentukan dalam array yang diberikan dalam C++."
type: docs
weight: 200
url: /id/cpp/system.xml/xmlnametable/get/
---
## XmlNameTable::Get(const ArrayPtr\<char16_t\>\&, int32_t, int32_t) method


Ketika dioverride dalam kelas turunan, mendapatkan string yang diatomisasi yang berisi karakter yang sama dengan rentang karakter yang ditentukan dalam array yang diberikan.

```cpp
virtual const String & System::Xml::XmlNameTable::Get(const ArrayPtr<char16_t> &array, int32_t offset, int32_t length)=0
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| array | const ArrayPtr\<char16_t\>\& | Array karakter yang berisi nama yang akan dicari. |
| offset | int32_t | Indeks berbasis nol ke dalam array yang menentukan karakter pertama dari nama. |
| length | int32_t | Jumlah karakter dalam nama. |

### ReturnValue

String yang teratomkan atau **nullptr** jika string belum teratomkan. Jika **length** nol, [String::Empty](../../../system/string/empty/) dikembalikan.

## Lihat Juga

* Class [String](../../../system/string/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [XmlNameTable](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlNameTable::Get(const String\&) method


Ketika dioverride dalam kelas turunan, mendapatkan string yang diatomisasi yang memiliki nilai yang sama dengan string yang ditentukan.

```cpp
virtual const String & System::Xml::XmlNameTable::Get(const String &array)=0
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| array | const String\& | Nama yang akan dicari. |

### ReturnValue

String yang diatomisasi atau **nullptr** jika string belum diatomisasi.

## Lihat Juga

* Class [String](../../../system/string/)
* Class [XmlNameTable](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
