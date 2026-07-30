---
title: "System::IO::DirectoryInfo::EnumerateFiles yöntemi"
linktitle: "EnumerateFiles"
second_title: "Aspose.Font için C++"
description: "System::IO::DirectoryInfo::EnumerateFiles yöntemi. C++'ta geçerli nesne tarafından temsil edilen dizinde bulunan tüm dosyaları içeren yinelenebilir bir koleksiyon döndürür."
type: docs
weight: 600
url: /tr/cpp/system.io/directoryinfo/enumeratefiles/
---
## DirectoryInfo::EnumerateFiles() method


Geçerli nesne tarafından temsil edilen dizinde bulunan tüm dosyaları içeren yinelemeli bir koleksiyon döndürür.

```cpp
SharedPtr<IEnumerable<FileInfoPtr>> System::IO::DirectoryInfo::EnumerateFiles()
```

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IEnumerable](../../../system.collections.generic/ienumerable/)
* Typedef [FileInfoPtr](../../../system/fileinfoptr/)
* Class [DirectoryInfo](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## DirectoryInfo::EnumerateFiles(const String\&) method


Geçerli nesne tarafından temsil edilen dizinde belirtilen arama kriterlerini karşılayan dosyaları arar.

```cpp
SharedPtr<IEnumerable<FileInfoPtr>> System::IO::DirectoryInfo::EnumerateFiles(const String &searchPattern)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| searchPattern | const String\& | Aranacak dosyaların ad deseni |

### ReturnValue

İsimleri **searchPattern** ile eşleşen bulunan dosyaları temsil eden [FileInfo](../../fileinfo/) nesnelerine ortak işaretçiler içeren yinelenebilir bir koleksiyon

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IEnumerable](../../../system.collections.generic/ienumerable/)
* Typedef [FileInfoPtr](../../../system/fileinfoptr/)
* Class [String](../../../system/string/)
* Class [DirectoryInfo](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## DirectoryInfo::EnumerateFiles(const String\&, SearchOption) method


Geçerli nesne tarafından temsil edilen dizinde veya bu dizinden kök alan tüm dizin ağacında belirtilen arama kriterlerini karşılayan dosyaları arar.

```cpp
SharedPtr<IEnumerable<FileInfoPtr>> System::IO::DirectoryInfo::EnumerateFiles(const String &searchPattern, SearchOption searchOption)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| searchPattern | const String\& | Aranacak dosyaların ad deseni |
| searchOption | SearchOption | Aramanın yalnızca geçerli nesne tarafından temsil edilen dizinde mi yoksa geçerli nesne tarafından temsil edilen dizinde köklenen tüm dizin ağacında mı yapılacağını belirtir |

### ReturnValue

İsimleri **searchPattern** ile eşleşen bulunan dosyaları temsil eden [FileInfo](../../fileinfo/) nesnelerine ortak işaretçiler içeren yinelenebilir bir koleksiyon

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IEnumerable](../../../system.collections.generic/ienumerable/)
* Typedef [FileInfoPtr](../../../system/fileinfoptr/)
* Class [String](../../../system/string/)
* Enum [SearchOption](../../searchoption/)
* Class [DirectoryInfo](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
