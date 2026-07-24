---
title: "System::Xml::NameTable::Get method"
linktitle: "Dapatkan"
second_title: "Aspose.Page untuk C++"
description: "System::Xml::NameTable::Get method. Mengembalikan string yang diatomkan yang berisi karakter yang sama dengan rentang karakter yang ditentukan dalam array yang diberikan dalam C++."
type: docs
weight: 300
url: /id/cpp/system.xml/nametable/get/
---
## NameTable::Get(const ArrayPtr\<char16_t\>\&, int32_t, int32_t) method


Mengembalikan string teratomisasi yang berisi karakter yang sama dengan rentang karakter yang ditentukan dalam array yang diberikan.

```cpp
const String & System::Xml::NameTable::Get(const ArrayPtr<char16_t> &key, int32_t start, int32_t len) override
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| kunci | const ArrayPtr\<char16_t\>\& | Array karakter yang berisi nama yang akan dicari. |
| mulai | int32_t | Indeks berbasis nol ke dalam array yang menentukan karakter pertama dari nama. |
| len | int32_t | Jumlah karakter dalam nama. |

### ReturnValue

String yang diatomkan atau **nullptr** jika string belum diatomkan. Jika **len** nol, [String::Empty](../../../system/string/empty/) dikembalikan.

## Lihat Juga

* Class [String](../../../system/string/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [NameTable](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## NameTable::Get(const String\&) method


Mengembalikan string yang diatomkan dengan nilai yang ditentukan.

```cpp
const String & System::Xml::NameTable::Get(const String &value) override
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| value | const String\& | Nama yang akan dicari. |

### ReturnValue

Objek string yang diatomkan atau **nullptr** jika string belum diatomkan.

## Lihat Juga

* Class [String](../../../system/string/)
* Class [NameTable](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
