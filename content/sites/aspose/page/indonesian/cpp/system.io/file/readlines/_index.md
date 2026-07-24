---
title: "Metode System::IO::File::ReadLines"
linktitle: "ReadLines"
second_title: "Aspose.Page untuk C++"
description: "System::IO::File::ReadLines method. Membaca konten file teks yang ditentukan baris per baris menggunakan pengkodean karakter yang ditentukan dan mengembalikan koleksi enumerable berupa string yang masing-masing mewakili satu baris konten file dalam C++."
type: docs
weight: 2600
url: /id/cpp/system.io/file/readlines/
---
## File::ReadLines method


Membaca konten file teks yang ditentukan baris demi baris menggunakan enkoding karakter yang ditentukan dan mengembalikan koleksi enumerable string yang masing-masing mewakili satu baris dari konten file.

```cpp
static SharedPtr<Collections::Generic::IEnumerable<String>> System::IO::File::ReadLines(const String &path, const EncodingPtr &encoding=Text::Encoding::get_UTF8())
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| path | const String\& | Jalur file yang akan dibaca |
| encoding | const EncodingPtr\& | Enkoding karakter yang akan digunakan |

### ReturnValue

Koleksi enumerable berupa string yang mewakili konten file yang ditentukan

## Lihat Juga

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IEnumerable](../../../system.collections.generic/ienumerable/)
* Class [String](../../../system/string/)
* Typedef [EncodingPtr](../../../system/encodingptr/)
* Class [File](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
