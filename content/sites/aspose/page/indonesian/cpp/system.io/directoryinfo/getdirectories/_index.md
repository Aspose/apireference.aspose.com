---
title: "System::IO::DirectoryInfo::GetDirectories metode"
linktitle: "GetDirectories"
second_title: "Aspose.Page untuk C++"
description: "System::IO::DirectoryInfo::GetDirectories metode. Mengembalikan sebuah array yang berisi shared pointer ke objek DirectoryInfo yang mewakili semua direktori yang berada dalam direktori yang diwakili oleh objek saat ini dalam C++."
type: docs
weight: 1200
url: /id/cpp/system.io/directoryinfo/getdirectories/
---
## DirectoryInfo::GetDirectories() method


Mengembalikan sebuah array yang berisi shared pointer ke objek [DirectoryInfo](../) yang mewakili semua direktori yang berada dalam direktori yang diwakili oleh objek saat ini.

```cpp
ArrayPtr<DirectoryInfoPtr> System::IO::DirectoryInfo::GetDirectories()
```

## Lihat Juga

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [DirectoryInfoPtr](../../../system/directoryinfoptr/)
* Class [DirectoryInfo](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## DirectoryInfo::GetDirectories(const String\&) method


Mencari direktori yang memenuhi kriteria pencarian yang ditentukan dalam direktori yang diwakili oleh objek saat ini.

```cpp
ArrayPtr<DirectoryInfoPtr> System::IO::DirectoryInfo::GetDirectories(const String &searchPattern)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| searchPattern | const String\& | Pola nama direktori yang akan dicari |

### ReturnValue

Sebuah array dari shared pointer ke objek [DirectoryInfo](../) yang mewakili direktori yang ditemukan yang namanya cocok dengan **searchPattern**

## Lihat Juga

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [DirectoryInfoPtr](../../../system/directoryinfoptr/)
* Class [String](../../../system/string/)
* Class [DirectoryInfo](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## DirectoryInfo::GetDirectories(const String\&, SearchOption) method


Mencari direktori yang memenuhi kriteria pencarian yang ditentukan baik di dalam direktori yang direpresentasikan oleh objek saat ini maupun di seluruh pohon direktori yang berakar pada direktori yang direpresentasikan oleh objek saat ini.

```cpp
ArrayPtr<DirectoryInfoPtr> System::IO::DirectoryInfo::GetDirectories(const String &searchPattern, SearchOption searchOption)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| searchPattern | const String\& | Pola nama direktori yang akan dicari |
| searchOption | SearchOption | Menentukan apakah pencarian harus dilakukan hanya pada direktori yang diwakili oleh objek saat ini atau pada seluruh pohon direktori yang berakar di direktori yang diwakili oleh objek saat ini |

### ReturnValue

Sebuah array dari shared pointer ke objek [DirectoryInfo](../) yang mewakili direktori yang ditemukan yang namanya cocok dengan **searchPattern**

## Lihat Juga

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [DirectoryInfoPtr](../../../system/directoryinfoptr/)
* Class [String](../../../system/string/)
* Enum [SearchOption](../../searchoption/)
* Class [DirectoryInfo](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
