---
title: "System::IO::DirectoryInfo::GetFiles yöntemi"
linktitle: "GetFiles"
second_title: "Aspose.Font için C++"
description: "System::IO::DirectoryInfo::GetFiles yöntemi. C++'ta geçerli nesne tarafından temsil edilen dizinde bulunan tüm dizinleri temsil eden FileInfo nesnelerine ortak işaretçiler içeren bir dizi döndürür."
type: docs
weight: 1300
url: /tr/cpp/system.io/directoryinfo/getfiles/
---
## DirectoryInfo::GetFiles() method


Geçerli nesne tarafından temsil edilen dizinde bulunan tüm dizinleri temsil eden [FileInfo](../../fileinfo/) nesnelerine ortak işaretçiler içeren bir dizi döndürür.

```cpp
ArrayPtr<FileInfoPtr> System::IO::DirectoryInfo::GetFiles()
```

## Ayrıca Bakınız

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [FileInfoPtr](../../../system/fileinfoptr/)
* Class [DirectoryInfo](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## DirectoryInfo::GetFiles(const String\&) method


Geçerli nesne tarafından temsil edilen dizinde belirtilen arama kriterlerini karşılayan dosyaları arar.

```cpp
ArrayPtr<FileInfoPtr> System::IO::DirectoryInfo::GetFiles(const String &searchPattern)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| searchPattern | const String\& | Aranacak dosyaların ad deseni |

### ReturnValue

İsimleri **searchPattern** ile eşleşen bulunan dosyaları temsil eden [FileInfo](../../fileinfo/) nesnelerine ortak işaretçiler içeren bir dizi

## Ayrıca Bakınız

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [FileInfoPtr](../../../system/fileinfoptr/)
* Class [String](../../../system/string/)
* Class [DirectoryInfo](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## DirectoryInfo::GetFiles(const String\&, SearchOption) method


Geçerli nesne tarafından temsil edilen dizinde veya bu dizinden kök alan tüm dizin ağacında belirtilen arama kriterlerini karşılayan dosyaları arar.

```cpp
ArrayPtr<FileInfoPtr> System::IO::DirectoryInfo::GetFiles(const String &searchPattern, SearchOption searchOption)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| searchPattern | const String\& | Aranacak dosyaların ad deseni |
| searchOption | SearchOption | Aramanın yalnızca geçerli nesne tarafından temsil edilen dizinde mi yoksa geçerli nesne tarafından temsil edilen dizinde köklenen tüm dizin ağacında mı yapılacağını belirtir |

### ReturnValue

İsimleri **searchPattern** ile eşleşen bulunan dosyaları temsil eden [FileInfo](../../fileinfo/) nesnelerine ortak işaretçiler içeren bir dizi

## Ayrıca Bakınız

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [FileInfoPtr](../../../system/fileinfoptr/)
* Class [String](../../../system/string/)
* Enum [SearchOption](../../searchoption/)
* Class [DirectoryInfo](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
