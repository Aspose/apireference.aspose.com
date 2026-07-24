---
title: "System::Xml::NameTable::Add method"
linktitle: "Add"
second_title: "Aspose.Page untuk C++"
description: "System::Xml::NameTable::Add method. Mengatomkan string yang ditentukan dan menambahkannya ke NameTable dalam C++."
type: docs
weight: 200
url: /id/cpp/system.xml/nametable/add/
---
## NameTable::Add(const ArrayPtr\<char16_t\>\&, int32_t, int32_t) method


Mengatomkan string yang ditentukan dan menambahkannya ke [NameTable](../).

```cpp
const String & System::Xml::NameTable::Add(const ArrayPtr<char16_t> &key, int32_t start, int32_t len) override
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| kunci | const ArrayPtr\<char16_t\>\& | Array karakter yang berisi string yang akan ditambahkan. |
| mulai | int32_t | Indeks berbasis nol ke dalam array yang menentukan karakter pertama dari string. |
| len | int32_t | Jumlah karakter dalam string. |

### ReturnValue

String yang telah diatomkan atau string yang sudah ada jika sudah ada di [NameTable](../). Jika **len** nol, [String::Empty](../../../system/string/empty/) dikembalikan.

## Lihat Juga

* Class [String](../../../system/string/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [NameTable](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## NameTable::Add(const String\&) method


Mengatomkan string yang ditentukan dan menambahkannya ke [NameTable](../).

```cpp
const String & System::Xml::NameTable::Add(const String &key) override
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| kunci | const String\& | String yang akan ditambahkan. |

### ReturnValue

String yang diatomkan atau string yang sudah ada jika sudah ada di [NameTable](../).

## Lihat Juga

* Class [String](../../../system/string/)
* Class [NameTable](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
