---
title: "Metode System::IO::Directory::GetFileSystemEntries"
linktitle: "GetFileSystemEntries"
second_title: "Aspose.Page untuk C++"
description: "Metode System::IO::Directory::GetFileSystemEntries. Mencari file dan direktori yang memenuhi kriteria pencarian yang ditentukan, baik di dalam direktori yang ditentukan maupun di seluruh pohon direktori yang berakar pada direktori tersebut dalam C++."
type: docs
weight: 1300
url: /id/cpp/system.io/directory/getfilesystementries/
---
## Directory::GetFileSystemEntries method


Menelusuri file dan direktori yang memenuhi kriteria pencarian yang ditentukan, baik di dalam direktori yang ditentukan maupun di seluruh pohon direktori yang berakar pada direktori tersebut.

```cpp
static ArrayPtr<String> System::IO::Directory::GetFileSystemEntries(const String &path, const String &searchPattern=u"*", SearchOption searchOption=SearchOption::TopDirectoryOnly)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| path | const String\& | Jalur lengkap atau relatif ke direktori tempat pencarian |
| searchPattern | const String\& | Pola nama file dan direktori yang akan dicari |
| searchOption | SearchOption | Menentukan apakah pencarian harus dilakukan hanya di direktori yang ditentukan atau di seluruh pohon direktori yang berakar pada direktori yang ditentukan |

### ReturnValue

Array jalur lengkap dari file dan direktori yang ditemukan yang namanya cocok dengan **searchPattern**

## Lihat Juga

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [String](../../../system/string/)
* Enum [SearchOption](../../searchoption/)
* Class [Directory](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
