---
title: "Metode System::IO::Directory::EnumerateFileSystemEntries"
linktitle: "EnumerateFileSystemEntries"
second_title: "Aspose.Page untuk C++"
description: "Metode System::IO::Directory::EnumerateFileSystemEntries. Mencari file dan direktori yang memenuhi kriteria pencarian yang ditentukan, baik di dalam direktori yang ditentukan maupun di seluruh pohon direktori yang berakar pada direktori yang ditentukan dalam C++."
type: docs
weight: 500
url: /id/cpp/system.io/directory/enumeratefilesystementries/
---
## Directory::EnumerateFileSystemEntries method


Menelusuri file dan direktori yang memenuhi kriteria pencarian yang ditentukan, baik di dalam direktori yang ditentukan maupun di seluruh pohon direktori yang berakar pada direktori tersebut.

```cpp
static StringEnumerablePtr System::IO::Directory::EnumerateFileSystemEntries(const String &path, const String &searchPattern=u"*", SearchOption searchOption=SearchOption::TopDirectoryOnly)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| path | const String\& | Jalur lengkap atau relatif ke direktori tempat pencarian |
| searchPattern | const String\& | Pola nama file dan direktori yang akan dicari |
| searchOption | SearchOption | Menentukan apakah pencarian harus dilakukan hanya di direktori yang ditentukan atau di seluruh pohon direktori yang berakar pada direktori yang ditentukan |

### ReturnValue

Koleksi yang dapat diiterasi berisi jalur lengkap file dan direktori yang ditemukan yang namanya cocok dengan **searchPattern**

## Lihat Juga

* Typedef [StringEnumerablePtr](../stringenumerableptr/)
* Class [String](../../../system/string/)
* Enum [SearchOption](../../searchoption/)
* Class [Directory](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
