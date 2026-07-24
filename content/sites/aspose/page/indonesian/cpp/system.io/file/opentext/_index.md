---
title: "Metode System::IO::File::OpenText"
linktitle: "OpenText"
second_title: "Aspose.Page untuk C++"
description: "Metode System::IO::File::OpenText. Membuka file yang ada yang ditentukan untuk membaca teks menggunakan enkoding UTF-8 tanpa berbagi dalam C++."
type: docs
weight: 2100
url: /id/cpp/system.io/file/opentext/
---
## File::OpenText method


Membuka file yang ada yang ditentukan untuk membaca teks menggunakan enkoding UTF-8 tanpa berbagi.

```cpp
static StreamReaderPtr System::IO::File::OpenText(const String &path, const EncodingPtr &encoding=Text::Encoding::get_UTF8Unmarked())
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| path | const String\& | Jalur file yang akan dibuka |
| encoding | const EncodingPtr\& | Enkoding karakter yang akan digunakan |

### ReturnValue

Sebuah shared pointer ke objek [StreamWriter](../../streamwriter/) yang terkait dengan file yang dibuka

## Lihat Juga

* Typedef [StreamReaderPtr](../../../system/streamreaderptr/)
* Class [String](../../../system/string/)
* Typedef [EncodingPtr](../../../system/encodingptr/)
* Class [File](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
