---
title: "System::IO::Directory::GetFiles metode"
linktitle: "GetFiles"
second_title: "Aspose.Page untuk C++"
description: "System::IO::Directory::GetFiles metode. Mencari file yang memenuhi kriteria pencarian yang ditentukan, baik di direktori yang ditentukan maupun di seluruh pohon direktori yang berakar di direktori yang ditentukan dalam C++."
type: docs
weight: 1200
url: /id/cpp/system.io/directory/getfiles/
---
## Directory::GetFiles method


Menelusuri file yang memenuhi kriteria pencarian yang ditentukan, baik di dalam direktori yang ditentukan maupun di seluruh pohon direktori yang berakar pada direktori tersebut.

```cpp
static ArrayPtr<String> System::IO::Directory::GetFiles(const String &path, const String &searchPattern=u"*", SearchOption searchOption=SearchOption::TopDirectoryOnly)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| path | const String\& | Jalur lengkap atau relatif ke direktori tempat pencarian |
| searchPattern | const String\& | Pola nama file yang akan dicari |
| searchOption | SearchOption | Menentukan apakah pencarian harus dilakukan hanya di direktori yang ditentukan atau di seluruh pohon direktori yang berakar pada direktori yang ditentukan |

### ReturnValue

Array berisi jalur lengkap dari file yang ditemukan yang namanya cocok dengan **searchPattern**

## Lihat Juga

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [String](../../../system/string/)
* Enum [SearchOption](../../searchoption/)
* Class [Directory](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
