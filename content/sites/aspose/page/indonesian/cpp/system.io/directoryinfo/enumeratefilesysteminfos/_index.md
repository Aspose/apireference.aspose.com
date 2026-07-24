---
title: "System::IO::DirectoryInfo::EnumerateFileSystemInfos method"
linktitle: "EnumerateFileSystemInfos"
second_title: "Aspose.Page untuk C++"
description: "System::IO::DirectoryInfo::EnumerateFileSystemInfos method. Mengembalikan koleksi yang dapat diiterasi berisi semua file dan direktori yang berada di dalam direktori yang diwakili oleh objek saat ini dalam C++."
type: docs
weight: 700
url: /id/cpp/system.io/directoryinfo/enumeratefilesysteminfos/
---
## DirectoryInfo::EnumerateFileSystemInfos() method


Mengembalikan koleksi enumerable yang berisi semua file dan direktori yang terletak di direktori yang direpresentasikan oleh objek saat ini.

```cpp
SharedPtr<IEnumerable<FileSystemInfoPtr>> System::IO::DirectoryInfo::EnumerateFileSystemInfos()
```

## Lihat Juga

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IEnumerable](../../../system.collections.generic/ienumerable/)
* Typedef [FileSystemInfoPtr](../../../system/filesysteminfoptr/)
* Class [DirectoryInfo](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## DirectoryInfo::EnumerateFileSystemInfos(const String\&) method


Mencari file dan direktori yang memenuhi kriteria pencarian yang ditentukan di dalam direktori yang direpresentasikan oleh objek saat ini.

```cpp
SharedPtr<IEnumerable<FileSystemInfoPtr>> System::IO::DirectoryInfo::EnumerateFileSystemInfos(const String &searchPattern)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| searchPattern | const String\& | Pola nama file dan direktori yang akan dicari |

### ReturnValue

Koleksi yang dapat diiterasi dari shared pointer ke objek [FileSystemInfo](../../filesysteminfo/) yang mewakili file dan direktori yang ditemukan yang namanya cocok dengan **searchPattern**

## Lihat Juga

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IEnumerable](../../../system.collections.generic/ienumerable/)
* Typedef [FileSystemInfoPtr](../../../system/filesysteminfoptr/)
* Class [String](../../../system/string/)
* Class [DirectoryInfo](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## DirectoryInfo::EnumerateFileSystemInfos(const String\&, SearchOption) method


Mencari file dan direktori yang memenuhi kriteria pencarian yang ditentukan baik di dalam direktori yang direpresentasikan oleh objek saat ini maupun di seluruh pohon direktori yang berakar pada direktori yang direpresentasikan oleh objek saat ini.

```cpp
SharedPtr<IEnumerable<FileSystemInfoPtr>> System::IO::DirectoryInfo::EnumerateFileSystemInfos(const String &searchPattern, SearchOption searchOption)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| searchPattern | const String\& | Pola nama file dan direktori yang akan dicari |
| searchOption | SearchOption | Menentukan apakah pencarian harus dilakukan hanya pada direktori yang diwakili oleh objek saat ini atau pada seluruh pohon direktori yang berakar di direktori yang diwakili oleh objek saat ini |

### ReturnValue

Koleksi yang dapat diiterasi dari shared pointer ke objek [FileSystemInfo](../../filesysteminfo/) yang mewakili file dan direktori yang ditemukan yang namanya cocok dengan **searchPattern**

## Lihat Juga

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IEnumerable](../../../system.collections.generic/ienumerable/)
* Typedef [FileSystemInfoPtr](../../../system/filesysteminfoptr/)
* Class [String](../../../system/string/)
* Enum [SearchOption](../../searchoption/)
* Class [DirectoryInfo](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
