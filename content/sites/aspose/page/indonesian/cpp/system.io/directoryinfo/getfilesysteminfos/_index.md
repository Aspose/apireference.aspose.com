---
title: "Metode System::IO::DirectoryInfo::GetFileSystemInfos"
linktitle: "GetFileSystemInfos"
second_title: "Aspose.Page untuk C++"
description: "Metode System::IO::DirectoryInfo::GetFileSystemInfos. Mengembalikan sebuah array yang berisi shared pointer ke objek FileSystemInfo yang mewakili semua file dan direktori yang terletak di dalam direktori yang direpresentasikan oleh objek saat ini dalam C++."
type: docs
weight: 1400
url: /id/cpp/system.io/directoryinfo/getfilesysteminfos/
---
## DirectoryInfo::GetFileSystemInfos() method


Mengembalikan sebuah array yang berisi shared pointer ke objek [FileSystemInfo](../../filesysteminfo/) yang mewakili semua file dan direktori yang terletak di dalam direktori yang direpresentasikan oleh objek saat ini.

```cpp
ArrayPtr<FileSystemInfoPtr> System::IO::DirectoryInfo::GetFileSystemInfos()
```

## Lihat Juga

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [FileSystemInfoPtr](../../../system/filesysteminfoptr/)
* Class [DirectoryInfo](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## DirectoryInfo::GetFileSystemInfos(const String\&) method


Mencari file dan direktori yang memenuhi kriteria pencarian yang ditentukan di dalam direktori yang direpresentasikan oleh objek saat ini.

```cpp
ArrayPtr<FileSystemInfoPtr> System::IO::DirectoryInfo::GetFileSystemInfos(const String &searchPattern)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| searchPattern | const String\& | Pola nama file dan direktori yang akan dicari |

### ReturnValue

Sebuah array berisi shared pointer ke objek [FileSystemInfo](../../filesysteminfo/) yang mewakili file dan direktori yang ditemukan dengan nama yang cocok **searchPattern**

## Lihat Juga

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [FileSystemInfoPtr](../../../system/filesysteminfoptr/)
* Class [String](../../../system/string/)
* Class [DirectoryInfo](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## DirectoryInfo::GetFileSystemInfos(const String\&, SearchOption) method


Mencari file dan direktori yang memenuhi kriteria pencarian yang ditentukan baik di dalam direktori yang direpresentasikan oleh objek saat ini maupun di seluruh pohon direktori yang berakar pada direktori yang direpresentasikan oleh objek saat ini.

```cpp
ArrayPtr<FileSystemInfoPtr> System::IO::DirectoryInfo::GetFileSystemInfos(const String &searchPattern, SearchOption searchOption)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| searchPattern | const String\& | Pola nama file dan direktori yang akan dicari |
| searchOption | SearchOption | Menentukan apakah pencarian harus dilakukan hanya pada direktori yang diwakili oleh objek saat ini atau pada seluruh pohon direktori yang berakar di direktori yang diwakili oleh objek saat ini |

### ReturnValue

Sebuah array berisi shared pointer ke objek [FileSystemInfo](../../filesysteminfo/) yang mewakili file dan direktori yang ditemukan dengan nama yang cocok **searchPattern**

## Lihat Juga

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [FileSystemInfoPtr](../../../system/filesysteminfoptr/)
* Class [String](../../../system/string/)
* Enum [SearchOption](../../searchoption/)
* Class [DirectoryInfo](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
