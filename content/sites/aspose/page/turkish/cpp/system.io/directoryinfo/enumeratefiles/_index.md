---
title: "System::IO::DirectoryInfo::EnumerateFiles yöntemi"
linktitle: "EnumerateFiles"
second_title: "Aspose.Page için C++"
description: "System::IO::DirectoryInfo::EnumerateFiles yöntemi. C++'da mevcut nesne tarafından temsil edilen dizinde bulunan tüm dosyaları içeren yinelemeli bir koleksiyon döndürür."
type: docs
weight: 600
url: /tr/cpp/system.io/directoryinfo/enumeratefiles/
---
## DirectoryInfo::EnumerateFiles() method


Geçerli nesne tarafından temsil edilen dizinde bulunan tüm dosyaları içeren yinelenebilir bir koleksiyon döndürür.

```cpp
SharedPtr<IEnumerable<FileInfoPtr>> System::IO::DirectoryInfo::EnumerateFiles()
```

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IEnumerable](../../../system.collections.generic/ienumerable/)
* Typedef [FileInfoPtr](../../../system/fileinfoptr/)
* Class [DirectoryInfo](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## DirectoryInfo::EnumerateFiles(const String\&) method


Geçerli nesne tarafından temsil edilen dizinde belirtilen arama kriterlerini karşılayan dosyaları arar.

```cpp
SharedPtr<IEnumerable<FileInfoPtr>> System::IO::DirectoryInfo::EnumerateFiles(const String &searchPattern)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| searchPattern | const String\& | Aranacak dosyaların ad kalıbı |

### ReturnValue

Adı **searchPattern** ile eşleşen bulunan dosyaları temsil eden [FileInfo](../../fileinfo/) nesnelerine ortak işaretçiler içeren yinelemeli bir koleksiyon

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IEnumerable](../../../system.collections.generic/ienumerable/)
* Typedef [FileInfoPtr](../../../system/fileinfoptr/)
* Class [String](../../../system/string/)
* Class [DirectoryInfo](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## DirectoryInfo::EnumerateFiles(const String\&, SearchOption) method


Geçerli nesne tarafından temsil edilen dizinde veya bu dizinden kök alan tüm dizin ağacında belirtilen arama kriterlerini karşılayan dosyaları arar.

```cpp
SharedPtr<IEnumerable<FileInfoPtr>> System::IO::DirectoryInfo::EnumerateFiles(const String &searchPattern, SearchOption searchOption)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| searchPattern | const String\& | Aranacak dosyaların ad kalıbı |
| searchOption | SearchOption | Aramanın yalnızca mevcut nesne tarafından temsil edilen dizinde mi yoksa mevcut nesne tarafından temsil edilen dizinde köklenen tüm dizin ağacında mı yapılacağını belirtir |

### ReturnValue

Adı **searchPattern** ile eşleşen bulunan dosyaları temsil eden [FileInfo](../../fileinfo/) nesnelerine ortak işaretçiler içeren yinelemeli bir koleksiyon

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IEnumerable](../../../system.collections.generic/ienumerable/)
* Typedef [FileInfoPtr](../../../system/fileinfoptr/)
* Class [String](../../../system/string/)
* Enum [SearchOption](../../searchoption/)
* Class [DirectoryInfo](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
