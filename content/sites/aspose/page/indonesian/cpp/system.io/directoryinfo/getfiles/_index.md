---
title: "Metode System::IO::DirectoryInfo::GetFiles"
linktitle: "GetFiles"
second_title: "Aspose.Page untuk C++"
description: "Metode System::IO::DirectoryInfo::GetFiles. Mengembalikan sebuah array yang berisi shared pointer ke objek FileInfo yang mewakili semua direktori yang terletak di dalam direktori yang direpresentasikan oleh objek saat ini dalam C++."
type: docs
weight: 1300
url: /id/cpp/system.io/directoryinfo/getfiles/
---
## DirectoryInfo::GetFiles() method


Mengembalikan sebuah array yang berisi shared pointer ke objek [FileInfo](../../fileinfo/) yang mewakili semua direktori yang terletak di dalam direktori yang direpresentasikan oleh objek saat ini.

```cpp
ArrayPtr<FileInfoPtr> System::IO::DirectoryInfo::GetFiles()
```

## Lihat Juga

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [FileInfoPtr](../../../system/fileinfoptr/)
* Class [DirectoryInfo](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## DirectoryInfo::GetFiles(const String\&) method


Mencari file yang memenuhi kriteria pencarian yang ditentukan di dalam direktori yang direpresentasikan oleh objek saat ini.

```cpp
ArrayPtr<FileInfoPtr> System::IO::DirectoryInfo::GetFiles(const String &searchPattern)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| searchPattern | const String\& | Pola nama file yang akan dicari |

### ReturnValue

Sebuah array berisi shared pointer ke objek [FileInfo](../../fileinfo/) yang mewakili file yang ditemukan dengan nama yang cocok **searchPattern**

## Lihat Juga

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [FileInfoPtr](../../../system/fileinfoptr/)
* Class [String](../../../system/string/)
* Class [DirectoryInfo](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## DirectoryInfo::GetFiles(const String\&, SearchOption) method


Mencari file yang memenuhi kriteria pencarian yang ditentukan baik di dalam direktori yang direpresentasikan oleh objek saat ini maupun di seluruh pohon direktori yang berakar pada direktori yang direpresentasikan oleh objek saat ini.

```cpp
ArrayPtr<FileInfoPtr> System::IO::DirectoryInfo::GetFiles(const String &searchPattern, SearchOption searchOption)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| searchPattern | const String\& | Pola nama file yang akan dicari |
| searchOption | SearchOption | Menentukan apakah pencarian harus dilakukan hanya pada direktori yang diwakili oleh objek saat ini atau pada seluruh pohon direktori yang berakar di direktori yang diwakili oleh objek saat ini |

### ReturnValue

Sebuah array berisi shared pointer ke objek [FileInfo](../../fileinfo/) yang mewakili file yang ditemukan dengan nama yang cocok **searchPattern**

## Lihat Juga

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [FileInfoPtr](../../../system/fileinfoptr/)
* Class [String](../../../system/string/)
* Enum [SearchOption](../../searchoption/)
* Class [DirectoryInfo](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
