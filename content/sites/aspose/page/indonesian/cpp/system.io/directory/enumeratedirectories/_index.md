---
title: "System::IO::Directory::EnumerateDirectories metode"
linktitle: "EnumerateDirectories"
second_title: "Aspose.Page untuk C++"
description: "System::IO::Directory::EnumerateDirectories metode. Mencari direktori yang memenuhi kriteria pencarian yang ditentukan, baik di direktori yang ditentukan maupun di seluruh pohon direktori yang berakar di direktori yang ditentukan dalam C++."
type: docs
weight: 300
url: /id/cpp/system.io/directory/enumeratedirectories/
---
## Directory::EnumerateDirectories method


Menelusuri direktori yang memenuhi kriteria pencarian yang ditentukan, baik di dalam direktori yang ditentukan maupun di seluruh pohon direktori yang berakar pada direktori tersebut.

```cpp
static StringEnumerablePtr System::IO::Directory::EnumerateDirectories(const String &path, const String &searchPattern=u"*", SearchOption searchOption=SearchOption::TopDirectoryOnly)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| path | const String\& | Jalur lengkap atau relatif ke direktori tempat pencarian |
| searchPattern | const String\& | Pola nama direktori yang akan dicari |
| searchOption | SearchOption | Menentukan apakah pencarian harus dilakukan hanya di direktori yang ditentukan atau di seluruh pohon direktori yang berakar pada direktori yang ditentukan |

### ReturnValue

Koleksi dapat diiterasi berisi jalur lengkap dari direktori yang ditemukan yang namanya cocok dengan **searchPattern**

## Lihat Juga

* Typedef [StringEnumerablePtr](../stringenumerableptr/)
* Class [String](../../../system/string/)
* Enum [SearchOption](../../searchoption/)
* Class [Directory](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
