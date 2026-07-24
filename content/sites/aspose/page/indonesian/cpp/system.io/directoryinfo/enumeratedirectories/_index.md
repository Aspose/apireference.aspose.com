---
title: "Metode System::IO::DirectoryInfo::EnumerateDirectories"
linktitle: "EnumerateDirectories"
second_title: "Aspose.Page untuk C++"
description: "Metode System::IO::DirectoryInfo::EnumerateDirectories. Mengembalikan koleksi yang dapat diiterasi yang berisi semua direktori yang terletak di dalam direktori yang direpresentasikan oleh objek saat ini dalam C++."
type: docs
weight: 500
url: /id/cpp/system.io/directoryinfo/enumeratedirectories/
---
## DirectoryInfo::EnumerateDirectories() method


Mengembalikan koleksi enumerable yang berisi semua direktori yang berada dalam direktori yang diwakili oleh objek saat ini.

```cpp
SharedPtr<IEnumerable<DirectoryInfoPtr>> System::IO::DirectoryInfo::EnumerateDirectories()
```

## Lihat Juga

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IEnumerable](../../../system.collections.generic/ienumerable/)
* Typedef [DirectoryInfoPtr](../../../system/directoryinfoptr/)
* Class [DirectoryInfo](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## DirectoryInfo::EnumerateDirectories(const String\&) method


Mencari direktori yang memenuhi kriteria pencarian yang ditentukan dalam direktori yang diwakili oleh objek saat ini.

```cpp
SharedPtr<IEnumerable<DirectoryInfoPtr>> System::IO::DirectoryInfo::EnumerateDirectories(const String &searchPattern)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| searchPattern | const String\& | Pola nama direktori yang akan dicari |

### ReturnValue

Koleksi yang dapat diiterasi berisi shared pointer ke objek [DirectoryInfo](../) yang mewakili direktori yang ditemukan dengan nama yang cocok **searchPattern**

## Lihat Juga

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IEnumerable](../../../system.collections.generic/ienumerable/)
* Typedef [DirectoryInfoPtr](../../../system/directoryinfoptr/)
* Class [String](../../../system/string/)
* Class [DirectoryInfo](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## DirectoryInfo::EnumerateDirectories(const String\&, SearchOption) method


Mencari direktori yang memenuhi kriteria pencarian yang ditentukan baik di dalam direktori yang direpresentasikan oleh objek saat ini maupun di seluruh pohon direktori yang berakar pada direktori yang direpresentasikan oleh objek saat ini.

```cpp
SharedPtr<IEnumerable<DirectoryInfoPtr>> System::IO::DirectoryInfo::EnumerateDirectories(const String &searchPattern, SearchOption searchOption)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| searchPattern | const String\& | Pola nama direktori yang akan dicari |
| searchOption | SearchOption | Menentukan apakah pencarian harus dilakukan hanya pada direktori yang diwakili oleh objek saat ini atau pada seluruh pohon direktori yang berakar di direktori yang diwakili oleh objek saat ini |

### ReturnValue

Koleksi yang dapat diiterasi berisi shared pointer ke objek [DirectoryInfo](../) yang mewakili direktori yang ditemukan dengan nama yang cocok **searchPattern**

## Lihat Juga

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IEnumerable](../../../system.collections.generic/ienumerable/)
* Typedef [DirectoryInfoPtr](../../../system/directoryinfoptr/)
* Class [String](../../../system/string/)
* Enum [SearchOption](../../searchoption/)
* Class [DirectoryInfo](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
