---
title: "Metode System::IO::File::WriteAllLines"
linktitle: "WriteAllLines"
second_title: "Aspose.Page untuk C++"
description: "Metode System::IO::File::WriteAllLines. Membuat file teks baru atau menimpa yang sudah ada dan menulis semua string dari array string yang ditentukan ke dalamnya, setiap string pada baris baru, menggunakan enkoding yang ditentukan dalam C++."
type: docs
weight: 3600
url: /id/cpp/system.io/file/writealllines/
---
## File::WriteAllLines(const String\&, const ArrayPtr\<String\>\&, const EncodingPtr\&) method


Membuat file teks baru atau menimpa yang sudah ada dan menulis semua string dari array string yang ditentukan ke dalamnya, setiap string pada baris baru, menggunakan enkoding yang ditentukan.

```cpp
static void System::IO::File::WriteAllLines(const String &path, const ArrayPtr<String> &contents, const EncodingPtr &encoding=Text::Encoding::get_UTF8Unmarked())
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| path | const String\& | File yang akan dibuat atau ditimpa |
| konten | const ArrayPtr\<String\>\& | Sebuah array string |
| encoding | const EncodingPtr\& | Enkoding karakter yang akan digunakan |

## Lihat Juga

* Class [String](../../../system/string/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [EncodingPtr](../../../system/encodingptr/)
* Class [File](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## File::WriteAllLines(const String\&, const SharedPtr\<Collections::Generic::IEnumerable\<String\>\>\&, const EncodingPtr\&) method


Membuat file teks baru atau menimpa yang sudah ada dan menulis semua string dari koleksi enumerable string yang ditentukan ke dalamnya, setiap string pada baris baru, menggunakan enkoding yang ditentukan.

```cpp
static void System::IO::File::WriteAllLines(const String &path, const SharedPtr<Collections::Generic::IEnumerable<String>> &contents, const EncodingPtr &encoding=Text::Encoding::get_UTF8Unmarked())
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| path | const String\& | File yang akan dibuat atau ditimpa |
| konten | const SharedPtr\<Collections::Generic::IEnumerable\<String\>\>\& | Koleksi enumerable berisi string |
| encoding | const EncodingPtr\& | Enkoding karakter yang akan digunakan |

## Lihat Juga

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IEnumerable](../../../system.collections.generic/ienumerable/)
* Typedef [EncodingPtr](../../../system/encodingptr/)
* Class [File](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
