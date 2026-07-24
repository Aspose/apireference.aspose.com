---
title: "System::IO::File::AppendAllLines metode"
linktitle: "AppendAllLines"
second_title: "Aspose.Page untuk C++"
description: "System::IO::File::AppendAllLines metode. Menambahkan string dari koleksi string yang ditentukan ke file yang ditentukan menggunakan enkoding yang ditentukan dengan menulis setiap string pada baris baru. Jika file yang ditentukan tidak ada, file tersebut dibuat. File ditutup setelah menulis semua string dalam C++."
type: docs
weight: 100
url: /id/cpp/system.io/file/appendalllines/
---
## File::AppendAllLines method


Menambahkan string dari koleksi string yang ditentukan ke file yang ditentukan menggunakan enkoding yang ditentukan dengan menulis setiap string pada baris baru. Jika file yang ditentukan tidak ada, file tersebut akan dibuat. File ditutup setelah menulis semua string.

```cpp
static void System::IO::File::AppendAllLines(const String &path, const SharedPtr<Collections::Generic::IEnumerable<String>> &contents, const EncodingPtr &encoding=Text::Encoding::get_UTF8Unmarked())
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| path | const String\& | Jalur file untuk menambahkan string ke dalamnya |
| konten | const SharedPtr\<Collections::Generic::IEnumerable\<String\>\>\& | String yang akan ditulis ke file |
| encoding | const EncodingPtr\& | Enkoding karakter yang akan digunakan |

## Lihat Juga

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IEnumerable](../../../system.collections.generic/ienumerable/)
* Typedef [EncodingPtr](../../../system/encodingptr/)
* Class [File](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
