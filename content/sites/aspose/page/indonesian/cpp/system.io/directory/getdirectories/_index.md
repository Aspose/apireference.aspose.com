---
title: "System::IO::Directory::GetDirectories method"
linktitle: "GetDirectories"
second_title: "Aspose.Page untuk C++"
description: "System::IO::Directory::GetDirectories method. Mencari direktori yang memenuhi kriteria pencarian yang ditentukan, baik di dalam direktori yang ditentukan maupun di seluruh pohon direktori yang berakar pada direktori yang ditentukan dalam C++."
type: docs
weight: 1000
url: /id/cpp/system.io/directory/getdirectories/
---
## Directory::GetDirectories method


Menelusuri direktori yang memenuhi kriteria pencarian yang ditentukan, baik di dalam direktori yang ditentukan maupun di seluruh pohon direktori yang berakar pada direktori tersebut.

```cpp
static ArrayPtr<String> System::IO::Directory::GetDirectories(const String &path, const String &searchPattern=u"*", SearchOption searchOption=SearchOption::TopDirectoryOnly)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| path | const String\& | Jalur lengkap atau relatif ke direktori tempat pencarian |
| searchPattern | const String\& | Pola nama direktori yang akan dicari |
| searchOption | SearchOption | Menentukan apakah pencarian harus dilakukan hanya di direktori yang ditentukan atau di seluruh pohon direktori yang berakar pada direktori yang ditentukan |

### ReturnValue

Array jalur lengkap dari direktori yang ditemukan yang namanya cocok dengan **searchPattern**

## Lihat Juga

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [String](../../../system/string/)
* Enum [SearchOption](../../searchoption/)
* Class [Directory](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
