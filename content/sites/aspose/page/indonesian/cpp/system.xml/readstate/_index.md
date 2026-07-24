---
title: "System::Xml::ReadState enum"
linktitle: "ReadState"
second_title: "Aspose.Page untuk C++"
description: "System::Xml::ReadState enum. Menentukan keadaan pembaca dalam C++."
type: docs
weight: 5300
url: /id/cpp/system.xml/readstate/
---
## ReadState enum


Menentukan status pembaca.

```cpp
enum class ReadState
```

### Nilai

| Nama | Nilai | Deskripsi |
| --- | --- | --- |
| Initial | 0 | Metode [XmlReader::Read](../xmlreader/read/) belum dipanggil. |
| Interactive | 1 | Metode [XmlReader::Read](../xmlreader/read/) telah dipanggil. Metode tambahan dapat dipanggil pada pembaca. |
| Kesalahan | 2 | Terjadi kesalahan yang mencegah operasi pembacaan melanjutkan. |
| EndOfFile | 3 | Akhir berkas telah berhasil dicapai. |
| Closed | 4 | Metode [XmlReader::Close](../xmlreader/close/) telah dipanggil. |

## Lihat Juga

* Namespace [System::Xml](../)
* Library [Aspose.Page for C++](../../)
