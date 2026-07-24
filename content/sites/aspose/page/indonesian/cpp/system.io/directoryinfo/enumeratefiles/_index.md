---
title: "System::IO::DirectoryInfo::EnumerateFiles metode"
linktitle: "EnumerateFiles"
second_title: "Aspose.Page untuk C++"
description: "System::IO::DirectoryInfo::EnumerateFiles metode. Mengembalikan koleksi yang dapat diiterasi yang berisi semua file yang berada dalam direktori yang diwakili oleh objek saat ini dalam C++."
type: docs
weight: 600
url: /id/cpp/system.io/directoryinfo/enumeratefiles/
---
## DirectoryInfo::EnumerateFiles() method


Mengembalikan koleksi enumerable yang berisi semua file yang terletak di direktori yang direpresentasikan oleh objek saat ini.

```cpp
SharedPtr<IEnumerable<FileInfoPtr>> System::IO::DirectoryInfo::EnumerateFiles()
```

## Lihat Juga

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IEnumerable](../../../system.collections.generic/ienumerable/)
* Typedef [FileInfoPtr](../../../system/fileinfoptr/)
* Class [DirectoryInfo](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## DirectoryInfo::EnumerateFiles(const String\&) method


Mencari file yang memenuhi kriteria pencarian yang ditentukan di dalam direktori yang direpresentasikan oleh objek saat ini.

```cpp
SharedPtr<IEnumerable<FileInfoPtr>> System::IO::DirectoryInfo::EnumerateFiles(const String &searchPattern)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| searchPattern | const String\& | Pola nama file yang akan dicari |

### ReturnValue

Koleksi yang dapat diiterasi dari shared pointer ke objek [FileInfo](../../fileinfo/) yang mewakili file yang ditemukan yang namanya cocok dengan **searchPattern**

## Lihat Juga

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IEnumerable](../../../system.collections.generic/ienumerable/)
* Typedef [FileInfoPtr](../../../system/fileinfoptr/)
* Class [String](../../../system/string/)
* Class [DirectoryInfo](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## DirectoryInfo::EnumerateFiles(const String\&, SearchOption) method


Mencari file yang memenuhi kriteria pencarian yang ditentukan baik di dalam direktori yang direpresentasikan oleh objek saat ini maupun di seluruh pohon direktori yang berakar pada direktori yang direpresentasikan oleh objek saat ini.

```cpp
SharedPtr<IEnumerable<FileInfoPtr>> System::IO::DirectoryInfo::EnumerateFiles(const String &searchPattern, SearchOption searchOption)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| searchPattern | const String\& | Pola nama file yang akan dicari |
| searchOption | SearchOption | Menentukan apakah pencarian harus dilakukan hanya pada direktori yang diwakili oleh objek saat ini atau pada seluruh pohon direktori yang berakar di direktori yang diwakili oleh objek saat ini |

### ReturnValue

Koleksi yang dapat diiterasi dari shared pointer ke objek [FileInfo](../../fileinfo/) yang mewakili file yang ditemukan yang namanya cocok dengan **searchPattern**

## Lihat Juga

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IEnumerable](../../../system.collections.generic/ienumerable/)
* Typedef [FileInfoPtr](../../../system/fileinfoptr/)
* Class [String](../../../system/string/)
* Enum [SearchOption](../../searchoption/)
* Class [DirectoryInfo](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
